import java.util.HashMap;

public class TwoSum {
	
	/*
	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	Example:
	Given nums = [2, 7, 11, 15], target = 9,
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
	
	*/
	
	int[] nums = {2, 4, 11, 15};
	int target = 15;
	
	public TwoSum() {
		
		int[] solution = solution(this.nums, this.target);
		for (int i = 0; i < solution.length ; i++) {
			System.out.println(solution[i]);
		}
		
		System.out.println("<<<============================>>");
		
		int[] solutionTwo = solution(this.nums, this.target);
		for (int i = 0; i < solutionTwo.length ; i++) {
			System.out.println(solutionTwo[i]);
		}
	}
	
	public int[] solution(int [] nums, int target) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j <nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No solution or valid arguments"); 
	}
	
	public int[] solutionTwo(int [] nums, int target) {
		
		HashMap <Integer, Integer> myMap = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			int toComplete = target - nums[i];
			if (myMap.containsKey(toComplete)) {
				return new int[] {myMap.get(toComplete), i};
			}
			myMap.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("Not valid arguments");
	}
	
	
	public static void main(String[] args) {
		new TwoSum();
	}

}
