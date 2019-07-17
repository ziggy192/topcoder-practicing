import java.util.*;
import java.math.*;
import static java.lang.Math.*;


//sai ket qua, must find the samllest index of word that >= previous
public class OrderedSuperString {
	
	public int getLength(String[] words) {
		String superString = "";
		int previousX = 0;
		for (String word : words) {
			for (int i = word.length(); i>=0; i--) {
				String tempString = superString + word.substring(i);
				// TODO: 7/3/19 find smallest indexOf word that >=previous

				int index = 0;

				while ((index = tempString.indexOf(word, index)) != -1) {
					if (index >= previousX) {
						break;
					}
					index++;
				}
				if (index != -1) {
					superString = tempString;
					previousX = index;
					break;
				}




			}
		}
		return superString.length();
	}
}
