package lesson5;

public class GenomicRangeQuery {
	public int[] solution(String S, int[] P, int[] Q) {

		/**
		 * Time Spent: 49min
		 * Task Score: 62%
		 * Correctness: 100%
		 * Performance: 0%
		 * Detected time complexity: O(N * M)
		 * 
		 * https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
		 */
		// A: 1, C: 2, G: 3, T: 4
		
//		int[] p = {2,5,0};
//		int[] q = {4,5,6};
//		P = p;
//		Q = q;
		
		char[] splitS = S.toCharArray();
		int[][] resTable = new int[splitS.length][splitS.length];
		for(int i=0; i < splitS.length; i++) {
			for(int k=i; k < splitS.length; k++) {
				char tmp = splitS[k];
				
				int curVal = returnVal(tmp);
				
				if (i==k) {
					resTable[i][k] = curVal;
					continue;
				}
				
				if (curVal == 1) {
					resTable[i][k] = curVal;
					// 이 뒤로는 무조건 모두 1 // 초기값은 0이므로, 만약 0이면 1이라고 보면 됨.
					break;
				}
				
				if (curVal > resTable[i][k-1]) {
					resTable[i][k] = resTable[i][k-1];
				} else {
					resTable[i][k] = curVal;
				}
				
			}
		}
		
		int[] result = new int[P.length];
		for(int i=0; i<P.length; i++) {
			result[i] = resTable[P[i]][Q[i]];
			if (result[i] == 0) {
				result[i] = 1;
			}
		}
		
		return result;
    }
	
	private int returnVal(char v) {
		switch(v) {
		case 'A':
			return 1;
		case 'C':
			return 2;
		case 'G':
			return 3;
		case 'T':
			return 4;
		}
		
		return -1;
	}
}
