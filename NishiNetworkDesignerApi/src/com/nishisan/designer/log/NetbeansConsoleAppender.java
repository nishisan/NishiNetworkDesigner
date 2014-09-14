/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nishisan.designer.log;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;

/**
 *
 * @author Lucas
 */
public class NetbeansConsoleAppender extends AppenderSkeleton {

    private static final InputOutput io = IOProvider.getDefault().getIO("Log", true);

    @Override
    protected void append(LoggingEvent event) {
        io.getOut().print(this.layout.format(event));
    }

    @Override
    public void close() {
        //faz algo..
    }

    @Override
    public boolean requiresLayout() {
        return true;
    }

}
