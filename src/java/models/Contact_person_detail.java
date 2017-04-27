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
@Table(name="contact_person_detail")
public class Contact_person_detail implements Serializable {
	public Contact_person_detail() {
	}
	
	public static Contact_person_detail loadContact_person_detailByORMID(int contact_person_detail_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadContact_person_detailByORMID(session, contact_person_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail getContact_person_detailByORMID(int contact_person_detail_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getContact_person_detailByORMID(session, contact_person_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail loadContact_person_detailByORMID(int contact_person_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadContact_person_detailByORMID(session, contact_person_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail getContact_person_detailByORMID(int contact_person_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getContact_person_detailByORMID(session, contact_person_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail loadContact_person_detailByORMID(PersistentSession session, int contact_person_detail_id) throws PersistentException {
		try {
			return (Contact_person_detail) session.load(models.Contact_person_detail.class, new Integer(contact_person_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail getContact_person_detailByORMID(PersistentSession session, int contact_person_detail_id) throws PersistentException {
		try {
			return (Contact_person_detail) session.get(models.Contact_person_detail.class, new Integer(contact_person_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail loadContact_person_detailByORMID(PersistentSession session, int contact_person_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Contact_person_detail) session.load(models.Contact_person_detail.class, new Integer(contact_person_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail getContact_person_detailByORMID(PersistentSession session, int contact_person_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Contact_person_detail) session.get(models.Contact_person_detail.class, new Integer(contact_person_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContact_person_detail(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryContact_person_detail(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContact_person_detail(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryContact_person_detail(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail[] listContact_person_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listContact_person_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail[] listContact_person_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listContact_person_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContact_person_detail(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Contact_person_detail as Contact_person_detail");
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
	
	public static List queryContact_person_detail(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Contact_person_detail as Contact_person_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Contact_person_detail", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail[] listContact_person_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryContact_person_detail(session, condition, orderBy);
			return (Contact_person_detail[]) list.toArray(new Contact_person_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail[] listContact_person_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryContact_person_detail(session, condition, orderBy, lockMode);
			return (Contact_person_detail[]) list.toArray(new Contact_person_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail loadContact_person_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadContact_person_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail loadContact_person_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadContact_person_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail loadContact_person_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Contact_person_detail[] contact_person_details = listContact_person_detailByQuery(session, condition, orderBy);
		if (contact_person_details != null && contact_person_details.length > 0)
			return contact_person_details[0];
		else
			return null;
	}
	
	public static Contact_person_detail loadContact_person_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Contact_person_detail[] contact_person_details = listContact_person_detailByQuery(session, condition, orderBy, lockMode);
		if (contact_person_details != null && contact_person_details.length > 0)
			return contact_person_details[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateContact_person_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateContact_person_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateContact_person_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateContact_person_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateContact_person_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Contact_person_detail as Contact_person_detail");
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
	
	public static java.util.Iterator iterateContact_person_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Contact_person_detail as Contact_person_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Contact_person_detail", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contact_person_detail loadContact_person_detailByCriteria(Contact_person_detailCriteria contact_person_detailCriteria) {
		Contact_person_detail[] contact_person_details = listContact_person_detailByCriteria(contact_person_detailCriteria);
		if(contact_person_details == null || contact_person_details.length == 0) {
			return null;
		}
		return contact_person_details[0];
	}
	
	public static Contact_person_detail[] listContact_person_detailByCriteria(Contact_person_detailCriteria contact_person_detailCriteria) {
		return contact_person_detailCriteria.listContact_person_detail();
	}
	
	public static Contact_person_detail createContact_person_detail() {
		return new models.Contact_person_detail();
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
				getCustomer_detail().getContact_person_detail().remove(this);
			}
			
			if(getAdd_by() != null) {
				getAdd_by().getContact_person_detail().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getContact_person_detail1().remove(this);
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
				getCustomer_detail().getContact_person_detail().remove(this);
			}
			
			if(getAdd_by() != null) {
				getAdd_by().getContact_person_detail().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getContact_person_detail1().remove(this);
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
	
	@Column(name="contact_person_detail_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MODELS_CONTACT_PERSON_DETAIL_CONTACT_PERSON_DETAIL_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELS_CONTACT_PERSON_DETAIL_CONTACT_PERSON_DETAIL_ID_GENERATOR", strategy="native")	
	private int contact_person_detail_id;
	
	@ManyToOne(targetEntity=models.Customer_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="customer_detail_id", referencedColumnName="customer_detail_id", nullable=false) })	
	private models.Customer_detail customer_detail;
	
	@Column(name="contact_person_name", nullable=false, length=100)	
	private String contact_person_name;
	
	@Column(name="contact_person_telephone1", nullable=false, length=100)	
	private String contact_person_telephone1;
	
	@Column(name="contact_person_telephone2", nullable=true, length=100)	
	private String contact_person_telephone2;
	
	@Column(name="contact_person_email", nullable=false, length=100)	
	private String contact_person_email;
	
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
	
	private void setContact_person_detail_id(int value) {
		this.contact_person_detail_id = value;
	}
	
	public int getContact_person_detail_id() {
		return contact_person_detail_id;
	}
	
	public int getORMID() {
		return getContact_person_detail_id();
	}
	
	public void setContact_person_name(String value) {
		this.contact_person_name = value;
	}
	
	public String getContact_person_name() {
		return contact_person_name;
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
	
	public void setCustomer_detail(models.Customer_detail value) {
		this.customer_detail = value;
	}
	
	public models.Customer_detail getCustomer_detail() {
		return customer_detail;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
				 return false;
				 }
				Contact_person_detail object = (Contact_person_detail) obj;
				return (this.getContact_person_detail_id() == object.getContact_person_detail_id());
	}
	
	public int hashCode() {
		int hash = 3;
				return hash;
	}
	
	public String toString() {
		return String.valueOf(getContact_person_detail_id());
	}
	
}
