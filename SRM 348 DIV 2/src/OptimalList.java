import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class OptimalList {

    public String optimize(String inst) {
        Direction result = new Direction(0, 0);
        for (char c : inst.toCharArray()) {
            Direction curDir = Direction.valueOf(c);
            result.add(curDir);
        }
        return result.printOutResult();
    }


    static class Direction {
        int x = 0;
        int y = 0;

        public Direction(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        static Direction valueOf(char direction) {
            switch (direction) {
                case 'N':
                    return new Direction(0, 1);
                case 'S':
                    return new Direction(0, -1);
                case 'W':
                    return new Direction(-1, 0);
                case 'E':
                    return new Direction(1, 0);
            }

            return null;
        }


        public void add(Direction curDir) {
            this.x += curDir.getX();
            this.y += curDir.getY();
        }

        public String printOutResult() {
            String result = "";
            if (x > 0) {

                for (int i = 0; i < Math.max(x, x * -1); i++) {

                    result += "E";
                }
            }
            if (y > 0) {

                for (int i = 0; i < Math.max(y, y * -1); i++) {

                    result += "N";
                }
            }

            if (y < 0) {
                for (int i = 0; i < Math.max(y, y * -1); i++) {

                    result += "S";
                }
            }
            if (x < 0) {
                for (int i = 0; i < Math.max(x, x * -1); i++) {

                    result += "W";
                }
            }


            return result;

        }
    }

}
