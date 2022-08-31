package by.epam.module1.linear;

import java.util.Scanner;

public class LinearTask6 {

    public static void main(String[] args) {

	double x;
	double y; 
	
	boolean isPointInArea;

	x = enterFromConsole("Введите координату х = ");
	y = enterFromConsole("Введите координату y = ");

	isPointInArea = isCoordinatesInsideArea(x, y);

	System.out.println("Координата попадает в область: " + isPointInArea);

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

    public static boolean isCoordinatesInsideArea(double x, double y) {

	if ((x >= -2 & x <= 2) & (y >= 0 & y <= 4)) {
	    return true;
	} else if ((x >= -4 & x <= 4) & (y <= 0 & y >= -3)) {
	    return true;
	} else {
	    return false;
	}

    }

}
