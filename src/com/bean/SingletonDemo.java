package com.bean;

public class SingletonDemo {

	public static void main(String[] args) {
		ABC obj = ABC.INSTANCE;
		obj.i=5;
		obj.show();
		ABC obj1 = ABC.INSTANCE;
		obj.i=6;
		obj.show();
		ABC obj2 = ABC.INSTANCE;
		obj.i=7;
		obj.show();

		
	}
		
		
	enum ABC{
		INSTANCE;
		int i;
		public void show() {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
/*		// ABC obj = new ABC();
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				ABC obj = ABC.getInstance();

			}

		});
		Thread t2 = new Thread(new Runnable() {

			public void run() {

				ABC obj1 = ABC.getInstance();

			}
		});
		t1.start();
		t2.start();
	}
}

class ABC {
	// public static ABC obj = new ABC();//Eagarly
	public static ABC obj;

	private ABC() {
		System.out.println("Instance Created");

	}

	public static ABC getInstance() {
		if (obj == null) {
			synchronized (ABC.class) {
				if (obj == null)

					obj = new ABC();
			}
		}
		return obj;
*/	}

}
