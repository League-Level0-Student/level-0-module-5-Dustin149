import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		int LastNum = 0;
		int AddNum = 0;
		int CurrentNum = 0;
				
		while (true) {
			JOptionPane.showMessageDialog(null, CurrentNum);
			
			AddNum = LastNum;
			LastNum = CurrentNum;
			
			if (CurrentNum == 0) {
				CurrentNum = 1;
				LastNum = 1;
			} else {
				CurrentNum = CurrentNum + AddNum;
			}		
		}
	}
}

