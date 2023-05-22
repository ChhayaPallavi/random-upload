package in.ineuron.persistense;

import in.ineuron.dto.Student;

public interface IStudentDao {
	
	public String save(String sname, Integer sage, String scity);

	public Student findById(Integer sid);

	public String updateStudent(Student student);

	public String delete(Integer sid);

	
	

}
