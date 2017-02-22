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

public class Supplier_detailDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression supplier_detail_id;
	public final StringExpression supplier_name;
	public final StringExpression specifications;
	public final IntegerExpression telephone;
	public final StringExpression size;
	public final IntegerExpression quantity;
	public final IntegerExpression is_active;
	public final IntegerExpression is_deleted;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression job_card_item;
	
	public Supplier_detailDetachedCriteria() {
		super(models.Supplier_detail.class, models.Supplier_detailCriteria.class);
		supplier_detail_id = new IntegerExpression("supplier_detail_id", this.getDetachedCriteria());
		supplier_name = new StringExpression("supplier_name", this.getDetachedCriteria());
		specifications = new StringExpression("specifications", this.getDetachedCriteria());
		telephone = new IntegerExpression("telephone", this.getDetachedCriteria());
		size = new StringExpression("size", this.getDetachedCriteria());
		quantity = new IntegerExpression("quantity", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		job_card_item = new CollectionExpression("job_card_item", this.getDetachedCriteria());
	}
	
	public Supplier_detailDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, models.Supplier_detailCriteria.class);
		supplier_detail_id = new IntegerExpression("supplier_detail_id", this.getDetachedCriteria());
		supplier_name = new StringExpression("supplier_name", this.getDetachedCriteria());
		specifications = new StringExpression("specifications", this.getDetachedCriteria());
		telephone = new IntegerExpression("telephone", this.getDetachedCriteria());
		size = new StringExpression("size", this.getDetachedCriteria());
		quantity = new IntegerExpression("quantity", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		job_card_item = new CollectionExpression("job_card_item", this.getDetachedCriteria());
	}
	
	public Job_card_itemDetachedCriteria createJob_card_itemCriteria() {
		return new Job_card_itemDetachedCriteria(createCriteria("job_card_item"));
	}
	
	public Supplier_detail uniqueSupplier_detail(PersistentSession session) {
		return (Supplier_detail) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Supplier_detail[] listSupplier_detail(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Supplier_detail[]) list.toArray(new Supplier_detail[list.size()]);
	}
}

