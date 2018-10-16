package com.assesment;

public class LongestString {
	public String longestStringMethod() {

		String s = "The cow jumped over the moon.";
		String[] word = s.split(" ");
		String maxlethWord = "";
		for (int i = 0; i < word.length; i++) {
			if (word[i].length() >= maxlethWord.length()) {
				maxlethWord = word[i];
			}
           			}
		return maxlethWord;
	}

	public static void main(String[] args) {
		LongestString ls = new LongestString();
		System.out.println(ls.longestStringMethod());
	}
}