package by.epam.module1.linear;

import java.util.Scanner;

public class LinearTask5 {

    public static void main(String[] args) {

	/*
	 * Дано натуральное число T,которое представляет длительность прошедшего времени
	 * в секундах. Вывести данное значение длительности в часах, минутах и секундах
	 * в следующей форме: HHч MMмин SSс.
	 */

	int seconds;

	String formatedTime;

	seconds = enterFromConsole("Введите время в секундах от 0 до 360000(включительно): ");

	formatedTime = getTimeFromSeconds(seconds);

	System.out.print("Форматированное время: " + formatedTime);

    }

    @SuppressWarnings("resource")
    private static int enterFromConsole(String message) {

	int value;

	Scanner scan;

	scan = new Scanner(System.in);

	do {
	    System.out.print(message);

	    while (!scan.hasNextInt()) {
		scan.nextLine();
		System.out.print(message);
	    }

	    value = scan.nextInt();

	} while (value < 0 || value > 360000);

	return value;
    }

    public static String getTimeFromSeconds(int timeInSeconds) {

	int hours;
	int minuts;
	int seconds;

	String time;

	hours = (timeInSeconds / 60) / 60;
	minuts = (timeInSeconds / 60) % 60;
	seconds = timeInSeconds % 60;

	time = String.format("%02dч %02dмин %02dс", hours, minuts, seconds);

	return time;

    }
}
