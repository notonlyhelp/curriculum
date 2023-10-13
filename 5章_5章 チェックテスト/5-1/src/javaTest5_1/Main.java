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
		
		//��@ ���L��̔z���String�^�����i�[�ł��Ȃ��悤�ɏC�����Ă��������B 
		//List<Object> array = new ArrayList<>();
		List<String> array =CreateArrayList();
		
		//��A array�̓�ڂ̗v�f��"bar"�ɂ��܂��傤�B
		array.set(1, "bar");
		
		//��B foo���i�[����Ă���C���f�b�N�X���o�͂��Ă��������B
		String CheckIndexName = "foo";
		int index = array.indexOf(CheckIndexName);
		System.out.println(CheckIndexName + "�̃C���f�b�N�X:"+index);
		
		
		//��C �L�[��String�^�A�o�����[��Object�^�̗v�f���O�i�[���܂��傤�B
		Map<String, Object> map = CreateMapList();
        
		//��D��L�Ŋi�[�����L�[���J��Ԃ����ŏo�͂��܂��傤
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("key: " + key);
		}
		
		//��E��L�Ŋi�[�����o�����[���J��Ԃ����ŏo�͂��܂��傤�B
        Collection<Object> values = map.values();
        for (Object value : values) {
            System.out.println("value: " + value);
        }
		
		//��F Calender�^cal���g���Aint�^�z��arrayDate�ɍ��̔N�E���E�������Ă��������B
		int[] arrayDate = CreateIntDateList();
		
		//��G �z��arrayDate��List�^�ɒu�����܂��傤�B
		List<Integer> ReplaceArrayDate = ReplaceIntDateList(arrayDate);
		
		//��H ��L�Ŋi�[�����v�f���J��Ԃ��ŏo�͂��܂��傤�B
        for (int i = 0; i < ReplaceArrayDate.size(); i++) {
        	System.out.println(ReplaceArrayDate.get(i));
        }
		

	}

	//��@ ���L��̔z���String�^�����i�[�ł��Ȃ��悤�ɏC�����Ă��������B 
	//List<Object> array = new ArrayList<>();
	private static List<String> CreateArrayList() {
		
		List<String> array = new ArrayList<>();

		array.add("hoge");
		array.add("pos");
		array.add("foo");
		
		return array;
		
	}
	
	//��C �L�[��String�^�A�o�����[��Object�^�̗v�f���O�i�[���܂��傤�B
	private static Map<String, Object> CreateMapList() {
		
		Map<String, Object> map = new HashMap<>();
        map.put("address", "/////"); 
        map.put("name","kosuke"); 
        map.put("age","29");
		
		return map;
		
	}
	
	//��F Calender�^cal���g���Aint�^�z��arrayDate�ɍ��̔N�E���E�������Ă��������B
	private static int[] CreateIntDateList() {
		
		Calendar cal = Calendar.getInstance();
		
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        int[] arrayDate = {year, month, day};
		
		return arrayDate;
	}
	
	//��G �z��arrayDate��List�^�ɒu�����܂��傤�B
	private static List<Integer> ReplaceIntDateList(int[] arrayDate) {
		
		List<Integer> ReplaceArrayDate = new ArrayList<>();
		
        for (int i = 0; i < arrayDate.length; i++) {
        	ReplaceArrayDate.add(arrayDate[i]);
        }
		
		return ReplaceArrayDate;
	}

}
