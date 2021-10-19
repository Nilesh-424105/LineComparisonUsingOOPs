package com.line.comparison;

/* 
 *  Calculate Length Of Line
 */

import java.util.Scanner;

public class LengthOfLine {

	// instance Variables
	int x1, y1, x2, y2;
	double lengthOfLine;

	// instance Method used to Calculate Length Of Line
	private void calculateLengthOfLine() {

		Scanner line = new Scanner(System.in);

		// Take Input From User For Line
		System.out.println("Enter the Value of x Co-ordinate 1st point: ");
		x1 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate  1nd point: ");
		y1 = line.nextInt();
		System.out.println("Enter the Value of x Co-ordinate 2nd point: ");
		x2 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate 2nd point: ");
		y2 = line.nextInt();

		line.close();

		// Calculate length of line
		lengthOfLine = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		System.out.println("Length Of Line is: " + lengthOfLine);
	}

	public static void main(String[] args) {

		System.out.println("Calculate Length Of Line: ");

		// Creation of Object
		LengthOfLine lengthOfLine = new LengthOfLine();
		// Calling Method
		lengthOfLine.calculateLengthOfLine();
	}
}
