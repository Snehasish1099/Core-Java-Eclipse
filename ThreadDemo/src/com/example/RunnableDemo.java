package com.example;

public class RunnableDemo implements Runnable {

	public void run() {
		System.out.println("Inside the thread");
	}

	public static void main(String args[]) {
		Runnable r1 = new RunnableDemo();
		Thread t1 = new Thread(r1, "My Thread");
		t1.start();
		System.out.println("Outside of the thread");

	}

}
