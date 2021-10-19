package com.line.comparison;

/* 
 *  Calculate Length Of Line
 */

import java.util.Scanner;

/*
 *  To Check Equality Of Lines
 */

public class EqualityOfLines {

	// instance Variables
	private int x1, y1, x2, y2, a1, b1, a2, b2;
	private Double lengthOfLine1, lengthOfLine2;

	// instance Method to Calculate Length Of Lines
	public void calculateLengthOfLines() {

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
		System.out.println("length_of_line1 = " + lengthOfLine1);

		// Calculate length of line2
		lengthOfLine2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("length_of_line2 = " + lengthOfLine2);

	}

	// By Using Equals Method To Check Equality of Lines
	private void checkEqualityOfLines() {

		boolean equality = lengthOfLine1.equals(lengthOfLine2);

		if (equality) {
			System.out.println("Both line are equal");

		} else {
			System.out.println("Both line are not equal");
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to line Comparision Computation Program");

		// creation of Object
		EqualityOfLines equalityOfLines = new EqualityOfLines();
		equalityOfLines.calculateLengthOfLines();
		equalityOfLines.checkEqualityOfLines();
	}

}
