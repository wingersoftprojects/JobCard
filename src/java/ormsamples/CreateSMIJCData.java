/**
 * Licensee: bajuna
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateSMIJCData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = models.JobCardPersistentManager.instance().getSession().beginTransaction();
		try {
			models.Job_card lmodelsJob_card = models.Job_card.createJob_card();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : user_action, delivery_note, job_card_item, last_edit_by, last_edit_date, add_by, add_date, is_deleted, is_active, customer_detail
			lmodelsJob_card.save();
			models.Job_card_item lmodelsJob_card_item = models.Job_card_item.createJob_card_item();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : amount, rate, quantity, machine_used, other_processes, binding_type, lamination_type, cover_type, paper_size, pages, item_type, job_title, paper_type, supplier_detail, job_card
			lmodelsJob_card_item.save();
			models.Customer_detail lmodelsCustomer_detail = models.Customer_detail.createCustomer_detail();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : job_card, delivery_note, address, telephone2, telephone1, contact_person_name, customer_name
			lmodelsCustomer_detail.save();
			models.Supplier_detail lmodelsSupplier_detail = models.Supplier_detail.createSupplier_detail();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : job_card_item, quantity, size, specifications, supplier_name
			lmodelsSupplier_detail.save();
			models.Paper_type lmodelsPaper_type = models.Paper_type.createPaper_type();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : job_card_item, paper_type_sub_category, paper_type_category
			lmodelsPaper_type.save();
			models.User_detail lmodelsUser_detail = models.User_detail.createUser_detail();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : group_user, user_action, add_by, add_date, is_user_gen_admin, second_name, first_name, user_password, user_name
			lmodelsUser_detail.save();
			models.User_action lmodelsUser_action = models.User_action.createUser_action();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : action_date, action, user_detail, job_card
			lmodelsUser_action.save();
			models.Group_detail lmodelsGroup_detail = models.Group_detail.createGroup_detail();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : group_right, group_user, add_by, add_date, is_deleted, is_active, group_name
			lmodelsGroup_detail.save();
			models.Group_right lmodelsGroup_right = models.Group_right.createGroup_right();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : add_by, add_date, is_deleted, is_active, allow_delete, allow_add, allow_edit, allow_view, group_detail
			lmodelsGroup_right.save();
			models.Delivery_note lmodelsDelivery_note = models.Delivery_note.createDelivery_note();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : customer_detaill, job_card
			lmodelsDelivery_note.save();
			models.Group_user lmodelsGroup_user = models.Group_user.createGroup_user();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : add_by, add_date, is_deleted, is_active, user_detail, group_detail
			lmodelsGroup_user.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateSMIJCData createSMIJCData = new CreateSMIJCData();
			try {
				createSMIJCData.createTestData();
			}
			finally {
				models.JobCardPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
