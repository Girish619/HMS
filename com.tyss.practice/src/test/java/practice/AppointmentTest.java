package practice;

import org.testng.annotations.Test;

public class AppointmentTest {

	@Test
	public void viewAppointment() {
		System.out.println("Appointment is visible");
	}
	
	@Test
	public void cancelAppointment() {
		System.out.println("Appointment cancelled");
	}
	
	
}
