package collection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

class Student {
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}

public class TestSetStudent {
	public static void main(String[] args) {
		ArrayList<Student> stdList = new ArrayList<>();
		stdList.add(new Student(1, "가나"));
		stdList.add(new Student(2, "나나"));
		stdList.add(new Student(3, "다나"));
		stdList.add(new Student(1, "가나"));
		System.out.println(stdList);
		System.out.println(stdList.size());
		System.out.println("=======================================");
		
		//-------------------------------------------
		HashSet<Student> stdSet = new HashSet<>();
		stdSet.add(new Student(1, "가나"));
		stdSet.add(new Student(2, "나나"));
		stdSet.add(new Student(3, "다나"));
		stdSet.add(new Student(1, "가나"));
		System.out.println(stdSet);
		System.out.println(stdSet.size());
		
		System.out.println("=======================================");	
	} 
}
