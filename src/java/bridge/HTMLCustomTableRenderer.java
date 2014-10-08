/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import java.io.IOException;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.component.UIData;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.Renderer;

/**
 *
 * @author A0V2WZZ
 */
public class HTMLCustomTableRenderer extends Renderer {

    public void decode(FacesContext context, UIComponent component) {
        if ((context == null) || (component == null)) {
            throw new NullPointerException();
        }
        UICustomTable aUICustomTable = null;
        if (component instanceof UICustomTable) {
            aUICustomTable = (UICustomTable) component;
        } else {
            return;
        }
        Map map = context.getExternalContext().getRequestParameterMap();
        String name = getName(aUICustomTable, context);
        if (map.containsKey(name)) {
            String value = (String) map.get(name);
            if (value != null) {
                setSubmittedValue(component, value);
            }
        }
    }

    public void setSubmittedValue(UIComponent component, Object obj) {

        if (component instanceof UIInput) {
            ((UIInput) component).setSubmittedValue(obj);
        }
    }

    private String getName(UICustomTable aUICustomTable,
            FacesContext context) {

        UIComponent parentUIComponent =
                getParentDataTableFromHierarchy(aUICustomTable);
        if (parentUIComponent == null) {
            return aUICustomTable.getClientId(context);
        } else {
            if (aUICustomTable.getOverrideName() != null &&
                    aUICustomTable.getOverrideName().equals("true")) {
                return aUICustomTable.getName();
            } else {
                String id = aUICustomTable.getClientId(context);
                int lastIndexOfColon = id.lastIndexOf(":");
                String partName = "";
                if (lastIndexOfColon != -1) {
                    partName = id.substring(0, lastIndexOfColon + 1);
                    if (aUICustomTable.getName() == null) {
                        partName = partName + "generatedRad";
                    } else {
                        partName = partName + aUICustomTable.getName();
                    }
                }
                return partName;
            }
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

    public void encodeEnd(FacesContext context, UIComponent component)
            throws IOException {
        if ((context == null) || (component == null)) {
            throw new NullPointerException();
        }


        UICustomTable aUICustomTable =
                (UICustomTable) component;

        if (component.isRendered()) {
            ResponseWriter writer = context.getResponseWriter();

            writer.write("<input type=\"radio\"");

            writer.write(" id=\"" + component.getClientId(context) + "\"");
            writer.write(" name=\"" + getName(aUICustomTable, context) + "\"");
            if (aUICustomTable.getStyleClass() != null &&
                    aUICustomTable.getStyleClass().trim().length() > 0) {
                writer.write(" class=\"" +
                        aUICustomTable.getStyleClass().trim() + "\"");
            }
            if (aUICustomTable.getStyle() != null &&
                    aUICustomTable.getStyle().trim().length() > 0) {
                writer.write(" style=\"" +
                        aUICustomTable.getStyle().trim() + "\"");
            }
            if (aUICustomTable.getDisabled() != null &&
                    aUICustomTable.getDisabled().trim().length() > 0 &&
                    aUICustomTable.getDisabled().trim().equals("true")) {
                writer.write(" disabled=\"disabled\"");
            }
            if (aUICustomTable.getItemValue() != null) {
                writer.write(" value=\"" +
                        aUICustomTable.getItemValue().trim() + "\"");
            }
            if (aUICustomTable.getOnClick() != null &&
                    aUICustomTable.getOnClick().trim().length() > 0) {
                writer.write(" onclick=\"" +
                        aUICustomTable.getOnClick().trim() + "\"");
            }
            if (aUICustomTable.getOnMouseOver() != null &&
                    aUICustomTable.getOnMouseOver().trim().length() > 0) {
                writer.write(" onmouseover=\"" +
                        aUICustomTable.getOnMouseOver().trim() + "\"");
            }
            if (aUICustomTable.getOnMouseOut() != null &&
                    aUICustomTable.getOnMouseOut().trim().length() > 0) {
                writer.write(" onmouseout=\"" +
                        aUICustomTable.getOnMouseOut().trim() + "\"");
            }
            if (aUICustomTable.getOnFocus() != null &&
                    aUICustomTable.getOnFocus().trim().length() > 0) {
                writer.write(" onfocus=\"" + aUICustomTable.getOnFocus().trim() + "\"");
            }
            if (aUICustomTable.getOnBlur() != null &&
                    aUICustomTable.getOnBlur().trim().length() > 0) {
                writer.write(" onblur=\"" + aUICustomTable.getOnBlur().trim() + "\"");
            }

            if (aUICustomTable.getValue() != null &&
                    aUICustomTable.getValue().equals(
                    aUICustomTable.getItemValue())) {
                writer.write(" checked=\"checked\"");
            }
            writer.write(">");
            if (aUICustomTable.getItemLabel() != null) {
                writer.write(aUICustomTable.getItemLabel());
            }
            writer.write("</input>");
        }
    }
}
