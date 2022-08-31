package by.epam.module1.linear;

import java.util.Scanner;

public class LinearTask1 {

    public static void main(String[] args) {

	/*
	 * Найдите значение функции: z = ((a - 3) * b / 2) + c.
	 */

	int a;
	int b;
	int c;
	double z;

	a = enterFromConsole("Введите a = ");
	b = enterFromConsole("Введите b = ");
	c = enterFromConsole("Введите c = ");
	z = calculateFunction(a, b, c);

	System.out.println("Значение функции z = " + z);

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

    public static double calculateFunction(int a, int b, int c) {

	double result;

	result = ((a - 3) * b / 2.0) + c;

	return result;
    }

}
