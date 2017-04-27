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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Company_settingCriteria extends AbstractORMCriteria {
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
	
	public Company_settingCriteria(Criteria criteria) {
		super(criteria);
		company_setting_id = new IntegerExpression("company_setting_id", this);
		company_name = new StringExpression("company_name", this);
		street_address = new StringExpression("street_address", this);
		telephone = new StringExpression("telephone", this);
		mobile = new StringExpression("mobile", this);
		imageattachement = new BlobExpression("imageattachement", this);
		add_date = new TimestampExpression("add_date", this);
		add_byId = new IntegerExpression("add_by.user_detail_id", this);
		add_by = new AssociationExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_byId = new IntegerExpression("last_edit_by.user_detail_id", this);
		last_edit_by = new AssociationExpression("last_edit_by", this);
		fax = new StringExpression("fax", this);
		email = new StringExpression("email", this);
		website = new StringExpression("website", this);
		sloghan = new StringExpression("sloghan", this);
		showdeveloper = new StringExpression("showdeveloper", this);
		tin = new StringExpression("tin", this);
		vatpercentage = new StringExpression("vatpercentage", this);
		currency = new StringExpression("currency", this);
		developeremail = new StringExpression("developeremail", this);
		developerphone = new StringExpression("developerphone", this);
		timezone = new StringExpression("timezone", this);
		dateformat = new StringExpression("dateformat", this);
		city = new StringExpression("city", this);
		accountnumber = new StringExpression("accountnumber", this);
		bankname = new StringExpression("bankname", this);
		branchname = new StringExpression("branchname", this);
		bankcode = new StringExpression("bankcode", this);
		swiftcode = new StringExpression("swiftcode", this);
		flagdays = new IntegerExpression("flagdays", this);
		building = new StringExpression("building", this);
	}
	
	public Company_settingCriteria(PersistentSession session) {
		this(session.createCriteria(Company_setting.class));
	}
	
	public Company_settingCriteria() throws PersistentException {
		this(models.JobCardPersistentManager.instance().getSession());
	}
	
	public User_detailCriteria createAdd_byCriteria() {
		return new User_detailCriteria(createCriteria("add_by"));
	}
	
	public User_detailCriteria createLast_edit_byCriteria() {
		return new User_detailCriteria(createCriteria("last_edit_by"));
	}
	
	public Company_setting uniqueCompany_setting() {
		return (Company_setting) super.uniqueResult();
	}
	
	public Company_setting[] listCompany_setting() {
		java.util.List list = super.list();
		return (Company_setting[]) list.toArray(new Company_setting[list.size()]);
	}
}

