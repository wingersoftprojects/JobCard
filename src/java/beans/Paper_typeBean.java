/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import models.Paper_type;

/**
 *
 * @author philp
 */
@ManagedBean
@SessionScoped
public class Paper_typeBean extends AbstractBean<Paper_type> implements Serializable{
    
    public Paper_typeBean(){
        super(Paper_type.class);
    }
    @Override
    public void init(){
        if(super.getEntityClass() == null){
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
