package lesson2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OddOccurrenceInArray {
	public int solution(int[] A) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int a : A) {
			if (map.containsKey(a)) {
				map.remove(a);
			} else {
				map.put(a, a);
			}
		}
		
		Iterator<Integer> iter = map.keySet().iterator();
		int res=0;
		while(iter.hasNext()) {
			 res = iter.next();
		}
		
		return res;
	}
	
}
