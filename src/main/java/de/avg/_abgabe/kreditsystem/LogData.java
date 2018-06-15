package de.avg._abgabe.kreditsystem;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class LogData implements JavaDelegate {

	public static Logger logger;
	static {
	    try {
	      boolean append = true;
	      FileHandler fh = new FileHandler("C:/Users/Lenovo/Desktop/camunda_output/Logger.log", append);
	      fh.setFormatter(new SimpleFormatter());
	      logger = Logger.getLogger("TestLog");
	      logger.addHandler(fh);
	    }
	    catch (IOException e) {
	      e.printStackTrace();
	    }
	}
	
	@Override
	public void execute(DelegateExecution operator) throws Exception {
		
		 String business = (String) operator.getVariable("business");
		 String vorname = (String) operator.getVariable("vorname");
		 String nachname = (String) operator.getVariable("nachname");
		 Long kreditsumme = (Long) operator.getVariable("kreditsumme");
		 Long alter = (Long) operator.getVariable("alter");
		 Long score = ((Integer) operator.getVariable("score")).longValue();
		 Long laufzeit = (Long) operator.getVariable("laufzeit");

		Kreditor k1=new Kreditor(vorname,  nachname,  kreditsumme,  alter,  business,  laufzeit,score);
		
		logger.info(k1.toString());
	}

}
