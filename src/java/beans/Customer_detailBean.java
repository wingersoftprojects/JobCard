/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import models.Customer_detail;
import models.JobCardPersistentManager;
import models.User_detail;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.primefaces.context.RequestContext;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class Customer_detailBean extends AbstractBean<Customer_detail> implements Serializable {

    private boolean is_dialog = false;

    public boolean isIs_dialog() {
        return is_dialog;
    }

    public void setIs_dialog(boolean is_dialog) {
        this.is_dialog = is_dialog;
    }

    public Customer_detailBean() {
        super(Customer_detail.class);
    }

    @Override
    public void init() {
        if (super.getEntityClass() == null) {
            loginBean.logout();
        }
    }
    @ManagedProperty("#{job_cardBean}")
    private Job_cardBean job_cardBean;

    public Job_cardBean getJob_cardBean() {
        return job_cardBean;
    }

    public void setJob_cardBean(Job_cardBean job_cardBean) {
        this.job_cardBean = job_cardBean;
    }

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

//    public void save_customer_detail(int aUserDetailId) {
//        if (this.getSelected().getCustomer_detail_id() > 0) {
//            this.save(aUserDetailId);
//        } else {
//            int i_d = 0;
//            i_d = this.save_return_entity_id(aUserDetailId);           
//        }
//    }
    public Customer_detail getCutomer_detail_by_ID(int cdi) {
        Customer_detail cd = new Customer_detail();
        try {
            cd = Customer_detail.getCustomer_detailByORMID(cdi);
        } catch (PersistentException ex) {
            cd = null;
            //Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cd;
    }

        public List<Customer_detail> getCustomer_details_by_user() {
        try {
            if (loginBean.getUser_detail().getIs_user_gen_admin() == 1) {
                return this.getTsActive();
            } else {
                String RFIDs = "";
                
                if (RFIDs.length() > 0) {
                    return Customer_detail.queryCustomer_detail("is_active=1 and is_deleted=0 and customer_detail_id IN(" + RFIDs + ")", null);
                } else {
                    return null;
                }
            }
        } catch (PersistentException ex) {
            Logger.getLogger(Customer_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
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
                if (this.getSelected().getCustomer_detail_id() > 0) {
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
            if (is_dialog) {
                job_cardBean.getSelected().setCustomer_detail(this.getSelected());
                RequestContext.getCurrentInstance().execute("PF('Dialog_Customer_Detail').hide()");
                RequestContext.getCurrentInstance().update(":form_job_card");
            }
            this.clearCache(this.getSelected());
            this.setFormstate("view");
            add();
            //initializelist();
            loginBean.saveMessage();
        } catch (PersistentException ex) {
            Logger.getLogger(Customer_detailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cancelcloseDialog() {
        RequestContext.getCurrentInstance().execute("PF('Dialog_Customer_Detail').hide()");
    }

}
