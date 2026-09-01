package lec_24;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques ="aab";
		List<List<String>> ll = new ArrayList<List<String>>();
		List<String> list = new ArrayList<String>();
		partition(ques, "", list, ll);
		
		System.out.println(ll);
	}
	
	public static void partition(String ques, String ans ,List<String> list ,List<List<String>> ll ) {
		if(ques.length() ==0) {
		   ll.add(new ArrayList<String>(list));
			return ;
		}
		for(int i=1; i<=ques.length(); i++) {
			String s = ques.substring(0, i);
			if(isPalindrom(s)) {
				list.add(s);
				partition(ques.substring(i), ans+ s +"|", list , ll);
				list.remove(list.size()-1);
			}
		}
	}
	
	public static boolean isPalindrom(String str) {
		int i=0, j=str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;j--;
			
		}
		return true;
	}

}
