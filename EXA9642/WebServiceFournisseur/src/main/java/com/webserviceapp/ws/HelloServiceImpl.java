package com.webserviceapp.ws;

import javax.jws.WebService;
import javax.jws.WebParam;
import javax.jws.WebMethod;
import javax.jws.WebResult;

import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import java.util.Random;



@WebService( serviceName="HelloService" )
@SOAPBinding(style = Style.DOCUMENT , use = Use.LITERAL)
public class HelloServiceImpl {

/**
 * Randomly generates useful data about the given Department.
 */
	private Random random;
	/**
	 * Default constructor.
	 */
	public HelloServiceImpl() {
		this.random = new Random();
	}


	public String sayHello()
	{
		return "Hello World";
	}
	
		public String ditBonjour()
	{
		return "Bonjour le monde	";
	}

	public String ditBonjourAuMonsieur(
		@WebParam(name="monsieur") String monsieur)
	{
		return "Bonjour " + monsieur ;
	}
	
	/**
	 * Retrieves random data from the given department's code.
	 * @param departmentCode the department's code.
	 * @return a {@link Department}
	 */
	
	public @WebResult(name="department") Department ouTuHabites ()
	{
		// we set the seed so that the sequence can be 
		// reproduced for the same department
		random.setSeed(4);
		// fills the department
		String urbanization = "campagnard";
		Department department = new Department();
		department.setCode(departmentCode);
		department.setPopulation(random.nextInt(10000000));
		department.setSurface(random.nextFloat()*10);
		return department;
	}
	
}
