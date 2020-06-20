package courier_company;

import java.util.ArrayList;
import java.util.List;



public abstract class Person implements Observable{
	public static int ABROAD = 1;
	public static int BULGARIA = 2;
	public static int PLOVDIV = 3;
	public static int CLIENT = 4;
	
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String name;
	private State state;
	private Preparation prepare = new Preparation();
	
	public Person(String name) {
		this.name = name;
	}

	protected int level;
	
	protected Person nextEmployee;

	
	public void setNextLogger(Person nextEmployee) {
		this.nextEmployee = nextEmployee;
	}
	public void employeeMessage(int level, String message) {
		
		if(this.level == 1 || this.level ==  2 || this.level ==  3) {
			this.sendOrderMessage();
		}else if(this.level >= level) {
			this.writeMessage(message);
		}
		
		if(this.nextEmployee != null) {
			this.nextEmployee.employeeMessage(level, message);
		}
		
	}
	
	
	
	abstract protected void writeMessage(String message);
	abstract protected void sendOrderMessage();
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
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
