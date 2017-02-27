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
import models.Group_detail;

/**
 *
 * @author philp
 */
@ManagedBean
@RequestScoped
public class Group_detailBean extends AbstractBean<Group_detail> implements Serializable {

    /**
     * Creates a new instance of Group_detailBean
     */
    public Group_detailBean() {
        super(Group_detail.class);
    }
    @Override
    public void init(){
        if(super.getEntityClass() ==null){
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
