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

public class Cover_typeDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public Cover_typeDetachedCriteria() {
		super(models.Cover_type.class, models.Cover_typeCriteria.class);
		cover_type_id = new IntegerExpression("cover_type_id", this.getDetachedCriteria());
		cover_type_name = new StringExpression("cover_type_name", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		job_card_item = new CollectionExpression("job_card_item", this.getDetachedCriteria());
	}
	
	public Cover_typeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, models.Cover_typeCriteria.class);
		cover_type_id = new IntegerExpression("cover_type_id", this.getDetachedCriteria());
		cover_type_name = new StringExpression("cover_type_name", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
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
	
	public Cover_type uniqueCover_type(PersistentSession session) {
		return (Cover_type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cover_type[] listCover_type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cover_type[]) list.toArray(new Cover_type[list.size()]);
	}
}

