/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import models.Group_detail;
import models.Group_right;
import models.JobCardPersistentManager;
import models.Job_card;
import models.User_detail;
import org.hibernate.LockMode;
import org.jboss.logging.Logger;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import utilities.GeneralUtilities;

/**
 *
 * @author philp
 */
@ManagedBean
@RequestScoped
public class Group_rightBean extends AbstractBean<Group_right> implements Serializable {

    private Group_detail selectedGroup_detail;
    private List<Group_right> group_rights;
    private boolean All_allow_view;
    private boolean All_allow_add;
    private boolean All_allow_edit;
    private boolean All_allow_delete;

    /**
     * Creates a new instance of Group_rightBean
     */
    public Group_rightBean() {
        super(Group_right.class);
    }

    @Override
    public void init() {
        if (super.getEntityClass() == null) {
            loginBean.logout();
        }
    }
    @ManagedProperty("#{loginBean}")
    public LoginBean loginBean;

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    /**
     * @return the All_allow_view
     */
    public boolean IsAll_allow_view() {
        return All_allow_view;
    }

    /**
     * @param All_allow_view the All_allow_view to set
     */
    public void setAll_allow_view(boolean All_allow_view) {
        this.All_allow_view = All_allow_view;
    }

    /**
     *
     * @return All_allow_add
     */
    public boolean IsAll_allow_add() {
        return All_allow_add;
    }

    /**
     *
     * @param All_allow_add the All_allow_add to set
     */
    public void setAll_allow_add(boolean All_allow_add) {
        this.All_allow_add = All_allow_add;
    }

    /**
     *
     * @return All_allow_edit
     */
    public boolean IsAll_allow_edit() {
        return All_allow_edit;
    }

    /**
     *
     * @param All_allow_edit the All_allow_edit to set
     */
    public void setAll_allow_edit(boolean All_allow_edit) {
        this.All_allow_edit = All_allow_edit;
    }

    /**
     *
     * @return All_allow_delete
     */
    public boolean IsAll_allow_delete() {
        return All_allow_delete;
    }

    /**
     *
     * @param All_allow_delete the All_allow_delete to set
     */
    public void setAll_allow_delete(boolean All_allow_delete) {
        this.All_allow_delete = All_allow_delete;
    }

