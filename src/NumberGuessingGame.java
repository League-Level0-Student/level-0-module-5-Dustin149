import java.util.Random;

import javax.swing.JOptionPane;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		boolean Continue = true;
		
		while (Continue == true) {
			
			int Num = r.nextInt(3);
			
			System.out.println("Correct Answer: "+Num);
			
			int Input = Integer.parseInt(JOptionPane.showInputDialog("Pick a number between 0 and 3."));
			boolean Correct = false;
			
			if (Num == Input) {
				JOptionPane.showMessageDialog(null, "Correct!");
				Correct = true;
			}
			
			if (Correct == false) {
				JOptionPane.showMessageDialog(null, "That's not correct, so I'll give you another chance.");
				Input = Integer.parseInt(JOptionPane.showInputDialog("What is your answer now?"));
				
				if (Num == Input) {
					JOptionPane.showMessageDialog(null, "You got it!");
					Correct = true;
				}
			}
			
			int Choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
			
			if (Choice != 0) {
				Continue = false;
				System.out.println(Choice);
			}
		}
		JOptionPane.showMessageDialog(null, "Thanks for playing!");
	}

}
