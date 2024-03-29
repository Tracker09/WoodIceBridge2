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
public class UICustomTable extends UIInput {

    public String returnValueBindingAsString(String attr) {
        ValueBinding valueBinding = getValueBinding(attr);
        if (valueBinding != null) {
            return (String) valueBinding.getValue(this.getFacesContext());
        } else {
            return null;
        }
    }
    private String name = null;
    private String overrideName = null;
    private String styleClass = null;
    private String style = null;
    private String disabled = null;
    private String itemLabel = null;
    private String itemValue = null;
    private String onClick = null;
    private String onMouseOver = null;
    private String onMouseOut = null;
    private String onFocus = null;
    private String onBlur = null;
    private String title = null;
    private String clearSortButton = null;
    private String deselectMultipleButton = null;
    private String deselectSingleButton = null;
    private String paginateButton = null;
    private String paginationControls = null;
    private String selectMultipleButton = null;
    private String sortPanelToggleButton = null;

    /**•
     * @return
     */
    public String getDisabled() {
        if (null != disabled) {
            return disabled;
        }
        return returnValueBindingAsString("disabled");
    }

    /**
     * @return
     */
    public String getItemLabel() {
        if (null != itemLabel) {
            return itemLabel;
        }
        return returnValueBindingAsString("itemLabel");
    }

    /**
     * @return
     */
    public String getItemValue() {
        if (null != itemValue) {
            return itemValue;
        }
        return returnValueBindingAsString("itemValue");
    }

    /**
     * @return
     */
    public String getName() {
        if (null != name) {
            return name;
        }
        return returnValueBindingAsString("name");
    }

    /**
     * @return
     */
    public String getOnBlur() {
        if (null != onBlur) {
            return onBlur;
        }
        return returnValueBindingAsString("onBlur");
    }

    /**
     * @return
     */
    public String getOnClick() {
        if (null != onClick) {
            return onClick;
        }
        return returnValueBindingAsString("onClick");
    }

    /**
     * @return
     */
    public String getOnFocus() {
        if (null != onFocus) {
            return onFocus;
        }
        return returnValueBindingAsString("onFocus");
    }

    /**
     * @return
     */
    public String getOnMouseOut() {
        if (null != onMouseOut) {
            return onMouseOut;
        }
        return returnValueBindingAsString("onMouseOut");
    }

    /**
     * @return
     */
    public String getOnMouseOver() {
        if (null != onMouseOver) {
            return onMouseOver;
        }
        return returnValueBindingAsString("onMouseOver");
    }

    /**
     * @return
     */
    public String getOverrideName() {
        if (null != overrideName) {
            return overrideName;
        }
        return returnValueBindingAsString("overrideName");
    }

    /**
     * @return
     */
    public String getStyle() {
        if (null != style) {
            return style;
        }
        return returnValueBindingAsString("style");
    }

    /**
     * @return
     */
    public String getStyleClass() {
        if (null != styleClass) {
            return styleClass;
        }
        return returnValueBindingAsString("styleClass");
    }

    /**
     * @param string
     */
    public void setDisabled(String string) {
        disabled = string;
    }

    /**
     * @param string
     */
    public void setItemLabel(String string) {
        itemLabel = string;
    }

    /**
     * @param string
     */
    public void setItemValue(String string) {
        itemValue = string;
    }

    /**
     * @param string
     */
    public void setName(String string) {
        name = string;
    }

    /**
     * @param string
     */
    public void setOnBlur(String string) {
        onBlur = string;
    }

    /**
     * @param string
     */
    public void setOnClick(String string) {
        onClick = string;
    }

    /**
     * @param string
     */
    public void setOnFocus(String string) {
        onFocus = string;
    }

    /**
     * @param string
     */
    public void setOnMouseOut(String string) {
        onMouseOut = string;
    }

    /**
     * @param string
     */
    public void setOnMouseOver(String string) {
        onMouseOver = string;
    }

    /**
     * @param string
     */
    public void setOverrideName(String string) {
        overrideName = string;
    }

    /**
     * @param string
     */
    public void setStyle(String string) {
        style = string;
    }

    /**
     * @param string
     */
    public void setStyleClass(String string) {
        styleClass = string;
    }

