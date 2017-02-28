/**
 * Licensee: bajuna
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteSMIJCData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = models.JobCardPersistentManager.instance().getSession().beginTransaction();
		try {
			models.Job_card lmodelsJob_card = models.Job_card.loadJob_cardByQuery(null, null);
			lmodelsJob_card.delete();
			models.Job_card_item lmodelsJob_card_item = models.Job_card_item.loadJob_card_itemByQuery(null, null);
			lmodelsJob_card_item.delete();
			models.Customer_detail lmodelsCustomer_detail = models.Customer_detail.loadCustomer_detailByQuery(null, null);
			lmodelsCustomer_detail.delete();
			models.Supplier_detail lmodelsSupplier_detail = models.Supplier_detail.loadSupplier_detailByQuery(null, null);
			lmodelsSupplier_detail.delete();
			models.Paper_type lmodelsPaper_type = models.Paper_type.loadPaper_typeByQuery(null, null);
			lmodelsPaper_type.delete();
			models.User_detail lmodelsUser_detail = models.User_detail.loadUser_detailByQuery(null, null);
			lmodelsUser_detail.delete();
			models.User_action lmodelsUser_action = models.User_action.loadUser_actionByQuery(null, null);
			lmodelsUser_action.delete();
			models.Group_detail lmodelsGroup_detail = models.Group_detail.loadGroup_detailByQuery(null, null);
			lmodelsGroup_detail.delete();
			models.Group_right lmodelsGroup_right = models.Group_right.loadGroup_rightByQuery(null, null);
			lmodelsGroup_right.delete();
			models.Delivery_note lmodelsDelivery_note = models.Delivery_note.loadDelivery_noteByQuery(null, null);
			lmodelsDelivery_note.delete();
			models.Group_user lmodelsGroup_user = models.Group_user.loadGroup_userByQuery(null, null);
			lmodelsGroup_user.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteSMIJCData deleteSMIJCData = new DeleteSMIJCData();
			try {
				deleteSMIJCData.deleteTestData();
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
