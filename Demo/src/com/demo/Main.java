package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(3, "Salman"), new Student(2, "Arshad"),new Student(1, "Rehan"));
		Collections.sort(students,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("++++++++++++++++++++++++++");
		Collections.sort(students);
		
		for (Student student1 : students) {
			System.out.println(student1);
		}
		
	}

}