    public Object saveState(FacesContext context) {
        Object[] values = new Object[13];
        values[0] = super.saveState(context);
        values[1] = styleClass;
        values[2] = style;
        values[3] = disabled;
        values[4] = itemLabel;
        values[5] = itemValue;
        values[6] = onClick;
        values[7] = onMouseOver;
        values[8] = onMouseOut;
        values[9] = onFocus;
        values[10] = onBlur;
        values[11] = name;
        values[12] = title;
        values[13] = clearSortButton;
        values[14] = deselectMultipleButton;
        values[15] = deselectSingleButton;
        values[16] = paginateButton;
        values[17] = paginationControls;
        values[18] = selectMultipleButton;
        values[19] = sortPanelToggleButton;

        return (values);
    }

    public void restoreState(FacesContext context, Object state) {
        Object[] values = (Object[]) state;
        super.restoreState(context, values[0]);
        styleClass = (String) values[1];
        style = (String) values[2];
        disabled = (String) values[3];
        itemLabel = (String) values[4];
        itemValue = (String) values[5];
        onClick = (String) values[6];
        onMouseOver = (String) values[7];
        onMouseOut = (String) values[8];
        onFocus = (String) values[9];
        onBlur = (String) values[10];
        name = (String) values[11];
        title = (String) values[12];
        clearSortButton = (String) values[13];
        deselectMultipleButton = (String) values[14];
        deselectSingleButton = (String) values[15];
        paginateButton = (String) values[16];
        paginationControls = (String) values[17];
        selectMultipleButton = (String) values[18];
        sortPanelToggleButton = (String) values[19];
    }

    public String getFamily() {
        return ("CustomTable");
    }

    /**
     * @return the clearSortButton
     */
    public String getClearSortButton() {
        if (null != clearSortButton) {
            return clearSortButton;
        }
        return returnValueBindingAsString("clearSortButton");
    }

    /**
     * @param clearSortButton the clearSortButton to set
     */
    public void setClearSortButton(String clearSortButton) {
        this.clearSortButton = clearSortButton;
    }

    /**
     * @return the deselectMultipleButton
     */
    public String getDeselectMultipleButton() {
        if (null != deselectMultipleButton) {
            return deselectMultipleButton;
        }
        return returnValueBindingAsString("deselectMultipleButton");
    }

    /**
     * @param deselectMultipleButton the deselectMultipleButton to set
     */
    public void setDeselectMultipleButton(String deselectMultipleButton) {
        this.deselectMultipleButton = deselectMultipleButton;
    }

    /**
     * @return the deselectSingleButton
     */
    public String getDeselectSingleButton() {
        if (null != deselectSingleButton) {
            return deselectSingleButton;
        }
        return returnValueBindingAsString("deselectSingleButton");
    }

    /**
     * @param deselectSingleButton the deselectSingleButton to set
     */
    public void setDeselectSingleButton(String deselectSingleButton) {
        this.deselectSingleButton = deselectSingleButton;
    }

    /**
     * @return the paginateButton
     */
    public String getPaginateButton() {
        if (null != paginateButton) {
            return paginateButton;
        }
        return returnValueBindingAsString("paginateButton");
    }

    /**
     * @param paginateButton the paginateButton to set
     */
    public void setPaginateButton(String paginateButton) {
        this.paginateButton = paginateButton;
    }

    /**
     * @return the paginationControls
     */
    public String getPaginationControls() {
        if (null != paginationControls) {
            return paginationControls;
        }
        return returnValueBindingAsString("paginationControls");
    }

    /**
     * @param paginationControls the paginationControls to set
     */
    public void setPaginationControls(String paginationControls) {
        this.paginationControls = paginationControls;
    }

    /**
     * @return the selectMultipleButton
     */
    public String getSelectMultipleButton() {
        if (null != selectMultipleButton) {
            return selectMultipleButton;
        }
        return returnValueBindingAsString("selectMultipleButton");
    }

    /**
     * @param selectMultipleButton the selectMultipleButton to set
     */
    public void setSelectMultipleButton(String selectMultipleButton) {
        this.selectMultipleButton = selectMultipleButton;
    }

    /**
     * @return the sortPanelToggleButton
     */
    public String getSortPanelToggleButton() {
        if (null != sortPanelToggleButton) {
            return sortPanelToggleButton;
        }
        return returnValueBindingAsString("sortPanelToggleButton");
    }

    /**
     * @param sortPanelToggleButton the sortPanelToggleButton to set
     */
    public void setSortPanelToggleButton(String sortPanelToggleButton) {
        this.sortPanelToggleButton = sortPanelToggleButton;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        if (null != title) {
            return title;
        }
        return returnValueBindingAsString("title");
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
}