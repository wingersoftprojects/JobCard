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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Customer_detailCriteria extends AbstractORMCriteria {
	public final IntegerExpression customer_detail_id;
	public final StringExpression customer_name;
	public final StringExpression telephone1;
	public final StringExpression telephone2;
	public final StringExpression email;
	public final StringExpression contact_person_name;
	public final StringExpression contact_person_telephone1;
	public final StringExpression contact_person_telephone2;
	public final StringExpression contact_person_email;
	public final StringExpression address;
	public final IntegerExpression is_active;
	public final IntegerExpression is_deleted;
	public final TimestampExpression add_date;
	public final IntegerExpression add_byId;
	public final AssociationExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_byId;
	public final AssociationExpression last_edit_by;
	public final CollectionExpression delivery_note;
	public final CollectionExpression job_card;
	public final CollectionExpression contact_person_detail;
	
	public Customer_detailCriteria(Criteria criteria) {
		super(criteria);
		customer_detail_id = new IntegerExpression("customer_detail_id", this);
		customer_name = new StringExpression("customer_name", this);
		telephone1 = new StringExpression("telephone1", this);
		telephone2 = new StringExpression("telephone2", this);
		email = new StringExpression("email", this);
		contact_person_name = new StringExpression("contact_person_name", this);
		contact_person_telephone1 = new StringExpression("contact_person_telephone1", this);
		contact_person_telephone2 = new StringExpression("contact_person_telephone2", this);
		contact_person_email = new StringExpression("contact_person_email", this);
		address = new StringExpression("address", this);
		is_active = new IntegerExpression("is_active", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		add_date = new TimestampExpression("add_date", this);
		add_byId = new IntegerExpression("add_by.user_detail_id", this);
		add_by = new AssociationExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this);
		last_edit_by = new AssociationExpression("last_edit_by", this);
		delivery_note = new CollectionExpression("delivery_note", this);
		job_card = new CollectionExpression("job_card", this);
		contact_person_detail = new CollectionExpression("contact_person_detail", this);
	}
	
	public Customer_detailCriteria(PersistentSession session) {
		this(session.createCriteria(Customer_detail.class));
	}
	
	public Customer_detailCriteria() throws PersistentException {
		this(models.JobCardPersistentManager.instance().getSession());
	}
	
	public User_detailCriteria createAdd_byCriteria() {
		return new User_detailCriteria(createCriteria("add_by"));
	}
	
	public User_detailCriteria createLast_edit_byCriteria() {
		return new User_detailCriteria(createCriteria("last_edit_by"));
	}
	
	public Delivery_noteCriteria createDelivery_noteCriteria() {
		return new Delivery_noteCriteria(createCriteria("delivery_note"));
	}
	
	public Job_cardCriteria createJob_cardCriteria() {
		return new Job_cardCriteria(createCriteria("job_card"));
	}
	
	public Contact_person_detailCriteria createContact_person_detailCriteria() {
		return new Contact_person_detailCriteria(createCriteria("contact_person_detail"));
	}
	
	public Customer_detail uniqueCustomer_detail() {
		return (Customer_detail) super.uniqueResult();
	}
	
	public Customer_detail[] listCustomer_detail() {
		java.util.List list = super.list();
		return (Customer_detail[]) list.toArray(new Customer_detail[list.size()]);
	}
}

