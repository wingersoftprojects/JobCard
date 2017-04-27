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

public class Company_settingDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression company_setting_id;
	public final StringExpression company_name;
	public final StringExpression street_address;
	public final StringExpression telephone;
	public final StringExpression mobile;
	public final BlobExpression imageattachement;
	public final TimestampExpression add_date;
	public final IntegerExpression add_byId;
	public final AssociationExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_byId;
	public final AssociationExpression last_edit_by;
	public final StringExpression fax;
	public final StringExpression email;
	public final StringExpression website;
	public final StringExpression sloghan;
	public final StringExpression showdeveloper;
	public final StringExpression tin;
	public final StringExpression vatpercentage;
	public final StringExpression currency;
	public final StringExpression developeremail;
	public final StringExpression developerphone;
	public final StringExpression timezone;
	public final StringExpression dateformat;
	public final StringExpression city;
	public final StringExpression accountnumber;
	public final StringExpression bankname;
	public final StringExpression branchname;
	public final StringExpression bankcode;
	public final StringExpression swiftcode;
	public final IntegerExpression flagdays;
	public final StringExpression building;
	
	public Company_settingDetachedCriteria() {
		super(models.Company_setting.class, models.Company_settingCriteria.class);
		company_setting_id = new IntegerExpression("company_setting_id", this.getDetachedCriteria());
		company_name = new StringExpression("company_name", this.getDetachedCriteria());
		street_address = new StringExpression("street_address", this.getDetachedCriteria());
		telephone = new StringExpression("telephone", this.getDetachedCriteria());
		mobile = new StringExpression("mobile", this.getDetachedCriteria());
		imageattachement = new BlobExpression("imageattachement", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
		fax = new StringExpression("fax", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		website = new StringExpression("website", this.getDetachedCriteria());
		sloghan = new StringExpression("sloghan", this.getDetachedCriteria());
		showdeveloper = new StringExpression("showdeveloper", this.getDetachedCriteria());
		tin = new StringExpression("tin", this.getDetachedCriteria());
		vatpercentage = new StringExpression("vatpercentage", this.getDetachedCriteria());
		currency = new StringExpression("currency", this.getDetachedCriteria());
		developeremail = new StringExpression("developeremail", this.getDetachedCriteria());
		developerphone = new StringExpression("developerphone", this.getDetachedCriteria());
		timezone = new StringExpression("timezone", this.getDetachedCriteria());
		dateformat = new StringExpression("dateformat", this.getDetachedCriteria());
		city = new StringExpression("city", this.getDetachedCriteria());
		accountnumber = new StringExpression("accountnumber", this.getDetachedCriteria());
		bankname = new StringExpression("bankname", this.getDetachedCriteria());
		branchname = new StringExpression("branchname", this.getDetachedCriteria());
		bankcode = new StringExpression("bankcode", this.getDetachedCriteria());
		swiftcode = new StringExpression("swiftcode", this.getDetachedCriteria());
		flagdays = new IntegerExpression("flagdays", this.getDetachedCriteria());
		building = new StringExpression("building", this.getDetachedCriteria());
	}
	
	public Company_settingDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, models.Company_settingCriteria.class);
		company_setting_id = new IntegerExpression("company_setting_id", this.getDetachedCriteria());
		company_name = new StringExpression("company_name", this.getDetachedCriteria());
		street_address = new StringExpression("street_address", this.getDetachedCriteria());
		telephone = new StringExpression("telephone", this.getDetachedCriteria());
		mobile = new StringExpression("mobile", this.getDetachedCriteria());
		imageattachement = new BlobExpression("imageattachement", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_byId = new IntegerExpression("add_by.user_detail_id", this.getDetachedCriteria());
		add_by = new AssociationExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this.getDetachedCriteria());
		last_edit_by = new AssociationExpression("last_edit_by", this.getDetachedCriteria());
		fax = new StringExpression("fax", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		website = new StringExpression("website", this.getDetachedCriteria());
		sloghan = new StringExpression("sloghan", this.getDetachedCriteria());
		showdeveloper = new StringExpression("showdeveloper", this.getDetachedCriteria());
		tin = new StringExpression("tin", this.getDetachedCriteria());
		vatpercentage = new StringExpression("vatpercentage", this.getDetachedCriteria());
		currency = new StringExpression("currency", this.getDetachedCriteria());
		developeremail = new StringExpression("developeremail", this.getDetachedCriteria());
		developerphone = new StringExpression("developerphone", this.getDetachedCriteria());
		timezone = new StringExpression("timezone", this.getDetachedCriteria());
		dateformat = new StringExpression("dateformat", this.getDetachedCriteria());
		city = new StringExpression("city", this.getDetachedCriteria());
		accountnumber = new StringExpression("accountnumber", this.getDetachedCriteria());
		bankname = new StringExpression("bankname", this.getDetachedCriteria());
		branchname = new StringExpression("branchname", this.getDetachedCriteria());
		bankcode = new StringExpression("bankcode", this.getDetachedCriteria());
		swiftcode = new StringExpression("swiftcode", this.getDetachedCriteria());
		flagdays = new IntegerExpression("flagdays", this.getDetachedCriteria());
		building = new StringExpression("building", this.getDetachedCriteria());
	}
	
	public User_detailDetachedCriteria createAdd_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("add_by"));
	}
	
	public User_detailDetachedCriteria createLast_edit_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("last_edit_by"));
	}
	
	public Company_setting uniqueCompany_setting(PersistentSession session) {
		return (Company_setting) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Company_setting[] listCompany_setting(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Company_setting[]) list.toArray(new Company_setting[list.size()]);
	}
}

