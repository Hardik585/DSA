package lec_23;

public class Ques_2_Coin_Combination {
	public static void main(String[] args) {
				int amt = 8;
				int[] coins = { 2, 3, 5 };
				combination(coins, amt, "", 0);
	}
	
	public static void combination(int[] coins, int amt, String ans, int idx) {
		if (amt == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < coins.length; i++) {
			if (coins[i] <= amt) {
				combination(coins, amt - coins[i], ans + coins[i] + " ", i);
			}
		}
	}
}
