package tn.esprit.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="greetingPortype",portName="greetingPort"
,serviceName="greetingService",targetNamespace="http://greeting.tn")
public class HelloWS {
	@WebMethod(operationName="greetingOperation")
	@WebResult(name="greeting")
	public String sayHello() {
		return "Hello from JAX-WS with no param";
	}
	@WebMethod(operationName="greetingToOperation")
	@WebResult(name="greetingTo")
	public String sayHelloTo(@WebParam(name="LastName")String nom) {
		return "Hello From JAX-WS with param"+nom;
	}
}
