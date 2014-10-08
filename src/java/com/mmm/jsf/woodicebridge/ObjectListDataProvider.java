/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmm.jsf.woodicebridge;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A0V2WZZ
 */
public class ObjectListDataProvider {

    private List tableDisplayList = new ArrayList();

    /**
     * @return the tableDisplayList
     */
    public List getTableDisplayList() {
        return tableDisplayList;
    }

    public void setList(List tableDisplayList) {
        this.tableDisplayList = tableDisplayList;
    }
}
