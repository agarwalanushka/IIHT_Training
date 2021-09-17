class SingletonEager{
private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager()
	{
		
	}
	public static SingletonEager getInstance()
	{
		return instance;
	}
}
class SingletonLazy{
	private static SingletonLazy instance;
	private SingletonLazy() {
		
	}
	public static SingletonLazy getInstance() {
		if(instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
}
class SingletonSyn{
	private static SingletonSyn instance;
	private SingletonSyn() {
		
	}
	public static SingletonSyn getInstance() {
		if(instance ==null) {
			synchronized(SingletonSyn.class) {
				if(instance == null) {
					instance = new SingletonSyn();
				}
			}
		}
		return instance;
	}
}
public class Singleton {
	public static void main(String[] args)
	{
		SingletonEager instance = SingletonEager.getInstance();
		System.out.println(instance);
		SingletonLazy instance1 = SingletonLazy.getInstance();
		System.out.println(instance1);
		SingletonSyn instance2 = SingletonSyn.getInstance();
		System.out.println(instance2);
	}
}
