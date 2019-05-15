package lesson5;

public class MinAvgTwoSlice {
	public int solution2(int[] A) {
		
		/**
		 * Time Spent: 25min
		 * Task Score: 60%
		 * Correctness: 100%
		 * Performance: 20%
		 */
		
		int[] t = {4, 2, 2, 5, 1, 5, 8};
		A = t;
		
		int pivotIdx = A.length / 2;
		
		divide(A, 0, A.length);
	}
	
	private Result divide(int[] arr, int start, int end) {
		
		int leftEnd = (start+end) /2;
		int rightStart = leftEnd + 1;
		
		double leftMin = 10000;
		double rightMin = 10000;
		
		Result leftResult, rightResult;
		
		
		if(leftEnd-start > 2){ 
			leftResult = divide(arr, start, leftEnd);
		} else {
			leftResult = new Result(start, end, (arr[start] + arr[leftEnd])/2 );
		}
		if(end-rightStart > 2) {
			rightResult = divide(arr, rightStart, end);
		}else {
			rightResult = new Result(start, end, (arr[start] + arr[leftEnd])/2 );
		}
		
		if (leftResult.minVal > rightResult.minVal) {
			return new Result(rightStart, end, rightMin);
		} else {
			return new Result(start, leftEnd, leftMin);
		}
		
	}
	
	class Result {
		int left;
		int right;
		double minVal;
		
		public Result(int left, int right, double minVal) {
			this.left = left;
			this.right = right;
			this.minVal = minVal;
		}
	}
	
	
	public int solution(int[] A) {
		
		/**
		 * Time Spent: 25min
		 * Task Score: 60%
		 * Correctness: 100%
		 * Performance: 20%
		 */
		
		int[] t = {4, 2, 2, 5, 1, 5, 8};
		A = t;
		
		double realMin = 10000;
		int realMinIdx = 0;
		
		for (int i=0; i < A.length; i++) {
			
			double tmpMin = 10000;
			double sum = A[i];
			double avg;
			for (int k = i+1; k < A.length; k++) {
				sum = sum + A[k];
				avg = sum / (k-i+1);
				
				if (tmpMin > avg) {
					tmpMin = avg;
				}
				
				// 평균 값이 -10000인 경우 바로 종료
				if (tmpMin == -10000)
					return i;
			}
			
			if (realMin > tmpMin) {
				realMin = tmpMin;
				realMinIdx = i;
			}
		}
		
		return realMinIdx;
	}

}
