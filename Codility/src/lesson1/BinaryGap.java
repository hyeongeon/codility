package lesson1;

public class BinaryGap {
	public int solution(int N) {
		boolean isShowOne = false;
		int max = 0;
		int cur = 0;
		

		while (N >= 1) {
			int v = N % 2;
			
			if (v == 0) {
				cur++;
			}
			else {
				if (max < cur && isShowOne) {
					max = cur;
				}
				isShowOne = true;
				cur = 0;
			}
//			System.out.println("M: " + max + ", cur: " + cur);
			
			if (N == 1) {
				break;
			}
			N = N / 2;

		}
		
		return max;
	}
}
