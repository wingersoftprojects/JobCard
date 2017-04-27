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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class User_actionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression user_action_id;
	public final IntegerExpression job_cardId;
	public final AssociationExpression job_card;
	public final IntegerExpression user_detailId;
	public final AssociationExpression user_detail;
	public final IntegerExpression action;
	public final DateExpression action_date;
	
	public User_actionDetachedCriteria() {
		super(models.User_action.class, models.User_actionCriteria.class);
		user_action_id = new IntegerExpression("user_action_id", this.getDetachedCriteria());
		job_cardId = new IntegerExpression("job_card.job_card_id", this.getDetachedCriteria());
		job_card = new AssociationExpression("job_card", this.getDetachedCriteria());
		user_detailId = new IntegerExpression("user_detail.user_detail_id", this.getDetachedCriteria());
		user_detail = new AssociationExpression("user_detail", this.getDetachedCriteria());
		action = new IntegerExpression("action", this.getDetachedCriteria());
		action_date = new DateExpression("action_date", this.getDetachedCriteria());
	}
	
	public User_actionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, models.User_actionCriteria.class);
		user_action_id = new IntegerExpression("user_action_id", this.getDetachedCriteria());
		job_cardId = new IntegerExpression("job_card.job_card_id", this.getDetachedCriteria());
		job_card = new AssociationExpression("job_card", this.getDetachedCriteria());
		user_detailId = new IntegerExpression("user_detail.user_detail_id", this.getDetachedCriteria());
		user_detail = new AssociationExpression("user_detail", this.getDetachedCriteria());
		action = new IntegerExpression("action", this.getDetachedCriteria());
		action_date = new DateExpression("action_date", this.getDetachedCriteria());
	}
	
	public Job_cardDetachedCriteria createJob_cardCriteria() {
		return new Job_cardDetachedCriteria(createCriteria("job_card"));
	}
	
	public User_detailDetachedCriteria createUser_detailCriteria() {
		return new User_detailDetachedCriteria(createCriteria("user_detail"));
	}
	
	public User_action uniqueUser_action(PersistentSession session) {
		return (User_action) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public User_action[] listUser_action(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (User_action[]) list.toArray(new User_action[list.size()]);
	}
}

