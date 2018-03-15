// Below is a completed program that uses brute force to crack a 9-digit password. 
// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

// Pro-tip: Do not include the creation of the threads as part of the time. 

package threads;

import java.util.Random;

public class BruteForceCracker {
	static long code = (long) (new Random().nextDouble() * 1_000_000_000);

	static long startTime;
	static long endTime;
	static float elapsedTime;

	public static void main(String[] args) {
		Thread zero = new Thread(() -> crackCode(0, 0));
		Thread one = new Thread(() -> crackCode(100000000, 1));
		Thread three = new Thread(() -> crackCode(300000000, 3));
		Thread five = new Thread(() -> crackCode(500000000, 5));
		Thread seven = new Thread(() -> crackCode(700000000, 7));
		Thread two = new Thread(() -> crackCode(200000000, 2));
		Thread four = new Thread(() -> crackCode(400000000, 4));
		Thread six = new Thread(() -> crackCode(600000000, 6));
		Thread eight = new Thread(() -> crackCode(800000000, 8));
		Thread nine = new Thread(() -> crackCode(900000000, 9));

		zero.start();
		one.start();
		two.start();
		three.start();
		four.start();
		five.start();
		six.start();
		seven.start();
		eight.start();
		nine.start();
		
		System.out.println("Starting Brute Force Checker");
		System.out.println(code);
		startTime = System.currentTimeMillis();
	}

	static void crackCode(int start, int num) {
		while (!checkCode(start)) {
			start++;
		}
		endTime = System.currentTimeMillis();
		elapsedTime = (float) (endTime - startTime);
		elapsedTime /= 1000.f;
		System.out.println("Total time taken: " + elapsedTime + " seconds from codeCracker" + num);
		System.out.println(start);
	}

	public static boolean checkCode(long p) {
		if (p == code) {
			return true;
		} else {
			return false;
		}
	}
}
