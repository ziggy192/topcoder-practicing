import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TemplateMatching {
	
	public String bestMatch(String text, String prefix, String suffix) {
		String result = "";
		int resultPrefixPoint=0;
		int resultPoint = -1;
		for (int i = 0; i < text.length(); i++) {
			for (int j = i; j < text.length(); j++) {
				String str = text.substring(i, j + 1);
				// TODO: 7/18/19 cal point
				int prefixPoint = prefixPoint(str, prefix);
				int suffixPoint = prefixPoint(suffix, str);
				int totalPoint = prefixPoint + suffixPoint;
				if (resultPoint == -1
						|| ((totalPoint > resultPoint)
						|| (totalPoint == resultPoint & prefixPoint > resultPrefixPoint))
						|| (totalPoint == resultPoint & prefixPoint == resultPrefixPoint && result.compareTo(str) > 0)) {
					result = str;
					resultPoint = totalPoint;
					resultPrefixPoint = prefixPoint;
				}
			}
		}
		new ArrayList().add()
		return result;
	}

	private int prefixPoint(String str, String prefix) {
		int maxIndex = Math.min(prefix.length(), str.length());
		for (int index = maxIndex; index > 0; index--) {
			if (prefix.substring(prefix.length()-index).equals(str.substring(0, index))) {
				return index;
			}

		}
		return 0;
	}
}
