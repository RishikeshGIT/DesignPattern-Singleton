package designpatterns.Singleton;

public class SingletonClass {

	private static SingletonClass singleObj = null;
	private SingletonClass() {}
	
	//Implementing "Lazy Instantiation". It implements "double check locking"  
	public static SingletonClass getInstance(){
		if (singleObj == null)
			synchronized (SingletonClass.class) {
				if (singleObj == null)
					singleObj =  new SingletonClass();
			}
		return singleObj;
	}
	
	public void greetingsFromSingleton() {
		System.out.println("Hello from the Singleton Class!!");
	}
	
}
