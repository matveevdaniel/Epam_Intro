package by.epam.module1.linear;

import java.util.Scanner;

public class LinearTask4 {

    public static void main(String[] args) {

	/*
	 * Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и
	 * целой частях). Поменять местами дробную и целую части числа и вывести
	 * полученное значение числа.
	 */

	double value;
	double result;

	value = enterFromConsole("Введите дробное значение вида nnn.ddd = ");

	result = swapDoubleValue(value);

	System.out.println(result);

    }

    @SuppressWarnings("resource")
    private static double enterFromConsole(String message) {

	double value;

	Scanner scan;

	scan = new Scanner(System.in);

	System.out.print(message);

	while (!scan.hasNextDouble()) {
	    scan.nextLine();
	    System.out.print(message);
	}

	value = scan.nextDouble();

	return value;
    }

    public static double swapDoubleValue(double value) {

	double firstNum;
	double lastNum;
	double swapFirstNum;
	double swapLastNum;
	double swapNumber;

	firstNum = (int) value;

	swapFirstNum = firstNum / 1000;

	lastNum = value - firstNum;

	swapLastNum = Math.round(lastNum * 1000);

	swapNumber = swapLastNum + swapFirstNum;

	return swapNumber;

    }
}