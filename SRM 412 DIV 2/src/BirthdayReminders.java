import java.util.*;
import java.math.*;
import java.util.stream.Collectors;

import static java.lang.Math.*;

public class BirthdayReminders {

    static String[] friendNames;
    static int[] birthDates;

    static String[] occasions;

    public String[] remind(String[] friendNames, int[] birthDates, int currentDate, String[] occasions, int[] days, int k) {
        this.friendNames = friendNames;
        this.occasions = occasions;
        this.birthDates = birthDates;
        List<Occasion> occasionList = new ArrayList<>();
        for (int i = 0; i < birthDates.length; i++) {
            int b = birthDates[i];

            for (int j = 0; j < days.length; j++) {
                int start = (int) Math.ceil(((double) currentDate - b) / days[j]);
                for (int l = start; l < start + k; l++) {
                    occasionList.add(new Occasion(i, b + l * days[j], j, l));
                }


            }
        }

        


        occasionList.sort(new Comparator<Occasion>() {
            @Override
            public int compare(Occasion o1, Occasion o2) {
                return o1.compareTo(o2);
            }
        });

        return occasionList.subList(0,k).stream().map(occasion -> occasion.toString()).toArray(String[]::new);
    }

    static class Occasion implements Comparable<Occasion> {
        int friendIndex;
        int date;
        int occationIndex;
        int number;


        public Occasion(int friendIndex, int date, int occationIndex, int number) {
            this.friendIndex = friendIndex;
            this.date = date;
            this.occationIndex = occationIndex;
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getOccationIndex() {
            return occationIndex;
        }

        public void setOccationIndex(int occationIndex) {
            this.occationIndex = occationIndex;
        }

        public int getFriendIndex() {
            return friendIndex;
        }

        public void setFriendIndex(int friendIndex) {
            this.friendIndex = friendIndex;
        }

        public int getDate() {
            return date;
        }

        public void setDate(int date) {
            this.date = date;
        }

        @Override
        public int compareTo(Occasion o) {
            if (o.getDate() != this.getDate()) {
                return this.getDate() - o.getDate();
            } else if (o.getOccationIndex() != this.occationIndex) {
                return this.getOccationIndex() - o.getOccationIndex();
            } else {
                return this.getFriendIndex() - o.getFriendIndex();
            }

        }

        @Override
        public String toString() {
            return String.format("%s. %s %s (%s)", date, friendNames[friendIndex], occasions[occationIndex], number);

        }
    }
}
