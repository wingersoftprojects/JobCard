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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Customer_detailDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public Customer_detailDetachedCriteria() {
		super(models.Customer_detail.class, models.Customer_detailCriteria.class);
		customer_detail_id = new IntegerExpression("customer_detail_id", this.getDetachedCriteria());
		customer_name = new StringExpression("customer_name", this.getDetachedCriteria());
		telephone1 = new StringExpression("telephone1", this.getDetachedCriteria());
		telephone2 = new StringExpression("telephone2", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contact_person_name = new StringExpression("contact_person_name", this.getDetachedCriteria());
		contact_person_telephone1 = new StringExpression("contact_person_telephone1", this.getDetachedCriteria());
		contact_person_telephone2 = new StringExpression("contact_person_telephone2", this.getDetachedCriteria());
		contact_person_email = new StringExpression("contact_person_email", this.getDetachedCriteria());
		address = new StringExpression("address", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
		delivery_note = new CollectionExpression("delivery_note", this.getDetachedCriteria());
		job_card = new CollectionExpression("job_card", this.getDetachedCriteria());
		contact_person_detail = new CollectionExpression("contact_person_detail", this.getDetachedCriteria());
	}
	
	public Customer_detailDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, models.Customer_detailCriteria.class);
		customer_detail_id = new IntegerExpression("customer_detail_id", this.getDetachedCriteria());
		customer_name = new StringExpression("customer_name", this.getDetachedCriteria());
		telephone1 = new StringExpression("telephone1", this.getDetachedCriteria());
		telephone2 = new StringExpression("telephone2", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contact_person_name = new StringExpression("contact_person_name", this.getDetachedCriteria());
		contact_person_telephone1 = new StringExpression("contact_person_telephone1", this.getDetachedCriteria());
		contact_person_telephone2 = new StringExpression("contact_person_telephone2", this.getDetachedCriteria());
		contact_person_email = new StringExpression("contact_person_email", this.getDetachedCriteria());
		address = new StringExpression("address", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
		delivery_note = new CollectionExpression("delivery_note", this.getDetachedCriteria());
		job_card = new CollectionExpression("job_card", this.getDetachedCriteria());
		contact_person_detail = new CollectionExpression("contact_person_detail", this.getDetachedCriteria());
	}
	
	public User_detailDetachedCriteria createAdd_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("add_by"));
	}
	
	public User_detailDetachedCriteria createLast_edit_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("last_edit_by"));
	}
	
	public Delivery_noteDetachedCriteria createDelivery_noteCriteria() {
		return new Delivery_noteDetachedCriteria(createCriteria("delivery_note"));
	}
	
	public Job_cardDetachedCriteria createJob_cardCriteria() {
		return new Job_cardDetachedCriteria(createCriteria("job_card"));
	}
	
	public Contact_person_detailDetachedCriteria createContact_person_detailCriteria() {
		return new Contact_person_detailDetachedCriteria(createCriteria("contact_person_detail"));
	}
	
	public Customer_detail uniqueCustomer_detail(PersistentSession session) {
		return (Customer_detail) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Customer_detail[] listCustomer_detail(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Customer_detail[]) list.toArray(new Customer_detail[list.size()]);
	}
}

