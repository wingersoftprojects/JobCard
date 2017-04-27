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

public class Paper_typeCriteria extends AbstractORMCriteria {
	public final IntegerExpression paper_type_id;
	public final StringExpression paper_type_category;
	public final StringExpression paper_type_sub_category;
	public final IntegerExpression is_active;
	public final IntegerExpression is_deleted;
	public final TimestampExpression add_date;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression add_byId;
	public final AssociationExpression add_by;
	public final IntegerExpression last_edit_byId;
	public final AssociationExpression last_edit_by;
	public final CollectionExpression job_card_item;
	
	public Paper_typeCriteria(Criteria criteria) {
		super(criteria);
		paper_type_id = new IntegerExpression("paper_type_id", this);
		paper_type_category = new StringExpression("paper_type_category", this);
		paper_type_sub_category = new StringExpression("paper_type_sub_category", this);
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
	
	public Paper_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Paper_type.class));
	}
	
	public Paper_typeCriteria() throws PersistentException {
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
	
	public Paper_type uniquePaper_type() {
		return (Paper_type) super.uniqueResult();
	}
	
	public Paper_type[] listPaper_type() {
		java.util.List list = super.list();
		return (Paper_type[]) list.toArray(new Paper_type[list.size()]);
	}
}

