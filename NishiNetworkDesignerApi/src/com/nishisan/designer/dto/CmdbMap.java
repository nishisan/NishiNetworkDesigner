/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nishisan.designer.dto;

import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author Lucas
 */
public class CmdbMap extends AbstractNode {

    public CmdbMap(Children children) {
        super(Children.create(new CmdbMapChildFactory(), true), Lookups.singleton(children));
        setDisplayName("Event ");
    }

    public CmdbMap() {
        super(Children.create(new CmdbMapChildFactory(), true));
        setDisplayName("Root");

    }
}
