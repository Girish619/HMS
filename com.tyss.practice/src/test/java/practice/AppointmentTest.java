package practice;

import org.testng.annotations.Test;

public class AppointmentTest {

	@Test(groups = "regession")
	public void viewAppointment() {
		System.out.println("Appointment is visible");
	}
	
	@Test(groups = "smoke")
	public void cancelAppointment() {
		System.out.println("Appointment cancelled");
	}
	
	
}
