package ir.javacup.contest.collections;

import java.util.List;
import java.util.Map;

public interface MapUtilImpl implements MapUtil {
 	public Map<String, Integer> frequency(List<String> list) {
 		Map<String, Integer> tempMap = new HashMap<String, Integer>();
 		if(list == null || list.size() == 0) return null;
 		else {
 			for (String st : list) {
 				if(tempMap.containsKey(st)) tempMap.put(st, tempMap.get(st) + 1);
 				else tempMap.put(st, 1);
 			}
 		}
 		return tempMap;
 	}
}
