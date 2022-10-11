package com.example;

public class ThreadTest extends Thread {

	ThreadTest(String name) {
		super(name);
	}

	public void run() {

		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			System.out.println(Thread.currentThread() + " " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest t1 = new ThreadTest("Snehasish");
		ThreadTest t2 = new ThreadTest("Sne Ha Sish");
		ThreadTest t3 = new ThreadTest("SneHaSisH");

		t1.start(); // printed
		try {
			t1.join();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t2.start();// didn't run
		try {
			t2.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t3.start();
	}

}
