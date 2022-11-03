package edu.rps.b2.thread;

import java.util.Scanner;

class subclass implements Runnable {
		Util obUtil=new Util();
		Scanner s=new Scanner(System.in);
		public void run() {
			obUtil.printingNumbers();
		Util.even();

}

public class App extends Thread  
{
	static int x = 0;

	public static void main(String[] args) {
//		App myobj=new App();
//		Thread t=new Thread(myobj);
//		
//		t.setDaemon(true);
//		t.start();
		subclass obj = new subclass();
		Thread subclassthread = new Thread(obj, "second");
//		subclassthread.setPriority(10);
		Thread third = new Thread(new subclass(), "third");
	
//		System.out.println(subclassthread.getName());
//		System.out.println(third.getName());
		third.start();
		subclassthread.start();
//		third.setPriority(10);
		
//		third.setDaemon(true);  // service thread

//		while(subclassthread.isAlive()) {
//			System.out.println(Thread.currentThread()+" is in process.... pls wait");
//		}
		
//			x++;
//			System.out.println(x);
//	
	}

}
