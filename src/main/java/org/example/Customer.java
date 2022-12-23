package org.example;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
class EdurekaLogger {
    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public void sampleLog()
    {
        LOGGER.log(Level.WARNING, "Welcome to Edureka!");
    }
}
public class Customer {
    public static void main(String[] args) {
        EdurekaLogger obj = new EdurekaLogger();
        obj.sampleLog();
        LogManager slg = LogManager.getLogManager();
        Logger log = slg.getLogger(Logger.GLOBAL_LOGGER_NAME);
        log.log(Level.WARNING, "Hi! Welcome from Edureka");
    }

}