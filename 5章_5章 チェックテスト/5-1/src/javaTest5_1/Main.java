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
		
		//問�@ 下記例の配列をString型しか格納できないように修正してください。 
		//List<Object> array = new ArrayList<>();
		List<String> array =CreateArrayList();
		
		//問�A arrayの二つ目の要素を"bar"にしましょう。
		array.set(1, "bar");
		
		//問�B fooが格納されているインデックスを出力してください。
		String CheckIndexName = "foo";
		int index = array.indexOf(CheckIndexName);
		System.out.println(CheckIndexName + "のインデックス:"+index);
		
		
		//問�C キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = CreateMapList();
        
		//問�D上記で格納したキーを繰り返し文で出力しましょう
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("key: " + key);
		}
		
		//問�E上記で格納したバリューを繰り返し文で出力しましょう。
        Collection<Object> values = map.values();
        for (Object value : values) {
            System.out.println("value: " + value);
        }
		
		//問�F Calender型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
		int[] arrayDate = CreateIntDateList();
		
		//問�G 配列arrayDateをList型に置換しましょう。
		List<Integer> ReplaceArrayDate = ReplaceIntDateList(arrayDate);
		
		//問�H 上記で格納した要素を繰り返しで出力しましょう。
        for (int i = 0; i < ReplaceArrayDate.size(); i++) {
        	System.out.println(ReplaceArrayDate.get(i));
        }
		

	}

	//問�@ 下記例の配列をString型しか格納できないように修正してください。 
	//List<Object> array = new ArrayList<>();
	private static List<String> CreateArrayList() {
		
		List<String> array = new ArrayList<>();

		array.add("hoge");
		array.add("pos");
		array.add("foo");
		
		return array;
		
	}
	
	//問�C キーがString型、バリューがObject型の要素を三つ格納しましょう。
	private static Map<String, Object> CreateMapList() {
		
		Map<String, Object> map = new HashMap<>();
        map.put("address", "/////"); 
        map.put("name","kosuke"); 
        map.put("age","29");
		
		return map;
		
	}
	
	//問�F Calender型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
	private static int[] CreateIntDateList() {
		
		Calendar cal = Calendar.getInstance();
		
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        int[] arrayDate = {year, month, day};
		
		return arrayDate;
	}
	
	//問�G 配列arrayDateをList型に置換しましょう。
	private static List<Integer> ReplaceIntDateList(int[] arrayDate) {
		
		List<Integer> ReplaceArrayDate = new ArrayList<>();
		
        for (int i = 0; i < arrayDate.length; i++) {
        	ReplaceArrayDate.add(arrayDate[i]);
        }
		
		return ReplaceArrayDate;
	}

}
