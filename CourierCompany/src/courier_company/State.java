package courier_company;

public interface State {
	public void applyState(Person context);
	public String getStateName();
}
