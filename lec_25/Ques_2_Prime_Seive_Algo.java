package lec_25;

import java.util.Scanner;

public class Ques_2_Prime_Seive_Algo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] prime = new int[n];
		prime[0] = 1; // 0 is not prime 
		prime[1] = 1; // 1 is also not prime
		for(int i=2; i * i<prime.length; i++) { // suppose n= 120 , so i*i < n must,
			if(prime[i]==0) {
				for(int j=2; i*j <prime.length; j++) {  
					prime[i*j]=1;
					
				}
			}
		}
		int count =0; 
		for(int i=0; i<prime.length; i++) {
			if(prime[i]==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
