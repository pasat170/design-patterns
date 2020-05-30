package mediatorFactory;

//import abstractfactory.FactoryProducer;
import singleton.Singleton;

public class ChatUser extends User {

	
	
	public ChatUser(ChatMediator mediator, String nickname) {
		super(mediator, nickname);
		//mediator.removeUser(this);
		//mediator.addUser(this);
	}
	
	
	@Override
	public void send(String message) {
		if(message.equals("addBot")) {
				System.out.println(this.nickname + " use command " + message);
				try {
					Singleton bot = Singleton.getInstance("Guard Bot");
					bot.sendMessage("Created");
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}else if(message.equals("cat")){
			System.out.println(this.nickname + " says: " + message);
			try {
				Singleton bot = Singleton.getInstance("Guard Bot");
				bot.deleteUser(this.nickname);
				mediator.removeUser(this);
				System.out.println(this.nickname + " is removed from chat room !");
				bot.sendMessageToOthers("This word is forbidden!!!");
				mediator.sendMessage("This word is forbidden!", this);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {

				System.out.println(this.nickname + " says: " + message);
				mediator.sendMessage(message, this);
			}
		
			
		}
		
		

	@Override
	public void receive(String message) {
		System.out.println(this.nickname + " received :" + message);
	}



}
