package com.methodndconstreference;

public class TestStu {

	public static void main(String[] args) {
		Studentt s =(name,rollno,marks,age)-> new Student(name, rollno, marks, age);
		Studentt s1 =Student::new;
	}


}

