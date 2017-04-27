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
@Table(name="item_type")
public class Item_type implements Serializable {
	public Item_type() {
	}
	
	public static Item_type loadItem_typeByORMID(int item_type_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadItem_typeByORMID(session, item_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type getItem_typeByORMID(int item_type_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getItem_typeByORMID(session, item_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type loadItem_typeByORMID(int item_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadItem_typeByORMID(session, item_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type getItem_typeByORMID(int item_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getItem_typeByORMID(session, item_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type loadItem_typeByORMID(PersistentSession session, int item_type_id) throws PersistentException {
		try {
			return (Item_type) session.load(models.Item_type.class, new Integer(item_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type getItem_typeByORMID(PersistentSession session, int item_type_id) throws PersistentException {
		try {
			return (Item_type) session.get(models.Item_type.class, new Integer(item_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type loadItem_typeByORMID(PersistentSession session, int item_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Item_type) session.load(models.Item_type.class, new Integer(item_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type getItem_typeByORMID(PersistentSession session, int item_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Item_type) session.get(models.Item_type.class, new Integer(item_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryItem_type(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryItem_type(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryItem_type(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryItem_type(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type[] listItem_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listItem_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type[] listItem_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listItem_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryItem_type(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Item_type as Item_type");
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
	
	public static List queryItem_type(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Item_type as Item_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Item_type", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type[] listItem_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryItem_type(session, condition, orderBy);
			return (Item_type[]) list.toArray(new Item_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type[] listItem_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryItem_type(session, condition, orderBy, lockMode);
			return (Item_type[]) list.toArray(new Item_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type loadItem_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadItem_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type loadItem_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadItem_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type loadItem_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Item_type[] item_types = listItem_typeByQuery(session, condition, orderBy);
		if (item_types != null && item_types.length > 0)
			return item_types[0];
		else
			return null;
	}
	
	public static Item_type loadItem_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Item_type[] item_types = listItem_typeByQuery(session, condition, orderBy, lockMode);
		if (item_types != null && item_types.length > 0)
			return item_types[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateItem_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateItem_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateItem_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateItem_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateItem_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Item_type as Item_type");
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
	
	public static java.util.Iterator iterateItem_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Item_type as Item_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Item_type", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Item_type loadItem_typeByCriteria(Item_typeCriteria item_typeCriteria) {
		Item_type[] item_types = listItem_typeByCriteria(item_typeCriteria);
		if(item_types == null || item_types.length == 0) {
			return null;
		}
		return item_types[0];
	}
	
	public static Item_type[] listItem_typeByCriteria(Item_typeCriteria item_typeCriteria) {
		return item_typeCriteria.listItem_type();
	}
	
	public static Item_type createItem_type() {
		return new models.Item_type();
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
				getAdd_by().getItem_type().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getItem_type1().remove(this);
			}
			
			models.Job_card_item[] lJob_card_items = (models.Job_card_item[])getJob_card_item().toArray(new models.Job_card_item[getJob_card_item().size()]);
			for(int i = 0; i < lJob_card_items.length; i++) {
				lJob_card_items[i].setItem_type(null);
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
				getAdd_by().getItem_type().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getItem_type1().remove(this);
			}
			
			models.Job_card_item[] lJob_card_items = (models.Job_card_item[])getJob_card_item().toArray(new models.Job_card_item[getJob_card_item().size()]);
			for(int i = 0; i < lJob_card_items.length; i++) {
				lJob_card_items[i].setItem_type(null);
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
	
	@Column(name="item_type_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MODELS_ITEM_TYPE_ITEM_TYPE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELS_ITEM_TYPE_ITEM_TYPE_ID_GENERATOR", strategy="native")	
	private int item_type_id;
	
	@Column(name="item_type_name", nullable=false, length=100)	
	private String item_type_name;
	
	@Column(name="is_active", nullable=false, length=1)	
	private Integer is_active;
	
	@Column(name="is_deleted", nullable=false, length=1)	
	private Integer is_deleted;
	
	@Column(name="add_date", nullable=false)	
	private java.sql.Timestamp add_date;
	
	@Column(name="last_edit_date", nullable=true)	
	private java.sql.Timestamp last_edit_date;
	
	@ManyToOne(targetEntity=models.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="add_by", referencedColumnName="user_detail_id", nullable=false) })	
	private models.User_detail add_by;
	
	@ManyToOne(targetEntity=models.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="last_edit_by", referencedColumnName="user_detail_id") })	
	private models.User_detail last_edit_by;
	
	@OneToMany(mappedBy="item_type", targetEntity=models.Job_card_item.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set job_card_item = new java.util.HashSet();
	
	private void setItem_type_id(int value) {
		this.item_type_id = value;
	}
	
	public int getItem_type_id() {
		return item_type_id;
	}
	
	public int getORMID() {
		return getItem_type_id();
	}
	
	public void setItem_type_name(String value) {
		this.item_type_name = value;
	}
	
	public String getItem_type_name() {
		return item_type_name;
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
				Item_type object = (Item_type) obj;
				return (this.getItem_type_id() == object.getItem_type_id());
	}
	
	public int hashCode() {
		int hash = 3;
				return hash;
	}
	
	public String toString() {
		return String.valueOf(getItem_type_id());
	}
	
}
