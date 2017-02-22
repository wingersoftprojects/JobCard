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
@Table(name="supplier_detail")
public class Supplier_detail implements Serializable {
	public Supplier_detail() {
	}
	
	public static Supplier_detail loadSupplier_detailByORMID(int supplier_detail_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadSupplier_detailByORMID(session, supplier_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail getSupplier_detailByORMID(int supplier_detail_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getSupplier_detailByORMID(session, supplier_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail loadSupplier_detailByORMID(int supplier_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadSupplier_detailByORMID(session, supplier_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail getSupplier_detailByORMID(int supplier_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getSupplier_detailByORMID(session, supplier_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail loadSupplier_detailByORMID(PersistentSession session, int supplier_detail_id) throws PersistentException {
		try {
			return (Supplier_detail) session.load(models.Supplier_detail.class, new Integer(supplier_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail getSupplier_detailByORMID(PersistentSession session, int supplier_detail_id) throws PersistentException {
		try {
			return (Supplier_detail) session.get(models.Supplier_detail.class, new Integer(supplier_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail loadSupplier_detailByORMID(PersistentSession session, int supplier_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Supplier_detail) session.load(models.Supplier_detail.class, new Integer(supplier_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail getSupplier_detailByORMID(PersistentSession session, int supplier_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Supplier_detail) session.get(models.Supplier_detail.class, new Integer(supplier_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySupplier_detail(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return querySupplier_detail(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySupplier_detail(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return querySupplier_detail(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail[] listSupplier_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listSupplier_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail[] listSupplier_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listSupplier_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySupplier_detail(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Supplier_detail as Supplier_detail");
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
	
	public static List querySupplier_detail(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Supplier_detail as Supplier_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Supplier_detail", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail[] listSupplier_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySupplier_detail(session, condition, orderBy);
			return (Supplier_detail[]) list.toArray(new Supplier_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail[] listSupplier_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySupplier_detail(session, condition, orderBy, lockMode);
			return (Supplier_detail[]) list.toArray(new Supplier_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail loadSupplier_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadSupplier_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail loadSupplier_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadSupplier_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail loadSupplier_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Supplier_detail[] supplier_details = listSupplier_detailByQuery(session, condition, orderBy);
		if (supplier_details != null && supplier_details.length > 0)
			return supplier_details[0];
		else
			return null;
	}
	
	public static Supplier_detail loadSupplier_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Supplier_detail[] supplier_details = listSupplier_detailByQuery(session, condition, orderBy, lockMode);
		if (supplier_details != null && supplier_details.length > 0)
			return supplier_details[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSupplier_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateSupplier_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSupplier_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateSupplier_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSupplier_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Supplier_detail as Supplier_detail");
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
	
	public static java.util.Iterator iterateSupplier_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Supplier_detail as Supplier_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Supplier_detail", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Supplier_detail loadSupplier_detailByCriteria(Supplier_detailCriteria supplier_detailCriteria) {
		Supplier_detail[] supplier_details = listSupplier_detailByCriteria(supplier_detailCriteria);
		if(supplier_details == null || supplier_details.length == 0) {
			return null;
		}
		return supplier_details[0];
	}
	
	public static Supplier_detail[] listSupplier_detailByCriteria(Supplier_detailCriteria supplier_detailCriteria) {
		return supplier_detailCriteria.listSupplier_detail();
	}
	
	public static Supplier_detail createSupplier_detail() {
		return new models.Supplier_detail();
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
			models.Job_card_item[] lJob_card_items = (models.Job_card_item[])getJob_card_item().toArray(new models.Job_card_item[getJob_card_item().size()]);
			for(int i = 0; i < lJob_card_items.length; i++) {
				lJob_card_items[i].setSupplier_detail(null);
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
			models.Job_card_item[] lJob_card_items = (models.Job_card_item[])getJob_card_item().toArray(new models.Job_card_item[getJob_card_item().size()]);
			for(int i = 0; i < lJob_card_items.length; i++) {
				lJob_card_items[i].setSupplier_detail(null);
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
	
	@Column(name="supplier_detail_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MODELS_SUPPLIER_DETAIL_SUPPLIER_DETAIL_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELS_SUPPLIER_DETAIL_SUPPLIER_DETAIL_ID_GENERATOR", strategy="native")	
	private int supplier_detail_id;
	
	@Column(name="supplier_name", nullable=false, length=100)	
	private String supplier_name;
	
	@Column(name="specifications", nullable=false, length=100)	
	private String specifications;
	
	@Column(name="telephone", nullable=true, length=20)	
	private Integer telephone;
	
	@Column(name="`size`", nullable=false, length=10)	
	private String size;
	
	@Column(name="quantity", nullable=false, length=20)	
	private int quantity;
	
	@Column(name="is_active", nullable=true, length=1)	
	private Integer is_active;
	
	@Column(name="is_deleted", nullable=true, length=1)	
	private Integer is_deleted;
	
	@Column(name="add_date", nullable=true)	
	private java.sql.Timestamp add_date;
	
	@Column(name="add_by", nullable=true, length=10)	
	private Integer add_by;
	
	@Column(name="last_edit_date", nullable=true)	
	private java.sql.Timestamp last_edit_date;
	
	@Column(name="last_edit_by", nullable=true, length=10)	
	private Integer last_edit_by;
	
	@OneToMany(mappedBy="supplier_detail", targetEntity=models.Job_card_item.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set job_card_item = new java.util.HashSet();
	
	private void setSupplier_detail_id(int value) {
		this.supplier_detail_id = value;
	}
	
	public int getSupplier_detail_id() {
		return supplier_detail_id;
	}
	
	public int getORMID() {
		return getSupplier_detail_id();
	}
	
	public void setSupplier_name(String value) {
		this.supplier_name = value;
	}
	
	public String getSupplier_name() {
		return supplier_name;
	}
	
	public void setSpecifications(String value) {
		this.specifications = value;
	}
	
	public String getSpecifications() {
		return specifications;
	}
	
	public void setTelephone(int value) {
		setTelephone(new Integer(value));
	}
	
	public void setTelephone(Integer value) {
		this.telephone = value;
	}
	
	public Integer getTelephone() {
		return telephone;
	}
	
	public void setSize(String value) {
		this.size = value;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setQuantity(int value) {
		this.quantity = value;
	}
	
	public int getQuantity() {
		return quantity;
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
				Supplier_detail object = (Supplier_detail) obj;
				return (this.getSupplier_detail_id() == object.getSupplier_detail_id());
	}
	
	public int hashCode() {
		int hash = 3;
				return hash;
	}
	
	public String toString() {
		return String.valueOf(getSupplier_detail_id());
	}
	
}
