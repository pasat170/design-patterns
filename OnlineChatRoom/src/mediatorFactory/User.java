package mediatorFactory;

import singleton.Singleton;

public abstract class User {

	protected ChatMediator mediator;
	protected String nickname;
	
	public User(ChatMediator mediator, String nickname) {
		this.mediator = mediator;
		this.nickname = nickname;
		
	}
	
	public abstract void send(String message);
	public abstract void receive(String message);
	
	
	

}
