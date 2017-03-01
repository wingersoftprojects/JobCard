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
import models.Delivery_note;
import org.orm.PersistentException;

/**
 *
 * @author bajuna
 */
@FacesConverter(value = "delivery_noteConverter")
public class Delivery_noteConverter implements Converter {

    public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        int id = 0;
        try {
            id = Integer.parseInt(string);
        } catch (NumberFormatException nfe) {

        }
        Delivery_note object = null;
        try {
            object = Delivery_note.getDelivery_noteByORMID(id);
        } catch (PersistentException ex) {
            Logger.getLogger(Delivery_noteConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return object;
    }

    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Delivery_note) {
            Delivery_note o = (Delivery_note) object;
            return String.valueOf(o.getDelivery_note_id());
        } else {
            throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: models.Delivery_note");
        }
    }
}
