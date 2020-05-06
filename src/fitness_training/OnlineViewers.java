package fitness_training;

public class OnlineViewers implements Observer {

	private String name;
	private Observable training;
	
	public OnlineViewers(String name) {
		this.name = name;
	}
	@Override
	public void update() {
		if (this.training == null) {
			System.out.println(this.name + " doesn't execute a command!");
			return;
		}
		
		String latestTopicString = this.training.getUpdate();
		System.out.println(this.name + " : execute command : " + latestTopicString);

	}

	@Override
	public void setTraining(Observable training) {
		this.training = training;
		
	}

	
}