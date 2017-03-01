/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import models.Customer_detail;
import models.JobCardPersistentManager;
import models.Job_card;
import models.Supplier_detail;
import org.orm.PersistentException;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class Job_cardBean extends AbstractBean<Job_card> implements Serializable {

    private Customer_detail customer_detail;
    private Supplier_detail supplier_detail;

    public Customer_detail getCustomer_detail() {
        return customer_detail;
    }

    public void setCustomer_detail(Customer_detail customer_detail) {
        this.customer_detail = customer_detail;
    }

    public Supplier_detail getSupplier_detail() {
        return supplier_detail;
    }

    public void setSupplier_detail(Supplier_detail supplier_detail) {
        this.supplier_detail = supplier_detail;
    }
    
    public Job_cardBean() {
        super(Job_card.class);
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
    
    public List<Customer_detail> completeCustomer_detail(String query) {
        List<Customer_detail> filteredCustomer_details = new ArrayList<>();
        try {
            filteredCustomer_details = (List<Customer_detail>) JobCardPersistentManager.instance().getSession().createQuery("select de FROM Customer_detail  de where de.is_deleted<>1 AND ( de.customer_name like '%" + query + "%' OR  de.contact_person_name '%" + query + "%' or de.telephone1 like '%" + query + "%' OR de.telephone2 like '%" + query + "%' OR de.email like '%" + query + "%')").list();
        } catch (PersistentException ex) {
            Logger.getLogger(Customer_detailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filteredCustomer_details;
    }
    
    public List<Supplier_detail> completeSupplier_detail(String query) {
        List<Supplier_detail> filteredSupplier_details = new ArrayList<>();
        try {
            filteredSupplier_details = (List<Supplier_detail>) JobCardPersistentManager.instance().getSession().createQuery("select de FROM Supplier_detail  de where de.is_deleted<>1 AND ( de.supplier_name like '%" + query + "%' OR  de.telephone '%" + query + "%')").list();
        } catch (PersistentException ex) {
            Logger.getLogger(Customer_detailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filteredSupplier_details;
    }
}
