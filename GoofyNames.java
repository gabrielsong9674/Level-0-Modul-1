import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {

		// 1. Ask the user to enter their name
		 String goofyName = JOptionPane.showInputDialog("Enter your name");
		// 2. Print upper case name to the console using .toUpperCase()
		 System.out.println(goofyName.toUpperCase());
		//    Run your program to see that this works.

		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.

			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i 
			
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.

			
			// 6. ADD this String  (containing 1 char) to the goofyName String

		
		// 7. Use pop-up to show user their Goofy name

	}
}


