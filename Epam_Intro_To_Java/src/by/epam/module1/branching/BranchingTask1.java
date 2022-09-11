package by.epam.module1.branching;

public class BranchingTask1 {

    public static void main(String[] args) {

	/*
	 * Даны два угла треугольника (в градусах). Определить, существует ли такой
	 * треугольник, и если да, то будет ли он прямоугольным.
	 */

	boolean isRightTriangle;

	isRightTriangle = hasRightAngle(140, 50);

	System.out.println("Является ли треугольник прямоугольным: " + isRightTriangle);

    }

    public static boolean hasRightAngle(int firstAngle, int secondAngle) {

	if ((firstAngle + secondAngle < 180) && ((firstAngle != 0) && (secondAngle != 0))) {

	    if ((firstAngle + secondAngle == 90) || (firstAngle == 90 || secondAngle == 90)) {

		System.out.println("Треугольник существует.");
		return true;
	    }

	    System.out.println("Треугольник существует.");

	}

	else {

	    System.out.println("Треугольник не существует.");

	}

	return false;
    }
}
