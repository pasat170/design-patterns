package singleton;

import mediatorFactory.ChatMediator;
import mediatorFactory.User;

public class Singleton {

private static Singleton instance = null;
	private Singleton() {
		
	}
	
	
	public static Singleton getInstance(String name) 
			throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		if(instance == null) {
			if(name.equals("Guard Bot"))
			instance = new Singleton();
		}
		return instance;
	}
	
	public void sendMessage(String message) {
		System.out.println("GuardBot: " + message);
	}
	
	public void deleteUser(String nickname) {
		System.out.println("GuardBot remove: " + nickname);
		
	}
	public void sendMessageToOthers(String message) {
		System.out.println("GuardBot says: " + message);
	}
}
