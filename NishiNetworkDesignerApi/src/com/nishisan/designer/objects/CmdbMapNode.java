/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nishisan.designer.objects;

import com.nishisan.designer.dto.CmdbMap;
import com.nishisan.designer.dto.CmdbMapChildFactory;
import javafx.event.Event;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.nodes.PropertySupport;
import org.openide.nodes.Sheet;
import org.openide.util.Exceptions;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author Lucas
 */
public class CmdbMapNode extends AbstractNode {

    public CmdbMapNode(CmdbMap children) {
        super(Children.create(new CmdbMapChildFactory(), true), Lookups.singleton(children));
        setDisplayName("Event");
    }

    public CmdbMapNode() {
        super(Children.create(new CmdbMapChildFactory(), true));
        setDisplayName("Root");
    }

    @Override
    protected Sheet createSheet() {
        Sheet sheet = Sheet.createDefault();
        Sheet.Set set = Sheet.createPropertiesSet();
        CmdbMap obj = getLookup().lookup(CmdbMap.class);
        try {
            Property indexProp = new PropertySupport.Reflection(obj, Integer.class, "getIndex", null);
            indexProp.setName("Index");
            set.put(indexProp);
        } catch (NoSuchMethodException ex) {
            Exceptions.printStackTrace(ex);
        }
        sheet.put(set);
        return sheet;
    }

    @Override
    public String getHtmlDisplayName() {
        CmdbMap obj = getLookup().lookup(CmdbMap.class);
        if (obj != null && obj.getIndex() % 2 != 0) {
            return "<font color='0000FF'>Event " + obj.getIndex() + "</font>";
        } else {
            return null;
        }
    }

}
