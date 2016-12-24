import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.seleniumhq.jetty9.server.handler.DebugHandler;

public class Configuration {
	static Reader r;
	static Properties androidProperty;
	
static void androidProperties(){
	File file=new File("src/config.properties");
	
	try{
	r=new FileReader(file);
	androidProperty=new Properties();
	androidProperty.load(r);
	
	}catch(IOException  ex)
	{
		System.out.println("sajal Singh");
	}	
	 
	
	
	}
}
