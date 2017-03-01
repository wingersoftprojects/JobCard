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
import models.Job_card_item;
import models.Paper_type;
import models.Supplier_detail;
import org.orm.PersistentException;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class Job_cardBean extends AbstractBean<Job_card> implements Serializable {

    private Job_card_item job_card_item = new Job_card_item();
    private List<Job_card_item> job_card_items = new ArrayList<>();

    public Job_card_item getJob_card_item() {
        return job_card_item;
    }

    public void setJob_card_item(Job_card_item job_card_item) {
        this.job_card_item = job_card_item;
    }

    public List<Job_card_item> getJob_card_items() {
        return job_card_items;
    }

    public void setJob_card_items(List<Job_card_item> job_card_items) {
        this.job_card_items = job_card_items;
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
            filteredCustomer_details = (List<Customer_detail>) JobCardPersistentManager.instance().getSession().createQuery("select de FROM Customer_detail  de where de.is_deleted<>1 AND ( de.customer_name like '%" + query + "%' OR  de.contact_person_name like '%" + query + "%' or de.telephone1 like '%" + query + "%' OR de.telephone2 like '%" + query + "%' OR de.email like '%" + query + "%')").list();
        } catch (PersistentException ex) {
            Logger.getLogger(Customer_detailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filteredCustomer_details;
    }

    public List<Supplier_detail> completeSupplier_detail(String query) {
        List<Supplier_detail> filteredSupplier_details = new ArrayList<>();
        try {
            filteredSupplier_details = (List<Supplier_detail>) JobCardPersistentManager.instance().getSession().createQuery("select de FROM Supplier_detail  de where de.is_deleted<>1 AND ( de.supplier_name like '%" + query + "%' OR  de.telephone like '%" + query + "%')").list();
        } catch (PersistentException ex) {
            Logger.getLogger(Customer_detailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filteredSupplier_details;
    }
    public List<Paper_type> completePaper_type(String query) {
        List<Paper_type> filteredPaper_types = new ArrayList<>();
        try {
            filteredPaper_types = (List<Paper_type>) JobCardPersistentManager.instance().getSession().createQuery("select de FROM Paper_type  de where de.is_deleted<>1 AND ( de.paper_type_category like '%" + query + "%' OR  de.paper_type_sub_category like '%" + query + "%')").list();
        } catch (PersistentException ex) {
            Logger.getLogger(Customer_detailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filteredPaper_types;
    }

    public void add_job_card_item() {
        if (job_card_items == null) {
            job_card_items = new ArrayList<>();
        }
        job_card_items.add(job_card_item);
        job_card_item = new Job_card_item();
    }

    public void remove_item(Job_card_item item) {
        job_card_items.remove(item);
    }
}
