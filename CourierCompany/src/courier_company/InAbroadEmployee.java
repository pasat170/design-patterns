package courier_company;

import java.util.ArrayList;
import java.util.List;





public class InAbroadEmployee extends Person{
	
	private Preparation prepare = new Preparation();
	public InAbroadEmployee(String name) {
		super(name);
		this.level = Person.ABROAD;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Employee who manage orders in abroad says: " + message);
	}

	@Override
	protected void sendOrderMessage() {
		System.out.println("Employee who manage orders in abroad says: I am ready for work! ");
	}
	private List<Observer> observers = new ArrayList<Observer>();
	private String name;
	
	@Override
	public void setMove(String name) {
		if(prepare.getStateName().equals("PREPARATION")) {
			this.name = name;
			this.notifyObservers();
		}
		
		
	}
	
	@Override
	public void attach(Observer observer) {
		this.observers.add(observer);
		observer.setBoy(this);

		
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
	

	@Override
	public String getUpdate() {
		return this.name;
	}
}
