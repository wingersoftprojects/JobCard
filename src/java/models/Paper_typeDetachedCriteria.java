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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Paper_typeDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public Paper_typeDetachedCriteria() {
		super(models.Paper_type.class, models.Paper_typeCriteria.class);
		paper_type_id = new IntegerExpression("paper_type_id", this.getDetachedCriteria());
		paper_type_category = new StringExpression("paper_type_category", this.getDetachedCriteria());
		paper_type_sub_category = new StringExpression("paper_type_sub_category", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
		job_card_item = new CollectionExpression("job_card_item", this.getDetachedCriteria());
	}
	
	public Paper_typeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, models.Paper_typeCriteria.class);
		paper_type_id = new IntegerExpression("paper_type_id", this.getDetachedCriteria());
		paper_type_category = new StringExpression("paper_type_category", this.getDetachedCriteria());
		paper_type_sub_category = new StringExpression("paper_type_sub_category", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
		job_card_item = new CollectionExpression("job_card_item", this.getDetachedCriteria());
	}
	
	public User_detailDetachedCriteria createAdd_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("add_by"));
	}
	
	public User_detailDetachedCriteria createLast_edit_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("last_edit_by"));
	}
	
	public Job_card_itemDetachedCriteria createJob_card_itemCriteria() {
		return new Job_card_itemDetachedCriteria(createCriteria("job_card_item"));
	}
	
	public Paper_type uniquePaper_type(PersistentSession session) {
		return (Paper_type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Paper_type[] listPaper_type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Paper_type[]) list.toArray(new Paper_type[list.size()]);
	}
}

