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

public class Group_rightCriteria extends AbstractORMCriteria {
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
	
	public Group_rightCriteria(Criteria criteria) {
		super(criteria);
		group_right_id = new IntegerExpression("group_right_id", this);
		group_detailId = new IntegerExpression("group_detail.group_detail_id", this);
		group_detail = new AssociationExpression("group_detail", this);
		job_cardId = new IntegerExpression("job_card.job_card_id", this);
		job_card = new AssociationExpression("job_card", this);
		delivery_noteId = new IntegerExpression("delivery_note.delivery_note_id", this);
		delivery_note = new AssociationExpression("delivery_note", this);
		allow_view = new IntegerExpression("allow_view", this);
		allow_edit = new IntegerExpression("allow_edit", this);
		allow_add = new IntegerExpression("allow_add", this);
		allow_delete = new IntegerExpression("allow_delete", this);
		is_active = new IntegerExpression("is_active", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
	}
	
	public Group_rightCriteria(PersistentSession session) {
		this(session.createCriteria(Group_right.class));
	}
	
	public Group_rightCriteria() throws PersistentException {
		this(models.JobCardPersistentManager.instance().getSession());
	}
	
	public Group_detailCriteria createGroup_detailCriteria() {
		return new Group_detailCriteria(createCriteria("group_detail"));
	}
	
	public Job_cardCriteria createJob_cardCriteria() {
		return new Job_cardCriteria(createCriteria("job_card"));
	}
	
	public Delivery_noteCriteria createDelivery_noteCriteria() {
		return new Delivery_noteCriteria(createCriteria("delivery_note"));
	}
	
	public Group_right uniqueGroup_right() {
		return (Group_right) super.uniqueResult();
	}
	
	public Group_right[] listGroup_right() {
		java.util.List list = super.list();
		return (Group_right[]) list.toArray(new Group_right[list.size()]);
	}
}

