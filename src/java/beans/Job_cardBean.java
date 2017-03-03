/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import models.Customer_detail;
import models.JobCardPersistentManager;
import models.Job_card;
import models.Job_card_item;
import models.Paper_type;
import models.Supplier_detail;
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
public class Job_cardBean extends AbstractBean<Job_card> implements Serializable {

    private Job_card_item job_card_item = new Job_card_item();
    private List<Job_card_item> job_card_items = new ArrayList<>();

    Job_card prev_job_card;

    public Job_card getPrev_job_card() {
        return prev_job_card;
    }

    public void setPrev_job_card(Job_card prev_job_card) {
        this.prev_job_card = prev_job_card;
    }

    private float total_amount;

    public float getTotal_amount() {
        compute_total();
        return total_amount;
    }

    public void setTotal_amount(float total_amount) {
        this.total_amount = total_amount;
    }

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
            String sql = "select de FROM Customer_detail  de where de.is_deleted<>1 AND ( de.customer_name like '%" + query + "%' OR  de.contact_person_name like '%" + query + "%' or de.telephone1 like '%" + query + "%' OR de.telephone2 like '%" + query + "%' OR de.email like '%" + query + "%')";
            filteredCustomer_details = (List<Customer_detail>) JobCardPersistentManager.instance().getSession().createQuery(sql).list();
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
            filteredPaper_types = (List<Paper_type>) JobCardPersistentManager.instance().getSession().createQuery("select de FROM Paper_type  de where de.is_deleted<>1 AND ( de.paper_type_category like '%" + query.trim() + "%' OR  de.paper_type_sub_category like '%" + query + "%')").list();
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
        compute_total();
        job_card_item = new Job_card_item();
    }

    public void compute_total() {
        total_amount = 0;
        for (Job_card_item j : job_card_items) {
            total_amount += j.getAmount();
        }
    }

    public void remove_item(Job_card_item item) {
        job_card_items.remove(item);
    }

    public void compute_amount() {
        job_card_item.setAmount(job_card_item.getRate() * job_card_item.getQuantity());
    }

    @Override
    public void save(User_detail aUserDetailId) {
        if (job_card_items.isEmpty()) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Save", "Please enter atleat one Job Card Item!");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
        }
        try {
            PersistentTransaction transaction = JobCardPersistentManager.instance().getSession().beginTransaction();
            if (this.getFormstate().equals("add")) {
                this.getSelected().setAdd_by(aUserDetailId);
                this.getSelected().setAdd_date(new Timestamp(new Date().getTime()));
                this.getSelected().setIs_active(1);
                this.getSelected().setIs_deleted(0);
                this.getSelected().setStatus("Captured");
                if (this.getSelected().getJob_card_id() > 0) {
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

            //transaction.commit();
            /**
             * Save Job Card Items
             */
            //transaction = JobCardPersistentManager.instance().getSession().beginTransaction();
            if (this.getFormstate().equals("add")) {
                for (Job_card_item j : job_card_items) {
                    if (j.getIs_deleted() == null) {
                        j.setJob_card(this.getSelected());
                        j.setAdd_by(aUserDetailId);
                        j.setAdd_date(new Timestamp(new Date().getTime()));
                        j.setIs_active(1);
                        j.setIs_deleted(0);
                        j.save();
                    }
                }
            }
            if (this.getFormstate().equals("edit")) {
                for (Job_card_item j : job_card_items) {
                    j.setLast_edit_by(aUserDetailId);
                    j.setLast_edit_date(new Timestamp(new Date().getTime()));
                    JobCardPersistentManager.instance().getSession().merge(j);
                }
            }
            transaction.commit();
            /**
             * End Job Card Items
             */
            prev_job_card = this.getSelected();
            clearCache(this.getSelected());
            this.setFormstate("view");
            add();
            loginBean.saveMessage();
        } catch (PersistentException ex) {
            Logger.getLogger(Job_cardBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void add() {
        job_card_items = new ArrayList<>();
        job_card_item = new Job_card_item();
        super.add(); //To change body of generated methods, choose Tools | Templates.
    }

    public void view_job_card(int job_card_id) {
        try {
            this.setSelected(Job_card.getJob_cardByORMID(job_card_id));
            job_card_items = new ArrayList<>(this.getSelected().getJob_card_item());
        } catch (PersistentException ex) {
            Logger.getLogger(Job_cardBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
