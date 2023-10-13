package javaTest5_1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		//–â‡@ ‰º‹L—á‚Ì”z—ñ‚ğStringŒ^‚µ‚©Ši”[‚Å‚«‚È‚¢‚æ‚¤‚ÉC³‚µ‚Ä‚­‚¾‚³‚¢B 
		//List<Object> array = new ArrayList<>();
		List<String> array =CreateArrayList();
		
		//–â‡A array‚Ì“ñ‚Â–Ú‚Ì—v‘f‚ğ"bar"‚É‚µ‚Ü‚µ‚å‚¤B
		array.set(1, "bar");
		
		//–â‡B foo‚ªŠi”[‚³‚ê‚Ä‚¢‚éƒCƒ“ƒfƒbƒNƒX‚ğo—Í‚µ‚Ä‚­‚¾‚³‚¢B
		String CheckIndexName = "foo";
		int index = array.indexOf(CheckIndexName);
		System.out.println(CheckIndexName + "‚ÌƒCƒ“ƒfƒbƒNƒX:"+index);
		
		
		//–â‡C ƒL[‚ªStringŒ^AƒoƒŠƒ…[‚ªObjectŒ^‚Ì—v‘f‚ğO‚ÂŠi”[‚µ‚Ü‚µ‚å‚¤B
		Map<String, Object> map = CreateMapList();
        
		//–â‡Dã‹L‚ÅŠi”[‚µ‚½ƒL[‚ğŒJ‚è•Ô‚µ•¶‚Åo—Í‚µ‚Ü‚µ‚å‚¤
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("key: " + key);
		}
		
		//–â‡Eã‹L‚ÅŠi”[‚µ‚½ƒoƒŠƒ…[‚ğŒJ‚è•Ô‚µ•¶‚Åo—Í‚µ‚Ü‚µ‚å‚¤B
        Collection<Object> values = map.values();
        for (Object value : values) {
            System.out.println("value: " + value);
        }
		
		//–â‡F CalenderŒ^cal‚ğg‚¢AintŒ^”z—ñarrayDate‚É¡‚Ì”NEŒE“ú‚ğ“ü‚ê‚Ä‚­‚¾‚³‚¢B
		int[] arrayDate = CreateIntDateList();
		
		//–â‡G ”z—ñarrayDate‚ğListŒ^‚É’uŠ·‚µ‚Ü‚µ‚å‚¤B
		List<Integer> ReplaceArrayDate = ReplaceIntDateList(arrayDate);
		
		//–â‡H ã‹L‚ÅŠi”[‚µ‚½—v‘f‚ğŒJ‚è•Ô‚µ‚Åo—Í‚µ‚Ü‚µ‚å‚¤B
        for (int i = 0; i < ReplaceArrayDate.size(); i++) {
        	System.out.println(ReplaceArrayDate.get(i));
        }
		

	}

	//–â‡@ ‰º‹L—á‚Ì”z—ñ‚ğStringŒ^‚µ‚©Ši”[‚Å‚«‚È‚¢‚æ‚¤‚ÉC³‚µ‚Ä‚­‚¾‚³‚¢B 
	//List<Object> array = new ArrayList<>();
	private static List<String> CreateArrayList() {
		
		List<String> array = new ArrayList<>();

		array.add("hoge");
		array.add("pos");
		array.add("foo");
		
		return array;
		
	}
	
	//–â‡C ƒL[‚ªStringŒ^AƒoƒŠƒ…[‚ªObjectŒ^‚Ì—v‘f‚ğO‚ÂŠi”[‚µ‚Ü‚µ‚å‚¤B
	private static Map<String, Object> CreateMapList() {
		
		Map<String, Object> map = new HashMap<>();
        map.put("address", "/////"); 
        map.put("name","kosuke"); 
        map.put("age","29");
		
		return map;
		
	}
	
	//–â‡F CalenderŒ^cal‚ğg‚¢AintŒ^”z—ñarrayDate‚É¡‚Ì”NEŒE“ú‚ğ“ü‚ê‚Ä‚­‚¾‚³‚¢B
	private static int[] CreateIntDateList() {
		
		Calendar cal = Calendar.getInstance();
		
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        int[] arrayDate = {year, month, day};
		
		return arrayDate;
	}
	
	//–â‡G ”z—ñarrayDate‚ğListŒ^‚É’uŠ·‚µ‚Ü‚µ‚å‚¤B
	private static List<Integer> ReplaceIntDateList(int[] arrayDate) {
		
		List<Integer> ReplaceArrayDate = new ArrayList<>();
		
        for (int i = 0; i < arrayDate.length; i++) {
        	ReplaceArrayDate.add(arrayDate[i]);
        }
		
		return ReplaceArrayDate;
	}

}
