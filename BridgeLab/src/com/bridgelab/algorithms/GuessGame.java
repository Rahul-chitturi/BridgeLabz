package com.bridgelab.algorithms;
/******************************************************************************
	 * Purpose:  Guess the number given by user and check by asking user,, imlementing binary search 
     *
	 * @author RAHUL CHITTURI
     * @version 10.0
     * @since 11-11-2019
	 ******************************************************************************/

import java.util.Scanner;

public class GuessGame {

	static Scanner S = new Scanner(System.in);

	static int find() {

		int low = 0, high = 127, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			int c = S.nextInt();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args) {

		System.out.println("guess a no between 0 to 127 ");
		S.next();
		try {
			System.out.println("guessed no is " + find());
		} catch (Exception e) {
			System.out.println("enter correct input");
		}
	}
}