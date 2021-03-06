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
import models.Job_card;
import org.orm.PersistentException;

/**
 *
 * @author bajuna
 */
@FacesConverter(value = "job_cardConverter")
public class Job_cardConverter implements Converter {
       public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        int id = 0;
        try {
            id = Integer.parseInt(string);
        } catch (NumberFormatException nfe) {

        }
        Job_card object = null;
        try {
            object = Job_card.getJob_cardByORMID(id);
        } catch (PersistentException ex) {
            Logger.getLogger(Job_cardConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return object;
    }

    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Job_card) {
            Job_card o = (Job_card) object;
            return String.valueOf(o.getJob_card_id());
        } else {
            throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: models.Job_card");
        }
    }
}
