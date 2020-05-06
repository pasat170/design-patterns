package fitness_training;

public class GetUpCommand implements Command{
	private Trainee trainer;

	public GetUpCommand(Trainee trainer) {
		this.trainer = trainer;
	}

	@Override
	public void execute() {
		this.trainer.getUp();
		
	}
	
}