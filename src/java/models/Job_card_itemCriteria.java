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

public class Job_card_itemCriteria extends AbstractORMCriteria {
	public final IntegerExpression job_card_item_id;
	public final IntegerExpression job_cardId;
	public final AssociationExpression job_card;
	public final IntegerExpression supplier_detailId;
	public final AssociationExpression supplier_detail;
	public final IntegerExpression paper_typeId;
	public final AssociationExpression paper_type;
	public final StringExpression job_title;
	public final IntegerExpression item_typeId;
	public final AssociationExpression item_type;
	public final StringExpression color;
	public final StringExpression color_other;
	public final IntegerExpression pages;
	public final StringExpression paper_size;
	public final IntegerExpression cover_typeId;
	public final AssociationExpression cover_type;
	public final StringExpression lamination_type;
	public final StringExpression binding_type;
	public final StringExpression other_processes;
	public final StringExpression machine_used;
	public final IntegerExpression quantity;
	public final IntegerExpression rate;
	public final IntegerExpression amount;
	public final IntegerExpression is_active;
	public final IntegerExpression is_deleted;
	public final TimestampExpression add_date;
	public final IntegerExpression add_byId;
	public final AssociationExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_byId;
	public final AssociationExpression last_edit_by;
	
	public Job_card_itemCriteria(Criteria criteria) {
		super(criteria);
		job_card_item_id = new IntegerExpression("job_card_item_id", this);
		job_cardId = new IntegerExpression("job_card.job_card_id", this);
		job_card = new AssociationExpression("job_card", this);
		supplier_detailId = new IntegerExpression("supplier_detail.supplier_detail_id", this);
		supplier_detail = new AssociationExpression("supplier_detail", this);
		paper_typeId = new IntegerExpression("paper_type.paper_type_id", this);
		paper_type = new AssociationExpression("paper_type", this);
		job_title = new StringExpression("job_title", this);
		item_typeId = new IntegerExpression("item_type.item_type_id", this);
		item_type = new AssociationExpression("item_type", this);
		color = new StringExpression("color", this);
		color_other = new StringExpression("color_other", this);
		pages = new IntegerExpression("pages", this);
		paper_size = new StringExpression("paper_size", this);
		cover_typeId = new IntegerExpression("cover_type.cover_type_id", this);
		cover_type = new AssociationExpression("cover_type", this);
		lamination_type = new StringExpression("lamination_type", this);
		binding_type = new StringExpression("binding_type", this);
		other_processes = new StringExpression("other_processes", this);
		machine_used = new StringExpression("machine_used", this);
		quantity = new IntegerExpression("quantity", this);
		rate = new IntegerExpression("rate", this);
		amount = new IntegerExpression("amount", this);
		is_active = new IntegerExpression("is_active", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		add_date = new TimestampExpression("add_date", this);
		add_byId = new IntegerExpression("add_by.user_detail_id", this);
		add_by = new AssociationExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this);
		last_edit_by = new AssociationExpression("last_edit_by", this);
	}
	
	public Job_card_itemCriteria(PersistentSession session) {
		this(session.createCriteria(Job_card_item.class));
	}
	
	public Job_card_itemCriteria() throws PersistentException {
		this(models.JobCardPersistentManager.instance().getSession());
	}
	
	public Job_cardCriteria createJob_cardCriteria() {
		return new Job_cardCriteria(createCriteria("job_card"));
	}
	
	public Supplier_detailCriteria createSupplier_detailCriteria() {
		return new Supplier_detailCriteria(createCriteria("supplier_detail"));
	}
	
	public Paper_typeCriteria createPaper_typeCriteria() {
		return new Paper_typeCriteria(createCriteria("paper_type"));
	}
	
	public Item_typeCriteria createItem_typeCriteria() {
		return new Item_typeCriteria(createCriteria("item_type"));
	}
	
	public Cover_typeCriteria createCover_typeCriteria() {
		return new Cover_typeCriteria(createCriteria("cover_type"));
	}
	
	public User_detailCriteria createAdd_byCriteria() {
		return new User_detailCriteria(createCriteria("add_by"));
	}
	
	public User_detailCriteria createLast_edit_byCriteria() {
		return new User_detailCriteria(createCriteria("last_edit_by"));
	}
	
	public Job_card_item uniqueJob_card_item() {
		return (Job_card_item) super.uniqueResult();
	}
	
	public Job_card_item[] listJob_card_item() {
		java.util.List list = super.list();
		return (Job_card_item[]) list.toArray(new Job_card_item[list.size()]);
	}
}

