package mediatorFactory;


import mediatorFactory.FactoryProducer;
import singleton.Singleton;

public class MediatorMain {

	public static void main(String[] args) {
		
		ChatMediator mediator  = new MessagesChatMediator();
		
		UsersFactory userFactory = FactoryProducer.getFactory("USER");
		User user1 = userFactory.getUser(mediator, "Hristo");
		User user2 = userFactory.getUser(mediator, "Ivan");
		User user3 = userFactory.getUser(mediator, "Mihail");
		
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		
		user2.send("Hello guys!");
		user3.send("addBot");
		user1.send("cat");
		user2.send("How are you today?");
		
		
		

	}

}
