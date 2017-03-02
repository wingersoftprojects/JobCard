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
import models.Cover_type;
import org.orm.PersistentException;

/**
 *
 * @author bajuna
 */
@FacesConverter(value = "cover_typeConverter")
public class Cover_typeConverter implements Converter {

    public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        int id = 0;
        try {
            id = Integer.parseInt(string);
        } catch (NumberFormatException nfe) {

        }
        Cover_type object = null;
        try {
            object = Cover_type.getCover_typeByORMID(id);
        } catch (PersistentException ex) {
            Logger.getLogger(Cover_typeConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return object;
    }

    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Cover_type) {
            Cover_type o = (Cover_type) object;
            return String.valueOf(o.getCover_type_id());
        } else {
            throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: models.Cover_type");
        }
    }
}
