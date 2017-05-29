/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import models.Delivery_note;
import models.JobCardPersistentManager;
import models.Job_card;
import models.User_detail;
import org.orm.PersistentTransaction;

/**
 *
 * @author philp
 */
@ManagedBean
@RequestScoped
public class Delivery_noteBean extends AbstractBean<Delivery_note> implements Serializable {

    public Delivery_noteBean() {
    }

    @Override
    public void init() {
        if (super.getEntityClass() == null) {
            loginBean.logout();
        }
    }
    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public LoginBean getLoginBean() {
        return loginBean;
    }

}
