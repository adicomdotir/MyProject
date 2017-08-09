package ir.javacup.contest.collections;

import java.util.List;

public interface ListUtilImpl implements ListUtil {
 	public List<String> uniques(List<String> list) {
 		List<String> tempList = new ArrayList<>();
 		if(list == null || list.size() == 0) return null;
 		else {
 			for (String st : list) {
 				if(!tempList.contains(st)) tempList.add(st);
 			}
 		}
 		return tempList;
 	}
}
