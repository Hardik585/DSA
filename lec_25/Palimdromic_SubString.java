package lec_25;

public class Palimdromic_SubString {
	static int c = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		partition("aaa", "");
		System.out.println(c);
	}

	public static void partition(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			
			return;
		}
		for (int i = 0; i <ques.length(); i++) {
			ans += ques.charAt(i)+"|";
			partition(ques.substring(1), ans);
			ans = ans.substring(0, ans.length()-1);
		}
	}

	public static boolean isPalindrom(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;

		}
		return true;
	}
}
