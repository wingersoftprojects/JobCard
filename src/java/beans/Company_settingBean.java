/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.sql.rowset.serial.SerialBlob;
import models.Company_setting;
import models.JobCardPersistentManager;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import utilities.GeneralUtilities;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class Company_settingBean implements Serializable {

    public Company_settingBean() {
        formstate = "";
    }

    @PostConstruct
    public void init() {
        try {
            this.company_setting = Company_setting.loadCompany_settingByQuery("id>0)", null);
            if (this.company_setting == null) {
                add();
            }
            if (company_setting != null) {
                this.formstate = "edit";
            } else {
                formstate = "view";
            }
        } catch (PersistentException ex) {
            Logger.getLogger(Company_settingBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handleFileUpload(FileUploadEvent event) {
        try {
            company_setting.setImageattachement(new SerialBlob(event.getFile().getContents()));
        } catch (SQLException ex) {
            Logger.getLogger(Company_settingBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private DefaultStreamedContent image;

    public DefaultStreamedContent getImage() {
        if (company_setting.getImageattachement() != null) {
            try {
                image = new DefaultStreamedContent(company_setting.getImageattachement().getBinaryStream());
            } catch (SQLException ex) {
                Logger.getLogger(Company_settingBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            image = new DefaultStreamedContent();
        }
        return image;
    }

    public void setImage(DefaultStreamedContent image) {
        this.image = image;
    }

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    private Company_setting company_setting;

    public Company_setting getCompany_setting() {
        if (company_setting == null) {
            init();
        }
        return company_setting;
    }

    public void setCompany_setting(Company_setting company_setting) {
        this.company_setting = company_setting;
    }

    private String formstate;

    private List<Company_setting> company_settingList;

    public List<Company_setting> getCompany_settingList() {
        try {
            company_settingList = Company_setting.queryCompany_setting(null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(Company_settingBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return company_settingList;
    }

    public void setCompany_settingList(List<Company_setting> company_settingList) {
        this.company_settingList = company_settingList;
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public void cancel() {
        try {
            if (company_setting != null) {
                JobCardPersistentManager.instance().getSession().evict(company_setting);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(Company_setting.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        this.company_setting = null;
        formstate = "view";
    }

    public void view(Company_setting d) {
        this.company_setting = d;
        formstate = "view";
    }

    public void delete(Company_setting d) {
        this.company_setting = d;
    }

    public void add() {
        company_setting = new Company_setting();
        formstate = "add";
    }

    public void edit() {
        try {
            this.company_setting = Company_setting.loadCompany_settingByQuery("id<>0)", null);
        } catch (PersistentException ex) {
            Logger.getLogger(Company_settingBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = JobCardPersistentManager.instance().getSession().beginTransaction();
            if (company_setting.getCompany_setting_id() > 0) {
                company_setting.setCompany_name(company_setting.getCompany_name().toUpperCase());
                company_setting.setLast_edit_by(loginBean.getUser_detail());
                company_setting.setLast_edit_date(new Timestamp(new Date().getTime()));
                JobCardPersistentManager.instance().getSession().merge(company_setting);
            } else {
                company_setting.setCompany_name(company_setting.getCompany_name().toUpperCase());
                company_setting.setAdd_date(new Timestamp(new Date().getTime()));
                company_setting.setAdd_by(loginBean.getUser_detail());
                company_setting.save();
            }
            t.commit();
            formstate = "edit";
            loginBean.saveMessage();
        } catch (PersistentException ex) {
            Logger.getLogger(Company_setting.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = JobCardPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = JobCardPersistentManager.instance().getSession().merge(company_setting);
            JobCardPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            JobCardPersistentManager.instance().getSession().evict(company_setting);
            this.company_setting = null;
        } catch (PersistentException ex) {
            Logger.getLogger(Company_setting.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
