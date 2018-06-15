package de.avg._abgabe.kreditsystem;



import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import de.hska.iwi.avg.schufasystem.service.SchufaService.Business;
import de.hska.iwi.avg.schufasystem.service.SchufaService.Int;
import de.hska.iwi.avg.schufasystem.service.SchufaService.Person;
import de.hska.iwi.avg.schufasystem.service.SchufaService.PersonNotFoundException;
import de.hska.iwi.avg.schufasystem.service.SchufaService.Profile;
import de.hska.iwi.avg.schufasystem.service.SchufaService.SchufaService;

public class SchufaClient {
  public static void main(String [] args) {

    try {
      TTransport transport;

        transport = new TSocket("localhost", 9090);
        transport.open();

      TProtocol protocol = new  TBinaryProtocol(transport);
      SchufaService.Client client = new SchufaService.Client(protocol);

      perform(client);

      transport.close();
    } catch (TException x) {
      x.printStackTrace();
    } 
  }

  private static void perform(SchufaService.Client client) throws TException
  {
	  Person unknownPerson = new Person("Andreas", "Heberle");
	  Person knownPerson = new Person("Eva", "Mustermann");
	  Person knownPerson2 = new Person("Jackson", "Panza");
	  
	  System.out.println("Finance Score (Eva Mustermann): " + client.getScore(knownPerson, Business.finance));
	  System.out.println("Finance Score (Peter Müller): " + client.getScore(knownPerson2, Business.finance));
	  Int i=new Int(client.getScore(knownPerson2, Business.finance));
	  System.out.println("Meine Test -----> " + i.getValue());

	  
	  try {
		  System.out.println("Banking Score (unknownPerson)? ");	  
		  System.out.println("Banking Score (unknownPerson): " + client.getScore(unknownPerson, Business.finance));
	  } catch (Exception ex) {
		  System.out.println("Expected Exception (unknownPerson) caught!");
	  }

	  
	  Profile profile;
	  
	  try  {
		  System.out.println("Get telco Score for knownPerson: " + client.getScore(knownPerson, Business.telco));
		  System.out.println("Update Profile for knownPerson");
		  profile = client.updateProfile(knownPerson, Business.telco, "50");
		  System.out.println("New telco Score from returned profile: " + profile.getDetails().get(Business.telco));
		  System.out.println("New telco Score for knownPerson from getScore: " + client.getScore(knownPerson, Business.telco));
  
	  } catch (PersonNotFoundException ex)  {
		  System.out.println("Error: Unexpected PersonNotFoundException caught - " + ex.why);
	  } 
	  
	  try  {
		  System.out.println(" 10 -> Telco Score for unknownPerson: " + client.getScore(knownPerson2, Business.telco).getValue());
		  profile = client.updateProfile(knownPerson2, Business.telco, "500");
	  } catch (PersonNotFoundException ex)  {
		  System.out.println("Success: Expected PersonNotFoundException caught - " + ex.why);
	  }
	  
  }
}