package collection1;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {
	// 배열은 추가를 못한다. 추가시 error(ArrayIndexOutOfBoundsException)
	public static void main(String[] args) {
		int [] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//----------------------------------------------
		//Collection - List
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(20);
		numList.add(30);
		numList.add(40);
		numList.add(50);
		
		for (int i = 0; i < numList.size(); i++) {
			System.out.print(numList.get(i) + " ");
		}
		System.out.println();
		
		numList.add(100);
		numList.add(35);
		for (Integer num : numList) {
			System.out.print(num + " ");
		}
		System.out.println();
		// 숫자 정렬은 (a, b) -> a - b or (a, b) -> b - a
		Collections.sort(numList, (a, b) -> b - a);
		System.out.println(numList);
	}
}
