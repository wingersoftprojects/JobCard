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

public class Group_rightDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression group_right_id;
	public final IntegerExpression group_detailId;
	public final AssociationExpression group_detail;
	public final IntegerExpression job_cardId;
	public final AssociationExpression job_card;
	public final IntegerExpression delivery_noteId;
	public final AssociationExpression delivery_note;
	public final IntegerExpression allow_view;
	public final IntegerExpression allow_edit;
	public final IntegerExpression allow_add;
	public final IntegerExpression allow_delete;
	public final IntegerExpression is_active;
	public final IntegerExpression is_deleted;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	
	public Group_rightDetachedCriteria() {
		super(models.Group_right.class, models.Group_rightCriteria.class);
		group_right_id = new IntegerExpression("group_right_id", this.getDetachedCriteria());
		group_detailId = new IntegerExpression("group_detail.group_detail_id", this.getDetachedCriteria());
		group_detail = new AssociationExpression("group_detail", this.getDetachedCriteria());
		job_cardId = new IntegerExpression("job_card.job_card_id", this.getDetachedCriteria());
		job_card = new AssociationExpression("job_card", this.getDetachedCriteria());
		delivery_noteId = new IntegerExpression("delivery_note.delivery_note_id", this.getDetachedCriteria());
		delivery_note = new AssociationExpression("delivery_note", this.getDetachedCriteria());
		allow_view = new IntegerExpression("allow_view", this.getDetachedCriteria());
		allow_edit = new IntegerExpression("allow_edit", this.getDetachedCriteria());
		allow_add = new IntegerExpression("allow_add", this.getDetachedCriteria());
		allow_delete = new IntegerExpression("allow_delete", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
	}
	
	public Group_rightDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, models.Group_rightCriteria.class);
		group_right_id = new IntegerExpression("group_right_id", this.getDetachedCriteria());
		group_detailId = new IntegerExpression("group_detail.group_detail_id", this.getDetachedCriteria());
		group_detail = new AssociationExpression("group_detail", this.getDetachedCriteria());
		job_cardId = new IntegerExpression("job_card.job_card_id", this.getDetachedCriteria());
		job_card = new AssociationExpression("job_card", this.getDetachedCriteria());
		delivery_noteId = new IntegerExpression("delivery_note.delivery_note_id", this.getDetachedCriteria());
		delivery_note = new AssociationExpression("delivery_note", this.getDetachedCriteria());
		allow_view = new IntegerExpression("allow_view", this.getDetachedCriteria());
		allow_edit = new IntegerExpression("allow_edit", this.getDetachedCriteria());
		allow_add = new IntegerExpression("allow_add", this.getDetachedCriteria());
		allow_delete = new IntegerExpression("allow_delete", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
	}
	
	public Group_detailDetachedCriteria createGroup_detailCriteria() {
		return new Group_detailDetachedCriteria(createCriteria("group_detail"));
	}
	
	public Job_cardDetachedCriteria createJob_cardCriteria() {
		return new Job_cardDetachedCriteria(createCriteria("job_card"));
	}
	
	public Delivery_noteDetachedCriteria createDelivery_noteCriteria() {
		return new Delivery_noteDetachedCriteria(createCriteria("delivery_note"));
	}
	
	public Group_right uniqueGroup_right(PersistentSession session) {
		return (Group_right) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Group_right[] listGroup_right(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Group_right[]) list.toArray(new Group_right[list.size()]);
	}
}

