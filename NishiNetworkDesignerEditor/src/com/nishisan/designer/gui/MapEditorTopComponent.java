/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nishisan.designer.gui;

import com.nishisan.designer.scene.MapEditor;
import java.awt.BorderLayout;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.Lookup;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//com.nishisan.designer.gui//MapEditor//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "MapEditorTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "com.nishisan.designer.gui.MapEditorTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_MapEditorAction",
        preferredID = "MapEditorTopComponent"
)
@Messages({
    "CTL_MapEditorAction=MapEditor",
    "CTL_MapEditorTopComponent=MapEditor Window",
    "HINT_MapEditorTopComponent=This is a MapEditor window"
})
public final class MapEditorTopComponent extends TopComponent {

    public MapEditorTopComponent() {
        initComponents();
        setName(Bundle.CTL_MapEditorTopComponent());
        setToolTipText(Bundle.HINT_MapEditorTopComponent());
        this.createSceneEditorAndSatelliteView();
        
    }

    /**
     * Cria o scene editor padrão e o satellite view do mesmo..
     */
    private void createSceneEditorAndSatelliteView() {
        setLayout(new BorderLayout());
        MapEditor editor = new MapEditor();
        add(editor.createView(), BorderLayout.CENTER);
        SatelliteViewTopComponent satelliteViewCmp = (SatelliteViewTopComponent) WindowManager.getDefault().findTopComponent("SatelliteViewTopComponent");
        if (satelliteViewCmp != null) {
            satelliteViewCmp.setLayout(new BorderLayout());
            satelliteViewCmp.add(editor.createSatelliteView(), BorderLayout.CENTER);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}
