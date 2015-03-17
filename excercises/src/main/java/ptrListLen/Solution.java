package ptrListLen;

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution {
	public int solution(IntList L) {

		int length = 0;

		if (L != null) 
		{
			length++;
			IntList list = L;
			while (list.next != null) {
				length++;
				list = list.next;
			}
		}
		return length;
	}

	@Test
	public void test1() {
		IntList intList = new IntList();

		intList.next = new IntList();

		Solution solution = new Solution();
		int solution2 = solution.solution(intList);

		assertEquals(2, solution2);
	}

	@Test
	public void test2() {
		IntList intList = new IntList();

		Solution solution = new Solution();
		int solution2 = solution.solution(intList);

		assertEquals(1, solution2);
	}

}
