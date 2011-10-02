package com.saurabh.programs.palindrome;

/**
 * <p>
 * Check for Palindrome. Program assumes A!=a, for A=a can be implemented using
 * equalsIgnoreCase().
 * </p>
 * 
 * @author Saurabh Jain
 */
public class Palindrome {

	public static void main(String[] args) {

		String pal1 = "A1a33a1A";
		boolean flag = true;

		System.out.println(pal1.length());

		if (pal1.length() == 1) {
			System.out.println("Input is a palindrome");
			// Implementing Base Case
		} else if (pal1.length() < 1) {
			System.out.println("Input does not have a +ve length");
			// Implementing Base Case
		} else {
			for (int i = 0, j = pal1.length() - 1; i < pal1.length() / 2; i++, j--) {
				if (pal1.charAt(i) != pal1.charAt(j)) {
					flag = false;
					break;
				} else {
					System.out.println(pal1.charAt(i) + "=" + pal1.charAt(j));
				}
			}
			if (flag == true) {
				System.out.println("Input is a palindrome");
			} else {
				System.out.println("Input is not a palindrome");
			}
		}
	}
}