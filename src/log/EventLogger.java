package log;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;

public class EventLogger {
	FileHandler fileHandler;
	//PrintWriter fileOut;
	LogManager logManager;
	Logger logger; 
	public EventLogger(String fileName) {
		try {
			logManager = LogManager. getLogManager();
			logger = logManager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			fileHandler = new FileHandler(fileName);
			fileHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHandler);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void log(String logMessage ) {
		logger.info(logMessage);
	}
}
