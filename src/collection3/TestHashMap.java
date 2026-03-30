package collection3;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("num", 1);
		map.put("name", "송중기");
		map.put("kor", 90);
		map.put("eng", 90);
		map.put("mat", 82);
		map.put("height", 180.2);
		
		
		System.out.println(map);
		int num = (int) map.get("num");
		System.out.println(num);
//		String name = (String) map.get("name");
		String name = String.valueOf(map.get("name")); // 추천 Object -> String
		System.out.println(name);
		int kor = (int) map.get("kor");
		System.out.println(kor);
		int eng = (int) map.get("eng");
		System.out.println(eng);
		int mat = (int) map.get("mat");
		System.out.println(mat);
		double height = (Double) map.get("height");
		System.out.println(height);
	}

}
