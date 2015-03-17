package deepestPit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution 
{
	public int  solution(int[] A)
	{
		int index = Integer.MIN_VALUE;
		
		for (int i = 0; i < A.length; i++)
		{
			int high = A[i];
			int low = A[i];
			int high2 = A[i];
			int start = i;
			while(A.length > i && A[i] >= high)
			{
				high = A[i];
				low = A[i];
				i++;
			}
			
			while(A.length > i && A[i] <= low)
			{ 
				low = A[i];
				high2 = A[i];
				i++;
			}

			while(A.length > i&& A[i] >= high2)
			{
				high2 = A[i];
				i++;
			}

			
			if ( high != low && low != high2)
			{
				System.out.println(high + " - " + low + " - " + high2);
				
				int min = Math.min(high-low, high2-low);
				
				if (index < min)
				{
					index = min;
				}
			}
			i = start +1;
		}
		if (index ==  Integer.MIN_VALUE)
		{
			index = -1;
		}
		
		return index;
	}
	
	@Test
	public void test1() 
	{
		
		int a [] = {0, 1, 3, -2, 0, 1, 0, -3, 2, 3};
		
		Solution solution = new Solution();
		int solution2 = solution.solution(a);
		
		assertEquals(4, solution2);
	}
	
	@Test
	public void test2() 
	{
		int a [] = {0};
		
		Solution solution = new Solution();
		int solution2 = solution.solution(a);
		
		assertEquals(-1, solution2);
	}
	
	
	@Test
	public void test3() 
	{
		int a [] = {0, -2, -3, -4, -5};
		
		Solution solution = new Solution();
		int solution2 = solution.solution(a);
		
		assertEquals(-1, solution2);
	}
	
	@Test
	public void test4() 
	{
		int a [] = {0, -2, -3, -4, -4};
		
		Solution solution = new Solution();
		int solution2 = solution.solution(a);
		
		assertEquals(-1, solution2);
	}
	
	@Test
	public void test6() 
	{
		int a [] = {0, 1, 2, -4, -5, -6};
		
		Solution solution = new Solution();
		int solution2 = solution.solution(a);
		
		assertEquals(-1, solution2);
	}
	
	@Test
	public void extremePit() 
	{
		int a [] = {0, 0, -200000000, 4};
		
		
		Solution solution = new Solution();
		int solution2 = solution.solution(a);
		
		assertEquals(200000000, solution2);
	}
}
