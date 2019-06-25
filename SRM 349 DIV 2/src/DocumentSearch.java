import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DocumentSearch {
	
	public int nonIntersecting(String[] doc, String search) {
		String joinDoc = String.join("", doc);


		int i = 0;
		int count = 0;
		int j = 0;
		while (j > -1) {
			j = joinDoc.indexOf(search, i);
			if (j > -1) {
				i = j + search.length();
				count++;
			}
		}






		return count;
	}
}
