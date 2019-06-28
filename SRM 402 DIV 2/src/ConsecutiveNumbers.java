import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class ConsecutiveNumbers {

    public int[] missingNumber(int[] numbers) {
        Arrays.sort(numbers);
        boolean continuous = true;
        int discontinuedNum = -1;
        if (numbers.length > 1) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i]-numbers[0]!=i) {
                    if ((numbers[i] - numbers[0] == i + 1)) {
                        if (discontinuedNum == -1) {

                            discontinuedNum = numbers[i] - 1;
                        }
                    }else{
                        return new int[]{};
                    }
                }
            }
        }
        if (discontinuedNum == -1) {
            if (numbers[0] - 1 > 0) {

                return new int[]{numbers[0] - 1, numbers[numbers.length - 1] + 1};
            } else {
                return new int[]{    numbers[numbers.length - 1] + 1};

            }

        } else {
            return new int[]{discontinuedNum};
        }
    }
}
