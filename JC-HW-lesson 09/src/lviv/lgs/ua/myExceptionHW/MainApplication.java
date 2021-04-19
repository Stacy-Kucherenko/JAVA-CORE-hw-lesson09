package lviv.lgs.ua.myExceptionHW;

import java.util.Scanner;

public class MainApplication {
	
	public static void main(String[] args) throws MyException, IllegalAccessException {
		
		Scanner sc = new Scanner(System.in);

		int a;
		int b;

		System.out.println("Please enter the first integer: ");
		
		if (sc.hasNextInt()) {
			a = sc.nextInt();

			System.out.println("Please enter the second integer: ");
		
			if (sc.hasNextInt()) {
				b = sc.nextInt();
				
				Methods result = new Methods(a, b);
				
				Methods.displayResult(result.toAdd());
				Methods.displayResult(result.toMinus());
				Methods.displayResult(result.toMultiply());
				Methods.displayResult(result.toDevide());

		
	}
			else
				System.out.println("ERROR! Enter an INTEGER number");
		}
}
}

	
