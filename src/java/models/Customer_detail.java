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
@Table(name="customer_detail")
public class Customer_detail implements Serializable {
	public Customer_detail() {
	}
	
	public static Customer_detail loadCustomer_detailByORMID(int customer_detail_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadCustomer_detailByORMID(session, customer_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail getCustomer_detailByORMID(int customer_detail_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getCustomer_detailByORMID(session, customer_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail loadCustomer_detailByORMID(int customer_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadCustomer_detailByORMID(session, customer_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail getCustomer_detailByORMID(int customer_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getCustomer_detailByORMID(session, customer_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail loadCustomer_detailByORMID(PersistentSession session, int customer_detail_id) throws PersistentException {
		try {
			return (Customer_detail) session.load(models.Customer_detail.class, new Integer(customer_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail getCustomer_detailByORMID(PersistentSession session, int customer_detail_id) throws PersistentException {
		try {
			return (Customer_detail) session.get(models.Customer_detail.class, new Integer(customer_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail loadCustomer_detailByORMID(PersistentSession session, int customer_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Customer_detail) session.load(models.Customer_detail.class, new Integer(customer_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail getCustomer_detailByORMID(PersistentSession session, int customer_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Customer_detail) session.get(models.Customer_detail.class, new Integer(customer_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCustomer_detail(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryCustomer_detail(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCustomer_detail(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryCustomer_detail(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail[] listCustomer_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listCustomer_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail[] listCustomer_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listCustomer_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCustomer_detail(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Customer_detail as Customer_detail");
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
	
	public static List queryCustomer_detail(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Customer_detail as Customer_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Customer_detail", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail[] listCustomer_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCustomer_detail(session, condition, orderBy);
			return (Customer_detail[]) list.toArray(new Customer_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail[] listCustomer_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCustomer_detail(session, condition, orderBy, lockMode);
			return (Customer_detail[]) list.toArray(new Customer_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail loadCustomer_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadCustomer_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail loadCustomer_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadCustomer_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail loadCustomer_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Customer_detail[] customer_details = listCustomer_detailByQuery(session, condition, orderBy);
		if (customer_details != null && customer_details.length > 0)
			return customer_details[0];
		else
			return null;
	}
	
	public static Customer_detail loadCustomer_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Customer_detail[] customer_details = listCustomer_detailByQuery(session, condition, orderBy, lockMode);
		if (customer_details != null && customer_details.length > 0)
			return customer_details[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCustomer_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateCustomer_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCustomer_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateCustomer_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCustomer_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Customer_detail as Customer_detail");
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
	
	public static java.util.Iterator iterateCustomer_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Customer_detail as Customer_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Customer_detail", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer_detail loadCustomer_detailByCriteria(Customer_detailCriteria customer_detailCriteria) {
		Customer_detail[] customer_details = listCustomer_detailByCriteria(customer_detailCriteria);
		if(customer_details == null || customer_details.length == 0) {
			return null;
		}
		return customer_details[0];
	}
	
	public static Customer_detail[] listCustomer_detailByCriteria(Customer_detailCriteria customer_detailCriteria) {
		return customer_detailCriteria.listCustomer_detail();
	}
	
	public static Customer_detail createCustomer_detail() {
		return new models.Customer_detail();
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
			if(getAdd_by() != null) {
				getAdd_by().getCustomer_detail().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getCustomer_detail1().remove(this);
			}
			
			models.Delivery_note[] lDelivery_notes = (models.Delivery_note[])getDelivery_note().toArray(new models.Delivery_note[getDelivery_note().size()]);
			for(int i = 0; i < lDelivery_notes.length; i++) {
				lDelivery_notes[i].setCustomer_detaill(null);
			}
			models.Job_card[] lJob_cards = (models.Job_card[])getJob_card().toArray(new models.Job_card[getJob_card().size()]);
			for(int i = 0; i < lJob_cards.length; i++) {
				lJob_cards[i].setCustomer_detail(null);
			}
			models.Contact_person_detail[] lContact_person_details = (models.Contact_person_detail[])getContact_person_detail().toArray(new models.Contact_person_detail[getContact_person_detail().size()]);
			for(int i = 0; i < lContact_person_details.length; i++) {
				lContact_person_details[i].setCustomer_detail(null);
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
			if(getAdd_by() != null) {
				getAdd_by().getCustomer_detail().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getCustomer_detail1().remove(this);
			}
			
			models.Delivery_note[] lDelivery_notes = (models.Delivery_note[])getDelivery_note().toArray(new models.Delivery_note[getDelivery_note().size()]);
			for(int i = 0; i < lDelivery_notes.length; i++) {
				lDelivery_notes[i].setCustomer_detaill(null);
			}
			models.Job_card[] lJob_cards = (models.Job_card[])getJob_card().toArray(new models.Job_card[getJob_card().size()]);
			for(int i = 0; i < lJob_cards.length; i++) {
				lJob_cards[i].setCustomer_detail(null);
			}
			models.Contact_person_detail[] lContact_person_details = (models.Contact_person_detail[])getContact_person_detail().toArray(new models.Contact_person_detail[getContact_person_detail().size()]);
			for(int i = 0; i < lContact_person_details.length; i++) {
				lContact_person_details[i].setCustomer_detail(null);
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
	
	@Column(name="customer_detail_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MODELS_CUSTOMER_DETAIL_CUSTOMER_DETAIL_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELS_CUSTOMER_DETAIL_CUSTOMER_DETAIL_ID_GENERATOR", strategy="native")	
	private int customer_detail_id;
	
	@Column(name="customer_name", nullable=false, length=100)	
	private String customer_name;
	
	@Column(name="telephone1", nullable=false, length=100)	
	private String telephone1;
	
	@Column(name="telephone2", nullable=false, length=100)	
	private String telephone2;
	
	@Column(name="email", nullable=true, length=100)	
	private String email;
	
	@Column(name="contact_person_name", nullable=true, length=100)	
	private String contact_person_name;
	
	@Column(name="contact_person_telephone1", nullable=true, length=100)	
	private String contact_person_telephone1;
	
	@Column(name="contact_person_telephone2", nullable=true, length=100)	
	private String contact_person_telephone2;
	
	@Column(name="contact_person_email", nullable=true, length=100)	
	private String contact_person_email;
	
	@Column(name="address", nullable=false, length=100)	
	private String address;
	
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
	
	@OneToMany(mappedBy="customer_detaill", targetEntity=models.Delivery_note.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set delivery_note = new java.util.HashSet();
	
	@OneToMany(mappedBy="customer_detail", targetEntity=models.Job_card.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set job_card = new java.util.HashSet();
	
	@OneToMany(mappedBy="customer_detail", targetEntity=models.Contact_person_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set contact_person_detail = new java.util.HashSet();
	
	private void setCustomer_detail_id(int value) {
		this.customer_detail_id = value;
	}
	
	public int getCustomer_detail_id() {
		return customer_detail_id;
	}
	
	public int getORMID() {
		return getCustomer_detail_id();
	}
	
	public void setCustomer_name(String value) {
		this.customer_name = value;
	}
	
	public String getCustomer_name() {
		return customer_name;
	}
	
	public void setContact_person_name(String value) {
		this.contact_person_name = value;
	}
	
	public String getContact_person_name() {
		return contact_person_name;
	}
	
	public void setTelephone1(String value) {
		this.telephone1 = value;
	}
	
	public String getTelephone1() {
		return telephone1;
	}
	
	public void setTelephone2(String value) {
		this.telephone2 = value;
	}
	
	public String getTelephone2() {
		return telephone2;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
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
	
	public void setContact_person_telephone1(String value) {
		this.contact_person_telephone1 = value;
	}
	
	public String getContact_person_telephone1() {
		return contact_person_telephone1;
	}
	
	public void setContact_person_telephone2(String value) {
		this.contact_person_telephone2 = value;
	}
	
	public String getContact_person_telephone2() {
		return contact_person_telephone2;
	}
	
	public void setContact_person_email(String value) {
		this.contact_person_email = value;
	}
	
	public String getContact_person_email() {
		return contact_person_email;
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
	
	public void setDelivery_note(java.util.Set value) {
		this.delivery_note = value;
	}
	
	public java.util.Set getDelivery_note() {
		return delivery_note;
	}
	
	
	public void setJob_card(java.util.Set value) {
		this.job_card = value;
	}
	
	public java.util.Set getJob_card() {
		return job_card;
	}
	
	
	public void setContact_person_detail(java.util.Set value) {
		this.contact_person_detail = value;
	}
	
	public java.util.Set getContact_person_detail() {
		return contact_person_detail;
	}
	
	
	public boolean equals(Object obj) {
		if (obj == null) {
				 return false;
				 }
				Customer_detail object = (Customer_detail) obj;
				return (this.getCustomer_detail_id() == object.getCustomer_detail_id());
	}
	
	public int hashCode() {
		int hash = 3;
				return hash;
	}
	
	public String toString() {
		return String.valueOf(getCustomer_detail_id());
	}
	
}
