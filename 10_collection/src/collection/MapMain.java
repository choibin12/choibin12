package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		Map<String,Integer> map2 = new HashMap<String, Integer >();
		
		map.put("book101","백설공주");
		map.put("book201","인어공주");
		map.put("book102","백설공주");//value 중복허용
		map.put("book301","피오나");
		map.put("book101","엄지공주");//key 중복허용
		
		System.out.println(map.get("book101"));
		System.out.println(map.get("book102"));
		System.out.println(map.get("book501"));
		map2.put("book", 10);
		System.out.println(map2.get("book"));
		System.out.println(map2.get("booka"));
	}

}
