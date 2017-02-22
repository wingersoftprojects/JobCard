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

public class Customer_detailCriteria extends AbstractORMCriteria {
	public final IntegerExpression customer_detail_id;
	public final StringExpression customer_name;
	public final StringExpression contact_person_name;
	public final IntegerExpression telephone1;
	public final IntegerExpression telephone2;
	public final StringExpression email;
	public final StringExpression address;
	public final IntegerExpression is_active;
	public final IntegerExpression is_deleted;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression delivery_note;
	public final CollectionExpression job_card;
	
	public Customer_detailCriteria(Criteria criteria) {
		super(criteria);
		customer_detail_id = new IntegerExpression("customer_detail_id", this);
		customer_name = new StringExpression("customer_name", this);
		contact_person_name = new StringExpression("contact_person_name", this);
		telephone1 = new IntegerExpression("telephone1", this);
		telephone2 = new IntegerExpression("telephone2", this);
		email = new StringExpression("email", this);
		address = new StringExpression("address", this);
		is_active = new IntegerExpression("is_active", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		delivery_note = new CollectionExpression("delivery_note", this);
		job_card = new CollectionExpression("job_card", this);
	}
	
	public Customer_detailCriteria(PersistentSession session) {
		this(session.createCriteria(Customer_detail.class));
	}
	
	public Customer_detailCriteria() throws PersistentException {
		this(models.JobCardPersistentManager.instance().getSession());
	}
	
	public Delivery_noteCriteria createDelivery_noteCriteria() {
		return new Delivery_noteCriteria(createCriteria("delivery_note"));
	}
	
	public Job_cardCriteria createJob_cardCriteria() {
		return new Job_cardCriteria(createCriteria("job_card"));
	}
	
	public Customer_detail uniqueCustomer_detail() {
		return (Customer_detail) super.uniqueResult();
	}
	
	public Customer_detail[] listCustomer_detail() {
		java.util.List list = super.list();
		return (Customer_detail[]) list.toArray(new Customer_detail[list.size()]);
	}
}

