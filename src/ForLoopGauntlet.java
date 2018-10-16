
public class ForLoopGauntlet {
	
	static int YearBorn = 2003;
	static int CurrentYear = 2018;
	static int CurrentAge = CurrentYear-YearBorn;

	public static void main(String[] args) {
		for (int i=0;i<=100;i++) {
			System.out.println(i);
		}
		for (int i=100;i>=0;i--) {
			System.out.println(i);
		}
		for (int i=2;i<=100;i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		for (int i=1;i<=99;i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		for (int i=0;i<=500;i++) {
			if (i%2 == 0) {
				System.out.println(i+" is even");
			} else {
				System.out.println(i+" is odd");	
			}
		}
		for (int i=0;i<777;i++) {
			if (i%7 != 0) {
				System.out.println(i);
			}
		}
		
		for (int i=YearBorn;i<=CurrentYear;i++) {
			System.out.println("In "+i+" I was "+(CurrentAge-(CurrentYear-i))+" years old");
		}
		
		for (int i=0;i<3;i++) {
			for (int n=0;n<3;n++) {
				System.out.println(i+" "+n);
			}
		}
		
		int Columns = 3;
		int MaxNum = 9;
		
		for (int i=1;i<=MaxNum;i++) {
			if (i%Columns==0) {
				System.out.println(i);
			} else {
				System.out.print(i);
				System.out.print(" ");
			}
		}
		
		Columns = 10;
		MaxNum = 100;
		
		for (int i=1;i<=MaxNum;i++) {
			if (i%Columns==0) {
				System.out.println(i);
			} else {
				System.out.print(i);
				System.out.print(" ");
			}
		}
		
		System.out.println("");
		
		for (int i=1;i<=6;i++) {
			for (int t=1;t<=i;t++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
