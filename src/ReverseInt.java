
public class ReverseInt {
	
	/*
	
	Given a 32-bit signed integer, reverse digits of an integer.

	Example 1:

	Input: 123
	Output: 321
	Example 2:

	Input: -123
	Output: -321
	Example 3:

	Input: 120
	Output: 21
	Note:
	Assume we are dealing with an environment which could only store 
	integers within the 32-bit signed integer range: [−231,  231 − 1]. 
	For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
	
	 */

	int Input = 123;
	
	public ReverseInt() {
		
		System.out.print(solution(this.Input));
	}
	
	public int solution(int target) {
		
		String tempTarget = String.valueOf(target);
		char[] tempTargetChar = tempTarget.toCharArray();
		String tempNewInt = "";
		
		for (int i = tempTargetChar.length; i <= 0; i--) {
			tempNewInt = tempNewInt + tempTargetChar[i];
		}
		
		int toReturn = Integer.valueOf(tempNewInt);
		
		return toReturn;
	}
	
	
	public static void main(String[] args) {
		
		new ReverseInt();

	}

}