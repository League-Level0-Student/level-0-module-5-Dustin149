import javax.swing.JOptionPane;

public class IsItAPrimeNum {

	public static void main(String[] args) {
		while (true) {
			double Input = Integer.parseInt(JOptionPane.showInputDialog("Type in any integer."));
			boolean Prime = true;
			
			if (Input%2 == 0 || Input%3 == 0 || Input%5 == 0 || Input%7 == 0) {
				if (Input/2 !=1 && Input/3 !=1 && Input/5 !=1 && Input/7 !=1) {
					Prime = false;
				}
			}
			
			if (Prime == true) {
				JOptionPane.showMessageDialog(null, "The number is prime");
			} else {
				JOptionPane.showMessageDialog(null, "The number is NOT prime");
			}
		}
	}

}
