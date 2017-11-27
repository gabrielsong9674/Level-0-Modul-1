import javax.swing.JOptionPane;

public class NumberSorter {
public static void main(String[] args) {
	String num1 = JOptionPane.showInputDialog("Enter a number ");
	String num2 = JOptionPane.showInputDialog("Enter another number");
	String num3 = JOptionPane.showInputDialog("Enter one last number");
	int one = Integer.parseInt(num1);
	int two = Integer.parseInt(num2);
	int three = Integer.parseInt(num3);
	if(one > two  && one > three && two>three) {
		JOptionPane.showMessageDialog(null, "Descending: "+ one + two+ three);
		JOptionPane.showMessageDialog(null, "Ascending: " +three + two + one);
	}
	else if(two > one && two > three && one > three) {
		JOptionPane.showMessageDialog(null, "Descending: "+ two + one + three);
		JOptionPane.showMessageDialog(null, "Ascending: "+ three + one + two);
	}
	else if(two> one && two > three && one < three) {
		JOptionPane.showMessageDialog(null, "Descending: " +two + three + one);
		JOptionPane.showMessageDialog(null, "Ascending: " +one + three + two);
	}
	else if(three > one && three > two && one > two) {
		JOptionPane.showMessageDialog(null,  "Descending: " +three + one + two);
		JOptionPane.showMessageDialog(null,  "Ascending: " +two + one + three);
	}
	else if(three > one && three > two && one < two) {
		JOptionPane.showMessageDialog(null, "Descending: " +three + two + one);
		JOptionPane.showMessageDialog(null, "Ascending: " +one + two + three);
	}
	
}
}
