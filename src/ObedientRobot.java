
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot robit = new Robot();

	public static void main(String[] args) {
		
		// 

		String color = JOptionPane.showInputDialog("what color would you like your shape to be?");
		if (color.equals("blue")) {
			robit.setPenColor(0, 0, 255);
		}
		else if (color.equals("green")) {
			robit.setPenColor(0, 255, 0);
		}
		else if (color.equals("red")) {
			robit.setPenColor(255, 0, 0);
		}
		else {
			robit.setRandomPenColor();
		}
		
		String shape = JOptionPane.showInputDialog("what shape would you like me to draw?");
		if (shape.equals("square")) {
			drawSquare();
		}
		if (shape.equals("triangle")) {
			drawTriangle();
		}
		if (shape.equals("circle")) {
			drawCircle();
		}

	}

	static void drawSquare() {
		robit.setSpeed(100);
		robit.penDown();
		for (int i = 0; i < 4; i++) {
			robit.turn(90);
			robit.move(100);
		}
	}

	static void drawTriangle() {
		robit.setSpeed(100);
		robit.penDown();
		for (int i = 0; i < 3; i++) {
			robit.turn(120);
			robit.move(100);
		}
	}

	static void drawCircle() {
		robit.setSpeed(100);
		robit.penDown();
		for (int i = 0; i < 360; i++) {
			robit.turn(1);
			robit.move(1);
		}
	}

}
