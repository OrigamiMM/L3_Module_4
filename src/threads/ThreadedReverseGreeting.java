package threads;

import java.util.Stack;

public class ThreadedReverseGreeting {
	// Write a program that creates a thread (Thread 1) that creates another thread
	// (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.
	Stack<Thread> th = new Stack<Thread>();

	static Thread g;

	public static void main(String[] args) {

	}

	static void createThread(int amount) {
	
	System.out.println("Hello From Thread " + amount + "!");
	new Thread();

	}
}
