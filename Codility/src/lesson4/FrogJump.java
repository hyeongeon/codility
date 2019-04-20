package lesson4;

import java.util.HashMap;
import java.util.Map;

public class FrogJump {

	public int solution_re(int X, int[] A) {
		
		/*
		 * Task Score: 100%
		 * Correctness: 100%
		 * Performance: 100%
		 * Detected time complexity: O(N)
		 */
		
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int i=0; i<A.length; i++) {
        	int a = A[i];
        	
            if (a > X) {
                continue;
            }
            
            map.put(a, true);
            
            if (map.size() == X) {
            	return i; 
            }
        }
        
        return -1;
    }
	
	public int solution(int X, int[] A) {
		
		/*
		 * 문제 이해....
		 * Time Spent: 9min
		 * Task Score: 27%
		 * Correctness: 50%
		 * Performance: 0%
		 * Detected time complexity: O(N)
		 */
		
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int i=0; i<A.length; i++) {
        	int a = A[i];
        	
            if (a > X) {
                continue;
            }
            else if (a == X) {
                if (map.size() == (X-1)) {
                	return i; 
                }
                continue;
            }
            map.put(a, true);
        }
        
        return -1;
    }
}
