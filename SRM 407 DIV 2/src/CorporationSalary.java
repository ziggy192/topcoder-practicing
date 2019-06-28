import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class CorporationSalary {

    private String[] relations;

    public long totalSalary(String[] relations) {
        int[] salary = new int[relations.length];
        int result = 0;
        this.relations = relations;
        for (int i = 0; i < relations.length; i++) {
            String row = relations[i];
            if (salary[i] <= 0) {
                salary[i] = getSalary(i, salary);
                result += salary[i];
            }

        }


        return result;
    }

    private int getSalary(int from, int[] salary) {
        int totalSalary = 0;
        if (salary[from] > 0) {
            return salary[from];
        }
        for (int i1 = 0; i1 < salary.length; i1++) {
            if (relations[from].charAt(i1) == 'Y') {
                totalSalary = totalSalary + getSalary(i1, salary);
            }
        }
        if (totalSalary == 0) {
            totalSalary = 1;
        }
        return totalSalary;
    }

}
