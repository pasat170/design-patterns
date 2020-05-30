package mediatorFactory;


public class UsersFactory {
	
	User getUser(ChatMediator mediator, String nickname) {
		
			return new ChatUser(mediator, nickname);
		
	}
}
