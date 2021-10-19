package com.line.comparison;

import java.util.Scanner;

/*
 * To Check Comparison Of Two Lines
 */

public class ComparisonOfTwoLines {

	// instance Variables
	int x1, y1, x2, y2, a1, b1, a2, b2;
	Double lengthOfLine1, lengthOfLine2;

	// To Calculate Length of Lines
	private void calculateLengthOfLines() {

		Scanner line = new Scanner(System.in);

		// Take Input From User For Line1
		System.out.println("Enter the Value of x Co-ordinate 1st point: ");
		x1 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate  1nd point: ");
		y1 = line.nextInt();
		System.out.println("Enter the Value of x Co-ordinate 2nd point: ");
		x2 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate 2nd point: ");
		y2 = line.nextInt();

		// Take Input From User For Line2
		System.out.println("Enter the Value of x Co-ordinate 3rd point: ");
		a1 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate 3rd point: ");
		b1 = line.nextInt();
		System.out.println("Enter the Value of x Co-ordinate 4th point: ");
		a2 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate 4th point: ");
		b2 = line.nextInt();

		line.close();

		// Calculate length of line1
		lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("length_1 = " + lengthOfLine1);

		// Calculate length of line2
		lengthOfLine2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("length_2 = " + lengthOfLine2);

	}

	// By Using CompareTo Method to check Comparison of lines
	private void compareTwoLines() {

		int comparelines = lengthOfLine1.compareTo(lengthOfLine2);
		if (comparelines > 0) {
			System.out.println("line_1 Greater Than line_2");
		} else if (comparelines < 0) {
			System.out.println("line_1 Less Than line_2");
		} else
			System.out.println("Both lines are Equal");
	}

	public static void main(String[] args) {

		System.out.println("To Check Comparison of Two Lines: ");

		// Creation of Object
		ComparisonOfTwoLines comparisonOfTwoLines = new ComparisonOfTwoLines();
		comparisonOfTwoLines.calculateLengthOfLines();
		comparisonOfTwoLines.compareTwoLines();
	}

}
