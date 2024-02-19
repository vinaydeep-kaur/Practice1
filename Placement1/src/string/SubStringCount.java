package string;

public class SubStringCount {
	
	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAAAAaA"));
	}

	public static int numJewelsInStones(String jewels, String stones) {
		int jCount = 0;
		for (int i = 0; i < stones.length();) {
			int k = 0;
			for (int j = 0; j < jewels.length(); j++) {
				if (jewels.charAt(j) != stones.charAt(j + k)) {
					i++;
					continue;
				}
				k++;
				if (k == jewels.length()) {
					jCount++;
				}
			}
		}

		return jCount;
	}
}
