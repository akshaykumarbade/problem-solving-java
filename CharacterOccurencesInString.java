package problemsolving;

//This question was asked me in a Java Developer Interview.

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurencesInString {

	public static void main(String[] args) {

//		Sample Input --> String s = "INDIA"
//		Output should be like this-->
//		I -> 2
//		N -> 1
//		D -> 1
//		A -> 1

		String str = "INDIA";

		char[] charArr = str.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

		Integer count = 1;
		for (int i = 0; i < charArr.length; i++) {

			if (!charMap.containsKey(charArr[i])) {
				int value = 1;
				charMap.put(charArr[i], value);
			} else {
				charMap.put(charArr[i], ++count);
			}
		}

		for (Map.Entry<Character, Integer> m : charMap.entrySet()) {
			System.out.println(m.getKey() + "->" + m.getValue());
		}

	}

}
