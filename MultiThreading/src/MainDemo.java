
public class MainDemo {

	public static void main(String[] args) {
	

		//MyRunnable r = new MyRunnable();
		
		//Thread t1 = new Thread(r);
		
		Thread t1 = new Thread(new MyRunnable());
		t1.setName("Our_special_Thread");
		t1.setPriority(1);
		//t1.start();
		
		
		Thread t2 = new Thread(new MyRunnable(), "DDD_Thread_2");
		t2.setPriority(1);
		//t2.start();
		
		
		Thread t3 = new Thread( new Runnable() {
			public void run() {
				for(int i=20; i > 0 ; i--) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
				}
			}
		} , "Annonymous_Class_Using_Interface_1"  );
		t3.setPriority(1);
		//t3.start();
		
				
		Thread t4 = new Thread("Anonymous_Thread_Using_class_1") {
			public void run() {
				for(int i=0; i >= -20 ; i--) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
				}
			}
		};
		t4.setPriority(10);
		
		t1.start();    ///1
		t2.start();    ///2
		t3.start();    ///1
		t4.start();    ///10
		//main thread  ///5
		
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		for(int i=0; i<20; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		

		
	}

}
