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

public class Job_card_itemDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final StringExpression paper_size_custom;
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
	public final StringExpression flag;
	
	public Job_card_itemDetachedCriteria() {
		super(models.Job_card_item.class, models.Job_card_itemCriteria.class);
		job_card_item_id = new IntegerExpression("job_card_item_id", this.getDetachedCriteria());
		job_cardId = new IntegerExpression("job_card.job_card_id", this.getDetachedCriteria());
		job_card = new AssociationExpression("job_card", this.getDetachedCriteria());
		supplier_detailId = new IntegerExpression("supplier_detail.supplier_detail_id", this.getDetachedCriteria());
		supplier_detail = new AssociationExpression("supplier_detail", this.getDetachedCriteria());
		paper_typeId = new IntegerExpression("paper_type.paper_type_id", this.getDetachedCriteria());
		paper_type = new AssociationExpression("paper_type", this.getDetachedCriteria());
		job_title = new StringExpression("job_title", this.getDetachedCriteria());
		item_typeId = new IntegerExpression("item_type.item_type_id", this.getDetachedCriteria());
		item_type = new AssociationExpression("item_type", this.getDetachedCriteria());
		color = new StringExpression("color", this.getDetachedCriteria());
		color_other = new StringExpression("color_other", this.getDetachedCriteria());
		pages = new IntegerExpression("pages", this.getDetachedCriteria());
		paper_size = new StringExpression("paper_size", this.getDetachedCriteria());
		paper_size_custom = new StringExpression("paper_size_custom", this.getDetachedCriteria());
		cover_typeId = new IntegerExpression("cover_type.cover_type_id", this.getDetachedCriteria());
		cover_type = new AssociationExpression("cover_type", this.getDetachedCriteria());
		lamination_type = new StringExpression("lamination_type", this.getDetachedCriteria());
		binding_type = new StringExpression("binding_type", this.getDetachedCriteria());
		other_processes = new StringExpression("other_processes", this.getDetachedCriteria());
		machine_used = new StringExpression("machine_used", this.getDetachedCriteria());
		quantity = new IntegerExpression("quantity", this.getDetachedCriteria());
		rate = new IntegerExpression("rate", this.getDetachedCriteria());
		amount = new IntegerExpression("amount", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
		flag = new StringExpression("flag", this.getDetachedCriteria());
	}
	
	public Job_card_itemDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, models.Job_card_itemCriteria.class);
		job_card_item_id = new IntegerExpression("job_card_item_id", this.getDetachedCriteria());
		job_cardId = new IntegerExpression("job_card.job_card_id", this.getDetachedCriteria());
		job_card = new AssociationExpression("job_card", this.getDetachedCriteria());
		supplier_detailId = new IntegerExpression("supplier_detail.supplier_detail_id", this.getDetachedCriteria());
		supplier_detail = new AssociationExpression("supplier_detail", this.getDetachedCriteria());
		paper_typeId = new IntegerExpression("paper_type.paper_type_id", this.getDetachedCriteria());
		paper_type = new AssociationExpression("paper_type", this.getDetachedCriteria());
		job_title = new StringExpression("job_title", this.getDetachedCriteria());
		item_typeId = new IntegerExpression("item_type.item_type_id", this.getDetachedCriteria());
		item_type = new AssociationExpression("item_type", this.getDetachedCriteria());
		color = new StringExpression("color", this.getDetachedCriteria());
		color_other = new StringExpression("color_other", this.getDetachedCriteria());
		pages = new IntegerExpression("pages", this.getDetachedCriteria());
		paper_size = new StringExpression("paper_size", this.getDetachedCriteria());
		paper_size_custom = new StringExpression("paper_size_custom", this.getDetachedCriteria());
		cover_typeId = new IntegerExpression("cover_type.cover_type_id", this.getDetachedCriteria());
		cover_type = new AssociationExpression("cover_type", this.getDetachedCriteria());
		lamination_type = new StringExpression("lamination_type", this.getDetachedCriteria());
		binding_type = new StringExpression("binding_type", this.getDetachedCriteria());
		other_processes = new StringExpression("other_processes", this.getDetachedCriteria());
		machine_used = new StringExpression("machine_used", this.getDetachedCriteria());
		quantity = new IntegerExpression("quantity", this.getDetachedCriteria());
		rate = new IntegerExpression("rate", this.getDetachedCriteria());
		amount = new IntegerExpression("amount", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
		flag = new StringExpression("flag", this.getDetachedCriteria());
	}
	
	public Job_cardDetachedCriteria createJob_cardCriteria() {
		return new Job_cardDetachedCriteria(createCriteria("job_card"));
	}
	
	public Supplier_detailDetachedCriteria createSupplier_detailCriteria() {
		return new Supplier_detailDetachedCriteria(createCriteria("supplier_detail"));
	}
	
	public Paper_typeDetachedCriteria createPaper_typeCriteria() {
		return new Paper_typeDetachedCriteria(createCriteria("paper_type"));
	}
	
	public Item_typeDetachedCriteria createItem_typeCriteria() {
		return new Item_typeDetachedCriteria(createCriteria("item_type"));
	}
	
	public Cover_typeDetachedCriteria createCover_typeCriteria() {
		return new Cover_typeDetachedCriteria(createCriteria("cover_type"));
	}
	
	public User_detailDetachedCriteria createAdd_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("add_by"));
	}
	
	public User_detailDetachedCriteria createLast_edit_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("last_edit_by"));
	}
	
	public Job_card_item uniqueJob_card_item(PersistentSession session) {
		return (Job_card_item) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Job_card_item[] listJob_card_item(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Job_card_item[]) list.toArray(new Job_card_item[list.size()]);
	}
}

