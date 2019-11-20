package app;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String input = "lrvmnir bpr sumvbwvr jx bpr lmiwv yjeryrkbi \r\n" + 
				"jx qmbm wi bpr xjvni mkd ymibrut jx irhx wi bpr riirkvr jx\r\n" + 
				"ymbinlmtmipw utn qmumbr dj w ipmhh but bj rhnvwdmbr bpr\r\n" + 
				"yjeryrkbi jx bpr qmbm mvvjudwko bj yt wkbrusurbmbwjk\r\n" + 
				"lmird jk xjubt trmui jx ibndt\r\n" + 
				"wb wi kjb mk rmit bmiq bj rashmwk rmvp yjeryrkb mkd wbi\r\n" + 
				"iwokwxwvmkvr mkd ijyr ynib urymwk nkrashmwkrd bj ower m\r\n" + 
				"vjyshrbr rashmkmbwjk jkr cjnhd pmer bj lr fnmhwxwrd mkd\r\n" + 
				"wkiswurd bj invp mk rabrkb bpmb pr vjnhd urmvp bpr ibmbr\r\n" + 
				"jx rkhwopbrkrd ywkd vmsmlhr jx urvjokwgwko ijnkdhrii\r\n" + 
				"ijnkd mkd ipmsrhrii ipmsr w dj kjb drry ytirhx bpr xwkmh\r\n" + 
				"mnbpjuwbt lnb yt rasruwrkvr cwbp qmbm pmi hrxb kj djnlb\r\n" + 
				"bpmb bpr xjhhjcwko wi bpr sujsru msshwvmbwjk mkd\r\n" + 
				"wkbrusurbmbwjk w jxxru yt bprjuwri wk bpr pjsr bpmb bpr\r\n" + 
				"riirkvr jx jqwkmcmk qmumbr cwhh urymwk wkbmvb";
		//input = "bpr";
		//input.replaceAll("\r", "");
		//input.replaceAll("\n", "");
		//System.out.println("input:\n" + input);
		Cipher c = new Cipher();
		FrequencyCalculator f = new FrequencyCalculator();
		Map<Character, Integer> map = f.calculateFrequency(input);
		System.out.println("Frequencies:\n");
		map.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
		//v = t
		//e = s

		Map<Character, Character> charMap = new HashMap<>();
		charMap.put('r', 'e');
		charMap.put('b', 't');
		charMap.put('p', 'h');
		charMap.put('i', 's');
		charMap.put('k', 'n');
		charMap.put('v', 'c');
		charMap.put('l', 'b');
		charMap.put('n', 'u');
		charMap.put('w', 'i');
		charMap.put('m', 'a');
		charMap.put('j', 'o');
		charMap.put('x', 'f');
		charMap.put('y', 'm');
		charMap.put('e', 'v');
		charMap.put('s', 'p');
		charMap.put('u', 'r');
		charMap.put('t', 'y');
		charMap.put('h', 'l');
		charMap.put('o', 'g');
		charMap.put('q', 'k');
		charMap.put('a', 'x');
		charMap.put('f', 'q');
		charMap.put('g', 'z');
		charMap.put('c', 'w');
		
		String finalString = c.buildAString(charMap, input, c);
		System.out.println("---\nresult:\n" + finalString);
	}
	
	
	
	

}
