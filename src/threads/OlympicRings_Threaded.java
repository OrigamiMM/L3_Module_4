package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.

public static void main(String[] args) {
Robot blue = new Robot(150, 150);
Robot yellow = new Robot(250,300);
Robot black = new Robot(350,150);
Robot green = new Robot(450,300);
Robot red = new Robot(550,150);
blue.setPenColor(Color.BLUE);
yellow.setPenColor(Color.YELLOW);
black.setPenColor(Color.BLACK);
green.setPenColor(Color.green);
red.setPenColor(Color.red);
new Thread(()-> DrawCircle(blue, 0, 0, 255)).start();
new Thread(()-> DrawCircle(yellow, 225, 225, 0)).start();
new Thread(()-> DrawCircle(black, 0, 0, 0)).start();
new Thread(()-> DrawCircle(green, 0, 255, 0)).start();
new Thread(()-> DrawCircle(red, 225, 0, 0)).start();

}
static void DrawCircle(Robot robot, int r, int g, int b) {
//robot.setPenColor(r,g,b);
robot.setSpeed(10);
robot.setPenWidth(3);
robot.penDown();
	for (int i = 0; i < 360; i++) {
		robot.move(2);
		robot.turn(1);
	}
robot.penUp();
robot.moveTo(400, 600);
}
}
