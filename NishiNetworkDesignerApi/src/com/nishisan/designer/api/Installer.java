/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nishisan.designer.api;

import com.nishisan.designer.log.NetbeansConsoleAppender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.Priority;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {

    private final Logger logger = Logger.getLogger(Installer.class);

    @Override
    public void restored() {
        configureLoggingSystem();
        logger.debug("System Log Configured...");
    }

    private void configureLoggingSystem() {
//        BasicConfigurator.configure();
//        NetbeansConsoleAppender logAppender = new NetbeansConsoleAppender();
//        logAppender.setName("Default");
//        logAppender.setLayout(new PatternLayout("[%5p] - %d{dd/MM/yyyy HH:mm:ss} - (%C) - %m%n"));
//
//        Logger.getRootLogger().setLevel(Level.DEBUG);
//        Logger.getRootLogger().addAppender(logAppender);

    }

}
