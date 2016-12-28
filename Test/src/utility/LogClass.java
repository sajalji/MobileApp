package utility;
import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogClass extends Logger{



	public LogClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	 Logger l;
	public Logger logger(Object o){
	 l= Logger.getLogger(o.getClass());
	 String logfile = System.getProperty("user.dir")
             + File.separator + "\\src\\logFile.properties";
     PropertyConfigurator.configure(logfile);
     return l;
	}
	
}
