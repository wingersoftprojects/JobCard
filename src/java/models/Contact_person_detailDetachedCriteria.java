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

public class Contact_person_detailDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression contact_person_detail_id;
	public final IntegerExpression customer_detailId;
	public final AssociationExpression customer_detail;
	public final StringExpression contact_person_name;
	public final StringExpression contact_person_telephone1;
	public final StringExpression contact_person_telephone2;
	public final StringExpression contact_person_email;
	public final IntegerExpression is_active;
	public final IntegerExpression is_deleted;
	public final TimestampExpression add_date;
	public final IntegerExpression add_byId;
	public final AssociationExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_byId;
	public final AssociationExpression last_edit_by;
	
	public Contact_person_detailDetachedCriteria() {
		super(models.Contact_person_detail.class, models.Contact_person_detailCriteria.class);
		contact_person_detail_id = new IntegerExpression("contact_person_detail_id", this.getDetachedCriteria());
		customer_detailId = new IntegerExpression("customer_detail.customer_detail_id", this.getDetachedCriteria());
		customer_detail = new AssociationExpression("customer_detail", this.getDetachedCriteria());
		contact_person_name = new StringExpression("contact_person_name", this.getDetachedCriteria());
		contact_person_telephone1 = new StringExpression("contact_person_telephone1", this.getDetachedCriteria());
		contact_person_telephone2 = new StringExpression("contact_person_telephone2", this.getDetachedCriteria());
		contact_person_email = new StringExpression("contact_person_email", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
	}
	
	public Contact_person_detailDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, models.Contact_person_detailCriteria.class);
		contact_person_detail_id = new IntegerExpression("contact_person_detail_id", this.getDetachedCriteria());
		customer_detailId = new IntegerExpression("customer_detail.customer_detail_id", this.getDetachedCriteria());
		customer_detail = new AssociationExpression("customer_detail", this.getDetachedCriteria());
		contact_person_name = new StringExpression("contact_person_name", this.getDetachedCriteria());
		contact_person_telephone1 = new StringExpression("contact_person_telephone1", this.getDetachedCriteria());
		contact_person_telephone2 = new StringExpression("contact_person_telephone2", this.getDetachedCriteria());
		contact_person_email = new StringExpression("contact_person_email", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
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
	
	public Contact_person_detail uniqueContact_person_detail(PersistentSession session) {
		return (Contact_person_detail) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Contact_person_detail[] listContact_person_detail(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Contact_person_detail[]) list.toArray(new Contact_person_detail[list.size()]);
	}
}

