package com.example;

public class DaemonThread extends Thread {
	public DaemonThread(String name) {
		super(name);
	}

	public void run() {
		// Checking whether the thread is Daemon or not
		if (Thread.currentThread().isDaemon()) {
			System.out.println(getName() + " is Daemon thread");
		}

		else {
			System.out.println(getName() + " is User thread");
		}
	}

	public static void main(String[] args) {

		DaemonThread t1 = new DaemonThread("t1");
		// Setting user thread t1 to Daemon
		t1.setDaemon(true);
		t1.start();

		DaemonThread t2 = new DaemonThread("t2");
		t2.start();

		DaemonThread t3 = new DaemonThread("t3");
		// Setting user thread t3 to Daemon
		t3.setDaemon(true);
		t3.start();

	}
}
