/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import models.Contact_person_detail;
import org.orm.PersistentException;

/**
 *
 * @author philp
 */
@FacesConverter(value = "contact_person_detailConverter")
public class Contact_person_detailConverter implements Converter {

    public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        int id = 0;
        try {
            id = Integer.parseInt(string);
        } catch (NumberFormatException nfe) {

        }
        Contact_person_detail object = null;
        try {
            object = Contact_person_detail.getContact_person_detailByORMID(id);
        } catch (PersistentException ex) {
            Logger.getLogger(Contact_person_detailConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return object;
    }

    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Contact_person_detail) {
            Contact_person_detail o = (Contact_person_detail) object;
            return String.valueOf(o.getContact_person_detail_id());
        } else {
            throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: models.Contact_person_detail");
        }
    }
}
