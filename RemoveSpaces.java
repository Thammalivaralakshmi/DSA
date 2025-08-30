package com.strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		String sentence = "public Static void main";
		System.out.println("Original Sentence : \n"+sentence);
		System.out.println("SpaceLess Sentence: \n"+sentence.replaceAll("\\s", ""));

	}

}
