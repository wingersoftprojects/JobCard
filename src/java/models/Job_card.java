/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: rlumala
 * License Type: Purchased
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
@Table(name="job_card")
public class Job_card implements Serializable {
	public Job_card() {
	}
	
	public static Job_card loadJob_cardByORMID(int job_card_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadJob_cardByORMID(session, job_card_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card getJob_cardByORMID(int job_card_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getJob_cardByORMID(session, job_card_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card loadJob_cardByORMID(int job_card_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadJob_cardByORMID(session, job_card_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card getJob_cardByORMID(int job_card_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getJob_cardByORMID(session, job_card_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card loadJob_cardByORMID(PersistentSession session, int job_card_id) throws PersistentException {
		try {
			return (Job_card) session.load(models.Job_card.class, new Integer(job_card_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card getJob_cardByORMID(PersistentSession session, int job_card_id) throws PersistentException {
		try {
			return (Job_card) session.get(models.Job_card.class, new Integer(job_card_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card loadJob_cardByORMID(PersistentSession session, int job_card_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Job_card) session.load(models.Job_card.class, new Integer(job_card_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card getJob_cardByORMID(PersistentSession session, int job_card_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Job_card) session.get(models.Job_card.class, new Integer(job_card_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJob_card(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryJob_card(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJob_card(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryJob_card(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card[] listJob_cardByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listJob_cardByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card[] listJob_cardByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listJob_cardByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJob_card(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Job_card as Job_card");
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
	
	public static List queryJob_card(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Job_card as Job_card");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Job_card", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card[] listJob_cardByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryJob_card(session, condition, orderBy);
			return (Job_card[]) list.toArray(new Job_card[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card[] listJob_cardByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryJob_card(session, condition, orderBy, lockMode);
			return (Job_card[]) list.toArray(new Job_card[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card loadJob_cardByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadJob_cardByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card loadJob_cardByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadJob_cardByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card loadJob_cardByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Job_card[] job_cards = listJob_cardByQuery(session, condition, orderBy);
		if (job_cards != null && job_cards.length > 0)
			return job_cards[0];
		else
			return null;
	}
	
	public static Job_card loadJob_cardByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Job_card[] job_cards = listJob_cardByQuery(session, condition, orderBy, lockMode);
		if (job_cards != null && job_cards.length > 0)
			return job_cards[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateJob_cardByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateJob_cardByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJob_cardByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateJob_cardByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJob_cardByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Job_card as Job_card");
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
	
	public static java.util.Iterator iterateJob_cardByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Job_card as Job_card");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Job_card", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card loadJob_cardByCriteria(Job_cardCriteria job_cardCriteria) {
		Job_card[] job_cards = listJob_cardByCriteria(job_cardCriteria);
		if(job_cards == null || job_cards.length == 0) {
			return null;
		}
		return job_cards[0];
	}
	
	public static Job_card[] listJob_cardByCriteria(Job_cardCriteria job_cardCriteria) {
		return job_cardCriteria.listJob_card();
	}
	
	public static Job_card createJob_card() {
		return new models.Job_card();
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
			if(getCustomer_detail() != null) {
				getCustomer_detail().getJob_card().remove(this);
			}
			
			if(getAdd_by() != null) {
				getAdd_by().getJob_card().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getJob_card1().remove(this);
			}
			
			if(getJob_manager() != null) {
				getJob_manager().getJob_card2().remove(this);
			}
			
			if(getContact_person_detail() != null) {
				getContact_person_detail().getJob_card().remove(this);
			}
			
			models.Job_card_item[] lJob_card_items = (models.Job_card_item[])getJob_card_item().toArray(new models.Job_card_item[getJob_card_item().size()]);
			for(int i = 0; i < lJob_card_items.length; i++) {
				lJob_card_items[i].setJob_card(null);
			}
			if(getDelivery_note() != null) {
				getDelivery_note().setJob_card(null);
			}
			
			models.User_action[] lUser_actions = (models.User_action[])getUser_action().toArray(new models.User_action[getUser_action().size()]);
			for(int i = 0; i < lUser_actions.length; i++) {
				lUser_actions[i].setJob_card(null);
			}
			models.Job_card_status[] lJob_card_statuss = (models.Job_card_status[])getJob_card_status().toArray(new models.Job_card_status[getJob_card_status().size()]);
			for(int i = 0; i < lJob_card_statuss.length; i++) {
				lJob_card_statuss[i].setJob_card(null);
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
			if(getCustomer_detail() != null) {
				getCustomer_detail().getJob_card().remove(this);
			}
			
			if(getAdd_by() != null) {
				getAdd_by().getJob_card().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getJob_card1().remove(this);
			}
			
			if(getJob_manager() != null) {
				getJob_manager().getJob_card2().remove(this);
			}
			
			if(getContact_person_detail() != null) {
				getContact_person_detail().getJob_card().remove(this);
			}
			
			models.Job_card_item[] lJob_card_items = (models.Job_card_item[])getJob_card_item().toArray(new models.Job_card_item[getJob_card_item().size()]);
			for(int i = 0; i < lJob_card_items.length; i++) {
				lJob_card_items[i].setJob_card(null);
			}
			if(getDelivery_note() != null) {
				getDelivery_note().setJob_card(null);
			}
			
			models.User_action[] lUser_actions = (models.User_action[])getUser_action().toArray(new models.User_action[getUser_action().size()]);
			for(int i = 0; i < lUser_actions.length; i++) {
				lUser_actions[i].setJob_card(null);
			}
			models.Job_card_status[] lJob_card_statuss = (models.Job_card_status[])getJob_card_status().toArray(new models.Job_card_status[getJob_card_status().size()]);
			for(int i = 0; i < lJob_card_statuss.length; i++) {
				lJob_card_statuss[i].setJob_card(null);
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
	
	@Column(name="job_card_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MODELS_JOB_CARD_JOB_CARD_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELS_JOB_CARD_JOB_CARD_ID_GENERATOR", strategy="native")	
	private int job_card_id;
	
	@ManyToOne(targetEntity=models.Customer_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="customer_detail_id", referencedColumnName="customer_detail_id", nullable=false) })	
	private models.Customer_detail customer_detail;
	
	@Column(name="job_card_number", nullable=true, length=50)	
	private Integer job_card_number;
	
	@Column(name="is_active", nullable=false, length=1)	
	private int is_active;
	
	@Column(name="is_deleted", nullable=false, length=1)	
	private int is_deleted;
	
	@Column(name="add_date", nullable=false)	
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
	
	@Column(name="job_date", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date job_date;
	
	@Column(name="status", nullable=false, length=100)	
	private String status;
	
	@Column(name="due_date", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date due_date;
	
	@ManyToOne(targetEntity=models.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="job_manager_id", referencedColumnName="user_detail_id") })	
	private models.User_detail job_manager;
	
	@Column(name="delivered_by", nullable=true, length=100)	
	private String delivered_by;
	
	@Column(name="delivered_by_phone_number", nullable=true, length=100)	
	private String delivered_by_phone_number;
	
	@ManyToOne(targetEntity=models.Contact_person_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="contact_person_detail_id", referencedColumnName="contact_person_detail_id") })	
	private models.Contact_person_detail contact_person_detail;
	
	@OneToMany(mappedBy="job_card", targetEntity=models.Job_card_item.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set job_card_item = new java.util.HashSet();
	
	@OneToOne(mappedBy="job_card", targetEntity=models.Delivery_note.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private models.Delivery_note delivery_note;
	
	@OneToMany(mappedBy="job_card", targetEntity=models.User_action.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set user_action = new java.util.HashSet();
	
	@OneToMany(mappedBy="job_card", targetEntity=models.Job_card_status.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set job_card_status = new java.util.HashSet();
	
	private void setJob_card_id(int value) {
		this.job_card_id = value;
	}
	
	public int getJob_card_id() {
		return job_card_id;
	}
	
	public int getORMID() {
		return getJob_card_id();
	}
	
	public void setJob_card_number(int value) {
		setJob_card_number(new Integer(value));
	}
	
	public void setJob_card_number(Integer value) {
		this.job_card_number = value;
	}
	
	public Integer getJob_card_number() {
		return job_card_number;
	}
	
	public void setIs_active(int value) {
		this.is_active = value;
	}
	
	public int getIs_active() {
		return is_active;
	}
	
	public void setIs_deleted(int value) {
		this.is_deleted = value;
	}
	
	public int getIs_deleted() {
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
	
	public void setJob_date(java.util.Date value) {
		this.job_date = value;
	}
	
	public java.util.Date getJob_date() {
		return job_date;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setDue_date(java.util.Date value) {
		this.due_date = value;
	}
	
	public java.util.Date getDue_date() {
		return due_date;
	}
	
	public void setDelivered_by(String value) {
		this.delivered_by = value;
	}
	
	public String getDelivered_by() {
		return delivered_by;
	}
	
	public void setDelivered_by_phone_number(String value) {
		this.delivered_by_phone_number = value;
	}
	
	public String getDelivered_by_phone_number() {
		return delivered_by_phone_number;
	}
	
	public void setCustomer_detail(models.Customer_detail value) {
		this.customer_detail = value;
	}
	
	public models.Customer_detail getCustomer_detail() {
		return customer_detail;
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
	
	public void setJob_manager(models.User_detail value) {
		this.job_manager = value;
	}
	
	public models.User_detail getJob_manager() {
		return job_manager;
	}
	
	public void setContact_person_detail(models.Contact_person_detail value) {
		this.contact_person_detail = value;
	}
	
	public models.Contact_person_detail getContact_person_detail() {
		return contact_person_detail;
	}
	
	public void setJob_card_item(java.util.Set value) {
		this.job_card_item = value;
	}
	
	public java.util.Set getJob_card_item() {
		return job_card_item;
	}
	
	
	public void setDelivery_note(models.Delivery_note value) {
		this.delivery_note = value;
	}
	
	public models.Delivery_note getDelivery_note() {
		return delivery_note;
	}
	
	public void setUser_action(java.util.Set value) {
		this.user_action = value;
	}
	
	public java.util.Set getUser_action() {
		return user_action;
	}
	
	
	public void setJob_card_status(java.util.Set value) {
		this.job_card_status = value;
	}
	
	public java.util.Set getJob_card_status() {
		return job_card_status;
	}
	
	
	public boolean equals(Object obj) {
		if (obj == null) {
				 return false;
				 }
				Job_card object = (Job_card) obj;
				return (this.getJob_card_id() == object.getJob_card_id());
	}
	
	public int hashCode() {
		int hash = 3;
				return hash;
	}
	
	public String toString() {
		return String.valueOf(getJob_card_id());
	}
	
}
