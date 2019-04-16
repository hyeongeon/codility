package lesson3;

public class FrogJmp {

	public int solution(int X, int Y, int D) {
	
		int tmp = Y-X;
		
		
		if (tmp % D == 0) {
			return tmp / D;
		} else {
			return tmp/D + 1;
		}
	}
}
