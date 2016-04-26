import java.time.DayOfWeek;
import java.util.Scanner;

public class ScoopUp {
		
	private static int option;
	private String answer;
	private String trash;
	private int time;
	private int day;
	private static String email;
	private static String password;
	
	static Scanner in = new Scanner(System.in);
	
	static Member m = new Member();
	
	
	public static void main(String[] args) {
		
//		Member member;
//		member = new Member();
//		member.setPassenger();
//		member.setDriver();
		
		ScoopUp system = new ScoopUp();
		
		system.loginScreen();
		
		if (option == 1) {
			//TO DO: Implement login
			System.out.println(m.getEmail() +" "+ m.getPassword());
			System.out.println("Enter your email address: ");
			email = in.nextLine();
			System.out.println("Enter you password: ");
			password = in.nextLine();
//			
			
//			if (email.equals(m.getEmail()) && password.equals(m.getPassword())){
//				system.mainScreen();
//			}
//			else {
//				System.out.println("Invalid user credentials!");
//			}
			
			
			system.mainScreen(); // remove after fixing login
			
			
			if (system.getOption() == 1){
				system.viewProfileScreen();
			} else if (system.getOption() == 2){
				
			} else if (system.getOption() == 3){
				
			} else if (system.getOption() == 4){
				
			} else {
				System.out.println("Invalid Input");
			}
				
		} else if (option == 2) {
			
			system.signUpScreen();
			
		} else {
			
			System.out.println("Invalid input!");
		}
	
	}
	
	/**
	 * @return the option
	 */
	public int getOption() {
		return option;
	}
	
	/**
	 * @param option the option to set
	 */
	public void setOption(int option) {
		this.option = option;
	}
	
	/**
	 * Login Screen
	 * @return
	 */
	private int loginScreen(){
		
		System.out.println("Welcome to ScoopUp!");
		System.out.println("***LOGIN***");
		System.out.println("Press 1 to Login");
		System.out.println("Press 2 to SignUp");
		
		return in.nextInt();
	}
	
	/**
	 * Main Menu
	 * @return
	 */
	private int mainScreen(){
		
		//System.out.println("Logged in as " + member.getName);
		System.out.println("***MAIN MENU***");
		System.out.println("Press 1 to View Profile");
		System.out.println("Press 2 to Request a Ride");
		System.out.println("Press 3 for Payments");
		System.out.println("Press 4 to Logout");
		option = in.nextInt();
		return option;
	}
	
	/**
	 * View Profile
	 * @return
	 */
	private int viewProfileScreen(){
		System.out.println("***PROFILE***\n\n");
		
		System.out.println("*"+m.getName()+"'s contact information*");
		System.out.println("Status: " + m.getMemberStatus());
		System.out.println("Preference (On Duty): " + m.isPreference());
		System.out.println("Emial: " + m.getEmail());
		System.out.println("Address: " + m.getAddress());
		
		System.out.println("*"+m.getName()+"'s vehicle information*");
		System.out.println("Vehicle: " + m.isHasVehicle());
		System.out.println("Vehicle: " + m.getVehicles());
		//System.out.println("Seats Available: " + m.vehicle.getAvailableSeats());
		
		System.out.println("*"+m.getName()+"'s schedule*");
		System.out.println("TO SCHOOL:");
		System.out.println("Mondays: "+ m.getArrivals().get(DayOfWeek.MONDAY));
		System.out.println("Mondays: "+ m.getArrivals().get(DayOfWeek.TUESDAY));
		System.out.println("Mondays: "+ m.getArrivals().get(DayOfWeek.WEDNESDAY));
		System.out.println("Mondays: "+ m.getArrivals().get(DayOfWeek.THURSDAY));
		System.out.println("Mondays: "+ m.getArrivals().get(DayOfWeek.FRIDAY));
		
		System.out.println("FROM SCHOOL:");
		System.out.println("Mondays: "+ m.getDepartures().get(DayOfWeek.MONDAY));
		System.out.println("Mondays: "+ m.getDepartures().get(DayOfWeek.TUESDAY));
		System.out.println("Mondays: "+ m.getDepartures().get(DayOfWeek.WEDNESDAY));
		System.out.println("Mondays: "+ m.getDepartures().get(DayOfWeek.THURSDAY));
		System.out.println("Mondays: "+ m.getDepartures().get(DayOfWeek.FRIDAY));
		
		System.out.println("OPTIONS");
		System.out.println("Press 1 to edit status");
		System.out.println("Press 2 to edit preference");
		System.out.println("Press 3 to edit seats available");
		System.out.println("Press 4 to edit schedule");
		System.out.println("Press 5 to go back to MAIN MENU");
		option = in.nextInt();
		return option;
	}
	
