/**
 * Licensee: bajuna
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListSMIJCData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Job_card...");
		models.Job_card[] modelsJob_cards = models.Job_card.listJob_cardByQuery(null, null);
		int length = Math.min(modelsJob_cards.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelsJob_cards[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Job_card_item...");
		models.Job_card_item[] modelsJob_card_items = models.Job_card_item.listJob_card_itemByQuery(null, null);
		length = Math.min(modelsJob_card_items.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelsJob_card_items[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Customer_detail...");
		models.Customer_detail[] modelsCustomer_details = models.Customer_detail.listCustomer_detailByQuery(null, null);
		length = Math.min(modelsCustomer_details.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelsCustomer_details[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Supplier_detail...");
		models.Supplier_detail[] modelsSupplier_details = models.Supplier_detail.listSupplier_detailByQuery(null, null);
		length = Math.min(modelsSupplier_details.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelsSupplier_details[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Paper_type...");
		models.Paper_type[] modelsPaper_types = models.Paper_type.listPaper_typeByQuery(null, null);
		length = Math.min(modelsPaper_types.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelsPaper_types[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing User_detail...");
		models.User_detail[] modelsUser_details = models.User_detail.listUser_detailByQuery(null, null);
		length = Math.min(modelsUser_details.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelsUser_details[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing User_action...");
		models.User_action[] modelsUser_actions = models.User_action.listUser_actionByQuery(null, null);
		length = Math.min(modelsUser_actions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelsUser_actions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Group_detail...");
		models.Group_detail[] modelsGroup_details = models.Group_detail.listGroup_detailByQuery(null, null);
		length = Math.min(modelsGroup_details.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelsGroup_details[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Group_right...");
		models.Group_right[] modelsGroup_rights = models.Group_right.listGroup_rightByQuery(null, null);
		length = Math.min(modelsGroup_rights.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelsGroup_rights[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Delivery_note...");
		models.Delivery_note[] modelsDelivery_notes = models.Delivery_note.listDelivery_noteByQuery(null, null);
		length = Math.min(modelsDelivery_notes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelsDelivery_notes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Group_user...");
		models.Group_user[] modelsGroup_users = models.Group_user.listGroup_userByQuery(null, null);
		length = Math.min(modelsGroup_users.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelsGroup_users[i]);
		}
		System.out.println(length + " record(s) retrieved.");
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Job_card by Criteria...");
		models.Job_cardCriteria lmodelsJob_cardCriteria = new models.Job_cardCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelsJob_cardCriteria.job_card_id.eq();
		lmodelsJob_cardCriteria.setMaxResults(ROW_COUNT);
		models.Job_card[] modelsJob_cards = lmodelsJob_cardCriteria.listJob_card();
		int length =modelsJob_cards== null ? 0 : Math.min(modelsJob_cards.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelsJob_cards[i]);
		}
		System.out.println(length + " Job_card record(s) retrieved."); 
		
		System.out.println("Listing Job_card_item by Criteria...");
		models.Job_card_itemCriteria lmodelsJob_card_itemCriteria = new models.Job_card_itemCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelsJob_card_itemCriteria.job_card_item_id.eq();
		lmodelsJob_card_itemCriteria.setMaxResults(ROW_COUNT);
		models.Job_card_item[] modelsJob_card_items = lmodelsJob_card_itemCriteria.listJob_card_item();
		length =modelsJob_card_items== null ? 0 : Math.min(modelsJob_card_items.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelsJob_card_items[i]);
		}
		System.out.println(length + " Job_card_item record(s) retrieved."); 
		
		System.out.println("Listing Customer_detail by Criteria...");
		models.Customer_detailCriteria lmodelsCustomer_detailCriteria = new models.Customer_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelsCustomer_detailCriteria.customer_detail_id.eq();
		lmodelsCustomer_detailCriteria.setMaxResults(ROW_COUNT);
		models.Customer_detail[] modelsCustomer_details = lmodelsCustomer_detailCriteria.listCustomer_detail();
		length =modelsCustomer_details== null ? 0 : Math.min(modelsCustomer_details.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelsCustomer_details[i]);
		}
		System.out.println(length + " Customer_detail record(s) retrieved."); 
		
		System.out.println("Listing Supplier_detail by Criteria...");
		models.Supplier_detailCriteria lmodelsSupplier_detailCriteria = new models.Supplier_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelsSupplier_detailCriteria.supplier_detail_id.eq();
		lmodelsSupplier_detailCriteria.setMaxResults(ROW_COUNT);
		models.Supplier_detail[] modelsSupplier_details = lmodelsSupplier_detailCriteria.listSupplier_detail();
		length =modelsSupplier_details== null ? 0 : Math.min(modelsSupplier_details.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelsSupplier_details[i]);
		}
		System.out.println(length + " Supplier_detail record(s) retrieved."); 
		
		System.out.println("Listing Paper_type by Criteria...");
		models.Paper_typeCriteria lmodelsPaper_typeCriteria = new models.Paper_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelsPaper_typeCriteria.paper_type_id.eq();
		lmodelsPaper_typeCriteria.setMaxResults(ROW_COUNT);
		models.Paper_type[] modelsPaper_types = lmodelsPaper_typeCriteria.listPaper_type();
		length =modelsPaper_types== null ? 0 : Math.min(modelsPaper_types.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelsPaper_types[i]);
		}
		System.out.println(length + " Paper_type record(s) retrieved."); 
		
		System.out.println("Listing User_detail by Criteria...");
		models.User_detailCriteria lmodelsUser_detailCriteria = new models.User_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelsUser_detailCriteria.user_detail_id.eq();
		lmodelsUser_detailCriteria.setMaxResults(ROW_COUNT);
		models.User_detail[] modelsUser_details = lmodelsUser_detailCriteria.listUser_detail();
		length =modelsUser_details== null ? 0 : Math.min(modelsUser_details.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelsUser_details[i]);
		}
		System.out.println(length + " User_detail record(s) retrieved."); 
		
		System.out.println("Listing User_action by Criteria...");
		models.User_actionCriteria lmodelsUser_actionCriteria = new models.User_actionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelsUser_actionCriteria.user_action_id.eq();
		lmodelsUser_actionCriteria.setMaxResults(ROW_COUNT);
		models.User_action[] modelsUser_actions = lmodelsUser_actionCriteria.listUser_action();
		length =modelsUser_actions== null ? 0 : Math.min(modelsUser_actions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelsUser_actions[i]);
		}
		System.out.println(length + " User_action record(s) retrieved."); 
		
		System.out.println("Listing Group_detail by Criteria...");
		models.Group_detailCriteria lmodelsGroup_detailCriteria = new models.Group_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelsGroup_detailCriteria.group_detail_id.eq();
		lmodelsGroup_detailCriteria.setMaxResults(ROW_COUNT);
		models.Group_detail[] modelsGroup_details = lmodelsGroup_detailCriteria.listGroup_detail();
		length =modelsGroup_details== null ? 0 : Math.min(modelsGroup_details.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelsGroup_details[i]);
		}
		System.out.println(length + " Group_detail record(s) retrieved."); 
		
		System.out.println("Listing Group_right by Criteria...");
		models.Group_rightCriteria lmodelsGroup_rightCriteria = new models.Group_rightCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelsGroup_rightCriteria.group_right_id.eq();
		lmodelsGroup_rightCriteria.setMaxResults(ROW_COUNT);
		models.Group_right[] modelsGroup_rights = lmodelsGroup_rightCriteria.listGroup_right();
		length =modelsGroup_rights== null ? 0 : Math.min(modelsGroup_rights.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelsGroup_rights[i]);
		}
		System.out.println(length + " Group_right record(s) retrieved."); 
		
		System.out.println("Listing Delivery_note by Criteria...");
		models.Delivery_noteCriteria lmodelsDelivery_noteCriteria = new models.Delivery_noteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelsDelivery_noteCriteria.delivery_note_id.eq();
		lmodelsDelivery_noteCriteria.setMaxResults(ROW_COUNT);
		models.Delivery_note[] modelsDelivery_notes = lmodelsDelivery_noteCriteria.listDelivery_note();
		length =modelsDelivery_notes== null ? 0 : Math.min(modelsDelivery_notes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelsDelivery_notes[i]);
		}
		System.out.println(length + " Delivery_note record(s) retrieved."); 
		
		System.out.println("Listing Group_user by Criteria...");
		models.Group_userCriteria lmodelsGroup_userCriteria = new models.Group_userCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelsGroup_userCriteria.group_user_id.eq();
		lmodelsGroup_userCriteria.setMaxResults(ROW_COUNT);
		models.Group_user[] modelsGroup_users = lmodelsGroup_userCriteria.listGroup_user();
		length =modelsGroup_users== null ? 0 : Math.min(modelsGroup_users.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelsGroup_users[i]);
		}
		System.out.println(length + " Group_user record(s) retrieved."); 
		
			}
	
	public static void main(String[] args) {
		try {
			ListSMIJCData listSMIJCData = new ListSMIJCData();
			try {
				listSMIJCData.listTestData();
				//listSMIJCData.listByCriteria();
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
