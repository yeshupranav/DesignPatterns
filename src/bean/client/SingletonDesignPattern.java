package bean.client;

public class SingletonDesignPattern {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				Abc obj = Abc.getInstance();
			}
		});
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				Abc obj1 = Abc.getInstance();

			}
		});
		t1.start();
		t2.start();
	}
}

class Abc {
	public static Abc obj;

	private Abc() {
		System.out.println("Hello World");
	}

	public static synchronized Abc getInstance() {
		if(obj==null)
		obj = new Abc();
		return obj;

	}
}

/*
 * Car c = Car.INSTANCE; c.i=5; c.show();
 * 
 * Car c1 = Car.INSTANCE; c.i=6; c.show();
 * 
 * 
 * } }
 * 
 * enum Car { INSTANCE; int i; public void show() { System.out.println(i); }
 * 
 * }
 */
/*
 * Thread t1 = new Thread(new Runnable() { // Car c = new Car();
 * 
 * public void run() { Car c = Car.getInstance();
 * 
 * }
 * 
 * }); Thread t2 = new Thread(new Runnable() { public void run() { Car c =
 * Car.getInstance();
 * 
 * } }); t1.start(); t2.start(); } }
 * 
 * class Car { // public static Car c = new Car();//Eagarly public static Car c;
 * 
 * private Car() { System.out.println("Instance Created");
 * 
 * }
 * 
 * public static Car getInstance() { if (c == null) { synchronized (Car.class) {
 * if (c == null)
 * 
 * c = new Car();// Lazy } } return c;
 */
