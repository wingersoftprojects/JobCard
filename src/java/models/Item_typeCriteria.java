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

public class Item_typeCriteria extends AbstractORMCriteria {
	public final IntegerExpression item_type_id;
	public final StringExpression item_type_name;
	public final IntegerExpression is_active;
	public final IntegerExpression is_deleted;
	public final TimestampExpression add_date;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression add_byId;
	public final AssociationExpression add_by;
	public final IntegerExpression last_edit_byId;
	public final AssociationExpression last_edit_by;
	public final CollectionExpression job_card_item;
	
	public Item_typeCriteria(Criteria criteria) {
		super(criteria);
		item_type_id = new IntegerExpression("item_type_id", this);
		item_type_name = new StringExpression("item_type_name", this);
		is_active = new IntegerExpression("is_active", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		add_date = new TimestampExpression("add_date", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		add_byId = new IntegerExpression("add_by.user_detail_id", this);
		add_by = new AssociationExpression("add_by", this);
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this);
		last_edit_by = new AssociationExpression("last_edit_by", this);
		job_card_item = new CollectionExpression("job_card_item", this);
	}
	
	public Item_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Item_type.class));
	}
	
	public Item_typeCriteria() throws PersistentException {
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
	
	public Item_type uniqueItem_type() {
		return (Item_type) super.uniqueResult();
	}
	
	public Item_type[] listItem_type() {
		java.util.List list = super.list();
		return (Item_type[]) list.toArray(new Item_type[list.size()]);
	}
}

