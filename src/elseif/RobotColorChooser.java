//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot robit = new Robot();
		//3. Ask the user what color they would like the robot to draw
	for(int i=0;i<10;i++) {
		String hey=JOptionPane.showInputDialog("what color would you like?");
	
		//5. Use an if/else statement to set the pen color that the user requested
		if (hey.equals("blue")){
			robit.penDown();
			robit.setSpeed(100);
			robit.setPenWidth(10);
			robit.setPenColor(0,83,250);
			robit.setAngle(45);
			robit.move(100);
		}
        //6. If the user doesn’t enter anything, choose a random color
		if (hey.equals("")) {
			robit.hide();
			robit.penDown();
			robit.setSpeed(5);
			robit.setPenWidth(15);
			robit.setRandomPenColor();
			robit.setAngle(45);
			robit.move(200);
			robit.setAngle(145);
			robit.move(200);
			robit.setAngle(-145);
			robit.move(200);
			robit.setAngle(-45);
			robit.move(200);
			
		}
	}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
