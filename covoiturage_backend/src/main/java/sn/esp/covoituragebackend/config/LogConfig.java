package sn.esp.covoituragebackend.config;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class LogConfig {
	
	public LogConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Logger getLog(Class c){
		return Logger.getLogger(c);
	}
}
