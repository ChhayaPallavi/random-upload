package in.ineuron.daofactory;

import in.ineuron.persistense.IStudentDao;
import in.ineuron.persistense.StudentDaoImpl;

public class StudentDaoFactory {
	
	private StudentDaoFactory() {
		
	}
	
	private static IStudentDao studentDao; //instance variable
	
	public static IStudentDao getStudentdao() {
		
		if(studentDao==null) {
			studentDao= new StudentDaoImpl();
		}
		return studentDao;
		
	}

}
