import javax.swing.JOptionPane;

public class SpudCounter {
public static void main(String[] args) {
	String potatoes = JOptionPane.showInputDialog("How many potatoes?");
	int num= Integer.parseInt(potatoes);
	for (int i = 0; i < num; i++) {
		System.out.println(i + " potatoes");
		if(num > 3) {
			System.out.println("four");
		}
	}
			
}
}
