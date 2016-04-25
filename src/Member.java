public class Member extends MemberAbstraction {
	
	MemberStatus memberStatus;
	float points;
	
	public Member(){
		memberStatus = new Passenger(this);
		points = 0;
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
	
	public MemberStatus getMemberStatus(MemberStatus ms) {
		return ms;
	}

	@Override
	public void setMember() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberStatus getMemberStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void payDriver(Member driver, Member passenger, float amt, boolean payType) {
		// TODO Auto-generated method stub
		
	}

	
	
}
