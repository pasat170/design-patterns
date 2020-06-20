package courier_company;

public class StandWait implements State {

	private String stateName = "STAND_WAIT";
	
	@Override
	public void applyState(Person person) {
		person.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
	}
}