    public void All_allow(String allow_what, boolean bool_value) {
        try {
            if (bool_value) {
                multiChangeGroupRight(allow_what, 1);
            } else {
                multiChangeGroupRight(allow_what, 0);
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Group_rightBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void multiChangeGroupRight(String allow_what, int allow_value) {
        int n = 0;
        n = this.group_rights.size();
        switch (allow_what) {
            case "view":
                for (int i = 0; i < n; i++) {
                    this.group_rights.get(i).setAllow_view(allow_value);
                }
                break;
            case "add":
                for (int i = 0; i < n; i++) {
                    this.group_rights.get(i).setAllow_add(allow_value);
                }
                break;
            case "edit":
                for (int i = 0; i < n; i++) {
                    this.group_rights.get(i).setAllow_edit(allow_value);
                }
                break;
            case "delete":
                for (int i = 0; i < n; i++) {
                    this.group_rights.get(i).setAllow_delete(allow_value);
                }
                break;
        }

    }

    public void refreshGroup_rights(Group_detail group_detail) {
        //first deselect all
        this.All_allow_view = false;
        this.All_allow_add = false;
        this.All_allow_edit = false;
        this.All_allow_delete = false;

        group_rights = new ArrayList<Group_right>();
        List<Job_card> job_cards = new ArrayList<>();
        job_cards = new Job_cardBean().getTsActive();
        int n = 0;
        n = job_cards.size();
        for (int i = 0; i < n; i++) {
            Group_right group_right = null;
            try {
                group_right = Group_right.loadGroup_rightByQuery("job_card_id=" + job_cards.get(i).getJob_card_id(), null, LockMode.NONE);
            } catch (PersistentException | IndexOutOfBoundsException | NullPointerException ex) {
                group_right = null;
                java.util.logging.Logger.getLogger(Group_rightBean.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (group_right == null) {
                group_right = new Group_right();
                group_right.setGroup_detail(group_detail);
                //group_right.setJob_card(job_cards.get(i));
                group_right.setAllow_view(0);
                group_right.setAllow_add(0);
                group_right.setAllow_edit(0);
                group_right.setAllow_delete(0);
            }
            group_rights.add(group_right);
        }
    }

    public void SaveGroup_rights() {
        try {
            PersistentTransaction transaction = JobCardPersistentManager.instance().getSession().beginTransaction();
            for (Group_right gr : this.group_rights) {
                gr.setIs_active(1);
                gr.setAdd_date(new Timestamp(new Date().getTime()));
                gr.setAdd_by(loginBean.getUser_detail());
                gr.setIs_deleted(0);
                gr.save();
            }
            transaction.commit();
            loginBean.saveMessage();
        } catch (PersistentException ex) {
            java.util.logging.Logger.getLogger(Group_rightBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Group_right> getActiveGroup_rightListByUser(User_detail user_detail) {
        List<Group_right> grl = new ArrayList<Group_right>();

        try {
            grl = null;
            if (user_detail == null || user_detail.getIs_active() == 0 || user_detail.getIs_deleted() == 1 || user_detail.getIs_user_gen_admin() == 1) {
                //do nothing, user is either general admin OR inactive OR deleted
            } else {
                grl = (List<Group_right>) JobCardPersistentManager.instance().getSession().createQuery(""
                        + "SELECT gr FROM Group_right gr WHERE gr.group_detail IN("
                        + "SELECT gu.group_detail FROM Group_user gu"
                        + "INNER JOIN gu.group_detail gd"
                        + "WHERE gd.is_active=1 and gd.is_deleted=0"
                        + "AND gu.user_detail=" + user_detail.getUser_detail_id() + ")"
                        + "").list();
            }
        } catch (PersistentException ex) {
            java.util.logging.Logger.getLogger(Group_rightBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return grl;
    }

    public int IsUserGroupsFormAccessAllowed(User_detail user_detail, List<Group_right> group_rights, String group_right_function, String allow) {

//first check if user is gen admin
        if (user_detail == null) {
            return 0;
        }
        //for gen admins
        if (user_detail.getIs_user_gen_admin() == 1 /*&& user_detail.getIs_active() ==1*/) {
            return 1;
        }
        //for non-gen admins
        int ListItemIndex = 0;
        int ListItemNo = 0;
        try {
            ListItemNo = group_rights.size();
        } catch (NullPointerException npe) {

        }

        for (Group_right gr : group_rights) {
            if (gr.getGroup_right_function().equals(group_right_function) && "View".equals(allow)) {
                if (gr.getAllow_view() == 1) {
                    return 1;
                }
            }
            if (gr.getGroup_right_function().equals(group_right_function) && "Add".equals(allow)) {
                if (gr.getAllow_add() == 1) {
                    return 1;
                }
            }
            if (gr.getGroup_right_function().equals(group_right_function) && "Delete".equals(allow)) {
                if (gr.getAllow_delete() == 1) {
                    return 1;
                }
            }
            if (gr.getGroup_right_function().equals(group_right_function) && "Edit".equals(allow)) {
                if (gr.getAllow_edit() == 1) {
                    return 1;
                }
            }
        }

        int IsNegativeRightSeen = 0;
        int IsPostiveRightSeen = 0;

        /*while(ListItemIndex < ListItemNo){
           
        }*/
        if (IsPostiveRightSeen == 1 && IsNegativeRightSeen == 1) {
            return 1; //Allow function Access  
        } else {
            return 0; //Disallow function Access
        }

    }

    /**
     * @return the selectedGroup_detail
     */
    public Group_detail getSelectedGroup_detail() {
        return selectedGroup_detail;
    }

    /**
     *
     * @param selectedGroup_detail the selectedGroup_detail to set
     */
    public void setSelectedGroup_detail(Group_detail selectedGroup_detail) {
        this.selectedGroup_detail = selectedGroup_detail;
    }

    /**
     *
     * @return the group_rights
     */
    public List<Group_right> getGroup_rights() {
        return group_rights;
    }

    /**
     *
     * @param group_rights the groups_rights to set
     */
    public void setGroup_rights(List<Group_right> group_rights) {
        this.group_rights = group_rights;
    }

}
