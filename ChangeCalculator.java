
// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String coin3 = JOptionPane.showInputDialog( "How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nickels = Integer.parseInt(coin3);
		// Ask the user how many dimes they have, and convert their answer
String coin1 = JOptionPane.showInputDialog("How many dimes do you have?");
int dimes = Integer.parseInt(coin1);
		// Ask the user how many quarters they have, and convert their answer
String coin2 = JOptionPane.showInputDialog("How many quarters do you have?");
int quarters = Integer.parseInt(coin2);
		// Calculate how much money the user has and save it in a double variable 
double value = dimes * 0.1 + quarters * 0.25 + nickels * 0.05 ;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have "+ value+" dollars");
	}
}
