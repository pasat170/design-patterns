package courier_company;

public class Preparation implements State {

	private String stateName = "PREPARATION";
	
	@Override
	public void applyState(Person person) {
		person.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
	}

}
