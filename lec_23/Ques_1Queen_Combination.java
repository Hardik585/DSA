package lec_23;

public class Ques_1Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int queen =2;
		int n =4;
		boolean[] board = new boolean[n];
		combination(board, queen, "", 0, 0);
	}
	
	public static void combination(boolean[] board, int tq, String ans, int qpsf , int idx) {
		if(tq==qpsf) {
			System.out.println(ans);
			return ;
		}
		for(int i=idx; i<board.length; i++) {
			if(!board[i]) {
				board[i]= true;
				combination(board, tq, ans+"b"+i+"q"+qpsf, qpsf+1 , i+1);
				board[i]= false;
			}
		}
	}

}
