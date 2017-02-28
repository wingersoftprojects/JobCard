/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.logging.Level;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import models.User_detail;
import org.orm.PersistentException;
import utilities.Security;

/**
 *
 * @author philp
 */
@ManagedBean
@SessionScoped
public class User_detailBean extends AbstractBean<User_detail> implements Serializable {

    private boolean OverridePassword;
    private String CurrentPassword;
    private String NewPassword;
    private String ConfirmPassword;

    /**
     * Creates new instance of User_detailBean
     */
    public User_detailBean() {
        super(User_detail.class);
    }

    @Override
    public void init() {
        if (super.getEntityClass() == null) {
            loginBean.logout();
        }
    }
    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void doEncrypt(User_detail aUser_detail) {
        if (aUser_detail != null) {
            aUser_detail.setUser_password(Security.Encrypt(aUser_detail.getUser_password()));
        }
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    /**
     *
     * @return OverridePassword
     */
    public boolean isOverridePassword() {
        return OverridePassword;
    }

    /**
     *
     * @param OverridePassword the OverridePassword to set
     */
    public void setOverridePassword(boolean OverridePassword) {
        this.OverridePassword = OverridePassword;
    }

    public void save_User_detail(User_detail id) {
        if ((this.OverridePassword && this.getSelected().getUser_detail_id() > 0) || this.getSelected().getUser_detail_id() == 0) {
            if (this.getSelected().getUser_password().length() < 8) {
                //PAssword less than 8 characters
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Password", "Password can not be less than 8 characters!"));
            } else if (!this.getSelected().getUser_password().equals(this.ConfirmPassword)) {
                //Password not equal
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Match Failed", "Password and Confirm Password do not match"));
            } else {
                this.getSelected().setUser_password(Security.Encrypt(this.getSelected().getUser_password()));
                super.save(id);
            }
        } else {
            super.save(id);
        }
    }

    public User_detail getUser_detail_by_ID(int udi) {
        User_detail ud = new User_detail();
        try {
            ud = User_detail.getUser_detailByORMID(udi);
        } catch (PersistentException ex) {
            ud = null;
            //Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ud;
    }

    /**
     *
     * @return the CurrentPassword
     */
    public String getCurrentPassword() {
        return CurrentPassword;
    }

    /**
     *
     * @param CurrentPassword the CurrentPassword to set
     */
    public void setCurrentPassword(String CurrentPassword) {
        this.CurrentPassword = CurrentPassword;
    }

    /**
     *
     * @return the NewPassword
     */
    public String getNewPassword() {
        return NewPassword;
    }

    /**
     *
     * @param NewPassword the NewPassword to set
     */
    public void setNewPassword(String NewPassword) {
        this.NewPassword = NewPassword;
    }

    /**
     *
     * @return the ConfirmPassword
     */
    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    /**
     *
     * @param ConfirmPassword the COnfirmPassword to set
     */
    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }

}