	private void requestRide(){
		
		System.out.println("Press 1 if you need a ride to school.");
		System.out.println("Press 2 if you need a ride from school.");
		System.out.println("Press 3 to go back");
		option = in.nextInt();
		
		if (option == 1){
			System.out.println("On what day to you need a ride?\nPress 1 for Monday\nPress 2 for Tuesday\nPress 3 for Wednesday\nPress 4 for Thursday\nPress 5 for Friday\nPress 6 for Saturday\nPress 7 for Sunday\n");
			day = in.nextInt();
			System.out.println("What time do you need to arrive to school? (Use military time, ex: 1230, 1315, 1400, etc.)");
			time = in.nextInt();
			//m.memberSchedule.addArrivals(day, time);
			System.out.println("A notification will be sent to you once driver accepts your request");
			requestRide();
			
		} else if (option == 2){
			System.out.println("On what day to you need a ride?\nPress 1 for Monday\nPress 2 for Tuesday\nPress 3 for Wednesday\nPress 4 for Thursday\nPress 5 for Friday\nPress 6 for Saturday\nPress 7 for Sunday\n");
			day = in.nextInt();
			System.out.println("What time do you need to leave from school? (Use military time, ex: 1230, 1315, 1400, etc.)");
			time = in.nextInt();
			//m.memberSchedule.addDepartures(day, time);
			System.out.println("A notification will be sent to you once driver accepts your request");
			requestRide();
		
		} else if (option == 3) {
			mainScreen();
			
		} else {
			System.out.println("Invalid Input!");
			requestRide();
		}
	}
	
