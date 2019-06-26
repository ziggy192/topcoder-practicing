import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class RevealTriangle {

    public String[] calcTriangle(String[] questionMarkTriangle) {

        char[] previousRow = new char[0];

        ArrayList<String> result = new ArrayList<>();
        for (int e = questionMarkTriangle.length - 1; e >= 0; e--) {
            String questionRow = questionMarkTriangle[e];

            if (questionRow.length() == 1) {
                previousRow = questionRow.toCharArray();
                result.add(0, questionRow);
                continue;
            }

            //find the not-question mark
            char[] rowArray = questionRow.toCharArray();
            int startingNumberIndex = 0;
            for (int i = 0; i < rowArray.length; i++) {
                if (rowArray[i] != '?') {
                    startingNumberIndex = i;
                    break;
                }
            }

            //breadth-first

            for (int i = startingNumberIndex + 1; i < rowArray.length; i++) {
                rowArray[i] = reviewQuestionMark(rowArray[i - 1], previousRow[i - 1]);
            }
            for (int i = startingNumberIndex - 1; i >= 0; i--) {
                rowArray[i] = reviewQuestionMark(rowArray[i + 1], previousRow[i]);
            }

            previousRow = rowArray;
            result.add(0, new String(rowArray));
        }

        return result.toArray(new String[]{});
    }

    private char reviewQuestionMark(char current, char sum) {
        int result = sum - current;
        if (result < 0) {
            result = result % 10 + 10;
        }
        return (char) ((result % 10) + '0');
    }
}
