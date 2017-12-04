
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
		
		boolean isWeekday, isVacation;
	
		if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Is it a weekday?", "",
				  JOptionPane.YES_NO_OPTION)) {
			isWeekday =true;
		
			if(isWeekday == true) {
				System.out.println("Get up lazybones!");
			}
		}
		/*else if(JOptionPane.NO_OPTION == JOptionPane.showConfirmDialog(null, "Is it a weekday?", "",
				  JOptionPane.YES_NO_OPTION)) {
			isWeekday = false;
			isVacation = true;
		if(isWeekday == false) {
			System.out.println();
		}
		*/
	
		/*
		 * Ask the user for these values using
		  JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
	

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}

