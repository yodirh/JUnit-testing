import java.util.ArrayList;
import java.util.HashMap;



public class studentManager {
	
	HashMap<String, student> list = new HashMap<String, student>();
	
	
	public void addStudent(String firstname, String lastname, int semester, String phoneno) {
		student stu= new student(firstname, lastname, semester, phoneno);
		checkStudentValidity(stu);
		checkStudentAlreadyExist(stu);
		list.put(lastname, stu);
	}
	
	public void checkStudentAlreadyExist(student student) {
		if(list.containsKey(student.getLastName()))
			throw new RuntimeException("student already exist");
	}
	
	public void checkStudentValidity(student student) {
		student.validateName();
		student.validateSemester();
		student.validatePhoneNo();
	}
	
	public int listSize() {
		return list.size();
	}
	
	
}
