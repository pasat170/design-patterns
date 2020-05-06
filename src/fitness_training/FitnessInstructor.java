package fitness_training;

public class FitnessInstructor {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		System.out.println("Fitness instructor gives commands to trainer!");
		this.command.execute();
	}
}