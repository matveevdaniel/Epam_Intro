package by.epam.module1.linear;

import java.util.Scanner;

public class LinearTask2 {

    public static void main(String[] args) {

	/*
	 * Вычислить значения выражения по формуле:
	 * 
	 * z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) *
	 * c + Math.pow(b, -2);
	 */

	int a;
	int b;
	int c;
	double z;

	a = enterFromConsole("Введите a = ");
	b = enterFromConsole("Введите b = ");
	c = enterFromConsole("Введите c = ");
	z = calculateValue(a, b, c);

	System.out.println("Значение выражения = " + z);

    }

    @SuppressWarnings("resource")
    private static int enterFromConsole(String message) {

	int value;

	Scanner scan;

	scan = new Scanner(System.in);

	System.out.print(message);

	while (!scan.hasNextInt()) {
	    scan.nextLine();
	    System.out.print(message);
	}

	value = scan.nextInt();

	return value;
    }

    public static double calculateValue(int a, int b, int c) {

	double result;

	result = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2.0 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

	return result;
    }
}
