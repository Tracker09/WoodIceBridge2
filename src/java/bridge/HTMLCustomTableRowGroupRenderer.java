/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.component.UIData;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

/**
 *
 * @author A0V2WZZ
 */
public class HTMLCustomTableRowGroupRenderer {

    public void decode(FacesContext context, UIComponent component) {
        if ((context == null) || (component == null)) {
            throw new NullPointerException();
        }
        UICustomTableRowGroup aUICustomTableRowGroup = null;
        if (component instanceof UICustomTableRowGroup) {
            aUICustomTableRowGroup = (UICustomTableRowGroup) component;
        } else {
            return;
        }
        Map map = context.getExternalContext().getRequestParameterMap();
    
    }

    public void setSubmittedValue(UIComponent component, Object obj) {

        if (component instanceof UIInput) {
            ((UIInput) component).setSubmittedValue(obj);
        }
    }


    private UIComponent getParentDataTableFromHierarchy(UIComponent uiComponent) {
        if (uiComponent == null) {
            return null;
        }
        if (uiComponent instanceof UIData) {
            return uiComponent;
        } else {
            //try to find recursively in the Component tree hierarchy
            return getParentDataTableFromHierarchy(uiComponent.getParent());
        }
    }
}
