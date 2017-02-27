/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: bajuna
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
@Table(name="delivery_note")
public class Delivery_note implements Serializable {
	public Delivery_note() {
	}
	
	public static Delivery_note loadDelivery_noteByORMID(int delivery_note_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadDelivery_noteByORMID(session, delivery_note_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note getDelivery_noteByORMID(int delivery_note_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getDelivery_noteByORMID(session, delivery_note_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note loadDelivery_noteByORMID(int delivery_note_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadDelivery_noteByORMID(session, delivery_note_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note getDelivery_noteByORMID(int delivery_note_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getDelivery_noteByORMID(session, delivery_note_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note loadDelivery_noteByORMID(PersistentSession session, int delivery_note_id) throws PersistentException {
		try {
			return (Delivery_note) session.load(models.Delivery_note.class, new Integer(delivery_note_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note getDelivery_noteByORMID(PersistentSession session, int delivery_note_id) throws PersistentException {
		try {
			return (Delivery_note) session.get(models.Delivery_note.class, new Integer(delivery_note_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note loadDelivery_noteByORMID(PersistentSession session, int delivery_note_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Delivery_note) session.load(models.Delivery_note.class, new Integer(delivery_note_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note getDelivery_noteByORMID(PersistentSession session, int delivery_note_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Delivery_note) session.get(models.Delivery_note.class, new Integer(delivery_note_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDelivery_note(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryDelivery_note(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDelivery_note(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryDelivery_note(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note[] listDelivery_noteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listDelivery_noteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note[] listDelivery_noteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listDelivery_noteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDelivery_note(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Delivery_note as Delivery_note");
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
	
	public static List queryDelivery_note(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Delivery_note as Delivery_note");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Delivery_note", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note[] listDelivery_noteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDelivery_note(session, condition, orderBy);
			return (Delivery_note[]) list.toArray(new Delivery_note[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note[] listDelivery_noteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDelivery_note(session, condition, orderBy, lockMode);
			return (Delivery_note[]) list.toArray(new Delivery_note[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note loadDelivery_noteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadDelivery_noteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note loadDelivery_noteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadDelivery_noteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note loadDelivery_noteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Delivery_note[] delivery_notes = listDelivery_noteByQuery(session, condition, orderBy);
		if (delivery_notes != null && delivery_notes.length > 0)
			return delivery_notes[0];
		else
			return null;
	}
	
	public static Delivery_note loadDelivery_noteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Delivery_note[] delivery_notes = listDelivery_noteByQuery(session, condition, orderBy, lockMode);
		if (delivery_notes != null && delivery_notes.length > 0)
			return delivery_notes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDelivery_noteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateDelivery_noteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDelivery_noteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateDelivery_noteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDelivery_noteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Delivery_note as Delivery_note");
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
	
	public static java.util.Iterator iterateDelivery_noteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Delivery_note as Delivery_note");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Delivery_note", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Delivery_note loadDelivery_noteByCriteria(Delivery_noteCriteria delivery_noteCriteria) {
		Delivery_note[] delivery_notes = listDelivery_noteByCriteria(delivery_noteCriteria);
		if(delivery_notes == null || delivery_notes.length == 0) {
			return null;
		}
		return delivery_notes[0];
	}
	
	public static Delivery_note[] listDelivery_noteByCriteria(Delivery_noteCriteria delivery_noteCriteria) {
		return delivery_noteCriteria.listDelivery_note();
	}
	
	public static Delivery_note createDelivery_note() {
		return new models.Delivery_note();
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
				getJob_card().setDelivery_note(null);
			}
			
			if(getCustomer_detaill() != null) {
				getCustomer_detaill().getDelivery_note().remove(this);
			}
			
			models.Group_right[] lGroup_rights = (models.Group_right[])getGroup_right().toArray(new models.Group_right[getGroup_right().size()]);
			for(int i = 0; i < lGroup_rights.length; i++) {
				lGroup_rights[i].setDelivery_note(null);
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
				getJob_card().setDelivery_note(null);
			}
			
			if(getCustomer_detaill() != null) {
				getCustomer_detaill().getDelivery_note().remove(this);
			}
			
			models.Group_right[] lGroup_rights = (models.Group_right[])getGroup_right().toArray(new models.Group_right[getGroup_right().size()]);
			for(int i = 0; i < lGroup_rights.length; i++) {
				lGroup_rights[i].setDelivery_note(null);
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
	
	@Column(name="delivery_note_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MODELS_DELIVERY_NOTE_DELIVERY_NOTE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELS_DELIVERY_NOTE_DELIVERY_NOTE_ID_GENERATOR", strategy="native")	
	private int delivery_note_id;
	
	@OneToOne(targetEntity=models.Job_card.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="job_card_id", referencedColumnName="job_card_id", nullable=false) })	
	private models.Job_card job_card;
	
	@ManyToOne(targetEntity=models.Customer_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="customer_detaill_id", referencedColumnName="customer_detail_id", nullable=false) })	
	private models.Customer_detail customer_detaill;
	
	@Column(name="delivery_note_number", nullable=true, length=10)	
	private Integer delivery_note_number;
	
	@Column(name="is_active", nullable=true, length=10)	
	private Integer is_active;
	
	@Column(name="is_deleted", nullable=true, length=10)	
	private Integer is_deleted;
	
	@Column(name="add_date", nullable=true)	
	private java.sql.Timestamp add_date;
	
	@Column(name="add_by", nullable=true)	
	private Integer add_by;
	
	@Column(name="last_edit_date", nullable=true)	
	private java.sql.Timestamp last_edit_date;
	
	@Column(name="last_edit_by", nullable=true)	
	private Integer last_edit_by;
	
	@OneToMany(mappedBy="delivery_note", targetEntity=models.Group_right.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set group_right = new java.util.HashSet();
	
	private void setDelivery_note_id(int value) {
		this.delivery_note_id = value;
	}
	
	public int getDelivery_note_id() {
		return delivery_note_id;
	}
	
	public int getORMID() {
		return getDelivery_note_id();
	}
	
	public void setDelivery_note_number(int value) {
		setDelivery_note_number(new Integer(value));
	}
	
	public void setDelivery_note_number(Integer value) {
		this.delivery_note_number = value;
	}
	
	public Integer getDelivery_note_number() {
		return delivery_note_number;
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
	
	public void setAdd_by(int value) {
		setAdd_by(new Integer(value));
	}
	
	public void setAdd_by(Integer value) {
		this.add_by = value;
	}
	
	public Integer getAdd_by() {
		return add_by;
	}
	
	public void setLast_edit_date(java.sql.Timestamp value) {
		this.last_edit_date = value;
	}
	
	public java.sql.Timestamp getLast_edit_date() {
		return last_edit_date;
	}
	
	public void setLast_edit_by(int value) {
		setLast_edit_by(new Integer(value));
	}
	
	public void setLast_edit_by(Integer value) {
		this.last_edit_by = value;
	}
	
	public Integer getLast_edit_by() {
		return last_edit_by;
	}
	
	public void setCustomer_detaill(models.Customer_detail value) {
		this.customer_detaill = value;
	}
	
	public models.Customer_detail getCustomer_detaill() {
		return customer_detaill;
	}
	
	public void setJob_card(models.Job_card value) {
		this.job_card = value;
	}
	
	public models.Job_card getJob_card() {
		return job_card;
	}
	
	public void setGroup_right(java.util.Set value) {
		this.group_right = value;
	}
	
	public java.util.Set getGroup_right() {
		return group_right;
	}
	
	
	public boolean equals(Object obj) {
		if (obj == null) {
				 return false;
				 }
				Delivery_note object = (Delivery_note) obj;
				return (this.getDelivery_note_id() == object.getDelivery_note_id());
	}
	
	public int hashCode() {
		int hash = 3;
				return hash;
	}
	
	public String toString() {
		return String.valueOf(getDelivery_note_id());
	}
	
}
