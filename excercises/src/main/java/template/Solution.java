package template;

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution 
{
	public int  solution(int[] A)
	{
		return 0;
	}
	
	@Test
	public void test1() 
	{
		int a [] = {-1, 3, -4, 5, 1, -6, 2, 1};
		
		Solution solution = new Solution();
		int solution2 = solution.solution(a);
		
		assertEquals(1 , solution2);
	}
	
}
