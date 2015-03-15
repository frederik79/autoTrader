package nz.schmidt.persistence;

import java.util.Arrays;

public class Solution 
{
	private void main() 
	{
		long array[] = {1,2,3,4};
	
	}

	public int solution(int[] A) {

		long outerCounter = 0;
		int equilibriumIndex = -1;

		for (int point = 0; point < (A.length - 1); point++) 
		{
			int [] front = Arrays.copyOfRange(A, 0, point);
			int [] end = Arrays.copyOfRange(A, point+1, A.length);

			IntStream.of(front).sum();
			IntStream.of(end).sum();
			
			outerCounter += A[i];
			long innerCounter = 0;

			for (int y = i + 2; y < A.length; y++) {
				innerCounter += A[y];
			}

			System.out.println(innerCounter + " - " + outerCounter);

			if (innerCounter == outerCounter) {
				equilibriumIndex = (i + 1);
				break;
			}
		}

		return equilibriumIndex;
	}
}
