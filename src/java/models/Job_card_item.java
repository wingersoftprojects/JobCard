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
@Table(name="job_card_item")
public class Job_card_item implements Serializable {
	public Job_card_item() {
	}
	
	public static Job_card_item loadJob_card_itemByORMID(int job_card_item_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadJob_card_itemByORMID(session, job_card_item_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item getJob_card_itemByORMID(int job_card_item_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getJob_card_itemByORMID(session, job_card_item_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item loadJob_card_itemByORMID(int job_card_item_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadJob_card_itemByORMID(session, job_card_item_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item getJob_card_itemByORMID(int job_card_item_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getJob_card_itemByORMID(session, job_card_item_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item loadJob_card_itemByORMID(PersistentSession session, int job_card_item_id) throws PersistentException {
		try {
			return (Job_card_item) session.load(models.Job_card_item.class, new Integer(job_card_item_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item getJob_card_itemByORMID(PersistentSession session, int job_card_item_id) throws PersistentException {
		try {
			return (Job_card_item) session.get(models.Job_card_item.class, new Integer(job_card_item_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item loadJob_card_itemByORMID(PersistentSession session, int job_card_item_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Job_card_item) session.load(models.Job_card_item.class, new Integer(job_card_item_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item getJob_card_itemByORMID(PersistentSession session, int job_card_item_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Job_card_item) session.get(models.Job_card_item.class, new Integer(job_card_item_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJob_card_item(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryJob_card_item(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJob_card_item(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryJob_card_item(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item[] listJob_card_itemByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listJob_card_itemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item[] listJob_card_itemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listJob_card_itemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJob_card_item(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Job_card_item as Job_card_item");
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
	
	public static List queryJob_card_item(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Job_card_item as Job_card_item");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Job_card_item", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item[] listJob_card_itemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryJob_card_item(session, condition, orderBy);
			return (Job_card_item[]) list.toArray(new Job_card_item[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item[] listJob_card_itemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryJob_card_item(session, condition, orderBy, lockMode);
			return (Job_card_item[]) list.toArray(new Job_card_item[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item loadJob_card_itemByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadJob_card_itemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item loadJob_card_itemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadJob_card_itemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item loadJob_card_itemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Job_card_item[] job_card_items = listJob_card_itemByQuery(session, condition, orderBy);
		if (job_card_items != null && job_card_items.length > 0)
			return job_card_items[0];
		else
			return null;
	}
	
	public static Job_card_item loadJob_card_itemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Job_card_item[] job_card_items = listJob_card_itemByQuery(session, condition, orderBy, lockMode);
		if (job_card_items != null && job_card_items.length > 0)
			return job_card_items[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateJob_card_itemByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateJob_card_itemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJob_card_itemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateJob_card_itemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJob_card_itemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Job_card_item as Job_card_item");
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
	
	public static java.util.Iterator iterateJob_card_itemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Job_card_item as Job_card_item");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Job_card_item", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Job_card_item loadJob_card_itemByCriteria(Job_card_itemCriteria job_card_itemCriteria) {
		Job_card_item[] job_card_items = listJob_card_itemByCriteria(job_card_itemCriteria);
		if(job_card_items == null || job_card_items.length == 0) {
			return null;
		}
		return job_card_items[0];
	}
	
	public static Job_card_item[] listJob_card_itemByCriteria(Job_card_itemCriteria job_card_itemCriteria) {
		return job_card_itemCriteria.listJob_card_item();
	}
	
	public static Job_card_item createJob_card_item() {
		return new models.Job_card_item();
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
				getJob_card().getJob_card_item().remove(this);
			}
			
			if(getSupplier_detail() != null) {
				getSupplier_detail().getJob_card_item().remove(this);
			}
			
			if(getPaper_type() != null) {
				getPaper_type().getJob_card_item().remove(this);
			}
			
			if(getAdd_by() != null) {
				getAdd_by().getJob_card_item().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getJob_card_item1().remove(this);
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
				getJob_card().getJob_card_item().remove(this);
			}
			
			if(getSupplier_detail() != null) {
				getSupplier_detail().getJob_card_item().remove(this);
			}
			
			if(getPaper_type() != null) {
				getPaper_type().getJob_card_item().remove(this);
			}
			
			if(getAdd_by() != null) {
				getAdd_by().getJob_card_item().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getJob_card_item1().remove(this);
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
	
	@Column(name="job_card_item_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MODELS_JOB_CARD_ITEM_JOB_CARD_ITEM_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELS_JOB_CARD_ITEM_JOB_CARD_ITEM_ID_GENERATOR", strategy="native")	
	private int job_card_item_id;
	
	@ManyToOne(targetEntity=models.Job_card.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="job_card_id", referencedColumnName="job_card_id", nullable=false) })	
	private models.Job_card job_card;
	
	@ManyToOne(targetEntity=models.Supplier_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="supplier_detail_id", referencedColumnName="supplier_detail_id", nullable=false) })	
	private models.Supplier_detail supplier_detail;
	
	@ManyToOne(targetEntity=models.Paper_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="paper_type_id", referencedColumnName="paper_type_id", nullable=false) })	
	private models.Paper_type paper_type;
	
	@Column(name="job_title", nullable=false, length=100)	
	private String job_title;
	
	@Column(name="item_type", nullable=false, length=100)	
	private String item_type;
	
	@Column(name="pages", nullable=false, length=10)	
	private int pages;
	
	@Column(name="paper_size", nullable=false, length=10)	
	private String paper_size;
	
	@Column(name="cover_type", nullable=false, length=50)	
	private String cover_type;
	
	@Column(name="lamination_type", nullable=false, length=50)	
	private String lamination_type;
	
	@Column(name="binding_type", nullable=false, length=50)	
	private String binding_type;
	
	@Column(name="other_processes", nullable=false, length=200)	
	private String other_processes;
	
	@Column(name="machine_used", nullable=false, length=50)	
	private String machine_used;
	
	@Column(name="quantity", nullable=false, length=10)	
	private int quantity;
	
	@Column(name="rate", nullable=false, length=10)	
	private int rate;
	
	@Column(name="amount", nullable=false, length=20)	
	private int amount;
	
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
	
	private void setJob_card_item_id(int value) {
		this.job_card_item_id = value;
	}
	
	public int getJob_card_item_id() {
		return job_card_item_id;
	}
	
	public int getORMID() {
		return getJob_card_item_id();
	}
	
	public void setJob_title(String value) {
		this.job_title = value;
	}
	
	public String getJob_title() {
		return job_title;
	}
	
	public void setItem_type(String value) {
		this.item_type = value;
	}
	
	public String getItem_type() {
		return item_type;
	}
	
	public void setPages(int value) {
		this.pages = value;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPaper_size(String value) {
		this.paper_size = value;
	}
	
	public String getPaper_size() {
		return paper_size;
	}
	
	public void setCover_type(String value) {
		this.cover_type = value;
	}
	
	public String getCover_type() {
		return cover_type;
	}
	
	public void setLamination_type(String value) {
		this.lamination_type = value;
	}
	
	public String getLamination_type() {
		return lamination_type;
	}
	
	public void setBinding_type(String value) {
		this.binding_type = value;
	}
	
	public String getBinding_type() {
		return binding_type;
	}
	
	public void setOther_processes(String value) {
		this.other_processes = value;
	}
	
	public String getOther_processes() {
		return other_processes;
	}
	
	public void setMachine_used(String value) {
		this.machine_used = value;
	}
	
	public String getMachine_used() {
		return machine_used;
	}
	
	public void setQuantity(int value) {
		this.quantity = value;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setRate(int value) {
		this.rate = value;
	}
	
	public int getRate() {
		return rate;
	}
	
	public void setAmount(int value) {
		this.amount = value;
	}
	
	public int getAmount() {
		return amount;
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
	
	public void setJob_card(models.Job_card value) {
		this.job_card = value;
	}
	
	public models.Job_card getJob_card() {
		return job_card;
	}
	
	public void setSupplier_detail(models.Supplier_detail value) {
		this.supplier_detail = value;
	}
	
	public models.Supplier_detail getSupplier_detail() {
		return supplier_detail;
	}
	
	public void setPaper_type(models.Paper_type value) {
		this.paper_type = value;
	}
	
	public models.Paper_type getPaper_type() {
		return paper_type;
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
				Job_card_item object = (Job_card_item) obj;
				return (this.getJob_card_item_id() == object.getJob_card_item_id());
	}
	
	public int hashCode() {
		int hash = 3;
				return hash;
	}
	
	public String toString() {
		return String.valueOf(getJob_card_item_id());
	}
	
}
