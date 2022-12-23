package org.example;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

class MyFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord log) {
        //don't log CONFIG logs in file
        if(log.getLevel() == Level.CONFIG) return false;
        return true;
    }

}
public class MyHandler extends StreamHandler {
    @Override
    public void publish(LogRecord record) {
        //add own logic to publish
        super.publish(record);
    }


    @Override
    public void flush() {
        super.flush();
    }


    @Override
    public void close() throws SecurityException {
        super.close();
    }
}
