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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Delivery_noteCriteria extends AbstractORMCriteria {
	public final IntegerExpression delivery_note_id;
	public final IntegerExpression job_cardId;
	public final AssociationExpression job_card;
	public final IntegerExpression customer_detaillId;
	public final AssociationExpression customer_detaill;
	public final IntegerExpression delivery_note_number;
	public final IntegerExpression is_active;
	public final IntegerExpression is_deleted;
	public final TimestampExpression add_date;
	public final IntegerExpression add_byId;
	public final AssociationExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_byId;
	public final AssociationExpression last_edit_by;
	
	public Delivery_noteCriteria(Criteria criteria) {
		super(criteria);
		delivery_note_id = new IntegerExpression("delivery_note_id", this);
		job_cardId = new IntegerExpression("job_card.job_card_id", this);
		job_card = new AssociationExpression("job_card", this);
		customer_detaillId = new IntegerExpression("customer_detaill.customer_detail_id", this);
		customer_detaill = new AssociationExpression("customer_detaill", this);
		delivery_note_number = new IntegerExpression("delivery_note_number", this);
		is_active = new IntegerExpression("is_active", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		add_date = new TimestampExpression("add_date", this);
		add_byId = new IntegerExpression("add_by.user_detail_id", this);
		add_by = new AssociationExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this);
		last_edit_by = new AssociationExpression("last_edit_by", this);
	}
	
	public Delivery_noteCriteria(PersistentSession session) {
		this(session.createCriteria(Delivery_note.class));
	}
	
	public Delivery_noteCriteria() throws PersistentException {
		this(models.JobCardPersistentManager.instance().getSession());
	}
	
	public Job_cardCriteria createJob_cardCriteria() {
		return new Job_cardCriteria(createCriteria("job_card"));
	}
	
	public Customer_detailCriteria createCustomer_detaillCriteria() {
		return new Customer_detailCriteria(createCriteria("customer_detaill"));
	}
	
	public User_detailCriteria createAdd_byCriteria() {
		return new User_detailCriteria(createCriteria("add_by"));
	}
	
	public User_detailCriteria createLast_edit_byCriteria() {
		return new User_detailCriteria(createCriteria("last_edit_by"));
	}
	
	public Delivery_note uniqueDelivery_note() {
		return (Delivery_note) super.uniqueResult();
	}
	
	public Delivery_note[] listDelivery_note() {
		java.util.List list = super.list();
		return (Delivery_note[]) list.toArray(new Delivery_note[list.size()]);
	}
}

