package lviv.lgs.ua.myExceptionHW;

public class Methods {

private static int a;
private static int b;
public Methods(int a1, int b1) {

	a = a1;
	b = b1;
}

public static  void check() throws MyException, IllegalAccessException {
	if ((a < 0) && (b < 0)) {
		throw new IllegalArgumentException();
	}
	
	if  (((a == 0) && (b != 0)) || ((a != 0) && (b == 0))) {
		throw new ArithmeticException();
	}
	
	if ((a == 0) && (b == 0)) {
		throw new IllegalAccessException();
	}
	if ((a > 0) && (b > 0)) {
		throw new MyException("ERROR. This is just no-working methods");
	}
}

public int toAdd() throws MyException, IllegalAccessException {
	Methods.check();
	return a + b;
	
}

public int toMinus() throws MyException, IllegalAccessException {
	Methods.check();
	return a - b;
	
}

public int toMultiply() throws MyException, IllegalAccessException {
	Methods.check();
	return a * b;
	
}
public int toDevide() throws MyException, IllegalAccessException {
	Methods.check();
	return a / b;
	
}

static void displayResult(double sum) {
	System.out.println("The result is " + sum);
}
	
}
