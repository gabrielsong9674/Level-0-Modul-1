
public class Fibonacchi {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3 = 1;
		for (int i = 0; i <= 11; i++) {
			System.out.println(num1);
			num1 = num2;
			num2 = num3;
			num3 = num2 + num1;

		}
	}
}
// 0 1 2 3 4 5 6 7 8 9 10 11
// 0 1 1 2 3 5 8 13 21 34 55 89