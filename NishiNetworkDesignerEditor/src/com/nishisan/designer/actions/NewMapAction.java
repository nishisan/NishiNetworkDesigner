/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nishisan.designer.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.apache.log4j.Logger;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "com.nishisan.designer.actions.NewMapAction"
)
@ActionRegistration(
        iconBase = "com/nishisan/designer/gui/icons/new-map.png",
        displayName = "#CTL_NewMapAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1300, separatorAfter = 1350),
    @ActionReference(path = "Toolbars/File", position = 300)
})
@Messages("CTL_NewMapAction=New Map")
public final class NewMapAction implements ActionListener {
    
    private final Logger logger = Logger.getLogger(NewMapAction.class);
    
    @Override
    public void actionPerformed(ActionEvent e) {
        logger.debug("NewMapAction Called....");
    }
}
