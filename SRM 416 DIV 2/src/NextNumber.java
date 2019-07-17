
public class NextNumber {
	
	public int getNextNumber(int N) {

		String binary = toBinary(N);

		binary = "0" + binary;
		String nextBin = nextBinary(binary);
		return toDecimal(nextBin);

	}

	private String nextBinary(String bin) {
		// TODO: 7/17/19 find the nearest 1 chain
		char[] binChars = bin.toCharArray();
		boolean passed1 = false;
		int index = -1;
		int count1 = 0;
		for (int i = binChars.length - 1; i >= 0; i--) {
			if (binChars[i] == '1') {
				passed1 = true;
				count1++;
			}
			if (binChars[i] == '0' && passed1) {
				index = i;
				break;
			}
		}
		// TODO: 7/17/19 move left 1
		// TODO: 7/17/19 move the rest to back
		count1--;
		binChars[index] = '1';
		for (int i = binChars.length - 1; i > index; i--) {
			if (count1 > 0) {
				count1--;
				binChars[i] = '1';
			} else {
				binChars[i] = '0';
			}
		}

		return new String(binChars);

	}
	private String toBinary(int n) {

		String result = "";
		while (n > 0) {
			result = (n % 2)+result;
			n = n / 2;
		}
		return result;
	}

	private int toDecimal(String binary) {
		int result = 0;
		char[] charArray = binary.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '1') {
				result += Math.pow(2, charArray.length - i - 1);
			}
		}
		return result;
	}


}
