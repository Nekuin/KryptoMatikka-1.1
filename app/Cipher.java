package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cipher {
	
	public String replaceLetters(String input, char key, char val) {
		char[] arr = input.toCharArray();
		String str = "";
		for(char c : arr) {
			if(Character.toString(c).equals(Character.toString(key))) {
				c = val;
			} else {
				//keep space as space, but replace any other char with 0
				c = (Character.toString(c).equals(" ")) ? c : '0';
			}
			
			str += Character.toString(c);
		}
		//System.out.println("chipered: " + str + " input: " + input);
		return str;
	}
	
	public String buildAString(Map<Character, Character> charMap, String input, Cipher c) {
		List<String> lists = new ArrayList<>();
		charMap.forEach((k, v) -> {
			lists.add(c.replaceLetters(input, k, v));
		});

		String finalString = String.valueOf(lists.get(0));
		
		for(String str : lists) {
			finalString = mergeString(finalString, str);
		}
		
		finalString = mergeString(finalString, input);
		
		return finalString;
	}
	
	public String mergeString(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		String str = "";
		for(int i = 0; i < arr1.length; i++) {
			if(Character.toString(arr1[i]).equals("0")) {
				//System.out.println();
				arr1[i] = arr2[i];
			}
			str += Character.toString(arr1[i]);
		}
		//System.out.println("Merging " + str1 + " " + str2 + ", result: " + str);
		return str;
	}
}
