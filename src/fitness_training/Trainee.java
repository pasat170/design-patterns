package fitness_training;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable{
	private Boolean performCommands;
	private List<Observer> observers = new ArrayList<Observer>();
	private String name;
	public void getUp() {
		System.out.println("Trainee gets up!");
		this.performCommands = true;
	}
	
	public void liesDown() {
		System.out.println("Trainee lies down!");
		this.performCommands = false;
	}

	@Override
	public void attach(Observer observer) {
		this.observers.add(observer);
		observer.setTraining(this);

		
	}

	@Override
	public void detach(Observer observer) {
		this.observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}

		
	}
	
	public void setNewTraining(String name) {
		this.name = name;
		this.notifyObservers();
	}

	@Override
	public String getUpdate() {
		return this.name;
	}
}