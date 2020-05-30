package mediatorFactory;



public class FactoryProducer {
public static UsersFactory getFactory(String factory) {
		
		if(factory.equals("USER")) {
			return new UsersFactory();
		}
		
		System.out.println("Unknown factory type");
		return null;
	}
}
