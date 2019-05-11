package lesson5;

public class PassingCars {
	public int solution(int[] A) {
		
		/**
		 * Time Spent: 52min
		 * Task Score: 100%
		 * Correctness: 100%
		 * Performance: 100%
		 * Detected time complexity: O(N)
		 */
		
		final int MAX = 1000000000;
        int count = 0;
        int totalCnt = 0;     
        int first = -1;
        
        for (int i=A.length-1; i>=0; i--) {
        	int a = A[i];
        	
        	if (first == -1 && a != 1) {
        		continue;
        	}
        	
        	if (first == -1) {
        		first = a;
        	}
        	
        	if (a != first) {
        		totalCnt = totalCnt + count;
        	} else {
        		count ++;
        	}
        	
        	if (count > MAX || totalCnt > MAX) {
        		return -1;
        	}
        	
        }
        
        return totalCnt;
    }
}
