
import java.util.*;

// bi tran so
public class TheLuckyNumbers {

    public int count(int a, int b) {
        int count = 0;
        long next = a;
        if (checkLucky(next)) {
            count++;
        } else {
            next = findNextFromNormal(a);
            count++;

        }


        while (next < b) {
            next = findNext(next);
            count++;
        }

        if (next > b) {
            count--;

        }


        return count;
    }

    private boolean checkLucky(long a) {

        for (char c : String.valueOf(a).toCharArray()) {
            if (c != '4' && c != '7') {
                return false;
            }
        }
        return true;
    }

    private long findNextFromNormal(long a) {
        char[] chars = ("0" + a).toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if ((chars[i] != '4' && chars[i] != '7') || (i == chars.length - 1)) {

                //make the rest 4
                for (int j = i + 1; j < chars.length; j++) {
                    chars[j] = '4';
                }


                //nextint the current
                for (int e = i ; e >= 0; e--) {
                    if (chars[e] < '4') {
                        chars[e] = '4';
                        break;
                    } else if (chars[e] < '7') {
                        chars[e] = '7';
                        break;
                    } else {
                        chars[e] = '4';
                    }
                }


                break;
            }
        }

        return Long.parseLong(new String(chars));
    }

    private long findNext(long a) {


        char[] chars = ("0" + a).toCharArray();


        char[] resultStr = Arrays.copyOfRange(chars, 0, chars.length);

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] < '4') {
                resultStr[i] = '4';
                break;
            } else if (chars[i] < '7') {
                resultStr[i] = '7';
                break;
            } else {
                resultStr[i] = '4';
            }
        }


        return Long.parseLong(new String(resultStr));
    }
}
