import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SearchBox {
	
	public int find(String text, String search, String wholeWord, int start)
	{

		int i = text.indexOf(search,start);

		if (i == -1) {
			return i;
		}

		if (wholeWord.equals("Y")) {

			text = " " + text + " ";
			return text.indexOf(" " + search + " ", start);
//			Arrays.asList(text.split(" ")).contains("search");
//			if (i == 0) {
//
//			}
//			if (i == 0 || i + search.length() == text.length() || (text.charAt(i - 1) == ' ' && text.charAt(i+search.length())==' ')) {
//				return i;
//			} else {
//				return -1;
//			}
		}


		return i;
	}
}
