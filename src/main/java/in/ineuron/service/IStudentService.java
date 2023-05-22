package in.ineuron.service;

import in.ineuron.dto.Student;

public interface IStudentService {
	
   public String addStudent( String sname, int sage, String scity);
    
	public Student searchStudent(int sid);
	
	public String updateStudent(Student student);
	
	public String deleteStudent(int sid);

}
