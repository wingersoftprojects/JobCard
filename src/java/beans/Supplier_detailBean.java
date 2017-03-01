/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.logging.Level;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import models.Customer_detail;
import models.Supplier_detail;
import org.orm.PersistentException;

/**
 *
 * @author philp
 */
@ManagedBean
@SessionScoped
public class Supplier_detailBean extends AbstractBean<Supplier_detail> implements Serializable{
    
    public Supplier_detailBean(){
        super(Supplier_detail.class);
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
     public Supplier_detail getSupplier_detail_by_ID(int sdi) {
        Supplier_detail sd = new Supplier_detail();
        try {
            sd = Supplier_detail.getSupplier_detailByORMID(sdi);
        } catch (PersistentException ex) {
            sd = null;
            //Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sd;
    }
}
