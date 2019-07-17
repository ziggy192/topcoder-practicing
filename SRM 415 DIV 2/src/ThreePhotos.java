import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class ThreePhotos {

    public int removeCubes(String[] A, String[] B, String[] C) {
        int n = A.length;

        boolean[][][] a = new boolean[n][n][n];


        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
                    a[x][y][z] = true;
                }
            }
        }
        for (int x = 0; x < n; x++) {
            char[] sChars = A[x].toCharArray();
            for (int y = 0; y < n; y++) {
                if (sChars[y] == 'N') {
                        for (int z = 0; z < n; z++) {
                        a[x][y][z] = false;
                    }
                }
            }
        }

        for (int x = 0; x < n; x++) {
            char[] sChars = B[x].toCharArray();
            for (int z = 0; z < n; z++) {
                if (sChars[z] == 'N') {
                    for (int y = 0; y < n; y++) {
                        a[x][y][z] = false;
                    }
                }

            }
        }
        for (int y = 0; y < n; y++) {
            char[] sChars = C[y].toCharArray();
            for (int z = 0; z < n; z++) {
                if (sChars[z] == 'N') {
                    for (int x = 0; x < n; x++) {
                        a[x][y][z] = false;
                    }
                }

            }
        }
        for (int x = 0; x < n; x++) {
            char[] sChars = A[x].toCharArray();
            for (int y = 0; y < n; y++) {
                if (sChars[y] == 'Y') {
                    // TODO: 7/8/19 at least 1 Y here
                    boolean checkFlag = false;
                    for (int z = 0; z < n; z++) {
                        if (a[x][y][z]) {
                            checkFlag = true;
                            break;
                        }
                    }
                    if (!checkFlag) {
                        return -1;
                    }
                }
            }
        }

        for (int x = 0; x < n; x++) {
            char[] sChars = B[x].toCharArray();
            for (int z = 0; z < n; z++) {
                if (sChars[z] == 'Y') {
                    // TODO: 7/8/19 at least 1 Y here
                    boolean checkFlag = false;
                    for (int y = 0; y < n; y++) {
                        if (a[x][y][z]) {
                            checkFlag = true;
                            break;
                        }
                    }
                    if (!checkFlag) {
                        return -1;
                    }
                }

            }
        }
        for (int y = 0; y < n; y++) {
            char[] sChars = C[y].toCharArray();
            for (int z = 0; z < n; z++) {
                if (sChars[z] == 'Y') {
                    // TODO: 7/8/19 at least 1 Y here
                    boolean checkFlag = false;
                    for (int x = 0; x < n; x++) {
                        if (a[x][y][z]) {
                            checkFlag = true;
                            break;
                        }
                    }
                    if (!checkFlag) {
                        return -1;
                    }
                }

            }
        }

        int count = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
                    if (!a[x][y][z]) {
                        count++;

                    }

                }

            }
        }


        return count;
    }
}
