package app;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCalculator {
	
	public Map<Character, Integer> calculateFrequency(String input){
		Map<Character, Integer> map = new HashMap<>();
		for(char c : input.toCharArray()) {
			if(!Character.toString(c).matches("[a-z?]")) {
				continue;
			}
			if(map.containsKey(c)) {
				int x = map.get(c);
				x++;
				map.put(c, x);
			} else {
				map.put(c, 1);
			}
		}
		
		return map;
	}
}
