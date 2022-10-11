package com.example;

public class ThreadScheduling implements Runnable {

	public static void main(String args[]) {
		Runnable n = new ThreadScheduling();

		Thread t1 = new Thread(n, "Snehasish");
		t1.start();

		Thread t2 = new Thread(n, "Sne Ha Sish");
		t2.start();

		Thread t3 = new Thread(n, "SneHaSish?");
		t3.start();

	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
