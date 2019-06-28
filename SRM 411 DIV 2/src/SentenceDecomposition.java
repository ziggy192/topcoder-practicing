import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SentenceDecomposition {

	private List<String>[] itegrationFormWords;
	public int decompose(String sentence, String[] validWords) {
		int maxLength = 0;
		for (String validWord : validWords) {
			if (validWord.length() > maxLength) {
				maxLength = validWord.length();
			}
		}

		int[][] l = new int[validWords.length][sentence.length()];
		for (int[] ints : l) {

			Arrays.fill(ints,-1);
		}

		for (int i = 0; i < sentence.length(); i++) {
			for (int j = 0; j < validWords.length; j++) {
				if (i - validWords[j].length()+1 < 0) {
					continue;
				}
				int cost = getCost(sentence.substring(i - validWords[j].length() + 1, i + 1), validWords[j]);
				if (cost == -1) {
					l[j][i] = -1;
					continue;
				}
				int min = Integer.MAX_VALUE;
				// TODO: 6/28/19 find min
				if (i - validWords[j].length() < 0) {
					min = 0;

				} else {

					for (int k = 0; k < validWords.length; k++) {
						if (i - validWords[j].length() < 0) {
							continue;
						}
						if ((l[k][i - validWords[j].length()] < min) && l[k][i - validWords[j].length()] != -1) {
							min = l[k][i - validWords[j].length()];
						}

					}
				}

				if (min != Integer.MAX_VALUE) {

					l[j][i] = cost + min;
				} else {
					l[j][i] = -1;
				}
			}

		}
		int min = Integer.MAX_VALUE;
		// TODO: 6/28/19 find min
		for (int k = 0; k <validWords.length; k++) {
			if (l[k][sentence.length()-1] < min && l[k][sentence.length()-1]!=-1) {
				min = l[k][sentence.length()-1];
			}

		}
		if (min == Integer.MAX_VALUE) {
			min = -1;
		}
		return min;
	}


	private int getCost(String checkingWord, String validWord) {
		if (checkingWord.length() != validWord.length()) {
			return -1;
		}

		boolean[] flag = new boolean[validWord.length()];

		char[] checkingWordChars = checkingWord.toCharArray();
		char[] validWordChars = validWord.toCharArray();
		for (char checkingWordChar : checkingWordChars) {
			boolean foundTheChar = false;
			for (int i = 0; i < validWordChars.length; i++) {
				if (validWordChars[i] == checkingWordChar && flag[i] == false) {
					flag[i] = true;
					foundTheChar = true;
					break;
				}
			}
			if (!foundTheChar) {
				return -1;
			}


		}

		int count = 0;
		for (int i = 0; i < checkingWordChars.length; i++) {
			if (checkingWordChars[i] != validWordChars[i]) {
				count++;
			}
		}
		return count;
	}


}
