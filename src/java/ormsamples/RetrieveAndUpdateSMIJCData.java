/**
 * Licensee: bajuna
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateSMIJCData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = models.JobCardPersistentManager.instance().getSession().beginTransaction();
		try {
			models.Job_card lmodelsJob_card = models.Job_card.loadJob_cardByQuery(null, null);
			// Update the properties of the persistent object
			lmodelsJob_card.save();
			models.Job_card_item lmodelsJob_card_item = models.Job_card_item.loadJob_card_itemByQuery(null, null);
			// Update the properties of the persistent object
			lmodelsJob_card_item.save();
			models.Customer_detail lmodelsCustomer_detail = models.Customer_detail.loadCustomer_detailByQuery(null, null);
			// Update the properties of the persistent object
			lmodelsCustomer_detail.save();
			models.Supplier_detail lmodelsSupplier_detail = models.Supplier_detail.loadSupplier_detailByQuery(null, null);
			// Update the properties of the persistent object
			lmodelsSupplier_detail.save();
			models.Paper_type lmodelsPaper_type = models.Paper_type.loadPaper_typeByQuery(null, null);
			// Update the properties of the persistent object
			lmodelsPaper_type.save();
			models.User_detail lmodelsUser_detail = models.User_detail.loadUser_detailByQuery(null, null);
			// Update the properties of the persistent object
			lmodelsUser_detail.save();
			models.User_action lmodelsUser_action = models.User_action.loadUser_actionByQuery(null, null);
			// Update the properties of the persistent object
			lmodelsUser_action.save();
			models.Group_detail lmodelsGroup_detail = models.Group_detail.loadGroup_detailByQuery(null, null);
			// Update the properties of the persistent object
			lmodelsGroup_detail.save();
			models.Group_right lmodelsGroup_right = models.Group_right.loadGroup_rightByQuery(null, null);
			// Update the properties of the persistent object
			lmodelsGroup_right.save();
			models.Delivery_note lmodelsDelivery_note = models.Delivery_note.loadDelivery_noteByQuery(null, null);
			// Update the properties of the persistent object
			lmodelsDelivery_note.save();
			models.Group_user lmodelsGroup_user = models.Group_user.loadGroup_userByQuery(null, null);
			// Update the properties of the persistent object
			lmodelsGroup_user.save();
			models.User_category lmodelsUser_category = models.User_category.loadUser_categoryByQuery(null, null);
			// Update the properties of the persistent object
			lmodelsUser_category.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Job_card by Job_cardCriteria");
		models.Job_cardCriteria lmodelsJob_cardCriteria = new models.Job_cardCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelsJob_cardCriteria.job_card_id.eq();
		System.out.println(lmodelsJob_cardCriteria.uniqueJob_card());
		
		System.out.println("Retrieving Job_card_item by Job_card_itemCriteria");
		models.Job_card_itemCriteria lmodelsJob_card_itemCriteria = new models.Job_card_itemCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelsJob_card_itemCriteria.job_card_item_id.eq();
		System.out.println(lmodelsJob_card_itemCriteria.uniqueJob_card_item());
		
		System.out.println("Retrieving Customer_detail by Customer_detailCriteria");
		models.Customer_detailCriteria lmodelsCustomer_detailCriteria = new models.Customer_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelsCustomer_detailCriteria.customer_detail_id.eq();
		System.out.println(lmodelsCustomer_detailCriteria.uniqueCustomer_detail());
		
		System.out.println("Retrieving Supplier_detail by Supplier_detailCriteria");
		models.Supplier_detailCriteria lmodelsSupplier_detailCriteria = new models.Supplier_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelsSupplier_detailCriteria.supplier_detail_id.eq();
		System.out.println(lmodelsSupplier_detailCriteria.uniqueSupplier_detail());
		
		System.out.println("Retrieving Paper_type by Paper_typeCriteria");
		models.Paper_typeCriteria lmodelsPaper_typeCriteria = new models.Paper_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelsPaper_typeCriteria.paper_type_id.eq();
		System.out.println(lmodelsPaper_typeCriteria.uniquePaper_type());
		
		System.out.println("Retrieving User_detail by User_detailCriteria");
		models.User_detailCriteria lmodelsUser_detailCriteria = new models.User_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelsUser_detailCriteria.user_detail_id.eq();
		System.out.println(lmodelsUser_detailCriteria.uniqueUser_detail());
		
		System.out.println("Retrieving User_action by User_actionCriteria");
		models.User_actionCriteria lmodelsUser_actionCriteria = new models.User_actionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelsUser_actionCriteria.user_action_id.eq();
		System.out.println(lmodelsUser_actionCriteria.uniqueUser_action());
		
		System.out.println("Retrieving Group_detail by Group_detailCriteria");
		models.Group_detailCriteria lmodelsGroup_detailCriteria = new models.Group_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelsGroup_detailCriteria.group_detail_id.eq();
		System.out.println(lmodelsGroup_detailCriteria.uniqueGroup_detail());
		
		System.out.println("Retrieving Group_right by Group_rightCriteria");
		models.Group_rightCriteria lmodelsGroup_rightCriteria = new models.Group_rightCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelsGroup_rightCriteria.group_right_id.eq();
		System.out.println(lmodelsGroup_rightCriteria.uniqueGroup_right());
		
		System.out.println("Retrieving Delivery_note by Delivery_noteCriteria");
		models.Delivery_noteCriteria lmodelsDelivery_noteCriteria = new models.Delivery_noteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelsDelivery_noteCriteria.delivery_note_id.eq();
		System.out.println(lmodelsDelivery_noteCriteria.uniqueDelivery_note());
		
		System.out.println("Retrieving Group_user by Group_userCriteria");
		models.Group_userCriteria lmodelsGroup_userCriteria = new models.Group_userCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelsGroup_userCriteria.group_user_id.eq();
		System.out.println(lmodelsGroup_userCriteria.uniqueGroup_user());
		
		System.out.println("Retrieving User_category by User_categoryCriteria");
		models.User_categoryCriteria lmodelsUser_categoryCriteria = new models.User_categoryCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelsUser_categoryCriteria.user_category_id.eq();
		System.out.println(lmodelsUser_categoryCriteria.uniqueUser_category());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateSMIJCData retrieveAndUpdateSMIJCData = new RetrieveAndUpdateSMIJCData();
			try {
				retrieveAndUpdateSMIJCData.retrieveAndUpdateTestData();
				//retrieveAndUpdateSMIJCData.retrieveByCriteria();
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
