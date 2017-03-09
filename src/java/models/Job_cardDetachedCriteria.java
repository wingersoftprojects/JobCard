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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Job_cardDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression job_card_id;
	public final IntegerExpression customer_detailId;
	public final AssociationExpression customer_detail;
	public final IntegerExpression job_card_number;
	public final IntegerExpression is_active;
	public final IntegerExpression is_deleted;
	public final TimestampExpression add_date;
	public final IntegerExpression add_byId;
	public final AssociationExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_byId;
	public final AssociationExpression last_edit_by;
	public final DateExpression job_date;
	public final StringExpression status;
	public final DateExpression due_date;
	public final IntegerExpression job_managerId;
	public final AssociationExpression job_manager;
	public final StringExpression delivered_by;
	public final StringExpression delivered_by_phone_number;
	public final CollectionExpression job_card_item;
	public final IntegerExpression delivery_noteId;
	public final AssociationExpression delivery_note;
	public final CollectionExpression user_action;
	public final CollectionExpression job_card_status;
	
	public Job_cardDetachedCriteria() {
		super(models.Job_card.class, models.Job_cardCriteria.class);
		job_card_id = new IntegerExpression("job_card_id", this.getDetachedCriteria());
		customer_detailId = new IntegerExpression("customer_detail.customer_detail_id", this.getDetachedCriteria());
		customer_detail = new AssociationExpression("customer_detail", this.getDetachedCriteria());
		job_card_number = new IntegerExpression("job_card_number", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
		job_date = new DateExpression("job_date", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		due_date = new DateExpression("due_date", this.getDetachedCriteria());
		job_managerId = new IntegerExpression("job_manager.user_detail_id", this.getDetachedCriteria());
		job_manager = new AssociationExpression("job_manager", this.getDetachedCriteria());
		delivered_by = new StringExpression("delivered_by", this.getDetachedCriteria());
		delivered_by_phone_number = new StringExpression("delivered_by_phone_number", this.getDetachedCriteria());
		job_card_item = new CollectionExpression("job_card_item", this.getDetachedCriteria());
		delivery_noteId = new IntegerExpression("delivery_note.job_card_id", this.getDetachedCriteria());
		delivery_note = new AssociationExpression("delivery_note", this.getDetachedCriteria());
		user_action = new CollectionExpression("user_action", this.getDetachedCriteria());
		job_card_status = new CollectionExpression("job_card_status", this.getDetachedCriteria());
	}
	
	public Job_cardDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, models.Job_cardCriteria.class);
		job_card_id = new IntegerExpression("job_card_id", this.getDetachedCriteria());
		customer_detailId = new IntegerExpression("customer_detail.customer_detail_id", this.getDetachedCriteria());
		customer_detail = new AssociationExpression("customer_detail", this.getDetachedCriteria());
		job_card_number = new IntegerExpression("job_card_number", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
		job_date = new DateExpression("job_date", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		due_date = new DateExpression("due_date", this.getDetachedCriteria());
		job_managerId = new IntegerExpression("job_manager.user_detail_id", this.getDetachedCriteria());
		job_manager = new AssociationExpression("job_manager", this.getDetachedCriteria());
		delivered_by = new StringExpression("delivered_by", this.getDetachedCriteria());
		delivered_by_phone_number = new StringExpression("delivered_by_phone_number", this.getDetachedCriteria());
		job_card_item = new CollectionExpression("job_card_item", this.getDetachedCriteria());
		delivery_noteId = new IntegerExpression("delivery_note.job_card_id", this.getDetachedCriteria());
		delivery_note = new AssociationExpression("delivery_note", this.getDetachedCriteria());
		user_action = new CollectionExpression("user_action", this.getDetachedCriteria());
		job_card_status = new CollectionExpression("job_card_status", this.getDetachedCriteria());
	}
	
	public Customer_detailDetachedCriteria createCustomer_detailCriteria() {
		return new Customer_detailDetachedCriteria(createCriteria("customer_detail"));
	}
	
	public User_detailDetachedCriteria createAdd_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("add_by"));
	}
	
	public User_detailDetachedCriteria createLast_edit_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("last_edit_by"));
	}
	
	public User_detailDetachedCriteria createJob_managerCriteria() {
		return new User_detailDetachedCriteria(createCriteria("job_manager"));
	}
	
	public Job_card_itemDetachedCriteria createJob_card_itemCriteria() {
		return new Job_card_itemDetachedCriteria(createCriteria("job_card_item"));
	}
	
	public Delivery_noteDetachedCriteria createDelivery_noteCriteria() {
		return new Delivery_noteDetachedCriteria(createCriteria("delivery_note"));
	}
	
	public User_actionDetachedCriteria createUser_actionCriteria() {
		return new User_actionDetachedCriteria(createCriteria("user_action"));
	}
	
	public Job_card_statusDetachedCriteria createJob_card_statusCriteria() {
		return new Job_card_statusDetachedCriteria(createCriteria("job_card_status"));
	}
	
	public Job_card uniqueJob_card(PersistentSession session) {
		return (Job_card) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Job_card[] listJob_card(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Job_card[]) list.toArray(new Job_card[list.size()]);
	}
}

