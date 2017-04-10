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
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import models.Customer_detail;
import models.JobCardPersistentManager;
import models.Job_card;
import models.Job_card_item;
import models.Job_card_status;
import models.Paper_type;
import models.Supplier_detail;
import models.User_detail;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.primefaces.context.RequestContext;
import utilities.GeneralUtilities;
import utilities.SendMail;
import utilities.Sender;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class Job_cardBean extends AbstractBean<Job_card> implements Serializable {

    private Job_card_item job_card_item = new Job_card_item();
    private List<Job_card_item> job_card_items = new ArrayList<>();
    private Job_card prev_job_card;
    private Job_card_status job_card_status;
    private String status = "";
    private String comment = "";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Job_card_status getJob_card_status() {
        return job_card_status;
    }

    public void setJob_card_status(Job_card_status job_card_status) {
        this.job_card_status = job_card_status;
    }

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

    public List<User_detail> completeUser_detail(String query) {
        List<User_detail> filteredUser_details = new ArrayList<>();
        try {
            String sql = "select de FROM User_detail  de where de.is_deleted<>1 AND ( de.first_name like '%" + query.trim() + "%' OR  de.second_name like '%" + query.trim() + "%' OR de.email like '%" + query.trim() + "%' OR de.third_name like '%" + query.trim() + "%' OR de.user_name like '%" + query.trim() + "%')";
            filteredUser_details = (List<User_detail>) JobCardPersistentManager.instance().getSession().createQuery(sql).list();
        } catch (PersistentException ex) {
            Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filteredUser_details;
    }

    public List<String> completeText(String query) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            results.add(query + i);
        }

        return results;
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
                status = "Captured";
                prev_job_card = this.getSelected();
                add_job_card_status();
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
            try {
                new SendMail().send_mail("Please note that you have a new job assigned to you. Login to view the job details. Thank You ", prev_job_card.getJob_manager().getEmail(), prev_job_card.getJob_manager().getFirst_name() + " " + prev_job_card.getJob_manager().getSecond_name());
            } catch (Exception ex) {
                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Save", ex.getMessage());
                RequestContext.getCurrentInstance().showMessageInDialog(message);
            }

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

    public void create_delivery_note(int job_card_id) {
        try {
            this.setSelected(Job_card.getJob_cardByORMID(job_card_id));
            job_card_items = new ArrayList<>(this.getSelected().getJob_card_item());
        } catch (PersistentException ex) {
            Logger.getLogger(Job_cardBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void change_job_card_status() {
        if (prev_job_card != null) {
            try {
                PersistentTransaction transaction = JobCardPersistentManager.instance().getSession().beginTransaction();
                prev_job_card.setLast_edit_by(loginBean.getUser_detail());
                prev_job_card.setLast_edit_date(new Timestamp(new Date().getTime()));
                prev_job_card.setStatus(status);
                JobCardPersistentManager.instance().getSession().merge(prev_job_card);
                add_job_card_status();
                transaction.commit();
                try {
                    //String contact = "+256" + prev_job_card.getCustomer_detail().getContact_person_telephone1().substring(1).replace("(", "").replace(")", "").replace(" ", "").replace("-", "");
                    if ("Ready".equals(status)) {
                        Sender s = new Sender("121.241.242.114", 8080, "wing-sharkmedia", "sharkmed", "Please note that the printing job at SHARK Media is ready for delivery", "1", "0", "256782760115", "SHARK-MEDIA");
                        s.submitMessage();
                        //new GeneralUtilities().send_sms(contact, "Please note that the printing job at SHARK Media is ready for delivery");
                        new SendMail().send_mail("Please note that the printing job at SHARK Media is ready for delivery", prev_job_card.getCustomer_detail().getContact_person_email(), prev_job_card.getCustomer_detail().getContact_person_name());
                    }
                    if ("Delivered".equals(status)) {
                        //new GeneralUtilities().send_sms(contact, "Please note that the printing job at SHARK Media has been delivered");
                        Sender s = new Sender("121.241.242.114", 8080, "wing-sharkmedia", "sharkmed", "Please note that the printing job at SHARK Media has been delivered", "1", "0", "256782760115", "SHARK-MEDIA");
                        s.submitMessage();
                        new SendMail().send_mail("Please note that the printing job at SHARK Media has been delivered<br/> By: " + prev_job_card.getDelivered_by() + " <br/> Telephone: " + prev_job_card.getDelivered_by_phone_number(), prev_job_card.getCustomer_detail().getContact_person_email(), prev_job_card.getCustomer_detail().getContact_person_name());
                    }
                } catch (Exception ex) {
                    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Save", ex.getMessage());
                    RequestContext.getCurrentInstance().showMessageInDialog(message);
                }
                RequestContext.getCurrentInstance().execute("PF('Dialog_Change_Job_Card_Status').hide()");               
                RequestContext.getCurrentInstance().update(":form_job_card_view");
                clear_comment();
            } catch (PersistentException ex) {
                Logger.getLogger(Job_cardBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void add_job_card_status() {
        try {
            job_card_status = new Job_card_status();
            job_card_status.setStatus(status);
            job_card_status.setComment(comment);
            job_card_status.setJob_card(prev_job_card);
            job_card_status.setAdd_by(loginBean.getUser_detail());
            job_card_status.setAdd_date(new Timestamp(new Date().getTime()));
            job_card_status.save();
        } catch (PersistentException ex) {
            Logger.getLogger(Job_cardBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void clear_comment() {
        status = "";
        comment = "";
    }

    public void cancel_status() {
        RequestContext.getCurrentInstance().execute("PF('Dialog_Change_Job_Card_Status').hide()");
    }

    public String get_job_status_comments(Job_card j) {
        String comments = "";
        List<Job_card_status> job_card_statuses = new ArrayList<>(j.getJob_card_status());
        int x = 0;
        for (Job_card_status j1 : job_card_statuses) {
            if (x == 0) {
                comments += j1.getComment();
            } else {
                comments += "" + j1.getComment();
            }
            x++;
        }
        return comments;
    }

}
