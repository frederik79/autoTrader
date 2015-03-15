package employertests.bugFixLeader;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Solution {
    int solution(int[] A) {
        int n = A.length;
        int[] L = new int[n + 1];
        L[0] = -1;
        for (int i = 0; i < n; i++) {
            L[i + 1] = A[i];
        }
        int count = 0;
        int pos = (n + 1) / 2;
        int candidate = L[pos];
        for (int i = 1; i <= n; i++) {
            if (L[i] == candidate)
                count = count + 1;
        }
        if (count > pos)
            return candidate;
        return (-1);
    }
    
    @Test
    public void testa() 
    {
    	int[] A = {2,2,2,2,2, 4 ,5, 6, 7, 8, 9};
    	
    	Solution solution = new Solution();
    	
    	int solution2 = solution.solution(A);
    	
    	assertEquals(-1, solution2);
	}
    
    public static void main(String[] args) {
		
	}
    
}

