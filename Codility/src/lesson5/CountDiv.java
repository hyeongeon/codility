package lesson5;

public class CountDiv {
	
	/*
	 * A and B are integers within the range [0..2,000,000,000];
	 * K is an integer within the range [1..2,000,000,000];
	 * A ≤ B.
	 */
	
	
	/*
	 * Time Spent: 20min
	 * Task Score: 100%
	 * Correctness: 100%
	 * Performance: 100%
	 * O(1)
	 */
	public int solution(int A, int B, int K) {
		
		int start;
		
		if (A%K == 0) {
			start = A/K;
		} else {
			start = (A - A%K + K) / K;
		}
		
		int end = B/K;
		
		
		
		
		return end - start + 1;
		
	}
}
