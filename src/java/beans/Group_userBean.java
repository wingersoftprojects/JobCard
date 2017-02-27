/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import models.Group_user;

/**
 *
 * @author philp
 */
@ManagedBean
@RequestScoped
public class Group_userBean extends AbstractBean<Group_user> implements Serializable {

    /**
     * Creates a new instance of Group_userBean
     */
    public Group_userBean() {
        super(Group_user.class);
    }
    public void init(){
        if(super.getEntityClass()==null){
            loginBean.logout();
        }
    }
    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }
    
}
