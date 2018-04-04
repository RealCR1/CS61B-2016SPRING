public class Exercise1_2_6 {
	public static void main(String[] args) {
		String s1 = "ACTGACG";
		String s2 = "TGACGAC";

		System.out.println("s1 is a circular rotation of s2." + isCircular(s1, s2).toString());

	}

	public boolean isCircular(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		} else {
			//indexOf() will return -1 if the s2 didn't find in s1.concact(s1).
			return (s1.concact(s1).indexOf(s2) != -1);
		}
	}
}