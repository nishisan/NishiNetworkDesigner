/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nishisan.designer.scene;

import com.nishisan.designer.objects.CmdbConnectionWidget;
import com.nishisan.designer.objects.CmdbNodeWidget;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.datatransfer.Transferable;
import java.awt.image.BufferedImage;
import org.apache.log4j.Logger;
import org.netbeans.api.visual.action.AcceptProvider;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.action.ConnectorState;
import org.netbeans.api.visual.graph.GraphScene;
import org.netbeans.api.visual.widget.EventProcessingType;
import org.netbeans.api.visual.widget.LayerWidget;
import org.netbeans.api.visual.widget.Widget;
import org.openide.util.ImageUtilities;

/**
 * Classe que representa o Top Component que motra o Map para Exibição
 *
 * @author Lucas
 */
public class MapEditor extends GraphScene<CmdbNodeWidget, CmdbConnectionWidget> {

    private LayerWidget mainLayer = new LayerWidget(this);

    private final LayerWidget connectionLayer = new LayerWidget(this);
    private final LayerWidget interractionLayer = new LayerWidget(this);
    private final LayerWidget backgroundLayer = new LayerWidget(this);
    private final Logger logger = Logger.getLogger(MapEditor.class);

    public MapEditor() {
        addChild(backgroundLayer);
        addChild(mainLayer);
        addChild(connectionLayer);
        addChild(interractionLayer);
        setKeyEventProcessingType(EventProcessingType.FOCUSED_WIDGET_AND_ITS_CHILDREN);
        setEnabled(true);
        initGrids();
        getActions().addAction(ActionFactory.createAcceptAction(new AcceptProvider() {
            @Override
            public ConnectorState isAcceptable(Widget widget, Point point, Transferable t) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                return ConnectorState.ACCEPT;
            }

            @Override
            public void accept(Widget widget, Point point, Transferable t) {
                logger.debug(widget);
            }
        }));

    }

    private void initGrids() {
        Image sourceImage = ImageUtilities.loadImage("com/nishisan/designer/icons/paper_grid17.png");
        int width = sourceImage.getWidth(null);
        int height = sourceImage.getHeight(null);
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        graphics.drawImage(sourceImage, 0, 0, null);
        graphics.dispose();
        TexturePaint PAINT_BACKGROUND = new TexturePaint(image, new Rectangle(0, 0, width, height));
        setBackground(PAINT_BACKGROUND);
        repaint();
        revalidate(false);
        validate();
    }

    @Override
    protected Widget attachNodeWidget(CmdbNodeWidget n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Widget attachEdgeWidget(CmdbConnectionWidget e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void attachEdgeSourceAnchor(CmdbConnectionWidget e, CmdbNodeWidget n, CmdbNodeWidget n1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void attachEdgeTargetAnchor(CmdbConnectionWidget e, CmdbNodeWidget n, CmdbNodeWidget n1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
