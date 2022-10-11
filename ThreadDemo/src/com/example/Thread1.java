package com.example;

public class Thread1 extends Thread {

	Thread1(String name) {
		super(name);
	}

	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String args[]) {

		Thread1 t1 = new Thread1("MyThread");
		t1.start();
	}
}
