import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Undo {

    public String getText(String[] commands, int[] time) {
        String[] states = new String[commands.length];

        String currentState = "";
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            if (command.startsWith("type")) {
                currentState += command.substring(5);

            } else {
                int currentTime = time[i];

                int timeValue = Integer.parseInt(command.substring(5));

                int foundState = -1;
                for (int j = time.length - 1; j >= 0; j--) {
                    if (time[j] < currentTime - timeValue) {
                        foundState = j;
                        break;
                    }
                }

                if (foundState!=-1) {
                    currentState = states[foundState];
                } else {
                    currentState = "";
                }

            }

            states[i] = currentState;
        }

        return currentState;
    }
}
