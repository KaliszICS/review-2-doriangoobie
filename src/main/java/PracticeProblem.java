import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String y = s.nextLine();
		System.out.println(y);

	}

	public static void q2() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		System.out.print("In: ");
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println(x / y);
		System.out.println(x % y);

		
	}

	public static void q3() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String c = s.nextLine();
		System.out.println(c + " was the text you wrote");

		
	}

	public static void q4() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		int x = s.nextInt();
		System.out.println(x * 5);
		
	}

	public static void q5() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		boolean x = s.nextBoolean();	
		System.out.println(x + " is a boolean");
	}

	public static void q6() {
		//Write question 6 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		double x = s.nextDouble();
		System.out.println(x - 3.2);

	}

}
