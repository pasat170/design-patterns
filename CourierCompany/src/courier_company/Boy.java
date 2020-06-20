package courier_company;


public class Boy implements Observer {


	private String name;
	private Observable employee;
	
	public Boy(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		if (this.employee == null) {
			System.out.println(this.name + " doesn't move the shipment!");
			return;
		}
		
		String latestTopicString = this.employee.getUpdate();
		System.out.println(this.name + " : perform the action : " + latestTopicString);

	}
	@Override
	public void setBoy(Observable employee) {
		this.employee = employee;
		
	}
	
	
	
}