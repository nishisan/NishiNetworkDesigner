/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nishisan.designer;

import org.apache.log4j.Logger;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {
    
    private final Logger logger = Logger.getLogger(Installer.class);
    
    @Override
    public void restored() {
        logger.debug("Editor Module Loaded..");
    }
    
}
