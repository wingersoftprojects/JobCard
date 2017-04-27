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

public class Supplier_detailCriteria extends AbstractORMCriteria {
	public final IntegerExpression supplier_detail_id;
	public final StringExpression supplier_name;
	public final StringExpression specifications;
	public final StringExpression telephone1;
	public final StringExpression telephone2;
	public final StringExpression email;
	public final IntegerExpression quantity;
	public final IntegerExpression is_active;
	public final IntegerExpression is_deleted;
	public final TimestampExpression add_date;
	public final IntegerExpression add_byId;
	public final AssociationExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_byId;
	public final AssociationExpression last_edit_by;
	public final CollectionExpression job_card_item;
	
	public Supplier_detailCriteria(Criteria criteria) {
		super(criteria);
		supplier_detail_id = new IntegerExpression("supplier_detail_id", this);
		supplier_name = new StringExpression("supplier_name", this);
		specifications = new StringExpression("specifications", this);
		telephone1 = new StringExpression("telephone1", this);
		telephone2 = new StringExpression("telephone2", this);
		email = new StringExpression("email", this);
		quantity = new IntegerExpression("quantity", this);
		is_active = new IntegerExpression("is_active", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		add_date = new TimestampExpression("add_date", this);
		add_byId = new IntegerExpression("add_by.user_detail_id", this);
		add_by = new AssociationExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this);
		last_edit_by = new AssociationExpression("last_edit_by", this);
		job_card_item = new CollectionExpression("job_card_item", this);
	}
	
	public Supplier_detailCriteria(PersistentSession session) {
		this(session.createCriteria(Supplier_detail.class));
	}
	
	public Supplier_detailCriteria() throws PersistentException {
		this(models.JobCardPersistentManager.instance().getSession());
	}
	
	public User_detailCriteria createAdd_byCriteria() {
		return new User_detailCriteria(createCriteria("add_by"));
	}
	
	public User_detailCriteria createLast_edit_byCriteria() {
		return new User_detailCriteria(createCriteria("last_edit_by"));
	}
	
	public Job_card_itemCriteria createJob_card_itemCriteria() {
		return new Job_card_itemCriteria(createCriteria("job_card_item"));
	}
	
	public Supplier_detail uniqueSupplier_detail() {
		return (Supplier_detail) super.uniqueResult();
	}
	
	public Supplier_detail[] listSupplier_detail() {
		java.util.List list = super.list();
		return (Supplier_detail[]) list.toArray(new Supplier_detail[list.size()]);
	}
}

