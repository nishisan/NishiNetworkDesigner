/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nishisan.designer.scene;

import com.nishisan.designer.objects.CmdbEdgeWidget;
import com.nishisan.designer.objects.CmdbNodeWidget;
import org.netbeans.api.visual.graph.GraphScene;
import org.netbeans.api.visual.widget.Widget;

/**
 * Classe que representa o Top Component que motra o Map para Exibição
 * @author Lucas
 */
public class MapEditor extends GraphScene<CmdbNodeWidget, CmdbEdgeWidget> {
     
    @Override
    protected Widget attachNodeWidget(CmdbNodeWidget n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Widget attachEdgeWidget(CmdbEdgeWidget e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void attachEdgeSourceAnchor(CmdbEdgeWidget e, CmdbNodeWidget n, CmdbNodeWidget n1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void attachEdgeTargetAnchor(CmdbEdgeWidget e, CmdbNodeWidget n, CmdbNodeWidget n1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
