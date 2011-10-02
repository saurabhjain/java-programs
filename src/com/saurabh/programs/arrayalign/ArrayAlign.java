package com.saurabh.programs.arrayalign;

/**
 * @author Saurabh Align similar elements Input: [a, 2, B, b, C, F, 1] Output:
 *         [a, b, B, C, F, 2, 1]
 */
public class ArrayAlign {

	/*
	 * Function to determine the type of the first element of the substring to
	 * be aligned together.
	 */
	public static char firstelem(StringBuffer s, int x) {
		char e = 'e';
		if (Character.isDigit(s.charAt(x))) {
			char d = 'd';
			return d;

		} else if (Character.isLowerCase(s.charAt(x))) {
			char l = 'l';
			return l;

		} else if (Character.isUpperCase(s.charAt(x))) {
			char u = 'u';
			return u;

		}
		return e;
	}

	/*
	 * Function to align the similar elements within a substring.
	 */
	public static int align(int k, char check, StringBuffer sb) {
		if (check == 'd') {
			char temp;
			for (int j = 1; j < sb.length(); j++) {
				if (Character.isDigit(sb.charAt(j))) {
					temp = sb.charAt(k);
					sb.setCharAt(k, sb.charAt(j));
					sb.setCharAt(j, temp);
					k += 1;
				}
			}
		} else if (check == 'l') {
			char temp;
			for (int j = 1; j < sb.length(); j++) {
				if (Character.isLowerCase(sb.charAt(j))) {
					temp = sb.charAt(k);
					sb.setCharAt(k, sb.charAt(j));
					sb.setCharAt(j, temp);
					k += 1;
				}
			}
		} else if (check == 'u') {
			char temp;
			for (int j = 1; j < sb.length(); j++) {
				if (Character.isUpperCase(sb.charAt(j))) {
					temp = sb.charAt(k);
					sb.setCharAt(k, sb.charAt(j));
					sb.setCharAt(j, temp);
					k += 1;
				}
			}
		}
		return k;
	}

	public static void main(String[] args) {

		// ========================================================
		// Variables, Checks, String, StringBuffer initialization
		// ========================================================
		int k = 1, x = 0;
		char check;
		// String arr = "a2BbCF1Mbg1J5Ghj";
		StringBuffer sb = new StringBuffer("a2BbCF1");
		// sb.append(arr);

		// ====================================================================
		// Checking the first element's type, aligning the substring, updating
		// variables.
		// ====================================================================
		check = firstelem(sb, x);
		k = align(k, check, sb);
		x = k;
		// System.out.println(sb);

		// ==================================================================
		// Checking the first element's type, aligning the second substring
		// ==================================================================
		check = firstelem(sb, x);
		k = align(k, check, sb);

		// ======================
		// Final aligned output.
		// ======================
		System.out.println(sb);
	}
}