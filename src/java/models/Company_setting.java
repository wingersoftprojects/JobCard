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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="company_setting")
public class Company_setting implements Serializable {
	public Company_setting() {
	}
	
	public static Company_setting loadCompany_settingByORMID(int company_setting_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadCompany_settingByORMID(session, company_setting_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting getCompany_settingByORMID(int company_setting_id) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getCompany_settingByORMID(session, company_setting_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting loadCompany_settingByORMID(int company_setting_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadCompany_settingByORMID(session, company_setting_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting getCompany_settingByORMID(int company_setting_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return getCompany_settingByORMID(session, company_setting_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting loadCompany_settingByORMID(PersistentSession session, int company_setting_id) throws PersistentException {
		try {
			return (Company_setting) session.load(models.Company_setting.class, new Integer(company_setting_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting getCompany_settingByORMID(PersistentSession session, int company_setting_id) throws PersistentException {
		try {
			return (Company_setting) session.get(models.Company_setting.class, new Integer(company_setting_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting loadCompany_settingByORMID(PersistentSession session, int company_setting_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Company_setting) session.load(models.Company_setting.class, new Integer(company_setting_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting getCompany_settingByORMID(PersistentSession session, int company_setting_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Company_setting) session.get(models.Company_setting.class, new Integer(company_setting_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompany_setting(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryCompany_setting(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompany_setting(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return queryCompany_setting(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting[] listCompany_settingByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listCompany_settingByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting[] listCompany_settingByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return listCompany_settingByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompany_setting(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Company_setting as Company_setting");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompany_setting(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Company_setting as Company_setting");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Company_setting", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting[] listCompany_settingByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCompany_setting(session, condition, orderBy);
			return (Company_setting[]) list.toArray(new Company_setting[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting[] listCompany_settingByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCompany_setting(session, condition, orderBy, lockMode);
			return (Company_setting[]) list.toArray(new Company_setting[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting loadCompany_settingByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadCompany_settingByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting loadCompany_settingByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return loadCompany_settingByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting loadCompany_settingByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Company_setting[] company_settings = listCompany_settingByQuery(session, condition, orderBy);
		if (company_settings != null && company_settings.length > 0)
			return company_settings[0];
		else
			return null;
	}
	
	public static Company_setting loadCompany_settingByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Company_setting[] company_settings = listCompany_settingByQuery(session, condition, orderBy, lockMode);
		if (company_settings != null && company_settings.length > 0)
			return company_settings[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCompany_settingByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateCompany_settingByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompany_settingByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = models.JobCardPersistentManager.instance().getSession();
			return iterateCompany_settingByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompany_settingByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Company_setting as Company_setting");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompany_settingByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Company_setting as Company_setting");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Company_setting", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_setting loadCompany_settingByCriteria(Company_settingCriteria company_settingCriteria) {
		Company_setting[] company_settings = listCompany_settingByCriteria(company_settingCriteria);
		if(company_settings == null || company_settings.length == 0) {
			return null;
		}
		return company_settings[0];
	}
	
	public static Company_setting[] listCompany_settingByCriteria(Company_settingCriteria company_settingCriteria) {
		return company_settingCriteria.listCompany_setting();
	}
	
	public static Company_setting createCompany_setting() {
		return new models.Company_setting();
	}
	
	public boolean save() throws PersistentException {
		try {
			models.JobCardPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			models.JobCardPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			models.JobCardPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			models.JobCardPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getAdd_by() != null) {
				getAdd_by().getCompany_setting().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getCompany_setting1().remove(this);
			}
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getAdd_by() != null) {
				getAdd_by().getCompany_setting().remove(this);
			}
			
			if(getLast_edit_by() != null) {
				getLast_edit_by().getCompany_setting1().remove(this);
			}
			
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	@Column(name="company_setting_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="MODELS_COMPANY_SETTING_COMPANY_SETTING_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELS_COMPANY_SETTING_COMPANY_SETTING_ID_GENERATOR", strategy="native")	
	private int company_setting_id;
	
	@Column(name="company_name", nullable=false, length=100)	
	private String company_name;
	
	@Column(name="street_address", nullable=false, length=255)	
	private String street_address;
	
	@Column(name="telephone", nullable=false, length=100)	
	private String telephone;
	
	@Column(name="mobile", nullable=false, length=100)	
	private String mobile;
	
	@Column(name="imageattachement", nullable=false)	
	private java.sql.Blob imageattachement;
	
	@Column(name="add_date", nullable=false)	
	private java.sql.Timestamp add_date;
	
	@ManyToOne(targetEntity=models.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="add_by", referencedColumnName="user_detail_id", nullable=false) })	
	private models.User_detail add_by;
	
	@Column(name="last_edit_date", nullable=true)	
	private java.sql.Timestamp last_edit_date;
	
	@ManyToOne(targetEntity=models.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="last_edit_by", referencedColumnName="user_detail_id") })	
	private models.User_detail last_edit_by;
	
	@Column(name="fax", nullable=true, length=100)	
	private String fax;
	
	@Column(name="email", nullable=true, length=100)	
	private String email;
	
	@Column(name="website", nullable=true, length=100)	
	private String website;
	
	@Column(name="sloghan", nullable=true, length=100)	
	private String sloghan;
	
	@Column(name="showdeveloper", nullable=true, length=3)	
	private String showdeveloper;
	
	@Column(name="tin", nullable=true, length=100)	
	private String tin;
	
	@Column(name="vatpercentage", nullable=true, length=100)	
	private String vatpercentage;
	
	@Column(name="currency", nullable=true, length=100)	
	private String currency;
	
	@Column(name="developeremail", nullable=true, length=100)	
	private String developeremail;
	
	@Column(name="developerphone", nullable=true, length=100)	
	private String developerphone;
	
	@Column(name="timezone", nullable=true, length=100)	
	private String timezone;
	
	@Column(name="dateformat", nullable=true, length=100)	
	private String dateformat;
	
	@Column(name="city", nullable=true, length=100)	
	private String city;
	
	@Column(name="accountnumber", nullable=true, length=100)	
	private String accountnumber;
	
	@Column(name="bankname", nullable=true, length=100)	
	private String bankname;
	
	@Column(name="branchname", nullable=true, length=100)	
	private String branchname;
	
	@Column(name="bankcode", nullable=true, length=100)	
	private String bankcode;
	
	@Column(name="swiftcode", nullable=true, length=100)	
	private String swiftcode;
	
	@Column(name="flagdays", nullable=true, length=11)	
	private Integer flagdays;
	
	@Column(name="building", nullable=true, length=100)	
	private String building;
	
	private void setCompany_setting_id(int value) {
		this.company_setting_id = value;
	}
	
	public int getCompany_setting_id() {
		return company_setting_id;
	}
	
	public int getORMID() {
		return getCompany_setting_id();
	}
	
	public void setCompany_name(String value) {
		this.company_name = value;
	}
	
	public String getCompany_name() {
		return company_name;
	}
	
	public void setStreet_address(String value) {
		this.street_address = value;
	}
	
	public String getStreet_address() {
		return street_address;
	}
	
	public void setTelephone(String value) {
		this.telephone = value;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setMobile(String value) {
		this.mobile = value;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setImageattachement(java.sql.Blob value) {
		this.imageattachement = value;
	}
	
	public java.sql.Blob getImageattachement() {
		return imageattachement;
	}
	
	public void setAdd_date(java.sql.Timestamp value) {
		this.add_date = value;
	}
	
	public java.sql.Timestamp getAdd_date() {
		return add_date;
	}
	
	public void setLast_edit_date(java.sql.Timestamp value) {
		this.last_edit_date = value;
	}
	
	public java.sql.Timestamp getLast_edit_date() {
		return last_edit_date;
	}
	
	public void setFax(String value) {
		this.fax = value;
	}
	
	public String getFax() {
		return fax;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setWebsite(String value) {
		this.website = value;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public void setSloghan(String value) {
		this.sloghan = value;
	}
	
	public String getSloghan() {
		return sloghan;
	}
	
	public void setShowdeveloper(String value) {
		this.showdeveloper = value;
	}
	
	public String getShowdeveloper() {
		return showdeveloper;
	}
	
	public void setTin(String value) {
		this.tin = value;
	}
	
	public String getTin() {
		return tin;
	}
	
	public void setVatpercentage(String value) {
		this.vatpercentage = value;
	}
	
	public String getVatpercentage() {
		return vatpercentage;
	}
	
	public void setCurrency(String value) {
		this.currency = value;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setDeveloperemail(String value) {
		this.developeremail = value;
	}
	
	public String getDeveloperemail() {
		return developeremail;
	}
	
	public void setDeveloperphone(String value) {
		this.developerphone = value;
	}
	
	public String getDeveloperphone() {
		return developerphone;
	}
	
	public void setTimezone(String value) {
		this.timezone = value;
	}
	
	public String getTimezone() {
		return timezone;
	}
	
	public void setDateformat(String value) {
		this.dateformat = value;
	}
	
	public String getDateformat() {
		return dateformat;
	}
	
	public void setCity(String value) {
		this.city = value;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setAccountnumber(String value) {
		this.accountnumber = value;
	}
	
	public String getAccountnumber() {
		return accountnumber;
	}
	
	public void setBankname(String value) {
		this.bankname = value;
	}
	
	public String getBankname() {
		return bankname;
	}
	
	public void setBranchname(String value) {
		this.branchname = value;
	}
	
	public String getBranchname() {
		return branchname;
	}
	
	public void setBankcode(String value) {
		this.bankcode = value;
	}
	
	public String getBankcode() {
		return bankcode;
	}
	
	public void setSwiftcode(String value) {
		this.swiftcode = value;
	}
	
	public String getSwiftcode() {
		return swiftcode;
	}
	
	public void setFlagdays(int value) {
		setFlagdays(new Integer(value));
	}
	
	public void setFlagdays(Integer value) {
		this.flagdays = value;
	}
	
	public Integer getFlagdays() {
		return flagdays;
	}
	
	public void setBuilding(String value) {
		this.building = value;
	}
	
	public String getBuilding() {
		return building;
	}
	
	public void setAdd_by(models.User_detail value) {
		this.add_by = value;
	}
	
	public models.User_detail getAdd_by() {
		return add_by;
	}
	
	public void setLast_edit_by(models.User_detail value) {
		this.last_edit_by = value;
	}
	
	public models.User_detail getLast_edit_by() {
		return last_edit_by;
	}
	
	public String toString() {
		return String.valueOf(getCompany_setting_id());
	}
	
}
