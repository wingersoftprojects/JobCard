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
import models.Supplier_detail;
import org.orm.PersistentException;

/**
 *
 * @author bajuna
 */
@FacesConverter(value = "supplier_detailConverter")
public class Supplier_detailConverter implements Converter {
       public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        int id = 0;
        try {
            id = Integer.parseInt(string);
        } catch (NumberFormatException nfe) {

        }
        Supplier_detail object = null;
        try {
            object = Supplier_detail.getSupplier_detailByORMID(id);
        } catch (PersistentException ex) {
            Logger.getLogger(Supplier_detailConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return object;
    }

    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Supplier_detail) {
            Supplier_detail o = (Supplier_detail) object;
            return String.valueOf(o.getSupplier_detail_id());
        } else {
            throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: models.Supplier_detail");
        }
    }
}
