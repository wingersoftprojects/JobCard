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
	public final StringExpression user_name;
	public final StringExpression user_password;
	public final StringExpression first_name;
	public final StringExpression second_name;
	public final StringExpression third_name;
	public final IntegerExpression is_user_gen_admin;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_byId;
	public final AssociationExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_byId;
	public final AssociationExpression last_edit_by;
	public final CollectionExpression user_action;
	public final CollectionExpression group_user;
	public final CollectionExpression login_session;
	public final CollectionExpression login_session1;
	public final CollectionExpression login_session2;
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
	public final CollectionExpression user_detail;
	public final CollectionExpression user_detail1;
	public final CollectionExpression item_type;
	public final CollectionExpression item_type1;
	public final CollectionExpression cover_type;
	public final CollectionExpression cover_type1;
	public final CollectionExpression company_setting;
	public final CollectionExpression company_setting1;
	
	public User_detailCriteria(Criteria criteria) {
		super(criteria);
		user_detail_id = new IntegerExpression("user_detail_id", this);
		user_name = new StringExpression("user_name", this);
		user_password = new StringExpression("user_password", this);
		first_name = new StringExpression("first_name", this);
		second_name = new StringExpression("second_name", this);
		third_name = new StringExpression("third_name", this);
		is_user_gen_admin = new IntegerExpression("is_user_gen_admin", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_byId = new IntegerExpression("add_by.user_detail_id", this);
		add_by = new AssociationExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this);
		last_edit_by = new AssociationExpression("last_edit_by", this);
		user_action = new CollectionExpression("user_action", this);
		group_user = new CollectionExpression("group_user", this);
		login_session = new CollectionExpression("login_session", this);
		login_session1 = new CollectionExpression("login_session1", this);
		login_session2 = new CollectionExpression("login_session2", this);
		group_user1 = new CollectionExpression("group_user1", this);
		group_user2 = new CollectionExpression("group_user2", this);
		group_detail = new CollectionExpression("group_detail", this);
		group_detail1 = new CollectionExpression("group_detail1", this);
		group_right = new CollectionExpression("group_right", this);
		group_right1 = new CollectionExpression("group_right1", this);
		job_card_item = new CollectionExpression("job_card_item", this);
		job_card_item1 = new CollectionExpression("job_card_item1", this);
		customer_detail = new CollectionExpression("customer_detail", this);
		customer_detail1 = new CollectionExpression("customer_detail1", this);
		delivery_note = new CollectionExpression("delivery_note", this);
		delivery_note1 = new CollectionExpression("delivery_note1", this);
		job_card = new CollectionExpression("job_card", this);
		paper_type = new CollectionExpression("paper_type", this);
		paper_type1 = new CollectionExpression("paper_type1", this);
		job_card1 = new CollectionExpression("job_card1", this);
		supplier_detail = new CollectionExpression("supplier_detail", this);
		supplier_detail1 = new CollectionExpression("supplier_detail1", this);
		user_detail = new CollectionExpression("user_detail", this);
		user_detail1 = new CollectionExpression("user_detail1", this);
		item_type = new CollectionExpression("item_type", this);
		item_type1 = new CollectionExpression("item_type1", this);
		cover_type = new CollectionExpression("cover_type", this);
		cover_type1 = new CollectionExpression("cover_type1", this);
		company_setting = new CollectionExpression("company_setting", this);
		company_setting1 = new CollectionExpression("company_setting1", this);
	}
	
	public User_detailCriteria(PersistentSession session) {
		this(session.createCriteria(User_detail.class));
	}
	
	public User_detailCriteria() throws PersistentException {
		this(models.JobCardPersistentManager.instance().getSession());
	}
	
	public User_detailCriteria createAdd_byCriteria() {
		return new User_detailCriteria(createCriteria("add_by"));
	}
	
	public User_detailCriteria createLast_edit_byCriteria() {
		return new User_detailCriteria(createCriteria("last_edit_by"));
	}
	
	public User_actionCriteria createUser_actionCriteria() {
		return new User_actionCriteria(createCriteria("user_action"));
	}
	
	public Group_userCriteria createGroup_userCriteria() {
		return new Group_userCriteria(createCriteria("group_user"));
	}
	
	public Login_sessionCriteria createLogin_sessionCriteria() {
		return new Login_sessionCriteria(createCriteria("login_session"));
	}
	
	public Login_sessionCriteria createLogin_session1Criteria() {
		return new Login_sessionCriteria(createCriteria("login_session1"));
	}
	
	public Login_sessionCriteria createLogin_session2Criteria() {
		return new Login_sessionCriteria(createCriteria("login_session2"));
	}
	
	public Group_userCriteria createGroup_user1Criteria() {
		return new Group_userCriteria(createCriteria("group_user1"));
	}
	
	public Group_userCriteria createGroup_user2Criteria() {
		return new Group_userCriteria(createCriteria("group_user2"));
	}
	
	public Group_detailCriteria createGroup_detailCriteria() {
		return new Group_detailCriteria(createCriteria("group_detail"));
	}
	
	public Group_detailCriteria createGroup_detail1Criteria() {
		return new Group_detailCriteria(createCriteria("group_detail1"));
	}
	
	public Group_rightCriteria createGroup_rightCriteria() {
		return new Group_rightCriteria(createCriteria("group_right"));
	}
	
	public Group_rightCriteria createGroup_right1Criteria() {
		return new Group_rightCriteria(createCriteria("group_right1"));
	}
	
	public Job_card_itemCriteria createJob_card_itemCriteria() {
		return new Job_card_itemCriteria(createCriteria("job_card_item"));
	}
	
	public Job_card_itemCriteria createJob_card_item1Criteria() {
		return new Job_card_itemCriteria(createCriteria("job_card_item1"));
	}
	
	public Customer_detailCriteria createCustomer_detailCriteria() {
		return new Customer_detailCriteria(createCriteria("customer_detail"));
	}
	
	public Customer_detailCriteria createCustomer_detail1Criteria() {
		return new Customer_detailCriteria(createCriteria("customer_detail1"));
	}
	
	public Delivery_noteCriteria createDelivery_noteCriteria() {
		return new Delivery_noteCriteria(createCriteria("delivery_note"));
	}
	
	public Delivery_noteCriteria createDelivery_note1Criteria() {
		return new Delivery_noteCriteria(createCriteria("delivery_note1"));
	}
	
	public Job_cardCriteria createJob_cardCriteria() {
		return new Job_cardCriteria(createCriteria("job_card"));
	}
	
	public Paper_typeCriteria createPaper_typeCriteria() {
		return new Paper_typeCriteria(createCriteria("paper_type"));
	}
	
	public Paper_typeCriteria createPaper_type1Criteria() {
		return new Paper_typeCriteria(createCriteria("paper_type1"));
	}
	
	public Job_cardCriteria createJob_card1Criteria() {
		return new Job_cardCriteria(createCriteria("job_card1"));
	}
	
	public Supplier_detailCriteria createSupplier_detailCriteria() {
		return new Supplier_detailCriteria(createCriteria("supplier_detail"));
	}
	
	public Supplier_detailCriteria createSupplier_detail1Criteria() {
		return new Supplier_detailCriteria(createCriteria("supplier_detail1"));
	}
	
	public User_detailCriteria createUser_detailCriteria() {
		return new User_detailCriteria(createCriteria("user_detail"));
	}
	
	public User_detailCriteria createUser_detail1Criteria() {
		return new User_detailCriteria(createCriteria("user_detail1"));
	}
	
	public Item_typeCriteria createItem_typeCriteria() {
		return new Item_typeCriteria(createCriteria("item_type"));
	}
	
	public Item_typeCriteria createItem_type1Criteria() {
		return new Item_typeCriteria(createCriteria("item_type1"));
	}
	
	public Cover_typeCriteria createCover_typeCriteria() {
		return new Cover_typeCriteria(createCriteria("cover_type"));
	}
	
	public Cover_typeCriteria createCover_type1Criteria() {
		return new Cover_typeCriteria(createCriteria("cover_type1"));
	}
	
	public Company_settingCriteria createCompany_settingCriteria() {
		return new Company_settingCriteria(createCriteria("company_setting"));
	}
	
	public Company_settingCriteria createCompany_setting1Criteria() {
		return new Company_settingCriteria(createCriteria("company_setting1"));
	}
	
	public User_detail uniqueUser_detail() {
		return (User_detail) super.uniqueResult();
	}
	
	public User_detail[] listUser_detail() {
		java.util.List list = super.list();
		return (User_detail[]) list.toArray(new User_detail[list.size()]);
	}
}

