import java.util.HashMap;

public class MemberLongTermSchedule extends MemberSchedule {

	private HashMap<Integer, Integer> longTermArrivals;
	private HashMap<Integer, Integer> longTermDepartures;

	private int day;
	private int time;
	
	/**
	 * @param day
	 * @param time
	 */
	private MemberLongTermSchedule(int day, int time) {
		super();
		this.day = day;
		this.time = time;
	}

	
	@Override
	public void addArrivals(int day, int time) {
		longTermArrivals.put(day, time);
		
	}

	@Override
	public void addDepartures(int day, int time) {
		longTermDepartures.put(day, time);

	}
}

