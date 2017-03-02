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
@Table(name="user_detail")
public class User_detail implements Serializable {
	public User_detail() {
	}
	
	public static User_detail loadUser_detailByORMID(int user_detail_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadUser_detailByORMID(session, user_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(int user_detail_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getUser_detailByORMID(session, user_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByORMID(int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadUser_detailByORMID(session, user_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getUser_detailByORMID(session, user_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByORMID(PersistentSession session, int user_detail_id) throws PersistentException {
		try {
			return (User_detail) session.load(models.User_detail.class, new Integer(user_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(PersistentSession session, int user_detail_id) throws PersistentException {
		try {
			return (User_detail) session.get(models.User_detail.class, new Integer(user_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByORMID(PersistentSession session, int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (User_detail) session.load(models.User_detail.class, new Integer(user_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(PersistentSession session, int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (User_detail) session.get(models.User_detail.class, new Integer(user_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_detail(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryUser_detail(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_detail(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryUser_detail(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listUser_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listUser_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_detail(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.User_detail as User_detail");
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
	
	public static List queryUser_detail(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.User_detail as User_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("User_detail", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUser_detail(session, condition, orderBy);
			return (User_detail[]) list.toArray(new User_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUser_detail(session, condition, orderBy, lockMode);
			return (User_detail[]) list.toArray(new User_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadUser_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadUser_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		User_detail[] user_details = listUser_detailByQuery(session, condition, orderBy);
		if (user_details != null && user_details.length > 0)
			return user_details[0];
		else
			return null;
	}
	
	public static User_detail loadUser_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		User_detail[] user_details = listUser_detailByQuery(session, condition, orderBy, lockMode);
		if (user_details != null && user_details.length > 0)
			return user_details[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUser_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateUser_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUser_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateUser_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUser_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.User_detail as User_detail");
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
	
	public static java.util.Iterator iterateUser_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.User_detail as User_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("User_detail", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByCriteria(User_detailCriteria user_detailCriteria) {
		User_detail[] user_details = listUser_detailByCriteria(user_detailCriteria);
		if(user_details == null || user_details.length == 0) {
			return null;
		}
		return user_details[0];
	}
	
	public static User_detail[] listUser_detailByCriteria(User_detailCriteria user_detailCriteria) {
		return user_detailCriteria.listUser_detail();
	}
	
	public static User_detail createUser_detail() {
		return new models.User_detail();
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
				getAdd_by().getUser_detail().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getUser_detail1().remove(this);
			}
			
			models.User_action[] lUser_actions = (models.User_action[])getUser_action().toArray(new models.User_action[getUser_action().size()]);
			for(int i = 0; i < lUser_actions.length; i++) {
				lUser_actions[i].setUser_detail(null);
			}
			models.Group_user[] lGroup_users = (models.Group_user[])getGroup_user().toArray(new models.Group_user[getGroup_user().size()]);
			for(int i = 0; i < lGroup_users.length; i++) {
				lGroup_users[i].setUser_detail(null);
			}
			models.Login_session[] lLogin_sessions = (models.Login_session[])getLogin_session().toArray(new models.Login_session[getLogin_session().size()]);
			for(int i = 0; i < lLogin_sessions.length; i++) {
				lLogin_sessions[i].setUser_detail(null);
			}
			models.Login_session[] lLogin_session1s = (models.Login_session[])getLogin_session1().toArray(new models.Login_session[getLogin_session1().size()]);
			for(int i = 0; i < lLogin_session1s.length; i++) {
				lLogin_session1s[i].setAdd_by(null);
			}
			models.Login_session[] lLogin_session2s = (models.Login_session[])getLogin_session2().toArray(new models.Login_session[getLogin_session2().size()]);
			for(int i = 0; i < lLogin_session2s.length; i++) {
				lLogin_session2s[i].setLast_edit_by(null);
			}
			models.Group_user[] lGroup_user1s = (models.Group_user[])getGroup_user1().toArray(new models.Group_user[getGroup_user1().size()]);
			for(int i = 0; i < lGroup_user1s.length; i++) {
				lGroup_user1s[i].setAdd_by(null);
			}
			models.Group_user[] lGroup_user2s = (models.Group_user[])getGroup_user2().toArray(new models.Group_user[getGroup_user2().size()]);
			for(int i = 0; i < lGroup_user2s.length; i++) {
				lGroup_user2s[i].setLast_edit_by(null);
			}
			models.Group_detail[] lGroup_details = (models.Group_detail[])getGroup_detail().toArray(new models.Group_detail[getGroup_detail().size()]);
			for(int i = 0; i < lGroup_details.length; i++) {
				lGroup_details[i].setAdd_by(null);
			}
			models.Group_detail[] lGroup_detail1s = (models.Group_detail[])getGroup_detail1().toArray(new models.Group_detail[getGroup_detail1().size()]);
			for(int i = 0; i < lGroup_detail1s.length; i++) {
				lGroup_detail1s[i].setLast_edit_by(null);
			}
			models.Group_right[] lGroup_rights = (models.Group_right[])getGroup_right().toArray(new models.Group_right[getGroup_right().size()]);
			for(int i = 0; i < lGroup_rights.length; i++) {
				lGroup_rights[i].setAdd_by(null);
			}
			models.Group_right[] lGroup_right1s = (models.Group_right[])getGroup_right1().toArray(new models.Group_right[getGroup_right1().size()]);
			for(int i = 0; i < lGroup_right1s.length; i++) {
				lGroup_right1s[i].setLast_edit_by(null);
			}
			models.Job_card_item[] lJob_card_items = (models.Job_card_item[])getJob_card_item().toArray(new models.Job_card_item[getJob_card_item().size()]);
			for(int i = 0; i < lJob_card_items.length; i++) {
				lJob_card_items[i].setAdd_by(null);
			}
			models.Job_card_item[] lJob_card_item1s = (models.Job_card_item[])getJob_card_item1().toArray(new models.Job_card_item[getJob_card_item1().size()]);
			for(int i = 0; i < lJob_card_item1s.length; i++) {
				lJob_card_item1s[i].setLast_edit_by(null);
			}
			models.Customer_detail[] lCustomer_details = (models.Customer_detail[])getCustomer_detail().toArray(new models.Customer_detail[getCustomer_detail().size()]);
			for(int i = 0; i < lCustomer_details.length; i++) {
				lCustomer_details[i].setAdd_by(null);
			}
			models.Customer_detail[] lCustomer_detail1s = (models.Customer_detail[])getCustomer_detail1().toArray(new models.Customer_detail[getCustomer_detail1().size()]);
			for(int i = 0; i < lCustomer_detail1s.length; i++) {
				lCustomer_detail1s[i].setLast_edit_by(null);
			}
			models.Delivery_note[] lDelivery_notes = (models.Delivery_note[])getDelivery_note().toArray(new models.Delivery_note[getDelivery_note().size()]);
			for(int i = 0; i < lDelivery_notes.length; i++) {
				lDelivery_notes[i].setAdd_by(null);
			}
			models.Delivery_note[] lDelivery_note1s = (models.Delivery_note[])getDelivery_note1().toArray(new models.Delivery_note[getDelivery_note1().size()]);
			for(int i = 0; i < lDelivery_note1s.length; i++) {
				lDelivery_note1s[i].setLast_edit_by(null);
			}
			models.Job_card[] lJob_cards = (models.Job_card[])getJob_card().toArray(new models.Job_card[getJob_card().size()]);
			for(int i = 0; i < lJob_cards.length; i++) {
				lJob_cards[i].setAdd_by(null);
			}
			models.Paper_type[] lPaper_types = (models.Paper_type[])getPaper_type().toArray(new models.Paper_type[getPaper_type().size()]);
			for(int i = 0; i < lPaper_types.length; i++) {
				lPaper_types[i].setAdd_by(null);
			}
			models.Paper_type[] lPaper_type1s = (models.Paper_type[])getPaper_type1().toArray(new models.Paper_type[getPaper_type1().size()]);
			for(int i = 0; i < lPaper_type1s.length; i++) {
				lPaper_type1s[i].setLast_edit_by(null);
			}
			models.Job_card[] lJob_card1s = (models.Job_card[])getJob_card1().toArray(new models.Job_card[getJob_card1().size()]);
			for(int i = 0; i < lJob_card1s.length; i++) {
				lJob_card1s[i].setLast_edit_by(null);
			}
			models.Supplier_detail[] lSupplier_details = (models.Supplier_detail[])getSupplier_detail().toArray(new models.Supplier_detail[getSupplier_detail().size()]);
			for(int i = 0; i < lSupplier_details.length; i++) {
				lSupplier_details[i].setAdd_by(null);
			}
			models.Supplier_detail[] lSupplier_detail1s = (models.Supplier_detail[])getSupplier_detail1().toArray(new models.Supplier_detail[getSupplier_detail1().size()]);
			for(int i = 0; i < lSupplier_detail1s.length; i++) {
				lSupplier_detail1s[i].setLast_edit_by(null);
			}
			models.User_detail[] lUser_details = (models.User_detail[])getUser_detail().toArray(new models.User_detail[getUser_detail().size()]);
			for(int i = 0; i < lUser_details.length; i++) {
				lUser_details[i].setAdd_by(null);
			}
			models.User_detail[] lUser_detail1s = (models.User_detail[])getUser_detail1().toArray(new models.User_detail[getUser_detail1().size()]);
			for(int i = 0; i < lUser_detail1s.length; i++) {
				lUser_detail1s[i].setLast_edit_by(null);
			}
			models.Item_type[] lItem_types = (models.Item_type[])getItem_type().toArray(new models.Item_type[getItem_type().size()]);
			for(int i = 0; i < lItem_types.length; i++) {
				lItem_types[i].setAdd_by(null);
			}
			models.Item_type[] lItem_type1s = (models.Item_type[])getItem_type1().toArray(new models.Item_type[getItem_type1().size()]);
			for(int i = 0; i < lItem_type1s.length; i++) {
				lItem_type1s[i].setLast_edit_by(null);
			}
			models.Cover_type[] lCover_types = (models.Cover_type[])getCover_type().toArray(new models.Cover_type[getCover_type().size()]);
			for(int i = 0; i < lCover_types.length; i++) {
				lCover_types[i].setAdd_by(null);
			}
			models.Cover_type[] lCover_type1s = (models.Cover_type[])getCover_type1().toArray(new models.Cover_type[getCover_type1().size()]);
			for(int i = 0; i < lCover_type1s.length; i++) {
				lCover_type1s[i].setLast_edit_by(null);
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
				getAdd_by().getUser_detail().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getUser_detail1().remove(this);
			}
			
			models.User_action[] lUser_actions = (models.User_action[])getUser_action().toArray(new models.User_action[getUser_action().size()]);
			for(int i = 0; i < lUser_actions.length; i++) {
				lUser_actions[i].setUser_detail(null);
			}
			models.Group_user[] lGroup_users = (models.Group_user[])getGroup_user().toArray(new models.Group_user[getGroup_user().size()]);
			for(int i = 0; i < lGroup_users.length; i++) {
				lGroup_users[i].setUser_detail(null);
			}
			models.Login_session[] lLogin_sessions = (models.Login_session[])getLogin_session().toArray(new models.Login_session[getLogin_session().size()]);
			for(int i = 0; i < lLogin_sessions.length; i++) {
				lLogin_sessions[i].setUser_detail(null);
			}
			models.Login_session[] lLogin_session1s = (models.Login_session[])getLogin_session1().toArray(new models.Login_session[getLogin_session1().size()]);
			for(int i = 0; i < lLogin_session1s.length; i++) {
				lLogin_session1s[i].setAdd_by(null);
			}
			models.Login_session[] lLogin_session2s = (models.Login_session[])getLogin_session2().toArray(new models.Login_session[getLogin_session2().size()]);
			for(int i = 0; i < lLogin_session2s.length; i++) {
				lLogin_session2s[i].setLast_edit_by(null);
			}
			models.Group_user[] lGroup_user1s = (models.Group_user[])getGroup_user1().toArray(new models.Group_user[getGroup_user1().size()]);
			for(int i = 0; i < lGroup_user1s.length; i++) {
				lGroup_user1s[i].setAdd_by(null);
			}
			models.Group_user[] lGroup_user2s = (models.Group_user[])getGroup_user2().toArray(new models.Group_user[getGroup_user2().size()]);
			for(int i = 0; i < lGroup_user2s.length; i++) {
				lGroup_user2s[i].setLast_edit_by(null);
			}
			models.Group_detail[] lGroup_details = (models.Group_detail[])getGroup_detail().toArray(new models.Group_detail[getGroup_detail().size()]);
			for(int i = 0; i < lGroup_details.length; i++) {
				lGroup_details[i].setAdd_by(null);
			}
			models.Group_detail[] lGroup_detail1s = (models.Group_detail[])getGroup_detail1().toArray(new models.Group_detail[getGroup_detail1().size()]);
			for(int i = 0; i < lGroup_detail1s.length; i++) {
				lGroup_detail1s[i].setLast_edit_by(null);
			}
			models.Group_right[] lGroup_rights = (models.Group_right[])getGroup_right().toArray(new models.Group_right[getGroup_right().size()]);
			for(int i = 0; i < lGroup_rights.length; i++) {
				lGroup_rights[i].setAdd_by(null);
			}
			models.Group_right[] lGroup_right1s = (models.Group_right[])getGroup_right1().toArray(new models.Group_right[getGroup_right1().size()]);
			for(int i = 0; i < lGroup_right1s.length; i++) {
				lGroup_right1s[i].setLast_edit_by(null);
			}
			models.Job_card_item[] lJob_card_items = (models.Job_card_item[])getJob_card_item().toArray(new models.Job_card_item[getJob_card_item().size()]);
			for(int i = 0; i < lJob_card_items.length; i++) {
				lJob_card_items[i].setAdd_by(null);
			}
			models.Job_card_item[] lJob_card_item1s = (models.Job_card_item[])getJob_card_item1().toArray(new models.Job_card_item[getJob_card_item1().size()]);
			for(int i = 0; i < lJob_card_item1s.length; i++) {
				lJob_card_item1s[i].setLast_edit_by(null);
			}
			models.Customer_detail[] lCustomer_details = (models.Customer_detail[])getCustomer_detail().toArray(new models.Customer_detail[getCustomer_detail().size()]);
			for(int i = 0; i < lCustomer_details.length; i++) {
				lCustomer_details[i].setAdd_by(null);
			}
			models.Customer_detail[] lCustomer_detail1s = (models.Customer_detail[])getCustomer_detail1().toArray(new models.Customer_detail[getCustomer_detail1().size()]);
			for(int i = 0; i < lCustomer_detail1s.length; i++) {
				lCustomer_detail1s[i].setLast_edit_by(null);
			}
			models.Delivery_note[] lDelivery_notes = (models.Delivery_note[])getDelivery_note().toArray(new models.Delivery_note[getDelivery_note().size()]);
			for(int i = 0; i < lDelivery_notes.length; i++) {
				lDelivery_notes[i].setAdd_by(null);
			}
			models.Delivery_note[] lDelivery_note1s = (models.Delivery_note[])getDelivery_note1().toArray(new models.Delivery_note[getDelivery_note1().size()]);
			for(int i = 0; i < lDelivery_note1s.length; i++) {
				lDelivery_note1s[i].setLast_edit_by(null);
			}
			models.Job_card[] lJob_cards = (models.Job_card[])getJob_card().toArray(new models.Job_card[getJob_card().size()]);
			for(int i = 0; i < lJob_cards.length; i++) {
				lJob_cards[i].setAdd_by(null);
			}
			models.Paper_type[] lPaper_types = (models.Paper_type[])getPaper_type().toArray(new models.Paper_type[getPaper_type().size()]);
			for(int i = 0; i < lPaper_types.length; i++) {
				lPaper_types[i].setAdd_by(null);
			}
			models.Paper_type[] lPaper_type1s = (models.Paper_type[])getPaper_type1().toArray(new models.Paper_type[getPaper_type1().size()]);
			for(int i = 0; i < lPaper_type1s.length; i++) {
				lPaper_type1s[i].setLast_edit_by(null);
			}
			models.Job_card[] lJob_card1s = (models.Job_card[])getJob_card1().toArray(new models.Job_card[getJob_card1().size()]);
			for(int i = 0; i < lJob_card1s.length; i++) {
				lJob_card1s[i].setLast_edit_by(null);
			}
			models.Supplier_detail[] lSupplier_details = (models.Supplier_detail[])getSupplier_detail().toArray(new models.Supplier_detail[getSupplier_detail().size()]);
			for(int i = 0; i < lSupplier_details.length; i++) {
				lSupplier_details[i].setAdd_by(null);
			}
			models.Supplier_detail[] lSupplier_detail1s = (models.Supplier_detail[])getSupplier_detail1().toArray(new models.Supplier_detail[getSupplier_detail1().size()]);
			for(int i = 0; i < lSupplier_detail1s.length; i++) {
				lSupplier_detail1s[i].setLast_edit_by(null);
			}
			models.User_detail[] lUser_details = (models.User_detail[])getUser_detail().toArray(new models.User_detail[getUser_detail().size()]);
			for(int i = 0; i < lUser_details.length; i++) {
				lUser_details[i].setAdd_by(null);
			}
			models.User_detail[] lUser_detail1s = (models.User_detail[])getUser_detail1().toArray(new models.User_detail[getUser_detail1().size()]);
			for(int i = 0; i < lUser_detail1s.length; i++) {
				lUser_detail1s[i].setLast_edit_by(null);
			}
			models.Item_type[] lItem_types = (models.Item_type[])getItem_type().toArray(new models.Item_type[getItem_type().size()]);
			for(int i = 0; i < lItem_types.length; i++) {
				lItem_types[i].setAdd_by(null);
			}
			models.Item_type[] lItem_type1s = (models.Item_type[])getItem_type1().toArray(new models.Item_type[getItem_type1().size()]);
			for(int i = 0; i < lItem_type1s.length; i++) {
				lItem_type1s[i].setLast_edit_by(null);
			}
			models.Cover_type[] lCover_types = (models.Cover_type[])getCover_type().toArray(new models.Cover_type[getCover_type().size()]);
			for(int i = 0; i < lCover_types.length; i++) {
				lCover_types[i].setAdd_by(null);
			}
			models.Cover_type[] lCover_type1s = (models.Cover_type[])getCover_type1().toArray(new models.Cover_type[getCover_type1().size()]);
			for(int i = 0; i < lCover_type1s.length; i++) {
				lCover_type1s[i].setLast_edit_by(null);
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
	
	@Column(name="user_detail_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MODELS_USER_DETAIL_USER_DETAIL_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELS_USER_DETAIL_USER_DETAIL_ID_GENERATOR", strategy="native")	
	private int user_detail_id;
	
	@Column(name="user_name", nullable=false, unique=true, length=50)	
	private String user_name;
	
	@Column(name="user_password", nullable=false)	
	private String user_password;
	
	@Column(name="first_name", nullable=false, length=100)	
	private String first_name;
	
	@Column(name="second_name", nullable=false, length=100)	
	private String second_name;
	
	@Column(name="third_name", nullable=true, length=100)	
	private String third_name;
	
	@Column(name="is_user_gen_admin", nullable=false, length=1)	
	private int is_user_gen_admin;
	
	@Column(name="is_deleted", nullable=false, length=1)	
	private int is_deleted;
	
	@Column(name="is_active", nullable=false, length=1)	
	private int is_active;
	
	@Column(name="add_date", nullable=false)	
	private java.sql.Timestamp add_date;
	
	@ManyToOne(targetEntity=models.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="add_by", referencedColumnName="user_detail_id") })	
	private models.User_detail add_by;
	
	@Column(name="last_edit_date", nullable=true)	
	private java.sql.Timestamp last_edit_date;
	
	@ManyToOne(targetEntity=models.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="last_edit_by", referencedColumnName="user_detail_id") })	
	private models.User_detail last_edit_by;
	
	@OneToMany(mappedBy="user_detail", targetEntity=models.User_action.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set user_action = new java.util.HashSet();
	
	@OneToMany(mappedBy="user_detail", targetEntity=models.Group_user.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set group_user = new java.util.HashSet();
	
	@OneToMany(mappedBy="user_detail", targetEntity=models.Login_session.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set login_session = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_by", targetEntity=models.Login_session.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set login_session1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="last_edit_by", targetEntity=models.Login_session.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set login_session2 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_by", targetEntity=models.Group_user.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set group_user1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="last_edit_by", targetEntity=models.Group_user.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set group_user2 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_by", targetEntity=models.Group_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set group_detail = new java.util.HashSet();
	
	@OneToMany(mappedBy="last_edit_by", targetEntity=models.Group_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set group_detail1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_by", targetEntity=models.Group_right.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set group_right = new java.util.HashSet();
	
	@OneToMany(mappedBy="last_edit_by", targetEntity=models.Group_right.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set group_right1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_by", targetEntity=models.Job_card_item.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set job_card_item = new java.util.HashSet();
	
	@OneToMany(mappedBy="last_edit_by", targetEntity=models.Job_card_item.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set job_card_item1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_by", targetEntity=models.Customer_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set customer_detail = new java.util.HashSet();
	
	@OneToMany(mappedBy="last_edit_by", targetEntity=models.Customer_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set customer_detail1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_by", targetEntity=models.Delivery_note.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set delivery_note = new java.util.HashSet();
	
	@OneToMany(mappedBy="last_edit_by", targetEntity=models.Delivery_note.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set delivery_note1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_by", targetEntity=models.Job_card.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set job_card = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_by", targetEntity=models.Paper_type.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set paper_type = new java.util.HashSet();
	
	@OneToMany(mappedBy="last_edit_by", targetEntity=models.Paper_type.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set paper_type1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="last_edit_by", targetEntity=models.Job_card.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set job_card1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_by", targetEntity=models.Supplier_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set supplier_detail = new java.util.HashSet();
	
	@OneToMany(mappedBy="last_edit_by", targetEntity=models.Supplier_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set supplier_detail1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_by", targetEntity=models.User_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set user_detail = new java.util.HashSet();
	
	@OneToMany(mappedBy="last_edit_by", targetEntity=models.User_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set user_detail1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_by", targetEntity=models.Item_type.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set item_type = new java.util.HashSet();
	
	@OneToMany(mappedBy="last_edit_by", targetEntity=models.Item_type.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set item_type1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_by", targetEntity=models.Cover_type.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set cover_type = new java.util.HashSet();
	
	@OneToMany(mappedBy="last_edit_by", targetEntity=models.Cover_type.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set cover_type1 = new java.util.HashSet();
	
	private void setUser_detail_id(int value) {
		this.user_detail_id = value;
	}
	
	public int getUser_detail_id() {
		return user_detail_id;
	}
	
	public int getORMID() {
		return getUser_detail_id();
	}
	
	public void setUser_name(String value) {
		this.user_name = value;
	}
	
	public String getUser_name() {
		return user_name;
	}
	
	public void setUser_password(String value) {
		this.user_password = value;
	}
	
	public String getUser_password() {
		return user_password;
	}
	
	public void setFirst_name(String value) {
		this.first_name = value;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public void setSecond_name(String value) {
		this.second_name = value;
	}
	
	public String getSecond_name() {
		return second_name;
	}
	
	public void setThird_name(String value) {
		this.third_name = value;
	}
	
	public String getThird_name() {
		return third_name;
	}
	
	public void setIs_user_gen_admin(int value) {
		this.is_user_gen_admin = value;
	}
	
	public int getIs_user_gen_admin() {
		return is_user_gen_admin;
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
	
	public void setUser_action(java.util.Set value) {
		this.user_action = value;
	}
	
	public java.util.Set getUser_action() {
		return user_action;
	}
	
	
	public void setGroup_user(java.util.Set value) {
		this.group_user = value;
	}
	
	public java.util.Set getGroup_user() {
		return group_user;
	}
	
	
	public void setLogin_session(java.util.Set value) {
		this.login_session = value;
	}
	
	public java.util.Set getLogin_session() {
		return login_session;
	}
	
	
	public void setLogin_session1(java.util.Set value) {
		this.login_session1 = value;
	}
	
	public java.util.Set getLogin_session1() {
		return login_session1;
	}
	
	
	public void setLogin_session2(java.util.Set value) {
		this.login_session2 = value;
	}
	
	public java.util.Set getLogin_session2() {
		return login_session2;
	}
	
	
	public void setGroup_user1(java.util.Set value) {
		this.group_user1 = value;
	}
	
	public java.util.Set getGroup_user1() {
		return group_user1;
	}
	
	
	public void setGroup_user2(java.util.Set value) {
		this.group_user2 = value;
	}
	
	public java.util.Set getGroup_user2() {
		return group_user2;
	}
	
	
	public void setGroup_detail(java.util.Set value) {
		this.group_detail = value;
	}
	
	public java.util.Set getGroup_detail() {
		return group_detail;
	}
	
	
	public void setGroup_detail1(java.util.Set value) {
		this.group_detail1 = value;
	}
	
	public java.util.Set getGroup_detail1() {
		return group_detail1;
	}
	
	
	public void setGroup_right(java.util.Set value) {
		this.group_right = value;
	}
	
	public java.util.Set getGroup_right() {
		return group_right;
	}
	
	
	public void setGroup_right1(java.util.Set value) {
		this.group_right1 = value;
	}
	
	public java.util.Set getGroup_right1() {
		return group_right1;
	}
	
	
	public void setJob_card_item(java.util.Set value) {
		this.job_card_item = value;
	}
	
	public java.util.Set getJob_card_item() {
		return job_card_item;
	}
	
	
	public void setJob_card_item1(java.util.Set value) {
		this.job_card_item1 = value;
	}
	
	public java.util.Set getJob_card_item1() {
		return job_card_item1;
	}
	
	
	public void setCustomer_detail(java.util.Set value) {
		this.customer_detail = value;
	}
	
	public java.util.Set getCustomer_detail() {
		return customer_detail;
	}
	
	
	public void setCustomer_detail1(java.util.Set value) {
		this.customer_detail1 = value;
	}
	
	public java.util.Set getCustomer_detail1() {
		return customer_detail1;
	}
	
	
	public void setDelivery_note(java.util.Set value) {
		this.delivery_note = value;
	}
	
	public java.util.Set getDelivery_note() {
		return delivery_note;
	}
	
	
	public void setDelivery_note1(java.util.Set value) {
		this.delivery_note1 = value;
	}
	
	public java.util.Set getDelivery_note1() {
		return delivery_note1;
	}
	
	
	public void setJob_card(java.util.Set value) {
		this.job_card = value;
	}
	
	public java.util.Set getJob_card() {
		return job_card;
	}
	
	
	public void setPaper_type(java.util.Set value) {
		this.paper_type = value;
	}
	
	public java.util.Set getPaper_type() {
		return paper_type;
	}
	
	
	public void setPaper_type1(java.util.Set value) {
		this.paper_type1 = value;
	}
	
	public java.util.Set getPaper_type1() {
		return paper_type1;
	}
	
	
	public void setJob_card1(java.util.Set value) {
		this.job_card1 = value;
	}
	
	public java.util.Set getJob_card1() {
		return job_card1;
	}
	
	
	public void setSupplier_detail(java.util.Set value) {
		this.supplier_detail = value;
	}
	
	public java.util.Set getSupplier_detail() {
		return supplier_detail;
	}
	
	
	public void setSupplier_detail1(java.util.Set value) {
		this.supplier_detail1 = value;
	}
	
	public java.util.Set getSupplier_detail1() {
		return supplier_detail1;
	}
	
	
	public void setUser_detail(java.util.Set value) {
		this.user_detail = value;
	}
	
	public java.util.Set getUser_detail() {
		return user_detail;
	}
	
	
	public void setUser_detail1(java.util.Set value) {
		this.user_detail1 = value;
	}
	
	public java.util.Set getUser_detail1() {
		return user_detail1;
	}
	
	
	public void setItem_type(java.util.Set value) {
		this.item_type = value;
	}
	
	public java.util.Set getItem_type() {
		return item_type;
	}
	
	
	public void setItem_type1(java.util.Set value) {
		this.item_type1 = value;
	}
	
	public java.util.Set getItem_type1() {
		return item_type1;
	}
	
	
	public void setCover_type(java.util.Set value) {
		this.cover_type = value;
	}
	
	public java.util.Set getCover_type() {
		return cover_type;
	}
	
	
	public void setCover_type1(java.util.Set value) {
		this.cover_type1 = value;
	}
	
	public java.util.Set getCover_type1() {
		return cover_type1;
	}
	
	
	public boolean equals(Object obj) {
		if (obj == null) {
				 return false;
				 }
				User_detail object = (User_detail) obj;
				return (this.getUser_detail_id() == object.getUser_detail_id());
	}
	
	public int hashCode() {
		int hash = 3;
				return hash;
	}
	
	public String toString() {
		return String.valueOf(getUser_detail_id());
	}
	
}
