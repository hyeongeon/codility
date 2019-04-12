package lesson2;

public class CyclicRotation {
	public int[] solution(int[] A, int k) {
		
		
		int len = A.length;
		
		int[] res = new int[len];
		
		for (int i=0; i< len; i++) {
			res[i] = A[(len+i-(k%len)) % len];
		}
		
		return res;
	}
}
