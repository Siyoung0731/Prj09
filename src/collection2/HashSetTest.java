package collection2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Java");
		set.add("Html");
		set.add("Spring");
		set.add("Java"); // 중복 X
		set.add("Oracle");
		System.out.println(set.size()); // 4
		System.out.println(set);
		
		//set 은 Iterator(반복자)로 for 문 돌려서 출력, 완전히 똑같은 문자열은 출력 X
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();		
			System.out.print(name + " ");
		}
		System.out.println();
	}
}
