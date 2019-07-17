import java.util.*;
import java.math.*;

import static java.lang.Math.*;


//timeouted do ko luu quy hoach dong lai ( salary)
public class CorporationSalary {

    private String[] relations;
    private long[] salary;

    public long totalSalary(String[] relations) {
        salary = new long[relations.length];
        long result = 0;
        this.relations = relations;
        for (int i = 0; i < relations.length; i++) {
            if (salary[i] <= 0) {
                salary[i] = getSalary(i);

            }
            result += salary[i];

        }


        return result;
    }

    private long getSalary(int from) {
        long totalSalary = 0;
        if (salary[from] > 0) {
            return salary[from];
        }
        for (int i1 = 0; i1 < salary.length; i1++) {
            if (relations[from].charAt(i1) == 'Y') {
                totalSalary = totalSalary + getSalary(i1);
            }
        }
        if (totalSalary == 0) {
            totalSalary = 1;
        }
        salary[from] = totalSalary;
        return totalSalary;
    }

}
