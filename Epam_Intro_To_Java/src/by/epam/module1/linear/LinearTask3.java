package by.epam.module1.linear;

import java.util.Scanner;

public class LinearTask3 {

    public static void main(String[] args) {

	/*
	 * Вычислить значения выражения по формуле:
	 * 
	 * (sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(x * y);
	 */

	int x;
	int y;
	double result;

	x = enterFromConsole("Введите x = ");
	y = enterFromConsole("Введите y = ");

	result = calculateValue(x, y);

	System.out.println("Значение выражения = " + result);

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

    public static double calculateValue(int x, int y) {

	double result;

	result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

	return result;

    }
}
