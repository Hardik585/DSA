package lec_23;

public class Ques_2_Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amt = 8;
		int[] coins = { 2, 3, 5 };
		permutation(coins, amt, "");

	}

	public static void permutation(int[] coins, int amt, String ans) {
		if (amt == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < coins.length; i++) {
			if (coins[i] <= amt) {
				permutation(coins, amt - coins[i], ans + coins[i] + " ");
			}
		}
	}

}
