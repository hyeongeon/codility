package lesson4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermCheck {

	// 4-1
	//https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/

public int solution_last(int[] A) {
		
	/*
	 * Task Score: 100%
	 * Correctness: 100%
	 * Performance: 100%
	 * Detected time complexity: O(N) or O(N * log(N))
	 */
	
		int min = 1000000000;
		
		for (int a: A) {
			if (a < min) {
				min = a;
			}
		}
		
		if (min != 1) {
			return 0;
		}
		
		int[] tmp = new int[A.length];
		
		for (int a: A) {
			int idx = a - min; // min = 1
			if (idx >= A.length) {
				// outOfBound
				System.out.println("outofbound: " + a);
				return 0;
			}
			
			if (tmp[idx] != 0) {
				// duplicate
				System.out.println("duplicate: " + a);
				return 0;
			}
			
			tmp[idx] = a;
		}
		
		return 1;
	}
	
	
	public int solution_re(int[] A) {
		
		/*
		 * Time Spent: 13min
		 * Task Score: 100%
		 * Correctness: 100%
		 * Performance: 100%
		 * Detected time complexity: O(N) or O(N * log(N))
		 */
		
		int min = 1000000000;	
		int sum = 0;
		int sumIdx = 0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0; i<A.length; i++) {
			int a = A[i];
			if (map.containsKey(a)) {
				// duplicate
				return 0;
			}
			map.put(a, a);
			
			if (min > a) {
				min = a;
			}
			
			sumIdx = sumIdx + i;
			sum = sum + a;
		}
		
		if (min != 1) {
			return 0;
		}
		
		sum = sum - (min * A.length);
		if (sum == sumIdx) {
			return 1;
		} else {
			return 0;
		}
	}
	
	
	public int solution(int[] A) {
		
		/*
		 * 문제를 잘못 이해. 무조건 1부터 연속되야하는데, 큰 수부터 연속돼도 return1을 반환했음
		 * Time Spent: 23min
		 * Task Score: 66%
		 * Correctness: 33%
		 * Performance: 100%
		 */
		
		
		int min = 1000000000;
		
		for (int a: A) {
			if (a < min) {
				min = a;
			}
		}
		
		System.out.println("min is : " + min);
		
		int[] tmp = new int[A.length];
		
		for (int a: A) {
			int idx = a - min;
			if (idx >= A.length) {
				// outOfBound
				System.out.println("outofbound: " + a);
				return 0;
			}
			
			if (tmp[idx] != 0) {
				// duplicate
				System.out.println("duplicate: " + a);
				return 0;
			}
			
			tmp[idx] = a;
		}
		
		return 1;
		
	}
}
