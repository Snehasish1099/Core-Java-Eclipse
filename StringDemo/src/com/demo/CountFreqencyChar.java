package com.demo;

public class CountFreqencyChar {

	static void printFrequency(String str) {

		int[] freq = new int[str.length()];
		int i, j;

		// converting string to array
		char ch[] = str.toCharArray();

		// setting the frequency
		for (i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					freq[i]++;
					ch[j] = '0';
				}

			}
		}

		for (i = 0; i < freq.length; i++) {
			if (ch[i] != ' ' && ch[i] != '0')// ignoring spaces and duplicate value
			{
				System.out.println(ch[i] + ": " + freq[i]);
			}
		}

		// duplicate values
		System.out.println("Duplicate characters: ");
		for (i = 0; i < freq.length; i++) {
			if (ch[i] != ' ' && ch[i] != '0')// ignoring spaces and duplicate value
			{
				if (freq[i] > 1)
					System.out.print(ch[i] + ": ");
			}
		}

	}

	public static void main(String args[]) {

		String str1 = "Java is easy";
		printFrequency(str1);

	}
}
