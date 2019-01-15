import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		double length;
		double width;
		double area;
		double perimeter;
		String choice;

		System.out.print("What is the length of the room?:  ");
		length = scnr.nextDouble();

		System.out.print("What is the width of the room?: ");
		width = scnr.nextInt();

		area = length * width;

		perimeter = length + length + width + width;

		System.out.println("Area: " + area);

		System.out.println("Perimeter: " + perimeter);

		System.out.print("Would you like to continue measuring rooms?: ");
		con = scnr.nextInt();

	}
}
