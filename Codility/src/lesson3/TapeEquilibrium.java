package lesson3;

public class TapeEquilibrium {

	public int solution(int[] A) {
		
		/*
		 * 음수값도 포함되는 걸 생각안함
		 * 
		 * Task Score: 76%
		 * Correctness: 71%
		 * Performance: 83%
		 * Detected time complexity: O(N)
		 */
		
		int totalSum = 0;
		int leftSum = 0;
		
		for(int a: A) {
			totalSum = totalSum + a;
		}
		
		int minGap = Math.abs(totalSum - A[0]); // 처음 시도
		
		for (int i=1; i<A.length ; i++) {
			leftSum = leftSum + A[i-1];
			int rightSum = totalSum - leftSum;
			int gap = Math.abs(rightSum - leftSum);
			
			if (gap < minGap) {
				minGap = gap;
			}
		}
		
		return minGap;
	}
	
	
	public int solution_re(int[] A) {
		
		/*
		 * 
		 * Task Score: 100%
		 * Correctness: 100%
		 * Performance: 100%
		 * Detected time complexity: O(N)
		 */
		
		int totalSum = 0;
		int leftSum = 0;
		
		for(int a: A) {
			totalSum = totalSum + a;
		}
		
		int minGap = 2000; // -1000 ~ 1000
		
		for (int i=1; i<A.length ; i++) {
			leftSum = leftSum + A[i-1];
			int rightSum = totalSum - leftSum;
			int gap = Math.abs(rightSum - leftSum);
			
			if (gap < minGap) {
				minGap = gap;
			}
		}
		
		return minGap;
	}
	
}
