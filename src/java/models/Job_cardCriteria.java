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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Job_cardCriteria extends AbstractORMCriteria {
	public final IntegerExpression job_card_id;
	public final IntegerExpression customer_detailId;
	public final AssociationExpression customer_detail;
	public final IntegerExpression job_card_number;
	public final IntegerExpression is_active;
	public final IntegerExpression is_deleted;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression job_card_item;
	public final IntegerExpression delivery_noteId;
	public final AssociationExpression delivery_note;
	public final CollectionExpression user_action;
	public final CollectionExpression group_right;
	
	public Job_cardCriteria(Criteria criteria) {
		super(criteria);
		job_card_id = new IntegerExpression("job_card_id", this);
		customer_detailId = new IntegerExpression("customer_detail.customer_detail_id", this);
		customer_detail = new AssociationExpression("customer_detail", this);
		job_card_number = new IntegerExpression("job_card_number", this);
		is_active = new IntegerExpression("is_active", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		job_card_item = new CollectionExpression("job_card_item", this);
		delivery_noteId = new IntegerExpression("delivery_note.job_card_id", this);
		delivery_note = new AssociationExpression("delivery_note", this);
		user_action = new CollectionExpression("user_action", this);
		group_right = new CollectionExpression("group_right", this);
	}
	
	public Job_cardCriteria(PersistentSession session) {
		this(session.createCriteria(Job_card.class));
	}
	
	public Job_cardCriteria() throws PersistentException {
		this(models.JobCardPersistentManager.instance().getSession());
	}
	
	public Customer_detailCriteria createCustomer_detailCriteria() {
		return new Customer_detailCriteria(createCriteria("customer_detail"));
	}
	
	public Job_card_itemCriteria createJob_card_itemCriteria() {
		return new Job_card_itemCriteria(createCriteria("job_card_item"));
	}
	
	public Delivery_noteCriteria createDelivery_noteCriteria() {
		return new Delivery_noteCriteria(createCriteria("delivery_note"));
	}
	
	public User_actionCriteria createUser_actionCriteria() {
		return new User_actionCriteria(createCriteria("user_action"));
	}
	
	public Group_rightCriteria createGroup_rightCriteria() {
		return new Group_rightCriteria(createCriteria("group_right"));
	}
	
	public Job_card uniqueJob_card() {
		return (Job_card) super.uniqueResult();
	}
	
	public Job_card[] listJob_card() {
		java.util.List list = super.list();
		return (Job_card[]) list.toArray(new Job_card[list.size()]);
	}
}

