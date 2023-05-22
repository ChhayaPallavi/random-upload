package in.ineuron.servicefactory;

import in.ineuron.service.IStudentService;
import in.ineuron.service.StudentServiceImpl;

public class StudentServiceFactory {
	
	//private constructor so that obj cannt be created outside
private StudentServiceFactory() {
	
}

public static IStudentService studentService=null;
//this is instance variable of interface is declared

public static IStudentService getStudentService() {
	//this is a static method where above  static variable is injected
	if(studentService==null) {
		studentService= new StudentServiceImpl(); //loose coupling
		
	}
	return studentService;
	
}
}
