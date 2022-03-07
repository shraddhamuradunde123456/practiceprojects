package phase1.assisted_practice.multithreading_excepn_oops;

public class ThreadCreation extends Thread {
	
	public void run(){
		System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());    
		System.out.println("running thread name is:"+Thread.currentThread().getName()); 
		System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive()); 
	    System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId());
	}

	public static void main(String[] args) {
		  
		  ThreadCreation m1=new ThreadCreation();  
		  ThreadCreation m2=new ThreadCreation();
		  ThreadCreation m3=new ThreadCreation();
		  
		  m1.setName("IT");
		  m2.setName("Finance");
		  m3.setName("HR");
		  
		  m1.setPriority(Thread.MAX_PRIORITY);  
		  m2.setPriority(Thread.NORM_PRIORITY);  
		  m3.setPriority(Thread.MIN_PRIORITY); 
		  
		  m1.start();  
		  m2.start();  
		  m3.start();

	}

}

