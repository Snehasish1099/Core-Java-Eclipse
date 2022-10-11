package com.sync;

public class ThreadTestSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table myTable = new Table();

		MyThread1 t1 = new MyThread1(myTable);
		t1.start();

		MyThread2 t2 = new MyThread2(myTable);
		t2.start();

	}

}