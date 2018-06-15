package de.avg._abgabe.kreditsystem;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import de.hska.iwi.avg.schufasystem.service.SchufaService.Business;
import de.hska.iwi.avg.schufasystem.service.SchufaService.Int;
import de.hska.iwi.avg.schufasystem.service.SchufaService.Person;
import de.hska.iwi.avg.schufasystem.service.SchufaService.PersonNotFoundException;
import de.hska.iwi.avg.schufasystem.service.SchufaService.SchufaService;

public class TransmitData implements JavaDelegate {

	@Override
	public void execute(DelegateExecution operator) throws Exception {
		 
		 String business = (String) operator.getVariable("business");
		 String vorname = (String) operator.getVariable("vorname");
		 String nachname = (String) operator.getVariable("nachname");
		 //Long alter = (Long) operator.getVariable("alter");
		 
		 Person p1 = new Person(vorname,nachname);
		 Business _business=Business.valueOf(business);
		
		TTransport transport;
        transport = new TSocket("localhost", 9090);
        transport.open();
        TProtocol protocol = new  TBinaryProtocol(transport);
        SchufaService.Client client = new SchufaService.Client(protocol);
       
        operator.setVariable("score_bez","score");
        
        try  {
      	  Int l= client.getScore(p1,_business);
      	  operator.setVariable("score",l.getValue());
  	  } catch (PersonNotFoundException ex)  {
  		  throw new BpmnError("PERSON_NOT_FOUND");
  	  }
      		

	}
	
	

}
