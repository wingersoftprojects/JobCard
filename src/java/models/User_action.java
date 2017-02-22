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
@Table(name="user_action")
public class User_action implements Serializable {
	public User_action() {
	}
	
	public static User_action loadUser_actionByORMID(int user_action_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadUser_actionByORMID(session, user_action_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action getUser_actionByORMID(int user_action_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getUser_actionByORMID(session, user_action_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action loadUser_actionByORMID(int user_action_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadUser_actionByORMID(session, user_action_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action getUser_actionByORMID(int user_action_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getUser_actionByORMID(session, user_action_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action loadUser_actionByORMID(PersistentSession session, int user_action_id) throws PersistentException {
		try {
			return (User_action) session.load(models.User_action.class, new Integer(user_action_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action getUser_actionByORMID(PersistentSession session, int user_action_id) throws PersistentException {
		try {
			return (User_action) session.get(models.User_action.class, new Integer(user_action_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action loadUser_actionByORMID(PersistentSession session, int user_action_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (User_action) session.load(models.User_action.class, new Integer(user_action_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action getUser_actionByORMID(PersistentSession session, int user_action_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (User_action) session.get(models.User_action.class, new Integer(user_action_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_action(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryUser_action(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_action(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryUser_action(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action[] listUser_actionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listUser_actionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action[] listUser_actionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listUser_actionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_action(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.User_action as User_action");
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
	
	public static List queryUser_action(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.User_action as User_action");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("User_action", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action[] listUser_actionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUser_action(session, condition, orderBy);
			return (User_action[]) list.toArray(new User_action[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action[] listUser_actionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUser_action(session, condition, orderBy, lockMode);
			return (User_action[]) list.toArray(new User_action[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action loadUser_actionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadUser_actionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action loadUser_actionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadUser_actionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action loadUser_actionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		User_action[] user_actions = listUser_actionByQuery(session, condition, orderBy);
		if (user_actions != null && user_actions.length > 0)
			return user_actions[0];
		else
			return null;
	}
	
	public static User_action loadUser_actionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		User_action[] user_actions = listUser_actionByQuery(session, condition, orderBy, lockMode);
		if (user_actions != null && user_actions.length > 0)
			return user_actions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUser_actionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateUser_actionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUser_actionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateUser_actionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUser_actionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.User_action as User_action");
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
	
	public static java.util.Iterator iterateUser_actionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.User_action as User_action");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("User_action", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_action loadUser_actionByCriteria(User_actionCriteria user_actionCriteria) {
		User_action[] user_actions = listUser_actionByCriteria(user_actionCriteria);
		if(user_actions == null || user_actions.length == 0) {
			return null;
		}
		return user_actions[0];
	}
	
	public static User_action[] listUser_actionByCriteria(User_actionCriteria user_actionCriteria) {
		return user_actionCriteria.listUser_action();
	}
	
	public static User_action createUser_action() {
		return new models.User_action();
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
				getJob_card().getUser_action().remove(this);
			}
			
			if(getUser_detail() != null) {
				getUser_detail().getUser_action().remove(this);
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
				getJob_card().getUser_action().remove(this);
			}
			
			if(getUser_detail() != null) {
				getUser_detail().getUser_action().remove(this);
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
	
	@Column(name="user_action_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MODELS_USER_ACTION_USER_ACTION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELS_USER_ACTION_USER_ACTION_ID_GENERATOR", strategy="native")	
	private int user_action_id;
	
	@ManyToOne(targetEntity=models.Job_card.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="job_card_id", referencedColumnName="job_card_id", nullable=false) })	
	private models.Job_card job_card;
	
	@ManyToOne(targetEntity=models.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="user_detail_id", referencedColumnName="user_detail_id", nullable=false) })	
	private models.User_detail user_detail;
	
	@Column(name="action", nullable=false, length=100)	
	private int action;
	
	@Column(name="action_date", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date action_date;
	
	private void setUser_action_id(int value) {
		this.user_action_id = value;
	}
	
	public int getUser_action_id() {
		return user_action_id;
	}
	
	public int getORMID() {
		return getUser_action_id();
	}
	
	public void setAction(int value) {
		this.action = value;
	}
	
	public int getAction() {
		return action;
	}
	
	public void setAction_date(java.util.Date value) {
		this.action_date = value;
	}
	
	public java.util.Date getAction_date() {
		return action_date;
	}
	
	public void setUser_detail(models.User_detail value) {
		this.user_detail = value;
	}
	
	public models.User_detail getUser_detail() {
		return user_detail;
	}
	
	public void setJob_card(models.Job_card value) {
		this.job_card = value;
	}
	
	public models.Job_card getJob_card() {
		return job_card;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
				 return false;
				 }
				User_action object = (User_action) obj;
				return (this.getUser_action_id() == object.getUser_action_id());
	}
	
	public int hashCode() {
		int hash = 3;
				return hash;
	}
	
	public String toString() {
		return String.valueOf(getUser_action_id());
	}
	
}
