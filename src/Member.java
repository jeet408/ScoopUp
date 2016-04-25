import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;

public class Member extends MemberAbstraction {
	
	private String name;
	private String email;
	private String password;
	private String address;
	private boolean hasVehicle;
	private boolean preference;
	private ArrayList<String> vehicles = new ArrayList<String>();
	private HashMap<DayOfWeek, Integer> arrivals;
	private HashMap<DayOfWeek, Integer> departures;
	
	MemberStatus memberStatus;
	float points;
	int rides; //update as soon as new rides are done
	
	MemberSchedule memberSchedule;
	
	Vehicle vehicle;
	
	
	public Member(){
		memberStatus = new Passenger(this);
		points = 0;
		rides = 0;
	}
	
	
	
	public void setPassenger() {
		
		System.out.println(memberStatus.setPassenger());
	}
	
	public void setDriver() {
		System.out.println(memberStatus.setDriver());
	}
	
	public void setMemberStatus(MemberStatus ms) {
		memberStatus = ms;
	}
	
	public MemberStatus getMemberStatus() {
		return memberStatus;
	}

	/**
	 * 
	 * payType False is creditCard, True is points
	 */
	@Override
	public boolean payDriver(float amt, boolean payType) {
		if(payType = true){
			if(points <= 0){
				return false;
			}
			else{
				points -= amt;
				return true;
			}
		}
		else{
			//Assume unlimited funds in credit card
			System.out.println("Paid by Credit Card");
			return true;
		}
	}
	
	public void addPoints(float amt){
		points += amt;
		
	}

	public void rideComplete(){
		rides++;
		if (rides % 10 == 0){
			points += 2;
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the hasVehicle
	 */
	public boolean isHasVehicle() {
		return hasVehicle;
	}

	/**
	 * @param hasVehicle the hasVehicle to set
	 */
	public void setHasVehicle(boolean hasVehicle) {
		this.hasVehicle = hasVehicle;
	}

	/**
	 * @return the vehicles
	 */
	public ArrayList<String> getVehicles() {
		return vehicles;
	}

	/**
	 * @param vehicles the vehicles to set
	 */
	public void setVehicles(ArrayList<String> vehicles) {
		this.vehicles = vehicles;
	}

	/**
	 * @return the preference
	 */
	public boolean isPreference() {
		return preference;
	}



	/**
	 * @param preference the preference to set
	 */
	public void setPreference(boolean preference) {
		this.preference = preference;
	}



	/**
	 * @return the arrivals
	 */
	public HashMap<DayOfWeek, Integer> getArrivals() {
		return arrivals;
	}

	/**
	 * @param arrivals the arrivals to set
	 */
	public void setArrivals(HashMap<DayOfWeek, Integer> arrivals) {
		this.arrivals = arrivals;
	}

	/**
	 * @return the departures
	 */
	public HashMap<DayOfWeek, Integer> getDepartures() {
		return departures;
	}

	/**
	 * @param departures the departures to set
	 */
	public void setDepartures(HashMap<DayOfWeek, Integer> departures) {
		this.departures = departures;
	}



	@Override
	public void addArrivals(HashMap<DayOfWeek, Integer> arrivals) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void addDepartures(HashMap<DayOfWeek, Integer> departures) {
		// TODO Auto-generated method stub
		
	}

}
