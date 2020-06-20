package courier_company;

import java.util.ArrayList;
import java.util.List;



public class Client extends Person{
	

	public Client(String name) {
		super(name);
		this.level = Person.CLIENT;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Client said: " + message);
	}

	@Override
	protected void sendOrderMessage() {
		System.out.println("Client said: Thank you! ");
	}
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String name;
	
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
