import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class OrderedSuperString {
	
	public int getLength(String[] words) {
		String superString = "";
		int previousX = 0;
		for (String word : words) {
			for (int i = word.length(); i>=0; i--) {
				String tempString = superString + word.substring(i);
				if (tempString.lastIndexOf(word) >= previousX) {
					superString = tempString;
					previousX = tempString.lastIndexOf(word);
					break;
				}
			}
		}
		return superString.length();
	}
}
