
public class student {
	
	String firstName;
	String lastName;
	int semester;
	String phoneNo;
	
	public student(String FirstName, String lastName, int semester, String phoneno) {
		this.firstName = FirstName;
		this.lastName = lastName;
		this.semester= semester;
		this.phoneNo= phoneno;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void validateName() {
		if (this.firstName.isEmpty() || this.lastName.isEmpty())
			throw new RuntimeException("first and last name should not be null");
	}
	
	public void validateSemester() {
		if (this.semester<1) {
			throw new RuntimeException("semester should not be 0");
		}
	}
	
	public void validatePhoneNo() {
		if (this.phoneNo == null ) {
			throw new RuntimeException("phone no cant be empty");
		}
	}

	
	
	
	
	

}
