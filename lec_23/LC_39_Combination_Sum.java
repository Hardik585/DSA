package lec_23;

import java.util.ArrayList;
import java.util.List;

public class LC_39_Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		combinationSumHelper(candidates, target, list, ans, 0);
		System.out.println(ans);

	}

	public static void combinationSumHelper(int[] candidates, int target, List<Integer> list,
			List<List<Integer>> ans, int idx) {
		if(target== 0) {
			ans.add(new ArrayList<Integer>(list));
			return ;
		}
		for(int i=idx; i<candidates.length; i++) {
			if(candidates[i] <= target) {
				list.add(candidates[i]);
				combinationSumHelper(candidates, target-candidates[i], list, ans, i);
				list.remove(list.size()-1);
			}
		}
	}

}
