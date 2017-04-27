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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Delivery_noteDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public Delivery_noteDetachedCriteria() {
		super(models.Delivery_note.class, models.Delivery_noteCriteria.class);
		delivery_note_id = new IntegerExpression("delivery_note_id", this.getDetachedCriteria());
		job_cardId = new IntegerExpression("job_card.job_card_id", this.getDetachedCriteria());
		job_card = new AssociationExpression("job_card", this.getDetachedCriteria());
		customer_detaillId = new IntegerExpression("customer_detaill.customer_detail_id", this.getDetachedCriteria());
		customer_detaill = new AssociationExpression("customer_detaill", this.getDetachedCriteria());
		delivery_note_number = new IntegerExpression("delivery_note_number", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
	}
	
	public Delivery_noteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, models.Delivery_noteCriteria.class);
		delivery_note_id = new IntegerExpression("delivery_note_id", this.getDetachedCriteria());
		job_cardId = new IntegerExpression("job_card.job_card_id", this.getDetachedCriteria());
		job_card = new AssociationExpression("job_card", this.getDetachedCriteria());
		customer_detaillId = new IntegerExpression("customer_detaill.customer_detail_id", this.getDetachedCriteria());
		customer_detaill = new AssociationExpression("customer_detaill", this.getDetachedCriteria());
		delivery_note_number = new IntegerExpression("delivery_note_number", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
	}
	
	public Job_cardDetachedCriteria createJob_cardCriteria() {
		return new Job_cardDetachedCriteria(createCriteria("job_card"));
	}
	
	public Customer_detailDetachedCriteria createCustomer_detaillCriteria() {
		return new Customer_detailDetachedCriteria(createCriteria("customer_detaill"));
	}
	
	public User_detailDetachedCriteria createAdd_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("add_by"));
	}
	
	public User_detailDetachedCriteria createLast_edit_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("last_edit_by"));
	}
	
	public Delivery_note uniqueDelivery_note(PersistentSession session) {
		return (Delivery_note) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Delivery_note[] listDelivery_note(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Delivery_note[]) list.toArray(new Delivery_note[list.size()]);
	}
}

