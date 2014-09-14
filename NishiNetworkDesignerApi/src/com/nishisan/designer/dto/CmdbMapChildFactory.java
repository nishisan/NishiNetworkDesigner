/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nishisan.designer.dto;

import java.util.Arrays;
import java.util.List;
import javafx.event.Event;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author Lucas
 */
public class CmdbMapChildFactory extends ChildFactory<CmdbMap> {

    @Override
    protected boolean createKeys(List<CmdbMap> list) {
        CmdbMap[] objs = new CmdbMap[5];
        for (int i = 0; i < objs.length; i++) {
            objs[i] = new CmdbMap();
        }
        //toPopulate.addAll(Arrays.asList(objs));
        return true;
    }

}
