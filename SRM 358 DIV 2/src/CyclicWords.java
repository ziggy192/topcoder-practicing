import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CyclicWords {
	
	public int differentCW(String[] words) {

		ArrayList<CyclicWord> cyclicWords = new ArrayList<>();
		for (String word : words) {

			CyclicWord cyclicWord = new CyclicWord(word);
			if (!cyclicWords.contains(cyclicWord)) {
				cyclicWords.add(cyclicWord);
			}
		}



		return cyclicWords.size();
	}

	static class CyclicWord{
		private String content;

		public CyclicWord(String content) {
			this.content = content;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		@Override
		public boolean equals(Object obj) {

			if (obj instanceof CyclicWord) {

				return checkCyclicEquals(this.getContent(), ((CyclicWord) obj).getContent());
			} else {
				return false;
			}
		}


	}
	public static boolean checkCyclicEquals(String x, String y) {
		if (x.length() != y.length()) {
			return false;
		}

		String sum = x.concat(x);
		return sum.contains(y);
	}
}
