/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nishisan.designer.log;

import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;

/**
 * Nishi Network Designer Default Logger...
 *
 * @author Lucas
 */
public class NNDLogger {

    private static final InputOutput io = IOProvider.getDefault().getIO("Log", true);

    public static void Debug(String msg) {
    }

}
