package fitness_training;

public interface Observable {
	public void attach(Observer observer);
	public void detach(Observer observer);
	public void notifyObservers();
	public String getUpdate();
}
