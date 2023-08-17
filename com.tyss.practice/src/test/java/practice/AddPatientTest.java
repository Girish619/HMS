package practice;


import org.testng.annotations.Test;

public class AddPatientTest {

	@Test(groups = "regression")
	public void addPatientTest() {
		System.out.println("Patients added");
	}
	
	@Test(groups = "smoke")
	public void managePatientTest() {
		System.out.println("Patients visible");
	}
}
