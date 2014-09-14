/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nishisan.designer.log;

import org.apache.log4j.Logger;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;

/**
 * Nishi Network Designer Default Logger...
 *
 * @author Lucas
 */
public class NNDLogger {

    private static final InputOutput io = IOProvider.getDefault().getIO("Log", true);
    
    /**
     * Debug Level =0
     *
     * @param msg
     */
    public static void debug(String msg) {
        
    }

    /**
     * Debug Level =0
     *
     * @param msg
     */
    public static void info(String msg) {
        io.getOut().println(msg);
    }

}
