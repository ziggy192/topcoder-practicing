import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class SentenceDecomposition {


    public int decompose(String sentence, String[] validWords) {
        int[] l = new int[sentence.length()];
        Arrays.fill(l, -1);
        for (int i = 0; i < sentence.length(); i++) {

            // TODO: 6/28/19 find min
            int min = Integer.MAX_VALUE;
            for (String validWord : validWords) {
                if (i - validWord.length() + 1 < 0) {
                    continue;
                }
                String checkingWord = sentence.substring(i - validWord.length() + 1, i + 1);
                int cost = getCost(checkingWord, validWord);
                if (cost == -1) {
                    continue;
                }
                int length;
                if (i - validWord.length() < 0) {
                    length = cost;
                } else if (l[i - validWord.length()] != -1) {

                    length = cost + l[i - validWord.length()];
                } else {
                    length = -1;
                }


                if (length != -1 && length < min) {
                    min = length;
                }


            }
            if (min == Integer.MAX_VALUE) {
                min = -1;
            }
            l[i] = min;
        }

        return l[sentence.length() - 1];
    }

    public int getCost(String checkingWord, String validWord) {
        if (checkingWord.length() != validWord.length()) {
            return -1;
        }
        // TODO: 6/28/19 check enough characters

        boolean[] flag = new boolean[checkingWord.length()];
        char[] checkingWordChars = checkingWord.toCharArray();
        char[] validWordChars = validWord.toCharArray();
        for (char checkingWordChar : checkingWordChars) {
            boolean foundChar = false;
            for (int i = 0; i < validWordChars.length; i++) {
                char validWordChar = validWordChars[i];
                if (validWordChar == checkingWordChar && flag[i] == false) {
                    flag[i] = true;
                    foundChar = true;
                    break;
                }

            }
            if (!foundChar) {
                return -1;
            }
        }
        int count = 0;
        for (int i = 0; i < checkingWordChars.length; i++) {
            if (checkingWordChars[i] != validWordChars[i]) {
                count++;
            }
        }
        // TODO: 6/28/19 cacluate cost
        return count;
    }


}
