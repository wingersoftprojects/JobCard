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

public class User_detailDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression user_detail_id;
	public final IntegerExpression user_categoryId;
	public final AssociationExpression user_category;
	public final StringExpression user_name;
	public final StringExpression user_password;
	public final StringExpression first_name;
	public final StringExpression second_name;
	public final StringExpression third_name;
	public final IntegerExpression is_user_gen_admin;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final DateExpression add_date;
	public final IntegerExpression add_by;
	public final DateExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression user_action;
	public final CollectionExpression group_user;
	public final CollectionExpression login_session;
	public final CollectionExpression login_session1;
	public final CollectionExpression login_session2;
	public final CollectionExpression user_category1;
	public final CollectionExpression user_category2;
	public final CollectionExpression group_user1;
	public final CollectionExpression group_user2;
	public final CollectionExpression group_detail;
	public final CollectionExpression group_detail1;
	public final CollectionExpression group_right;
	public final CollectionExpression group_right1;
	public final CollectionExpression job_card_item;
	public final CollectionExpression job_card_item1;
	public final CollectionExpression customer_detail;
	public final CollectionExpression customer_detail1;
	public final CollectionExpression delivery_note;
	public final CollectionExpression delivery_note1;
	public final CollectionExpression job_card;
	public final CollectionExpression paper_type;
	public final CollectionExpression paper_type1;
	public final CollectionExpression job_card1;
	public final CollectionExpression supplier_detail;
	public final CollectionExpression supplier_detail1;
	
	public User_detailDetachedCriteria() {
		super(models.User_detail.class, models.User_detailCriteria.class);
		user_detail_id = new IntegerExpression("user_detail_id", this.getDetachedCriteria());
		user_categoryId = new IntegerExpression("user_category.user_category_id", this.getDetachedCriteria());
		user_category = new AssociationExpression("user_category", this.getDetachedCriteria());
		user_name = new StringExpression("user_name", this.getDetachedCriteria());
		user_password = new StringExpression("user_password", this.getDetachedCriteria());
		first_name = new StringExpression("first_name", this.getDetachedCriteria());
		second_name = new StringExpression("second_name", this.getDetachedCriteria());
		third_name = new StringExpression("third_name", this.getDetachedCriteria());
		is_user_gen_admin = new IntegerExpression("is_user_gen_admin", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new DateExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new DateExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		user_action = new CollectionExpression("user_action", this.getDetachedCriteria());
		group_user = new CollectionExpression("group_user", this.getDetachedCriteria());
		login_session = new CollectionExpression("login_session", this.getDetachedCriteria());
		login_session1 = new CollectionExpression("login_session1", this.getDetachedCriteria());
		login_session2 = new CollectionExpression("login_session2", this.getDetachedCriteria());
		user_category1 = new CollectionExpression("user_category1", this.getDetachedCriteria());
		user_category2 = new CollectionExpression("user_category2", this.getDetachedCriteria());
		group_user1 = new CollectionExpression("group_user1", this.getDetachedCriteria());
		group_user2 = new CollectionExpression("group_user2", this.getDetachedCriteria());
		group_detail = new CollectionExpression("group_detail", this.getDetachedCriteria());
		group_detail1 = new CollectionExpression("group_detail1", this.getDetachedCriteria());
		group_right = new CollectionExpression("group_right", this.getDetachedCriteria());
		group_right1 = new CollectionExpression("group_right1", this.getDetachedCriteria());
		job_card_item = new CollectionExpression("job_card_item", this.getDetachedCriteria());
		job_card_item1 = new CollectionExpression("job_card_item1", this.getDetachedCriteria());
		customer_detail = new CollectionExpression("customer_detail", this.getDetachedCriteria());
		customer_detail1 = new CollectionExpression("customer_detail1", this.getDetachedCriteria());
		delivery_note = new CollectionExpression("delivery_note", this.getDetachedCriteria());
		delivery_note1 = new CollectionExpression("delivery_note1", this.getDetachedCriteria());
		job_card = new CollectionExpression("job_card", this.getDetachedCriteria());
		paper_type = new CollectionExpression("paper_type", this.getDetachedCriteria());
		paper_type1 = new CollectionExpression("paper_type1", this.getDetachedCriteria());
		job_card1 = new CollectionExpression("job_card1", this.getDetachedCriteria());
		supplier_detail = new CollectionExpression("supplier_detail", this.getDetachedCriteria());
		supplier_detail1 = new CollectionExpression("supplier_detail1", this.getDetachedCriteria());
	}
	
	public User_detailDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, models.User_detailCriteria.class);
		user_detail_id = new IntegerExpression("user_detail_id", this.getDetachedCriteria());
		user_categoryId = new IntegerExpression("user_category.user_category_id", this.getDetachedCriteria());
		user_category = new AssociationExpression("user_category", this.getDetachedCriteria());
		user_name = new StringExpression("user_name", this.getDetachedCriteria());
		user_password = new StringExpression("user_password", this.getDetachedCriteria());
		first_name = new StringExpression("first_name", this.getDetachedCriteria());
		second_name = new StringExpression("second_name", this.getDetachedCriteria());
		third_name = new StringExpression("third_name", this.getDetachedCriteria());
		is_user_gen_admin = new IntegerExpression("is_user_gen_admin", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new DateExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new DateExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		user_action = new CollectionExpression("user_action", this.getDetachedCriteria());
		group_user = new CollectionExpression("group_user", this.getDetachedCriteria());
		login_session = new CollectionExpression("login_session", this.getDetachedCriteria());
		login_session1 = new CollectionExpression("login_session1", this.getDetachedCriteria());
		login_session2 = new CollectionExpression("login_session2", this.getDetachedCriteria());
		user_category1 = new CollectionExpression("user_category1", this.getDetachedCriteria());
		user_category2 = new CollectionExpression("user_category2", this.getDetachedCriteria());
		group_user1 = new CollectionExpression("group_user1", this.getDetachedCriteria());
		group_user2 = new CollectionExpression("group_user2", this.getDetachedCriteria());
		group_detail = new CollectionExpression("group_detail", this.getDetachedCriteria());
		group_detail1 = new CollectionExpression("group_detail1", this.getDetachedCriteria());
		group_right = new CollectionExpression("group_right", this.getDetachedCriteria());
		group_right1 = new CollectionExpression("group_right1", this.getDetachedCriteria());
		job_card_item = new CollectionExpression("job_card_item", this.getDetachedCriteria());
		job_card_item1 = new CollectionExpression("job_card_item1", this.getDetachedCriteria());
		customer_detail = new CollectionExpression("customer_detail", this.getDetachedCriteria());
		customer_detail1 = new CollectionExpression("customer_detail1", this.getDetachedCriteria());
		delivery_note = new CollectionExpression("delivery_note", this.getDetachedCriteria());
		delivery_note1 = new CollectionExpression("delivery_note1", this.getDetachedCriteria());
		job_card = new CollectionExpression("job_card", this.getDetachedCriteria());
		paper_type = new CollectionExpression("paper_type", this.getDetachedCriteria());
		paper_type1 = new CollectionExpression("paper_type1", this.getDetachedCriteria());
		job_card1 = new CollectionExpression("job_card1", this.getDetachedCriteria());
		supplier_detail = new CollectionExpression("supplier_detail", this.getDetachedCriteria());
		supplier_detail1 = new CollectionExpression("supplier_detail1", this.getDetachedCriteria());
	}
	
	public User_categoryDetachedCriteria createUser_categoryCriteria() {
		return new User_categoryDetachedCriteria(createCriteria("user_category"));
	}
	
	public User_actionDetachedCriteria createUser_actionCriteria() {
		return new User_actionDetachedCriteria(createCriteria("user_action"));
	}
	
	public Group_userDetachedCriteria createGroup_userCriteria() {
		return new Group_userDetachedCriteria(createCriteria("group_user"));
	}
	
	public Login_sessionDetachedCriteria createLogin_sessionCriteria() {
		return new Login_sessionDetachedCriteria(createCriteria("login_session"));
	}
	
	public Login_sessionDetachedCriteria createLogin_session1Criteria() {
		return new Login_sessionDetachedCriteria(createCriteria("login_session1"));
	}
	
	public Login_sessionDetachedCriteria createLogin_session2Criteria() {
		return new Login_sessionDetachedCriteria(createCriteria("login_session2"));
	}
	
	public User_categoryDetachedCriteria createUser_category1Criteria() {
		return new User_categoryDetachedCriteria(createCriteria("user_category1"));
	}
	
	public User_categoryDetachedCriteria createUser_category2Criteria() {
		return new User_categoryDetachedCriteria(createCriteria("user_category2"));
	}
	
	public Group_userDetachedCriteria createGroup_user1Criteria() {
		return new Group_userDetachedCriteria(createCriteria("group_user1"));
	}
	
	public Group_userDetachedCriteria createGroup_user2Criteria() {
		return new Group_userDetachedCriteria(createCriteria("group_user2"));
	}
	
	public Group_detailDetachedCriteria createGroup_detailCriteria() {
		return new Group_detailDetachedCriteria(createCriteria("group_detail"));
	}
	
	public Group_detailDetachedCriteria createGroup_detail1Criteria() {
		return new Group_detailDetachedCriteria(createCriteria("group_detail1"));
	}
	
	public Group_rightDetachedCriteria createGroup_rightCriteria() {
		return new Group_rightDetachedCriteria(createCriteria("group_right"));
	}
	
	public Group_rightDetachedCriteria createGroup_right1Criteria() {
		return new Group_rightDetachedCriteria(createCriteria("group_right1"));
	}
	
	public Job_card_itemDetachedCriteria createJob_card_itemCriteria() {
		return new Job_card_itemDetachedCriteria(createCriteria("job_card_item"));
	}
	
	public Job_card_itemDetachedCriteria createJob_card_item1Criteria() {
		return new Job_card_itemDetachedCriteria(createCriteria("job_card_item1"));
	}
	
	public Customer_detailDetachedCriteria createCustomer_detailCriteria() {
		return new Customer_detailDetachedCriteria(createCriteria("customer_detail"));
	}
	
	public Customer_detailDetachedCriteria createCustomer_detail1Criteria() {
		return new Customer_detailDetachedCriteria(createCriteria("customer_detail1"));
	}
	
	public Delivery_noteDetachedCriteria createDelivery_noteCriteria() {
		return new Delivery_noteDetachedCriteria(createCriteria("delivery_note"));
	}
	
	public Delivery_noteDetachedCriteria createDelivery_note1Criteria() {
		return new Delivery_noteDetachedCriteria(createCriteria("delivery_note1"));
	}
	
	public Job_cardDetachedCriteria createJob_cardCriteria() {
		return new Job_cardDetachedCriteria(createCriteria("job_card"));
	}
	
	public Paper_typeDetachedCriteria createPaper_typeCriteria() {
		return new Paper_typeDetachedCriteria(createCriteria("paper_type"));
	}
	
	public Paper_typeDetachedCriteria createPaper_type1Criteria() {
		return new Paper_typeDetachedCriteria(createCriteria("paper_type1"));
	}
	
	public Job_cardDetachedCriteria createJob_card1Criteria() {
		return new Job_cardDetachedCriteria(createCriteria("job_card1"));
	}
	
	public Supplier_detailDetachedCriteria createSupplier_detailCriteria() {
		return new Supplier_detailDetachedCriteria(createCriteria("supplier_detail"));
	}
	
	public Supplier_detailDetachedCriteria createSupplier_detail1Criteria() {
		return new Supplier_detailDetachedCriteria(createCriteria("supplier_detail1"));
	}
	
	public User_detail uniqueUser_detail(PersistentSession session) {
		return (User_detail) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public User_detail[] listUser_detail(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (User_detail[]) list.toArray(new User_detail[list.size()]);
	}
}

