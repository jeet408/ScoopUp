
public abstract class MemberAbstraction {
	/**
	 * Abstract methods for MemberStatus (State Pattern)
	 */
	public abstract void setPassenger();
	public abstract void setDriver();
	
	public abstract MemberStatus getMemberStatus();
	public abstract void setMemberStatus(MemberStatus ms);
	
	/**
	 * Abstract methods for Payments (Bridge Pattern)
	 */
	abstract public boolean payDriver(float amt, boolean payType);
	abstract public void addPoints(float amt);

}
