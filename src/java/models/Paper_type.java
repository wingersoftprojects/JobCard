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
@Table(name="paper_type")
public class Paper_type implements Serializable {
	public Paper_type() {
	}
	
	public static Paper_type loadPaper_typeByORMID(int paper_type_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadPaper_typeByORMID(session, paper_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type getPaper_typeByORMID(int paper_type_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getPaper_typeByORMID(session, paper_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type loadPaper_typeByORMID(int paper_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadPaper_typeByORMID(session, paper_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type getPaper_typeByORMID(int paper_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getPaper_typeByORMID(session, paper_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type loadPaper_typeByORMID(PersistentSession session, int paper_type_id) throws PersistentException {
		try {
			return (Paper_type) session.load(models.Paper_type.class, new Integer(paper_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type getPaper_typeByORMID(PersistentSession session, int paper_type_id) throws PersistentException {
		try {
			return (Paper_type) session.get(models.Paper_type.class, new Integer(paper_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type loadPaper_typeByORMID(PersistentSession session, int paper_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paper_type) session.load(models.Paper_type.class, new Integer(paper_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type getPaper_typeByORMID(PersistentSession session, int paper_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paper_type) session.get(models.Paper_type.class, new Integer(paper_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaper_type(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryPaper_type(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaper_type(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryPaper_type(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type[] listPaper_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listPaper_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type[] listPaper_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listPaper_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaper_type(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Paper_type as Paper_type");
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
	
	public static List queryPaper_type(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Paper_type as Paper_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paper_type", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type[] listPaper_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPaper_type(session, condition, orderBy);
			return (Paper_type[]) list.toArray(new Paper_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type[] listPaper_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPaper_type(session, condition, orderBy, lockMode);
			return (Paper_type[]) list.toArray(new Paper_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type loadPaper_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadPaper_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type loadPaper_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadPaper_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type loadPaper_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Paper_type[] paper_types = listPaper_typeByQuery(session, condition, orderBy);
		if (paper_types != null && paper_types.length > 0)
			return paper_types[0];
		else
			return null;
	}
	
	public static Paper_type loadPaper_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Paper_type[] paper_types = listPaper_typeByQuery(session, condition, orderBy, lockMode);
		if (paper_types != null && paper_types.length > 0)
			return paper_types[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePaper_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iteratePaper_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaper_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iteratePaper_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaper_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Paper_type as Paper_type");
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
	
	public static java.util.Iterator iteratePaper_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Paper_type as Paper_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paper_type", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paper_type loadPaper_typeByCriteria(Paper_typeCriteria paper_typeCriteria) {
		Paper_type[] paper_types = listPaper_typeByCriteria(paper_typeCriteria);
		if(paper_types == null || paper_types.length == 0) {
			return null;
		}
		return paper_types[0];
	}
	
	public static Paper_type[] listPaper_typeByCriteria(Paper_typeCriteria paper_typeCriteria) {
		return paper_typeCriteria.listPaper_type();
	}
	
	public static Paper_type createPaper_type() {
		return new models.Paper_type();
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
				getAdd_by().getPaper_type().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getPaper_type1().remove(this);
			}
			
			models.Job_card_item[] lJob_card_items = (models.Job_card_item[])getJob_card_item().toArray(new models.Job_card_item[getJob_card_item().size()]);
			for(int i = 0; i < lJob_card_items.length; i++) {
				lJob_card_items[i].setPaper_type(null);
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
				getAdd_by().getPaper_type().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getPaper_type1().remove(this);
			}
			
			models.Job_card_item[] lJob_card_items = (models.Job_card_item[])getJob_card_item().toArray(new models.Job_card_item[getJob_card_item().size()]);
			for(int i = 0; i < lJob_card_items.length; i++) {
				lJob_card_items[i].setPaper_type(null);
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
	
	@Column(name="paper_type_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MODELS_PAPER_TYPE_PAPER_TYPE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELS_PAPER_TYPE_PAPER_TYPE_ID_GENERATOR", strategy="native")	
	private int paper_type_id;
	
	@Column(name="paper_type_category", nullable=false, length=50)	
	private String paper_type_category;
	
	@Column(name="paper_type_sub_category", nullable=false, length=50)	
	private String paper_type_sub_category;
	
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
	
	@OneToMany(mappedBy="paper_type", targetEntity=models.Job_card_item.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set job_card_item = new java.util.HashSet();
	
	private void setPaper_type_id(int value) {
		this.paper_type_id = value;
	}
	
	public int getPaper_type_id() {
		return paper_type_id;
	}
	
	public int getORMID() {
		return getPaper_type_id();
	}
	
	public void setPaper_type_category(String value) {
		this.paper_type_category = value;
	}
	
	public String getPaper_type_category() {
		return paper_type_category;
	}
	
	public void setPaper_type_sub_category(String value) {
		this.paper_type_sub_category = value;
	}
	
	public String getPaper_type_sub_category() {
		return paper_type_sub_category;
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
	
	public void setJob_card_item(java.util.Set value) {
		this.job_card_item = value;
	}
	
	public java.util.Set getJob_card_item() {
		return job_card_item;
	}
	
	
	public boolean equals(Object obj) {
		if (obj == null) {
				 return false;
				 }
				Paper_type object = (Paper_type) obj;
				return (this.getPaper_type_id() == object.getPaper_type_id());
	}
	
	public int hashCode() {
		int hash = 3;
				return hash;
	}
	
	public String toString() {
		return String.valueOf(getPaper_type_id());
	}
	
}
