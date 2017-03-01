/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import connections.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import models.Group_right;
import models.Login_session;
import models.User_detail;
import org.orm.PersistentException;
import org.orm.PersistentManager;
import utilities.GeneralUtilities;
import utilities.Security;

/**
 *
 * @author philp
 */
@ManagedBean
@SessionScoped
public class LoginBean {

    private String username;
    private String password;
    private boolean isloggedin = false;
    private String action = "login";
    private String messageString = "";
    private String login_session_id;
    private User_detail user_detail;
    private PersistentManager _instance;
    private List<Group_right> group_rights;

    public PersistentManager getInstance() {
        return _instance;
    }

    public void setInstance(PersistentManager _instance) {
        this._instance = _instance;
    }

    public LoginBean() {
        try {
            this.setUser_detail(User_detail.getUser_detailByORMID(1));
        } catch (PersistentException ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsloggedin() {
        return isloggedin;
    }

    public void setIsloggedin(boolean isloggedin) {
        this.isloggedin = isloggedin;
    }

    public void login() {
        user_detail = null;
        setIsloggedin(false);
        try {
            user_detail = User_detail.loadUser_detailByQuery("is_deleted =0 and is_active =1 and user_name ='" + username + "'", null);
        } catch (PersistentException ex) {
            GeneralUtilities.clearsession();
        } catch (Exception e) {
            GeneralUtilities.clearsession();
        }
        if (user_detail != null) {
            if (Security.Decrypt(user_detail.getUser_password()).equals(password)) {
                setIsloggedin(true);
            } else {
                setIsloggedin(false);
            }
        } else {
            setIsloggedin(false);
        }

        //get group_rights of this user
        try {
            this.setGroup_rights(new Group_rightBean().getActiveGroup_rightListByUser(user_detail));

        } catch (NullPointerException npe) {
            this.setGroup_rights(null);
        }
        if (isloggedin) {
            setIsloggedin(true);
            messageString = "";
            //create session
            FacesContext context = FacesContext.getCurrentInstance();
            HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
            HttpSession httpSession = request.getSession(true);

            //first delete all un-logged out sessions of this user that are older than 12 hours
            new Login_sessionBean().deleteOldUnloggedOutSessions(user_detail.getUser_detail_id());

            //-------add login session to the database--
            Login_session ls = new Login_session();
            ls.setUser_detail(user_detail);
            ls.setSession_id(FacesContext.getCurrentInstance().getExternalContext().getSessionId(false));
            login_session_id = ls.getSession_id();
            String aRemoteIp = "";
            String aRemoteHost = "";
            String aRemoteUser = "";
            aRemoteIp = request.getHeader("X-FORWARDED-FOR");

            if (aRemoteIp == null) {
                aRemoteIp = request.getRemoteAddr();
            }
            ls.setRemote_ip(aRemoteIp);
            try {
                aRemoteHost = request.getRemoteHost();
                if (aRemoteHost == null) {
                    aRemoteHost = "";
                }
            } catch (NullPointerException npe) {
                aRemoteHost = "";
            }
            ls.setRemote_host(aRemoteHost);
            try {
                aRemoteUser = request.getRemoteUser();
                if (aRemoteUser == null) {
                    aRemoteUser = "";
                }
            } catch (NullPointerException npe) {
                aRemoteUser = "";
            }
            ls.setRemote_user(aRemoteUser);

            Login_sessionBean lsb = new Login_sessionBean();
            lsb.setSelected(ls);
            lsb.save(user_detail);

            ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler) context.getApplication().getNavigationHandler();
            nav.performNavigation("user_detail?faces-redirect=true");

        } else {
            messageString = "Invalid Login Details Submitted!";
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("JOBCARD Login Failure", messageString));
        }
    }

    public Connection getMySQLConnection() {
        Connection conn = null;
        try {
            Class.forName(DBConnection.getMySQL_JDBC_DRIVER());
            conn = DriverManager.getConnection(DBConnection.getMySQL_DB_URL(), DBConnection.getMySQL_USER(), DBConnection.getMySQL_PASSWORD());
        } catch (ClassNotFoundException | SQLException e) {
        }
        return conn;
    }

    public boolean IsAllowed(String group_right_function, String role) {
        try {
            return new Group_rightBean().IsUserGroupsFormAccessAllowed(this.getUser_detail(), this.getGroup_rights(), group_right_function, role) != 0;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public String getMessageString() {
        return messageString;
    }

    public void setMessageString(String messageString) {
        this.messageString = messageString;
    }

    public String logout() {
        return "login?faces-redirect=true";
    }

    public void redirectifnotloggedin() {
        if (!isloggedin) {
            logout();
            FacesContext fc = FacesContext.getCurrentInstance();
            ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler) fc.getApplication().getNavigationHandler();
            nav.performNavigation("login?faces-redirect=true");

        }
    }

    public void saveMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Completed Successfully", "Completed Successfully"));
    }

    /**
     *
     * @return user_detail
     */
    public User_detail getUser_detail() {
        return user_detail;
    }

    /**
     *
     * @param user_detail the user_detail to set
     */
    public void setUser_detail(User_detail user_detail) {
        this.user_detail = user_detail;
    }

    public List<Group_right> getGroup_rights() {
        return group_rights;
    }

    public void setGroup_rights(List<Group_right> group_rights) {
        this.group_rights = group_rights;
    }

}
