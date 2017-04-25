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

public class User_actionCriteria extends AbstractORMCriteria {
	public final IntegerExpression user_action_id;
	public final IntegerExpression job_cardId;
	public final AssociationExpression job_card;
	public final IntegerExpression user_detailId;
	public final AssociationExpression user_detail;
	public final IntegerExpression action;
	public final DateExpression action_date;
	
	public User_actionCriteria(Criteria criteria) {
		super(criteria);
		user_action_id = new IntegerExpression("user_action_id", this);
		job_cardId = new IntegerExpression("job_card.job_card_id", this);
		job_card = new AssociationExpression("job_card", this);
		user_detailId = new IntegerExpression("user_detail.user_detail_id", this);
		user_detail = new AssociationExpression("user_detail", this);
		action = new IntegerExpression("action", this);
		action_date = new DateExpression("action_date", this);
	}
	
	public User_actionCriteria(PersistentSession session) {
		this(session.createCriteria(User_action.class));
	}
	
	public User_actionCriteria() throws PersistentException {
		this(models.JobCardPersistentManager.instance().getSession());
	}
	
	public Job_cardCriteria createJob_cardCriteria() {
		return new Job_cardCriteria(createCriteria("job_card"));
	}
	
	public User_detailCriteria createUser_detailCriteria() {
		return new User_detailCriteria(createCriteria("user_detail"));
	}
	
	public User_action uniqueUser_action() {
		return (User_action) super.uniqueResult();
	}
	
	public User_action[] listUser_action() {
		java.util.List list = super.list();
		return (User_action[]) list.toArray(new User_action[list.size()]);
	}
}

