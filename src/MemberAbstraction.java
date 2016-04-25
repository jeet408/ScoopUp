/**
 * @author jakubkalinowski
 *
 */
public abstract class MemberAbstraction {
	public abstract void setPassenger();
	public abstract void setMember();
	
	public abstract MemberStatus getMemberStatus();
	public abstract void setMemberStatus(MemberStatus ms);
	
	/**
	 * Abstract methods for Payments (Bridge Pattern)
	 */
	abstract public boolean payDriver(float amt, boolean payType);
	abstract public void addPoints(float amt);

}
