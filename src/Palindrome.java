/*
 Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
 */


public class Palindrome {
	
	public Palindrome() {
		
		System.out.println(solution(56788765));
	}
	
	public boolean solution(int target) {
		
		if (target < 0 || target % 10 == 0 && target != 0) {
			return false;
		}
		
		int reversedInteger = 0;
		
		while (target > reversedInteger) {
			reversedInteger = reversedInteger * 10 + target % 10;
			target /= 10;
		}
		
		return target == reversedInteger || target == reversedInteger/10;
	}

	
	public static void main(String[] args) {
		new Palindrome();

	}

}
