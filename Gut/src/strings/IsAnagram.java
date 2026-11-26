package strings;

import java.util.HashMap;

public class IsAnagram {

	public static boolean isAnagram(String str1, String str2) {
		if (str1 == null || str2 == null || (str1.length() != str2.length())) {
			return false;
		}

		HashMap<Character, Integer> map = new HashMap<>();

		char letter;

		for (int i = 0; i < str1.length(); i++) {
			letter = str1.charAt(i);
			map.put(letter, map.getOrDefault(letter, 0) + 1);
		}

		for (int i = 0; i < str2.length(); i++) {
			letter = str2.charAt(i);
			if (!map.containsKey(letter) || map.get(letter) == 0) {
				return false;
			} else {
				map.put(letter, map.get(letter) - 1);
			}
		}

		return true;
	}

	public static void main(String[] args) {
		boolean status = isAnagram("m", "mm");
		if (status) {
			System.out.println("Both Strings are Anagrams !");
		} else {
			System.out.println("Both Strings are not Anagrams !");
		}
	}
}
