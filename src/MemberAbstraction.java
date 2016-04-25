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
	 * Abstract methods for Payemnts (Bridge Pattern)
	 */
	abstract public void payDriver(Member driver, Member passenger, float amt, boolean payType);
}
