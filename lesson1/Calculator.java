public class Calculator {
	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		char mathOper = '+';

		int sum = 1;
		if (mathOper == '+') {
			sum = a + b;
		} else if (mathOper == '-') {
			sum = a - b;			
		} else if (mathOper == '*') {
			sum = a * b;
		} else if (mathOper == '/') {
			sum = a / b;
		} else if (mathOper == '^') {
			for (int i = 0; i < b; i++) {
				sum *= a;
			}
		} else if (mathOper == '%') {
			sum = a % b;
		}
		System.out.println(sum);
	}
}