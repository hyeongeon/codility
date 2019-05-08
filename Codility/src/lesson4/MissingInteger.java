package lesson4;

public class MissingInteger {
	
	/**
	 * Time Spent: 10min
	 * Task Score: 100%
	 * Correctness: 100%
	 * Performance: 100%
	 */
	
	public static final int MAX_VALUE = 100000;
	
	public int solution(int[] A) {
        
		boolean[] res = new boolean[MAX_VALUE + 1];
		
		for(int a: A) {
			if(a <= 0 || a > MAX_VALUE) {
				continue;
			}
			else {
				res[a] = true;
			}
		}
		
		for (int i=1; i<res.length; i++) {
			if (!res[i]) {
				return i;
			}
		}
		
		return 1;
    }
	
	public int solution2(int[] A) {
        
		boolean[] res = new boolean[A.length];
		
		for(int a: A) {
			if(a <= 0 || a > A.length) {
				continue;
			}
			else {
				res[a] = true;
			}
		}
		
		for (int i=1; i<res.length; i++) {
			if (!res[i]) {
				return i;
			}
		}
		
		return 1;
    }
}