	/**
	 * Sign Up
	 */
	private void signUpScreen(){
		in.nextLine(); //FLUSH
		System.out.println("***Sign Up***");
		System.out.println("Would you like to be a driver? (y/n) \nNote: This option can be changed later in User's Profile");
		answer = in.nextLine();
		
		/*
		 * Set member status to driver or passenger
		 */
		if (answer.equals("y")) {
			m.setDriver();
			//m.setMemberStatus(p);
		} else if (answer.equals("n")) {
			m.setPassenger();
		}
		else {
			System.out.println("Invalid input!");
		}
		
		System.out.println("Enter your full name: ");
		m.setName(in.nextLine());
		System.out.println("Enter your email address: ");
		m.setEmail(in.nextLine());
		System.out.println("Enter your password: ");
		m.setPassword(in.nextLine());
		System.out.println("Enter your full address (street, city, state, zip code): ");
		m.setAddress(in.nextLine());
		System.out.println("Do you have a vehicle? (y/n)");
		answer = in.nextLine();
		
		/*
		 * Create a vehicle
		 */
		if (answer.equals("y")){
			m.setHasVehicle(true);
			System.out.println("Enter vehicle's year: ");
			//m.vehicle.setYear(in.nextInt());
			System.out.println("Enter vehicle's make: ");
			//m.vehicle.setMake(in.nextLine());
			System.out.println("Enter vehicle's model: ");
			//m.vehicle.setModel(in.nextLine());
			System.out.println("Enter vehicle's color: ");
			//m.vehicle.setColor(in.nextLine());
			System.out.println("Enter vehicle's year: ");
			//m.vehicle.setAvailableSeats(in.nextInt());
		} else if (answer.equals("n")) {
			m.setHasVehicle(false);
		} else { 
			System.out.println("Invalid ipnut!");
		}
		
		System.out.println("You are almost done. \nLastly we need to setup your schedule for the rest of the semester.");
		System.out.println("Will you be needing a ride to school on Mondays? (y/n)");
		answer = in.nextLine();
		
		/*
		 * MONDAY -- Pass info to memberLongTermSchedule
		 */
		if (answer.equals("y")){
			System.out.println("What time do you need to be in school? (__:__ <-- use 24 hours time)");
			//m.memberSchedule.addArrivals(DayOfWeek.MONDAY, in.nextInt());
			System.out.println("What time do you need to be leave school? (__:__ <-- use 24 hours time)");
			//m.memberSchedule.addArrivals(DayOfWeek.MONDAY, in.nextInt());
		} else if (answer.equals("n")) {
			System.out.println("");
		} else { 
			System.out.println("Invalid ipnut!");
		}
		
		System.out.println("Will you be needing a ride to school on Tuesdays? (y/n)");
		answer = in.nextLine();
		
		/*
		 * TUESDAY -- info to memberLongTermSchedule
		 */
		if (answer.equals("y")){
			System.out.println("What time do you need to be in school? (__:__ <-- use 24 hours time)");
			//m.memberSchedule.addArrivals(DayOfWeek.TUESDAY, in.nextInt());
			System.out.println("What time do you need to be leave school? (__:__ <-- use 24 hours time)");
			//m.memberSchedule.addArrivals(DayOfWeek.TUESDAY, in.nextInt());
		} else if (answer.equals("n")) {
			System.out.println("");
		} else { 
			System.out.println("Invalid ipnut!");
		}
		
		System.out.println("Will you be needing a ride to school on Wednesdays? (y/n)");
		answer = in.nextLine();
		
		/*
		 * WEDNESDAY -- Pass info to memberLongTermSchedule
		 */
		if (answer.equals("y")){
			System.out.println("What time do you need to be in school? (__:__ <-- use 24 hours time)");
			//m.memberSchedule.addArrivals(DayOfWeek.WEDNESDAY, in.nextInt());
			System.out.println("What time do you need to be leave school? (__:__ <-- use 24 hours time)");
			//m.memberSchedule.addArrivals(DayOfWeek.WEDNESDAY, in.nextInt());
		} else if (answer.equals("n")) {
			System.out.println("");
		} else { 
			System.out.println("Invalid ipnut!");
		}
		
		System.out.println("Will you be needing a ride to school on Thursdays? (y/n)");
		answer = in.nextLine();
		
		/*
		 * Pass info to memberLongTermSchedule
		 */
		if (answer.equals("y")){
			System.out.println("What time do you need to be in school? (__:__ <-- use 24 hours time)");
			//m.memberSchedule.addArrivals(DayOfWeek.THURSDAY, in.nextInt());
			System.out.println("What time do you need to be leave school? (__:__ <-- use 24 hours time)");
			//m.memberSchedule.addArrivals(DayOfWeek.THURSDAY, in.nextInt());
		} else if (answer.equals("n")) {
			System.out.println("");
		} else { 
			System.out.println("Invalid ipnut!");
		}
		
		System.out.println("Will you be needing a ride to school on Fridays? (y/n)");
		answer = in.nextLine();
		
		/*
		 * FRIDAY -- Pass info to memberLongTermSchedule
		 */
		if (answer.equals("y")){
			System.out.println("What time do you need to be in school? (__:__ <-- use 24 hours time)");
			//m.memberSchedule.addArrivals(DayOfWeek.FRIDAY, in.nextInt());
			System.out.println("What time do you need to be leave school? (__:__ <-- use 24 hours time)");
			//m.memberSchedule.addArrivals(DayOfWeek.FRIDAY, in.nextInt());
		} else if (answer.equals("n")) {
			System.out.println("");
		} else { 
			System.out.println("Invalid ipnut!");
		}
		
		if (m.getMemberStatus().equals("Your status is set to driver")){
			System.out.println("Would you like to change your preference to ON DUTY? (y/n)");
			if (in.nextLine().equals("y")){
				m.setPreference(true);
				System.out.println("You are ON DUTY!");
			} else if (in.nextLine().equals("n")){
				m.setPreference(false);
				System.out.println("You are OFF DUTY! You may change your preference in your Profile");
			} else {
				System.out.println("Invalid Input!");
			}
		}
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("Congratulation! You are registered with ScoopUp.");
		System.out.println("\n");
		System.out.println("\n");
		
		loginScreen();
	}
}
