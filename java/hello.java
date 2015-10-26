import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);

		String fromIn;
		System.out.print("$ ");
		fromIn = userIn.next();

		System.out.println("Hello, " + fromIn + "!");

	}
}