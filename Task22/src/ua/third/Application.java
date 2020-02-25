package ua.third;

interface Number {
	public void printNumber();
}

public class Application {

	public static void main(String[] args) {
		
		Number minFloat = () -> System.out.println(Float.MIN_VALUE);
		Number maxFloat = () -> System.out.println(Float.MAX_VALUE);
		Number minDouble = () -> System.out.println(Double.MIN_VALUE);;
		Number maxDouble = () -> System.out.println(Double.MAX_VALUE);
		
		minFloat.printNumber();
		maxFloat.printNumber();
		minDouble.printNumber();
		maxDouble.printNumber();
	}
	
}
