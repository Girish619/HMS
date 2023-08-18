package practice;


import org.testng.annotations.Test;

public class AddPatientTest {

	@Test(groups = "smoke")
	public void addPatientTest() {
		System.out.println("Patient added");
	}
	
	@Test(groups = "regession")
	public void managePatientTest() {
		System.out.println("Patient visible");
	}
}
