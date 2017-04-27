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

public class Job_card_statusDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression job_card_status_id;
	public final IntegerExpression job_cardId;
	public final AssociationExpression job_card;
	public final StringExpression status;
	public final IntegerExpression is_active;
	public final IntegerExpression is_deleted;
	public final TimestampExpression add_date;
	public final IntegerExpression add_byId;
	public final AssociationExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_byId;
	public final AssociationExpression last_edit_by;
	public final StringExpression comment;
	
	public Job_card_statusDetachedCriteria() {
		super(models.Job_card_status.class, models.Job_card_statusCriteria.class);
		job_card_status_id = new IntegerExpression("job_card_status_id", this.getDetachedCriteria());
		job_cardId = new IntegerExpression("job_card.job_card_id", this.getDetachedCriteria());
		job_card = new AssociationExpression("job_card", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
	}
	
	public Job_card_statusDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, models.Job_card_statusCriteria.class);
		job_card_status_id = new IntegerExpression("job_card_status_id", this.getDetachedCriteria());
		job_cardId = new IntegerExpression("job_card.job_card_id", this.getDetachedCriteria());
		job_card = new AssociationExpression("job_card", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
	}
	
	public Job_cardDetachedCriteria createJob_cardCriteria() {
		return new Job_cardDetachedCriteria(createCriteria("job_card"));
	}
	
	public User_detailDetachedCriteria createAdd_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("add_by"));
	}
	
	public User_detailDetachedCriteria createLast_edit_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("last_edit_by"));
	}
	
	public Job_card_status uniqueJob_card_status(PersistentSession session) {
		return (Job_card_status) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Job_card_status[] listJob_card_status(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Job_card_status[]) list.toArray(new Job_card_status[list.size()]);
	}
}

