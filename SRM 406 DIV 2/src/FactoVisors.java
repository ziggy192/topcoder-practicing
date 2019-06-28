import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class FactoVisors {

    public int getNum(int[] divisors, int[] multiples) {
        List<Integer> result = new ArrayList<>();

        int maxDivisor = 0;
        for (int divisor : divisors) {
            if (divisor > maxDivisor) {
                maxDivisor = divisor;
            }
        }

        int minMultiple = multiples[0];
        for (int multiple : multiples) {
            if (minMultiple > multiple) {
                minMultiple = multiple;
            }
        }


        if (minMultiple % maxDivisor != 0) {
            return 0;
        }

        int h = minMultiple / maxDivisor;
        int hSquare = (int) Math.floor(Math.sqrt(h));

        for (int i = 1; i <= hSquare; i++) {
            if (h % i == 0) {
                int temp = maxDivisor * i;
                if (check(temp, divisors, multiples)) {

                    result.add(temp);
                }
                if (h / i == i) {
                    continue;
                }
                temp = maxDivisor * (h / i);
                if (check(temp, divisors, multiples)) {

                    result.add(temp);
                }
            }
        }
        return result.size();
    }

    private boolean check(int temp, int[] divisors, int[] multiples) {
        for (int divisor : divisors) {
            if (temp % divisor != 0) {
                return false;
            }
        }
        for (int multiple : multiples) {
            if (multiple % temp != 0) {
                return false;
            }
        }
        return true;
    }


}
