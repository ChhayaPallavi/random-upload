package in.ineuron.service;

import in.ineuron.daofactory.StudentDaoFactory;
import in.ineuron.dto.Student;
import in.ineuron.persistense.IStudentDao;

public class StudentServiceImpl implements IStudentService {
	//service---->persistence
//this is service layer code
	IStudentDao studentDao;
	@Override
	public String addStudent( String sname, int sage, String scity) {
		studentDao = StudentDaoFactory.getStudentdao();
		return studentDao.save(sname, sage, scity);
	}

	@Override
	public Student searchStudent(int sid) {
		// TODO Auto-generated method stub
		 studentDao = StudentDaoFactory.getStudentdao();
		return studentDao.findById(sid);
	}

	@Override
	public String updateStudent(Student student) {
		studentDao = StudentDaoFactory.getStudentdao();
		return studentDao.updateStudent(student);
	}

	@Override
	public String deleteStudent(int sid) {
		// TODO Auto-generated method stub
		 studentDao = StudentDaoFactory.getStudentdao();
			return studentDao.delete(sid);
		
	}

}
