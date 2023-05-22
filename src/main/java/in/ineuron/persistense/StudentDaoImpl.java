package in.ineuron.persistense;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.dto.Student;
import in.ineuron.util.HibernateUtil;

public class StudentDaoImpl implements IStudentDao {
	
	Session session=null;

	@Override
	public String save(String sname, Integer sage, String scity) {
		// TODO Auto-generated method stub
	session = HibernateUtil.getSession();
	Transaction transaction = session.beginTransaction();
	boolean flag= false;
	String status= " ";
	try {
		if(transaction!=null) {
			Student std= new Student();
			std.setSname(sname);
			std.setSage(sage);
			std.setScity(scity);
			
			session.save(std);
			
			flag= true;
			
		}
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		if(flag) {
			transaction.commit();
			System.out.println("Object inserted");
		}else {
			transaction.rollback();
			System.out.println("Object not inserted");
		}
		
	}
		return status;
	}

	@Override
	public Student findById(Integer sid) {
		// TODO Auto-generated method stub
		Student student = session.get(Student.class, sid);
		if(student!=null) {
			return student;
		}else 
			
		return null;
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return "failure";
	}

	@Override
	public String delete(Integer sid) {
		// TODO Auto-generated method stub
		Student student = findById(sid);
		Transaction transaction = session.beginTransaction();
		boolean flag= false;
		String status= " ";
		
		try {
			if(student!=null) {
				session.delete(student);
				flag=true;		
			}
			else {
				return "not found";
			}
		}catch(Exception e) {
			e.printStackTrace();
				
			}
		finally{
			if(flag) {
				transaction.commit();
				status="success";
			}
			else {
				transaction.rollback();
				status="failure";
			}
			
		}
		
		return null;
	}

}
