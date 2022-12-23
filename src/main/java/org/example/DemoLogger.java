package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
class Loggers {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public void makeSomeLog() {
        LOGGER.log(Level.INFO, "My first Log Message");

    }
}
    public class DemoLogger {
        public static void main(String[] args) {
            Loggers obj = new Loggers();
            obj.makeSomeLog();
            LogManager lgmngr = LogManager.getLogManager();
            Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
            log.log(Level.INFO, "This is a log message");
        }
    }
