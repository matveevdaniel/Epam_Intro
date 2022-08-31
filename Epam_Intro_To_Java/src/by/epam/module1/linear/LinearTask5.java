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
	LinearTask5 task;

	task = new LinearTask5();

	seconds = task.enterFromConsole("Введите 5-значное время в секундах: ");

	formatedTime = task.getTimeFromSeconds(seconds);

	System.out.println(formatedTime);

    }

    public String getTimeFromSeconds(int timeInSeconds) {

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

    @SuppressWarnings("resource")
    public int enterFromConsole(String message) {

	int value;
	
	Scanner scan;

	scan = new Scanner(System.in);

	

	//do {
	    System.out.print(message);
	    while (!scan.hasNextInt()) {
	    scan.nextLine();
	    System.out.print(message);
	    }
	//System.out.print("Int: ");
	value = scan.nextInt();
	//}
	//while(value<0 || value>99999);

	return value;
    }

}
