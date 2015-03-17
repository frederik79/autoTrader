package countMultiplicativePairs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Solution {
	public int solution(int[] A, int[] B) 
	{
		int scale = 1000000;
		int N = A.length;
		int count = 0;
		int left = 0;
		int right = N - 1;
		int C_left = 0;

		while (left < right) {
			// to avoid rounding errors, use multiplication
			C_left = A[left] * scale + B[left];
			if (C_left >= scale) {

				if (C_left * (A[right] * scale + B[right]) >= (C_left + (A[right]
						* scale + B[right]))
						* scale) {
					// if C[left],C[right] is ok, that means that all elements
					// C[left++],C[right] to satisfy condition
					count += right - left;
					right--;
				} else {
					left++;
				}
			} else {
				left++;
			}
		}
		
		if (count > 1000000000)
			return 1000000000;
		else 
		{
			return count;
		}
	}

	@Test
	public void test1() {
		int a[] = { 0, 1, 2, 2, 3, 5 };
		int b[] = { 500000, 500000, 0, 0, 0, 20000 };

		Solution solution = new Solution();
		int solution2 = solution.solution(a, b);

		assertEquals(8, solution2);
	}

	@Test
	public void test2() {
		int a[] = { 0, 1, 2, 3 };
		int b[] = { 0, 1, 2, 4 };

		Solution solution = new Solution();
		int solution2 = solution.solution(a, b);

		assertEquals(1, solution2);
	}
}
