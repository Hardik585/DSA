package lec_25;

import java.util.Scanner;

/*
 * Here the TC is n*n
 *  
 * 
*/
public class Ques_2_Count_Prime_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		for (int i = 2; i < n; i++) {
			if (isItPrime(i)) {
				c++;
			}
		}
		System.out.println(c);
	}

	private static boolean isItPrime(int i) {
		int j=2;
		while(j<i) {
			if ( i % j == 0) {
				return false;
			}
			j++;
		}
		return true;
	}

}
