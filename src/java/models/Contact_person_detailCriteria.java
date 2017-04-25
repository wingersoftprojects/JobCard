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

public class Contact_person_detailCriteria extends AbstractORMCriteria {
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
	
	public Contact_person_detailCriteria(Criteria criteria) {
		super(criteria);
		contact_person_detail_id = new IntegerExpression("contact_person_detail_id", this);
		customer_detailId = new IntegerExpression("customer_detail.customer_detail_id", this);
		customer_detail = new AssociationExpression("customer_detail", this);
		contact_person_name = new StringExpression("contact_person_name", this);
		contact_person_telephone1 = new StringExpression("contact_person_telephone1", this);
		contact_person_telephone2 = new StringExpression("contact_person_telephone2", this);
		contact_person_email = new StringExpression("contact_person_email", this);
		is_active = new IntegerExpression("is_active", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		add_date = new TimestampExpression("add_date", this);
		add_byId = new IntegerExpression("add_by.user_detail_id", this);
		add_by = new AssociationExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this);
		last_edit_by = new AssociationExpression("last_edit_by", this);
	}
	
	public Contact_person_detailCriteria(PersistentSession session) {
		this(session.createCriteria(Contact_person_detail.class));
	}
	
	public Contact_person_detailCriteria() throws PersistentException {
		this(models.JobCardPersistentManager.instance().getSession());
	}
	
	public Customer_detailCriteria createCustomer_detailCriteria() {
		return new Customer_detailCriteria(createCriteria("customer_detail"));
	}
	
	public User_detailCriteria createAdd_byCriteria() {
		return new User_detailCriteria(createCriteria("add_by"));
	}
	
	public User_detailCriteria createLast_edit_byCriteria() {
		return new User_detailCriteria(createCriteria("last_edit_by"));
	}
	
	public Contact_person_detail uniqueContact_person_detail() {
		return (Contact_person_detail) super.uniqueResult();
	}
	
	public Contact_person_detail[] listContact_person_detail() {
		java.util.List list = super.list();
		return (Contact_person_detail[]) list.toArray(new Contact_person_detail[list.size()]);
	}
}

