package com.example;

public class ThreadPriority extends Thread {

	ThreadPriority(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread() + " " + i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current Thread priority:" + Thread.currentThread().getPriority());

		ThreadPriority p1 = new ThreadPriority("Thread p1");
		p1.start();

		ThreadPriority p2 = new ThreadPriority("Thread p2");
		p2.start();

		ThreadPriority p3 = new ThreadPriority("Thread p3");
		p3.start();

		p1.setPriority(10);

		System.gc();

	}

}