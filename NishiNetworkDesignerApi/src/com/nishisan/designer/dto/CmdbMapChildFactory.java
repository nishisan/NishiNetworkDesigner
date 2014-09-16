/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nishisan.designer.dto;

import com.nishisan.designer.objects.CmdbMapNode;
import java.util.Arrays;
import java.util.List;
import javafx.event.Event;
import org.apache.log4j.Logger;
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
    
    private final Logger logger = Logger.getLogger(CmdbMapChildFactory.class);
    
    @Override
    protected boolean createKeys(List<CmdbMap> toPopulate) {
        CmdbMap[] objs = new CmdbMap[5];
        for (int i = 0; i < objs.length; i++) {
            objs[i] = new CmdbMap();
            logger.debug("Created Node...");
        }
        toPopulate.addAll(Arrays.asList(objs));
        return true;
    }
    
    @Override
    protected Node createNodeForKey(CmdbMap key) {
//        Node result = new AbstractNode(
//                Children.create(new CmdbMapChildFactory(), true),
//                Lookups.singleton(key));
//        result.setDisplayName(key.toString());
//        return result;
        return new CmdbMapNode(key);
    }
    
}
