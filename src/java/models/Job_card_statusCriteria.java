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

public class Job_card_statusCriteria extends AbstractORMCriteria {
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
	
	public Job_card_statusCriteria(Criteria criteria) {
		super(criteria);
		job_card_status_id = new IntegerExpression("job_card_status_id", this);
		job_cardId = new IntegerExpression("job_card.job_card_id", this);
		job_card = new AssociationExpression("job_card", this);
		status = new StringExpression("status", this);
		is_active = new IntegerExpression("is_active", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		add_date = new TimestampExpression("add_date", this);
		add_byId = new IntegerExpression("add_by.user_detail_id", this);
		add_by = new AssociationExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this);
		last_edit_by = new AssociationExpression("last_edit_by", this);
		comment = new StringExpression("comment", this);
	}
	
	public Job_card_statusCriteria(PersistentSession session) {
		this(session.createCriteria(Job_card_status.class));
	}
	
	public Job_card_statusCriteria() throws PersistentException {
		this(models.JobCardPersistentManager.instance().getSession());
	}
	
	public Job_cardCriteria createJob_cardCriteria() {
		return new Job_cardCriteria(createCriteria("job_card"));
	}
	
	public User_detailCriteria createAdd_byCriteria() {
		return new User_detailCriteria(createCriteria("add_by"));
	}
	
	public User_detailCriteria createLast_edit_byCriteria() {
		return new User_detailCriteria(createCriteria("last_edit_by"));
	}
	
	public Job_card_status uniqueJob_card_status() {
		return (Job_card_status) super.uniqueResult();
	}
	
	public Job_card_status[] listJob_card_status() {
		java.util.List list = super.list();
		return (Job_card_status[]) list.toArray(new Job_card_status[list.size()]);
	}
}

