/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;

/**
 *
 * @author A0V2WZZ
 */
public class UICustomTableRowGroup extends UIInput {

    public String returnValueBindingAsString(String attr) {
        ValueBinding valueBinding = getValueBinding(attr);
        if (valueBinding != null) {
            return (String) valueBinding.getValue(this.getFacesContext());
        } else {
            return null;
        }
    }
    private String id = null;
    private String sourceData = null;
    private String sourceVar = null;
    private String binding = null;
    private String footerText = null;
    private String headerText = null;
    private String selected = null;
    private String selectMultipleToggleButton = null;
    private String groupToggleButton = null;

    public Object saveState(FacesContext context) {
        Object[] values = new Object[13];
        values[0] = super.saveState(context);
        values[1] = id;
        values[2] = sourceData;
        values[3] = sourceVar;
        values[4] = binding;
        values[5] = footerText;
        values[6] = headerText;
        values[7] = selected;
        values[8] = selectMultipleToggleButton;
        values[9] = groupToggleButton;

        return (values);
    }

    public String getFamily() {
        return ("CustomTableRowGroup");
    }
    public void restoreState(FacesContext context, Object state) {
        Object[] values = (Object[]) state;
        super.restoreState(context, values[0]);
        id = (String) values[1];
        sourceData = (String) values[2];
        sourceVar = (String) values[3];
        binding = (String) values[4];
        footerText = (String) values[5];
        headerText = (String) values[6];
        selected = (String) values[7];
        selectMultipleToggleButton = (String) values[8];
        groupToggleButton = (String) values[9];
    }

    /**
     * @return the id
     */
    public String getId() {
        if (null != id) {
            return id;
        }
        return returnValueBindingAsString("id");
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the sourceData
     */
    public String getSourceData() {
        if (null != sourceData) {
            return sourceData;
        }
        return returnValueBindingAsString("sourceData");
    }

    /**
     * @param sourceData the sourceData to set
     */
    public void setSourceData(String sourceData) {
        this.sourceData = sourceData;
    }

    /**
     * @return the sourceVar
     */
    public String getSourceVar() {
        if (null != sourceVar) {
            return sourceVar;
        }
        return returnValueBindingAsString("sourceVar");
    }

    /**
     * @param sourceVar the sourceVar to set
     */
    public void setSourceVar(String sourceVar) {
        this.sourceVar = sourceVar;
    }

    /**
     * @return the binding
     */
    public String getBinding() {
        if (null != binding) {
            return binding;
        }
        return returnValueBindingAsString("binding");
    }

    /**
     * @param binding the binding to set
     */
    public void setBinding(String binding) {
        this.binding = binding;
    }

    /**
     * @return the footerText
     */
    public String getFooterText() {
        if (null != footerText) {
            return footerText;
        }
        return returnValueBindingAsString("footerText");
    }

    /**
     * @param footerText the footerText to set
     */
    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    /**
     * @return the headerText
     */
    public String getHeaderText() {
        if (null != headerText) {
            return headerText;
        }
        return returnValueBindingAsString("headerText");
    }

    /**
     * @param headerText the headerText to set
     */
    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    /**
     * @return the selected
     */
    public String getSelected() {
        if (null != selected) {
            return selected;
        }
        return returnValueBindingAsString("selected");
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(String selected) {
        this.selected = selected;
    }

    /**
     * @return the selectMultipleToggleButton
     */
    public String getSelectMultipleToggleButton() {
        if (null != selectMultipleToggleButton) {
            return selectMultipleToggleButton;
        }
        return returnValueBindingAsString("selectMultipleToggleButton");
    }

    /**
     * @param selectMultipleToggleButton the selectMultipleToggleButton to set
     */
    public void setSelectMultipleToggleButton(String selectMultipleToggleButton) {
        this.selectMultipleToggleButton = selectMultipleToggleButton;
    }

    /**
     * @return the groupToggleButton
     */
    public String getGroupToggleButton() {
        if (null != groupToggleButton) {
            return groupToggleButton;
        }
        return returnValueBindingAsString("groupToggleButton");
    }

    /**
     * @param groupToggleButton the groupToggleButton to set
     */
    public void setGroupToggleButton(String groupToggleButton) {
        this.groupToggleButton = groupToggleButton;
    }
}