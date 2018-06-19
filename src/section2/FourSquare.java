package section2;

import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
public static void main(String[] args) {
	FourSquare f =new FourSquare();
	f.go();
}
	// 2. Create a new Robot

	void go() {
		// 4. Make the robot move as fast as possible
		Robot sami= new Robot();
		
		// 5. Set the pen width to 5
		sami.setPenWidth(5);
		sami.setSpeed(20);
		
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for(int i=0;i<4;i++) {
			sami.penDown();
			sami.setRandomPenColor();
			sami.move(200);		
			sami.turn(90);
		
		
		}
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	
			// 8. Turn the robot 90 degrees to the right

	}
}

	/* 3. Fill in the code to draw a square inside the method below. */



