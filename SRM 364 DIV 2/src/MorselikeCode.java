import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MorselikeCode {
	
	public String decrypt(String[] library, String message) {
		HashMap<String, String> libraryMap = new HashMap<>();
		for (String s : library) {
			String[] s1 = s.split(" ");
			libraryMap.put(s1[1], s1[0]);
		}
		String result = "";
		for (String s : message.split(" ")) {
			result+= libraryMap.getOrDefault(s, "?");
		}

		return result;
	}
}
