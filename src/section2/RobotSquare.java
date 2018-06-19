package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
public static void main(String[] args) {
	Robot sami= new Robot();
	for(int i=0;i<4;i++) {
	sami.setPenColor(Color.CYAN);	
	sami.setPenWidth(3);
	sami.penUp();
	sami.penDown();
	sami.setSpeed(5);
	sami.move(200);
	sami.sparkle();
	sami.turn (90);
	}
}
}
