/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import models.Contact_person_detail;
import models.Customer_detail;
import models.JobCardPersistentManager;
import models.User_detail;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 *
 * @author philp
 */
@ManagedBean
@RequestScoped
public class Contact_person_detailBean extends AbstractBean<Contact_person_detail> implements Serializable {

    private Customer_detail selectedCustomer_detail;
    private List<Contact_person_detail> contact_person_details;

    public Contact_person_detailBean() {
        super(Contact_person_detail.class);
    }

    @Override
    public void init() {
        if (super.getEntityClass() == null) {
            loginBean.logout();
        }
    }
    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }
    public void SaveContact_person_details() {
        try {
            PersistentTransaction transaction = JobCardPersistentManager.instance().getSession().beginTransaction();
            for (Contact_person_detail cpd : this.contact_person_details) {
                cpd.setIs_active(1);
                cpd.setAdd_date(new Timestamp(new Date().getTime()));
                cpd.setAdd_by(loginBean.getUser_detail());
                cpd.setIs_deleted(0);
                cpd.save();
            }
            transaction.commit();
            loginBean.saveMessage();
        } catch (PersistentException ex) {
            java.util.logging.Logger.getLogger(Contact_person_detailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Contact_person_detail getContact_person_detail_by_ID(int cpdi) {
        Contact_person_detail cpd = new Contact_person_detail();
        try {
            cpd = Contact_person_detail.getContact_person_detailByORMID(cpdi);
        } catch (PersistentException ex) {
            cpd = null;
            //Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cpd;
    }

    @Override
    public void save(User_detail aUserDetailId) {
        try {
            PersistentTransaction transaction = JobCardPersistentManager.instance().getSession().beginTransaction();
            if (this.getFormstate().equals("add")) {
                this.getSelected().setAdd_by(aUserDetailId);
                this.getSelected().setAdd_date(new Timestamp(new Date().getTime()));
                this.getSelected().setIs_active(1);
                this.getSelected().setIs_deleted(0);
                if (this.getSelected().getContact_person_detail_id() > 0) {
                    JobCardPersistentManager.instance().getSession().merge(this.getSelected());
                } else {
                    this.getSelected().save();
                }
            }
            if (this.getFormstate().equals("edit")) {
                this.getSelected().setLast_edit_by(aUserDetailId);
                this.getSelected().setLast_edit_date(new Timestamp(new Date().getTime()));
                JobCardPersistentManager.instance().getSession().merge(this.getSelected());
            }
            transaction.commit();
            this.clearCache(this.getSelected());
            this.setFormstate("view");
            add();
            //initializelist();
            loginBean.saveMessage();
        } catch (PersistentException ex) {
            Logger.getLogger(Contact_person_detailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cancelcloseDialog() {
    }

    public Customer_detail getSelectedCustomer_detail() {
        return selectedCustomer_detail;
    }

    public void setSelectedCustomer_detail(Customer_detail selectedCustomer_detail) {
        this.selectedCustomer_detail = selectedCustomer_detail;
    }

    public List<Contact_person_detail> getContact_person_details() {
        return contact_person_details;
    }

    public void setContact_person_details(List<Contact_person_detail> contact_person_details) {
        this.contact_person_details = contact_person_details;
    }
    
}
