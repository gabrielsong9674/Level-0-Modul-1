import javax.swing.JOptionPane;

public class xGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String emerson = "magical abilities";
		String grace = "tennis";
		String sofia = "eating";
		String priyankaa = "flexibility";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		for (int i = 0; i < 10; i++) {

			String name = JOptionPane.showInputDialog("Enter a name");
			// 3. Show the superpower in a pop-up, depending on the name entered.
			if (name.equals("Emerson") || name.equals("emerson")) {
				JOptionPane.showMessageDialog(null, "Emerson's super power is " + emerson);
			} else if (name.equals("Grace") || name.equals("grace")) {
				JOptionPane.showMessageDialog(null, "Grace's super power is " + grace);
			} else if (name.equals("Sofia") || name.equals("sofia")) {
				JOptionPane.showMessageDialog(null, "Sofia's super power is " + sofia);
			} else if (name.equals("Priyankaa") || name.equals("priyankaa")) {
				JOptionPane.showMessageDialog(null, "Priyankaa's super power is " + priyankaa);
			} else {
				String power = JOptionPane.showInputDialog("I don't know. What is " + name + " 's super power?");
				JOptionPane.showMessageDialog(null, name + " 's superpower is " + power);
			}
		}
	}
}
