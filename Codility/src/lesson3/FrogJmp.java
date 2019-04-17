package lesson3;

public class FrogJmp {

	public int solution(int X, int Y, int D) {
	
		/**
		 * TimeSpect : 
		 * TaskScore : 100%
		 * Correctness : 100%
		 * Performance : 100%
		 * Detected time complexity: O(1)
		 */

		
		int tmp = Y-X;
		
		
		if (tmp % D == 0) {
			return tmp / D;
		} else {
			return tmp/D + 1;
		}
	}
}
