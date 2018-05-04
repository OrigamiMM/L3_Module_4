package threads;

public class Runner implements Runnable {
public static void main(String[] args) {
	System.out.println("main");
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}

}
