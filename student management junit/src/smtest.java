import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class smtest {
	
	studentManager studentmanager;
	
	@BeforeAll
	void setupAll() {
		System.out.println("test started ..");
		studentmanager = new studentManager();
	}

	
	@Test
	@DisplayName("First or last name of the student can not be null")
	void shouldThrowExceptionifStudentNameisNull() {
		Assertions.assertThrows(RuntimeException.class, ()-> {
			new student("", "forhad", 1, "0111").validateName();
			});
	}
	
	
	@Test 
	@DisplayName("The semester must be 1 or heigher")
	void shouldThrowExceptionifsemesterisNull() {
		Assertions.assertThrows(RuntimeException.class, ()->{
			new student("mohiuddin", "forhad", 0, "1111").validateSemester();
		});
	}
	
	
	@Test
	@DisplayName("Student's phone no can not be null")
	void shouldThrowExceptionifphoneNoisNull() {
		Assertions.assertThrows(RuntimeException.class, ()->{
			new student("mohiuddin", "forhad", 0, "").validateSemester();
		});
	}
	
	
	@Test
	@DisplayName("All valid parameters should add student to list" )
	void shouldAddStudent() {
		studentmanager.addStudent("mohiuddin", "forhad", 1, "1144");
	}
	
	
	@Test
	@DisplayName("There should be only one entry on the list after first assignment")
	void onlyOneIteminList() {
		Assertions.assertEquals(1, studentmanager.listSize());
	}
	
	
	@Test
	@DisplayName("Should throw an exception if the student already exist")
	void shouldAddStudent1() {
		Assertions.assertThrows(RuntimeException.class, () -> 
		studentmanager.addStudent("mohiuddin","forhad", 1, "1144"));
		
	}
	

	@AfterAll
	static void afterAll() {
		System.out.println("all test done");
	}

}
