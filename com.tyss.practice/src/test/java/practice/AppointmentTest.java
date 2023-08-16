package practice;

import org.testng.annotations.Test;

public class AppointmentTest {

	@Test(groups = "smoke")
	public void viewAppointment() {
		System.out.println("Appointment is visible");
	}
	
	@Test(groups = "regression")
	public void cancelAppointment() {
		System.out.println("Appointment cancelled");
	}
	
	
}
