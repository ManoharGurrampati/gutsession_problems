package strings;

import java.util.HashMap;

//"A support team receives a string of characters from a log. 
//They want the first character that appears only once, and they want its position. 
//If every character repeats, tell them there is none."

public class FirstUniqueCharacter {
	public static void main(String[] args) {
		String str = "swiss";
		int index = findFirstUniqueChar(str);
		if (index >= 0 && index < str.length()) {
			System.out.println(
					"First unique character is found at : " + index + " | & Character is : " + str.charAt(index));
		} else {
			System.out.println("No unique character found!");
		}
	}

	private static int findFirstUniqueChar(String str) {
		int index = -1;
//		Checking edges cases.
		if (str == null || str.length() == 0) {
			return index;
		}

		char letter;
		HashMap<Character, Integer> map = new HashMap<>();
//		Storing Character and its count.
		for (int i = 0; i < str.length(); i++) {
			letter = str.charAt(i);
			map.put(letter, map.getOrDefault(letter, 0) + 1);
		}
//		Checks which character has count 1.
		for (int i = 0; i < str.length(); i++) {
			letter = str.charAt(i);
			if (map.get(letter) == 1) {
				index = i;
				break;
			}
		}
		return index;
	}
}
