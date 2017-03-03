/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.logging.Level;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import models.Customer_detail;
import models.User_detail;
import org.orm.PersistentException;
import org.primefaces.context.RequestContext;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class Customer_detailBean extends AbstractBean<Customer_detail> implements Serializable {

    public Customer_detailBean() {
        super(Customer_detail.class);
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

    @Override
    public void save(User_detail aUserDetailId) {
        super.save(aUserDetailId); //To change body of generated methods, choose Tools | Templates.
        RequestContext.getCurrentInstance().execute("PF('Dialog_Customer_Detail').hide()");
        RequestContext.getCurrentInstance().update(":form_job_card");
    }

    public void cancelcloseDialog() {
        RequestContext.getCurrentInstance().execute("PF('Dialog_Customer_Detail').hide()");
    }

}
