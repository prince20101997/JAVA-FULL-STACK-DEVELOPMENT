package com.simplilearn.thread;

public class MultiThread extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"my thread is safe");
	}

	public static void main(String args[])
	{
		MultiThread t1 =new MultiThread();
		t1.start();
		
		MultiThread t2 =new MultiThread();
		t2.start();
	}
}
