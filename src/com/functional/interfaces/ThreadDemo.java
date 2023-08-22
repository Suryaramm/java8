package com.functional.interfaces;

class T implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("its run ");
	}
	
}


public class ThreadDemo {

	public static void main(String[] args) {
		Thread t1=new Thread(new T());
		t1.start();
		
		Runnable  r=()->{
			System.out.println("its me from main");
		};
		Thread t2=new Thread(r);
		t2.start();
		// TODO Auto-generated method stub
     	}

}
