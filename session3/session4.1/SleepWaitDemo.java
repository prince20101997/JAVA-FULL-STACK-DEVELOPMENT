package com.simplilearn.thread;

public class SleepWaitDemo {
	private static Object LOCK=new Object();
	public static void main(String args[]) throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName());
	synchronized(LOCK)
	{
		LOCK.wait(1000);
		System.out.println("wake up after 1 second");
	}
	}

}
