package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot robot = new Robot();
		
		// Default Settings //
		int WinX = 1000;
    	int WinY = 1000;		
		
    	robot.penDown();
    	robot.setSpeed(100);
    	robot.setWindowSize(WinX, WinY);
    	robot.moveTo(WinX/2, WinY/2);
    	robot.setRandomPenColor();
    	robot.setPenWidth(1);
    	robot.miniaturize();
    	robot.setX(50);
    	robot.setY(WinY/2);
    	
		//2. Set the speed to 100

		int colorChoice=JOptionPane.showOptionDialog(null, "Choose a color", "Evil Polygons", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Black", "Random"}, 0);
		System.out.println(colorChoice);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice == 0) {
			robot.setPenColor(Color.BLACK);
		}
		//4. Ask the use how many polygons they want to be drawn.
		int ShapesNum = Integer.parseInt(JOptionPane.showInputDialog("How many polygons do you want to be drawn?"));
		//5. Use the robot to draw the number of polygons the user requested.
		for (int i=0;i<ShapesNum;i++) {
			int Sides = 6;
			int Width = 100;
			
			robot.penDown();
			robot.setAngle(90);
			
			for (int t=0;t<Sides;t++) {
				robot.move(Width/Sides);
				robot.turn(360/Sides);
			}
			
			robot.penUp();
			
			robot.setAngle(90);
			robot.move(Width/2);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

