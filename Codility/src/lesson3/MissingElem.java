package lesson3;

public class MissingElem {
	public int solution(int[] A) {
		
		/*
		 * Task Score: 100%
		 * Correctness: 100%
		 * Performance: 100%
		 * Detected time complexity: O(N) or O(N * log(N))
		 * */
		
		int sumOfIndex = 0;
		int sumOfValue = 0;
		
		for (int i=0; i<A.length; i++) {
			sumOfIndex = sumOfIndex + i;
			sumOfValue = sumOfValue + A[i];
		}
		
		sumOfIndex = sumOfIndex + A.length + (A.length + 1);
		
		return sumOfIndex - sumOfValue;
	}
}
