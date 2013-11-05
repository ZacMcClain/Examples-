import java.util.Scanner;


public class Appointment {
	private DayOfWeek whichDay;
	private int scheduleLocation;
	
	public void scheduleAppointment() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter day of week: ");
		String day = scan.next();
		whichDay = DayOfWeek.valueOf(day.toUpperCase());
	}
	
	public void remindTuesdayPatients() {
		if (whichDay == DayOfWeek.TUESDAY)
			System.out.println("Remember your appointment!");
	}

	public static void main(String[] args) {
		Appointment appointment = new Appointment();
		appointment.scheduleAppointment();
		appointment.remindTuesdayPatients();

	}

}
