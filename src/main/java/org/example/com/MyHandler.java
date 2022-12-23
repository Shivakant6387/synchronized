package org.example.com;

import org.example.LogHandler;

import java.io.IOException;
import java.util.logging.*;

public class MyHandler {
    public static Logger LOGGER = Logger.getLogger(LogHandler.class.getName());
    public static ConsoleHandler CONSOLE_HANDLER = new ConsoleHandler();
    ;
    public static Handler FILE_HANDLER;

    static {
        LOGGER.setUseParentHandlers(false);
        LOGGER.setLevel(Level.ALL);

        try {
            //file handler
            FILE_HANDLER = new FileHandler("data/logs/log", 20000, 10);
            //FILE_HANDLER.setFormatter(new LineFormat());
            FILE_HANDLER.setLevel(Level.ALL);

            //console handler
           // CONSOLE_HANDLER.setFormatter(new colorFormat());
            CONSOLE_HANDLER.setLevel(Level.ALL);

            //add custom handlers
            LOGGER.addHandler(FILE_HANDLER);
            LOGGER.addHandler(CONSOLE_HANDLER);

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }
}
