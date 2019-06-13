package by.htp.les10.main.compare;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		
		Student student1 = new Student("A", 1990, 12);
		Student student2 = new Student("B", 1980, 6);
		Student student3 = new Student("C", 1981, 11);
		Student student4 = new Student("D", 1982, 10);
		Student student5 = new Student("E", 1985, 9);
		
		System.out.println(student1.compareTo(student2));
		System.out.println(student3.compareTo(student4));
		System.out.println(student4.compareTo(student5));
		
		System.out.println(student5.compareTo(student3));
		
		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		
		
		Collections.sort(list);
		System.out.println(list);
		
		//lower case letters vs uppercase
		List<String> s1 = new ArrayList<String>();
		String a1 = "aaa";
		String a2 = "AAA";
		String b1 = "bbb";
		String b2 = "BBB";
		
		s1.add(a1);
		s1.add(a2);
		s1.add(b1);
		s1.add(b2);
		
		
		Collections.sort(s1, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareToIgnoreCase(o2);
			}
		});
		

		System.out.println(s1);
	}

}
