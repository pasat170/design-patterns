package fitness_training;

public class MainFitness {

	public static void main(String[] args) {
		FitnessInstructor fitnessInstructor = new FitnessInstructor();
		Trainee training = new Trainee();
		Command lightsOnCommand = new GetUpCommand(training);
		Command lightsOffCommand = new LiesDownCommand(training);
		Observer viewer1 = new OnlineViewers("First online viewer");
		Observer viewer2 = new OnlineViewers("Second online viewer");
		Observer viewer3 = new OnlineViewers("Third online viewer");
		
		training.attach(viewer1);
		training.attach(viewer2);
		training.attach(viewer3);
		
		fitnessInstructor.setCommand(lightsOnCommand);
		fitnessInstructor.pressButton();
		training.setNewTraining(" get up!");
		fitnessInstructor.setCommand(lightsOffCommand);
		fitnessInstructor.pressButton();
		training.setNewTraining(" lies down!");

	}

}