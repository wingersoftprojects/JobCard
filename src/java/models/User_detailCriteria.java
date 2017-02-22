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

public class User_detailCriteria extends AbstractORMCriteria {
	public final IntegerExpression user_detail_id;
	public final IntegerExpression user_categoryId;
	public final AssociationExpression user_category;
	public final StringExpression user_name;
	public final StringExpression user_password;
	public final StringExpression first_name;
	public final StringExpression second_name;
	public final StringExpression third_name;
	public final IntegerExpression is_user_gen_admin;
	public final DateExpression add_date;
	public final IntegerExpression add_by;
	public final DateExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression user_action;
	public final CollectionExpression group_user;
	
	public User_detailCriteria(Criteria criteria) {
		super(criteria);
		user_detail_id = new IntegerExpression("user_detail_id", this);
		user_categoryId = new IntegerExpression("user_category.user_category_id", this);
		user_category = new AssociationExpression("user_category", this);
		user_name = new StringExpression("user_name", this);
		user_password = new StringExpression("user_password", this);
		first_name = new StringExpression("first_name", this);
		second_name = new StringExpression("second_name", this);
		third_name = new StringExpression("third_name", this);
		is_user_gen_admin = new IntegerExpression("is_user_gen_admin", this);
		add_date = new DateExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new DateExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		user_action = new CollectionExpression("user_action", this);
		group_user = new CollectionExpression("group_user", this);
	}
	
	public User_detailCriteria(PersistentSession session) {
		this(session.createCriteria(User_detail.class));
	}
	
	public User_detailCriteria() throws PersistentException {
		this(models.JobCardPersistentManager.instance().getSession());
	}
	
	public User_categoryCriteria createUser_categoryCriteria() {
		return new User_categoryCriteria(createCriteria("user_category"));
	}
	
	public User_actionCriteria createUser_actionCriteria() {
		return new User_actionCriteria(createCriteria("user_action"));
	}
	
	public Group_userCriteria createGroup_userCriteria() {
		return new Group_userCriteria(createCriteria("group_user"));
	}
	
	public User_detail uniqueUser_detail() {
		return (User_detail) super.uniqueResult();
	}
	
	public User_detail[] listUser_detail() {
		java.util.List list = super.list();
		return (User_detail[]) list.toArray(new User_detail[list.size()]);
	}
}

