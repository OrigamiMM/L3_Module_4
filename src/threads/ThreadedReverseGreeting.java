package threads;

public class ThreadedReverseGreeting {
	// Write a program that creates a thread (Thread 1) that creates another thread
	// (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.
	public static void main(String[] args) {
		createThread(0);
		System.out.println("the end");
	}
	static void createThread(int amount) {
	Thread w = new Thread(()->{
		if (amount<50) {createThread(amount+1);}
	System.out.println("Hello From Thread " + amount + "!"); });
	w.start();
	try {
		w.join();
	}catch(Exception e){}}}