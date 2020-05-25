package Ruby_;

import java.util.Scanner;

public class Lesson__3__Exception3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please input first number");
		int num1 = input.nextInt();
		System.out.println("please input second number");
		int num2 = input.nextInt();
		try {
			int result = num1 / num2;
			System.out.println("result = " + result);
		} catch (RuntimeException e) {
		   // e.printStackTrace();
			System.out.println(e);
			//System.out.println(e.getMessage());
		}
		int result2 = num1 + num2;
		System.out.println("second result =" + result2);
	}
}
