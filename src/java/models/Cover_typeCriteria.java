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

public class Cover_typeCriteria extends AbstractORMCriteria {
	public final IntegerExpression cover_type_id;
	public final StringExpression cover_type_name;
	public final IntegerExpression is_active;
	public final IntegerExpression is_deleted;
	public final IntegerExpression add_byId;
	public final AssociationExpression add_by;
	public final TimestampExpression add_date;
	public final IntegerExpression last_edit_byId;
	public final AssociationExpression last_edit_by;
	public final TimestampExpression last_edit_date;
	public final CollectionExpression job_card_item;
	
	public Cover_typeCriteria(Criteria criteria) {
		super(criteria);
		cover_type_id = new IntegerExpression("cover_type_id", this);
		cover_type_name = new StringExpression("cover_type_name", this);
		is_active = new IntegerExpression("is_active", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		add_byId = new IntegerExpression("add_by.user_detail_id", this);
		add_by = new AssociationExpression("add_by", this);
		add_date = new TimestampExpression("add_date", this);
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this);
		last_edit_by = new AssociationExpression("last_edit_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		job_card_item = new CollectionExpression("job_card_item", this);
	}
	
	public Cover_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Cover_type.class));
	}
	
	public Cover_typeCriteria() throws PersistentException {
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
	
	public Cover_type uniqueCover_type() {
		return (Cover_type) super.uniqueResult();
	}
	
	public Cover_type[] listCover_type() {
		java.util.List list = super.list();
		return (Cover_type[]) list.toArray(new Cover_type[list.size()]);
	}
}

