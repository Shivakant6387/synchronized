package org.example;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogging {
    private static Logger logger=Logger.getLogger("MyLog");
    public  static void init(){
        FileHandler fh;
        try{
            fh=new FileHandler("/home/giitian/Desktop/Java_Shiva_Home_Project/logging_java_001MyLogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter=new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.info("Logger Initialized");
        }catch (Exception e){
            logger.log(Level.WARNING,"Exception::",e);
        }
    }
    public static void main(String[] args) {
    init();
    try{
        int a=10/0;//for ArithmeticException
    }catch (Exception e){
        logger.log(Level.WARNING,"Exception ::",e);
    }
    logger.info("End of program");
    }
}
