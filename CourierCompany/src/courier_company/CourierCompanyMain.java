package courier_company;



public class CourierCompanyMain {

	private static Person getChain() {
		Person empl1 = new InAbroadEmployee("Employee for abroad");
		Person empl2 = new InBulgariaEmployee("Employee for Bulgaria");
		Person empl3= new InPlovdivEmployee("Employee for Plovdiv");
		Person client = new Client("Client");
		Person client1 = new Client("Client1");
		
		stateStandAndWait();
		stateStandAndWaitEmployeeTwo();
		stateStandAndWaitEmployeeThree();
		client.setNextLogger(empl1);
		
		
		return client;
	}
	
	public static void main(String[] args) {
		Person empl1 = new InAbroadEmployee("Employee for abroad");
		Person empl2 = new InBulgariaEmployee("Employee for Bulgaria");
		Person empl3= new InPlovdivEmployee("Employee for Plovdiv");
		Person client = new Client("Client");
		Preparation prepare = new Preparation();
		Person chain = getChain();
		chain.employeeMessage(1, "I want to send this shipment to Monaco");
		chain.sendOrderMessage();
		if(prepare.getStateName().equals("PREPARATION")) {
			Observer viewer = new Boy("Stefan");
			empl1.attach(viewer);
			empl1.setMove(" Move the shipment in the warehouse ");
			stateStandAndWaitEmployeeTwo();
		}

	}
	
	
	public static void stateStandAndWait() {
		Person empl1 = new InAbroadEmployee("Employee for abroad");
		
		StandWait standWait = new StandWait();
		
		standWait.applyState(empl1);
		State playerState = empl1.getState();
		String currentState = playerState.getStateName();
		System.out.println(empl1.getName() + " is in state: " + currentState);
	}
	
	public static void stateStandAndWaitEmployeeTwo() {
		Person empl2 = new InBulgariaEmployee("Employee for Bulgaria");
		
		StandWait standWait = new StandWait();
		
		standWait.applyState(empl2);
		State playerStateTwo = empl2.getState();
		String currentStateTwo = playerStateTwo.getStateName();
		System.out.println(empl2.getName() + " is in state: " + currentStateTwo);
	}
	
	public static void stateStandAndWaitEmployeeThree() {
		Person empl3= new InPlovdivEmployee("Employee for Plovdiv");
		
		StandWait standWait = new StandWait();
		
		standWait.applyState(empl3);
		State playerStateThree = empl3.getState();
		String currentStateThree = playerStateThree.getStateName();
		System.out.println(empl3.getName() + " is in state: " + currentStateThree);
	}
}
