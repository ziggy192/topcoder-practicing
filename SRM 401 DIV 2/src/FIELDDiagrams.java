public class FIELDDiagrams {

    private int[][] l;

    public long countDiagrams(int fieldOrder) {
        this.l = new int[fieldOrder + 1][fieldOrder + 1];
        int result = 0;
        for (int i = 1; i <= fieldOrder; i++) {
            result += calculate(fieldOrder, i);
        }
        return result;
    }

    int calculate(int level, int maxValue) {

        if (l[level][maxValue] != 0) {
            return l[level][maxValue];
        }


        if (level == 1) {
            l[level][maxValue] =1;
        } else if (maxValue == 0) {

            l[level][maxValue] = 1;
        } else {
            int min = Math.min(level - 1, maxValue);

            for (int i = 0; i <= min; i++) {
                l[level][maxValue] += calculate(level - 1, i);
            }
        }
        return l[level][maxValue];
    }


}
