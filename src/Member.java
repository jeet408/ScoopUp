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

	
	
}
