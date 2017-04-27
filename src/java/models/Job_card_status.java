/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package models;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="job_card_status")
public class Job_card_status implements Serializable {
	public Job_card_status() {
	}
	
	public static Job_card_status loadJob_card_statusByORMID(int job_card_status_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadJob_card_statusByORMID(session, job_card_status_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status getJob_card_statusByORMID(int job_card_status_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getJob_card_statusByORMID(session, job_card_status_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status loadJob_card_statusByORMID(int job_card_status_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadJob_card_statusByORMID(session, job_card_status_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status getJob_card_statusByORMID(int job_card_status_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getJob_card_statusByORMID(session, job_card_status_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status loadJob_card_statusByORMID(PersistentSession session, int job_card_status_id) throws PersistentException {
		try {
			return (Job_card_status) session.load(models.Job_card_status.class, new Integer(job_card_status_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status getJob_card_statusByORMID(PersistentSession session, int job_card_status_id) throws PersistentException {
		try {
			return (Job_card_status) session.get(models.Job_card_status.class, new Integer(job_card_status_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status loadJob_card_statusByORMID(PersistentSession session, int job_card_status_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Job_card_status) session.load(models.Job_card_status.class, new Integer(job_card_status_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status getJob_card_statusByORMID(PersistentSession session, int job_card_status_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Job_card_status) session.get(models.Job_card_status.class, new Integer(job_card_status_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJob_card_status(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryJob_card_status(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJob_card_status(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryJob_card_status(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status[] listJob_card_statusByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listJob_card_statusByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status[] listJob_card_statusByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listJob_card_statusByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJob_card_status(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Job_card_status as Job_card_status");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJob_card_status(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Job_card_status as Job_card_status");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Job_card_status", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status[] listJob_card_statusByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryJob_card_status(session, condition, orderBy);
			return (Job_card_status[]) list.toArray(new Job_card_status[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status[] listJob_card_statusByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryJob_card_status(session, condition, orderBy, lockMode);
			return (Job_card_status[]) list.toArray(new Job_card_status[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status loadJob_card_statusByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadJob_card_statusByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status loadJob_card_statusByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadJob_card_statusByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status loadJob_card_statusByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Job_card_status[] job_card_statuses = listJob_card_statusByQuery(session, condition, orderBy);
		if (job_card_statuses != null && job_card_statuses.length > 0)
			return job_card_statuses[0];
		else
			return null;
	}
	
	public static Job_card_status loadJob_card_statusByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Job_card_status[] job_card_statuses = listJob_card_statusByQuery(session, condition, orderBy, lockMode);
		if (job_card_statuses != null && job_card_statuses.length > 0)
			return job_card_statuses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateJob_card_statusByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateJob_card_statusByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJob_card_statusByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateJob_card_statusByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJob_card_statusByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Job_card_status as Job_card_status");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJob_card_statusByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Job_card_status as Job_card_status");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Job_card_status", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_status loadJob_card_statusByCriteria(Job_card_statusCriteria job_card_statusCriteria) {
		Job_card_status[] job_card_statuses = listJob_card_statusByCriteria(job_card_statusCriteria);
		if(job_card_statuses == null || job_card_statuses.length == 0) {
			return null;
		}
		return job_card_statuses[0];
	}
	
	public static Job_card_status[] listJob_card_statusByCriteria(Job_card_statusCriteria job_card_statusCriteria) {
		return job_card_statusCriteria.listJob_card_status();
	}
	
	public static Job_card_status createJob_card_status() {
		return new models.Job_card_status();
	}
	
	public boolean save() throws PersistentException {
		try {
			models.JobCardPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			models.JobCardPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			models.JobCardPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			models.JobCardPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getJob_card() != null) {
				getJob_card().getJob_card_status().remove(this);
			}
			
			if(getAdd_by() != null) {
				getAdd_by().getJob_card_status().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getJob_card_status1().remove(this);
			}
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getJob_card() != null) {
				getJob_card().getJob_card_status().remove(this);
			}
			
			if(getAdd_by() != null) {
				getAdd_by().getJob_card_status().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getJob_card_status1().remove(this);
			}
			
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	@Column(name="job_card_status_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="MODELS_JOB_CARD_STATUS_JOB_CARD_STATUS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELS_JOB_CARD_STATUS_JOB_CARD_STATUS_ID_GENERATOR", strategy="native")	
	private int job_card_status_id;
	
	@ManyToOne(targetEntity=models.Job_card.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="job_card", referencedColumnName="job_card_id", nullable=false) })	
	private models.Job_card job_card;
	
	@Column(name="status", nullable=false, length=100)	
	private String status;
	
	@Column(name="is_active", nullable=true, length=1)	
	private Integer is_active;
	
	@Column(name="is_deleted", nullable=true, length=1)	
	private Integer is_deleted;
	
	@Column(name="add_date", nullable=true)	
	private java.sql.Timestamp add_date;
	
	@ManyToOne(targetEntity=models.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="add_by", referencedColumnName="user_detail_id", nullable=false) })	
	private models.User_detail add_by;
	
	@Column(name="last_edit_date", nullable=true)	
	private java.sql.Timestamp last_edit_date;
	
	@ManyToOne(targetEntity=models.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="last_edit_by", referencedColumnName="user_detail_id") })	
	private models.User_detail last_edit_by;
	
	@Column(name="comment", nullable=true)	
	private String comment;
	
	private void setJob_card_status_id(int value) {
		this.job_card_status_id = value;
	}
	
	public int getJob_card_status_id() {
		return job_card_status_id;
	}
	
	public int getORMID() {
		return getJob_card_status_id();
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setIs_active(int value) {
		setIs_active(new Integer(value));
	}
	
	public void setIs_active(Integer value) {
		this.is_active = value;
	}
	
	public Integer getIs_active() {
		return is_active;
	}
	
	public void setIs_deleted(int value) {
		setIs_deleted(new Integer(value));
	}
	
	public void setIs_deleted(Integer value) {
		this.is_deleted = value;
	}
	
	public Integer getIs_deleted() {
		return is_deleted;
	}
	
	public void setAdd_date(java.sql.Timestamp value) {
		this.add_date = value;
	}
	
	public java.sql.Timestamp getAdd_date() {
		return add_date;
	}
	
	public void setLast_edit_date(java.sql.Timestamp value) {
		this.last_edit_date = value;
	}
	
	public java.sql.Timestamp getLast_edit_date() {
		return last_edit_date;
	}
	
	public void setComment(String value) {
		this.comment = value;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setJob_card(models.Job_card value) {
		this.job_card = value;
	}
	
	public models.Job_card getJob_card() {
		return job_card;
	}
	
	public void setAdd_by(models.User_detail value) {
		this.add_by = value;
	}
	
	public models.User_detail getAdd_by() {
		return add_by;
	}
	
	public void setLast_edit_by(models.User_detail value) {
		this.last_edit_by = value;
	}
	
	public models.User_detail getLast_edit_by() {
		return last_edit_by;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
				 return false;
				 }
				Job_card_status object = (Job_card_status) obj;
				return (this.getJob_card_status_id() == object.getJob_card_status_id());
	}
	
	public int hashCode() {
		int hash = 3;
				return hash;
	}
	
	public String toString() {
		return String.valueOf(getJob_card_status_id());
	}
	
}
