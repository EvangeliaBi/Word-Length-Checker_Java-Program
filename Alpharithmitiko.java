package alpha;

import java.util.Scanner;

public class Alpharithmitiko {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please insert a word: ");
		String str = scan.nextLine();
		System.out.println("The result is: " + foo(str));
	}
	
		public static boolean foo(String s) {
			return(s.length() > 10);
		}
}