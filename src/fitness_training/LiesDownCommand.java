package fitness_training;

public class LiesDownCommand implements Command {

	private Trainee trainer;
	
	public LiesDownCommand(Trainee trainer) {
		this.trainer = trainer;
	}

	@Override
	public void execute() {
		this.trainer.liesDown();

	}

}