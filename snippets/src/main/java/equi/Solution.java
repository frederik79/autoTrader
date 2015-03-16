package equi;

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution 
{
	
	public int  solution(int[] A)
	{
		int index = -1;
		long sum = 0;
		
		for (int i = 0 ; i < A.length; i++)
		{
			sum+=A[i];
		}
		
		long leftSum = 0;
		long rightSum = sum;
		
		for (int i = 0 ; i < (A.length); i++)
		{
			rightSum -= A[i];	
			if (leftSum == rightSum)
			{
				index = i;
				break;
			}
			leftSum += 	A[i];
			
		}
		
		return index;
	}
	
	@Test
	public void test1() 
	{
		int a [] = {-1, 3, -4, 5, 1, -6, 2, 1};
		
		Solution solution = new Solution();
		int solution2 = solution.solution(a);
		
		assertEquals(solution2, 1);
	}
	
	@Test
	public void test2() 
	{
		int a [] = {1, -1, 1};
		
		Solution solution = new Solution();
		int solution2 = solution.solution(a);
		
		assertEquals(solution2, 0);
	}
	
	@Test
	public void test5() 
	{
		int a [] = {1, 5, 1};
		
		Solution solution = new Solution();
		int solution2 = solution.solution(a);
		
		assertEquals(solution2, 1);
	}
	
	@Test
	public void overflowTest() 
	{
		int a [] = {Integer.MAX_VALUE, 2, 1, -2147483647};
		
		Solution solution = new Solution();
		int solution2 = solution.solution(a);
		
		assertEquals(solution2, -1);
	}
	
	@Test
	public void test3() 
	{
		int a [] = {};
		
		Solution solution = new Solution();
		int solution2 = solution.solution(a);
		
		assertEquals(solution2, -1);
	}
	
	
	@Test
	public void test4() 
	{
		int a [] = {1};
		
		Solution solution = new Solution();
		int solution2 = solution.solution(a);
		
		assertEquals(solution2, 0);
	}
	
	@Test
	public void test6() 
	{
		int a [] = {2, -1, -2, 1, 500};
		
		Solution solution = new Solution();
		int solution2 = solution.solution(a);
		
		assertEquals(solution2, 4);
	}
	
	
}
