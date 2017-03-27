/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import models.JobCardPersistentManager;
import models.Job_card;
import org.orm.PersistentException;
import utilities.GeneralUtilities;

/**
 *
 * @author philp
 */
@ManagedBean
@SessionScoped
public class ReportBean implements Serializable{
    private List<Job_card> job_card_list; 
    private Date start_date;
    private Date end_date;
    private List<Object[]> job_status_count;

    public List<Object[]> getJob_status_count() {
        return job_status_count;
    }

    public void setJob_status_count(List<Object[]> job_status_count) {
        this.job_status_count = job_status_count;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
    public List<Job_card> getJob_card_list() {
        return job_card_list;
    }

    public void setJob_card_list(List<Job_card> job_card_list) {
        this.job_card_list = job_card_list;
    }
    public void query_job_card(){
        try {
            String sql="job_date between '"+ GeneralUtilities.simpleDateFormatDate().format(start_date) +"' and '"+ GeneralUtilities.simpleDateFormatDate().format(end_date)+"'";
            job_card_list = Job_card.queryJob_card(sql, null);
        } catch (PersistentException ex) {
            Logger.getLogger(ReportBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void query_status_total(){
        try {
            String sql="SELECT DISTINCT Status,COUNT(*) FROM job_card where job_date between '"+ GeneralUtilities.simpleDateFormatDate().format(start_date) +"' and '"+ GeneralUtilities.simpleDateFormatDate().format(end_date)+"' GROUP BY Status";
            //job_card_list = Job_card.queryJob_card(sql, null);
            job_status_count=(List<Object[]>)JobCardPersistentManager.instance().getSession().createSQLQuery(sql).list();
        } catch (PersistentException ex) {
            Logger.getLogger(ReportBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
