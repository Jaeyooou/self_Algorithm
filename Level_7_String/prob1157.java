package dfasdfasdf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class prob1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		int cnt = 0;
		for(int i = 0 ; i < word.length() ; i++) {
			char tmp = Character.toUpperCase(word.charAt(i));
			if(map.containsKey(tmp) == true) { // 대문자로 바꿔 알파벳 있으면 char : value++ 해주기
				map.put(tmp,map.get(tmp)+1 );
			}
			else {
				map.put(tmp, 1);
			}
		}
		int maxValue = Collections.max(map.values());
		Iterator values = map.values().iterator();
		while(values.hasNext()) {
			if((int)values.next() == maxValue)
				cnt++;
		}
		if(cnt == 1) {
			Iterator it = map.keySet().iterator();
			while(it.hasNext()) {
				Character key = (Character) it.next();
				if(maxValue == map.get(key)) {
					System.out.println(key);
					return;
				}
			}
		}
		else {
			System.out.println("?");
		}
		
			
		
		
	}

}
