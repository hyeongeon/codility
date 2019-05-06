package lesson4;

public class Counter {
	
	public int[] solution(int N, int[] A) {
        
		/**
		 * Time Spent: 34min
		 * Task Score: 100%
		 * Correctness: 100%
		 * Performance: 100%
		 * Detected time complexity: O(N + M)
		 */
		
		int[] test = {1, 1, 2, 2, 3, 7, 4, 3, 4, 5};
        
        int[] res = new int[N];
        int max = -1;
        int rememberMax = -1;
        boolean maxFlag = false;
        
        A = test;
        for(int a: A) {
        	if(a == N + 1) {
        		maxFlag = true;
        		rememberMax = max;
        		continue;
        	} else if (a >= 1 && a <= N) {
        		
        		if (maxFlag && res[a-1] < rememberMax) {
        			res[a-1] = rememberMax;
        		}
        		
        		res[a-1]++;
        		
        		if (max < res[a-1]) {
            		max = res[a-1];
            	}
        	} else {
        		continue;
        	}
        	
        }
        
        for(int i=0; i < res.length; i++) {
        	if(res[i] < rememberMax) {
        		res[i] = rememberMax;
        	}
        }
        
        return res;
    }
}
