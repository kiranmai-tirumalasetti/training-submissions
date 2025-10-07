package myown;
import java.util.Scanner;

public class ReverseString {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string to reverse: ");
	        String input = scanner.nextLine();

	        // Convert string to char array
	        char[] chars = input.toCharArray();

	        String reversed = "";
	        // Loop from end to start
	        for (int i = chars.length - 1; i >= 0; i--) {
	            reversed += chars[i];
	        }

	        System.out.println("Reversed string: " + reversed);
	        scanner.close();
	    }
	}



