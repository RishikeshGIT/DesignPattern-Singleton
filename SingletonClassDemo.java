package designpatterns.Singleton;

public class SingletonClassDemo {

	public static void main(String[] args) {
		SingletonClass singleton = SingletonClass.getInstance();
		
		singleton.greetingsFromSingleton();
	}
}
