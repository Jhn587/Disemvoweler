import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		String testString1 = "Hi How Are You";
		System.out.println("Enter a String to be disemvoweled");
		Scanner keyInput = new Scanner(System.in);
		
		testString1 = keyInput.nextLine();
		
		Disemvoweler firstDis = new Disemvoweler(testString1);
		
		System.out.println(firstDis);
	}

}