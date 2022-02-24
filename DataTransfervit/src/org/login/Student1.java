package org.login;

public class Student1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Lakshmi");
		s1.setRollNum("Roo1");
		s1.setDeptName("cse");
		Student s2 = new Student();
		s2.setName("Senthi");
		s2.setRollNum("R002");
		s2.setDeptName("Mech");
		Student s3=s2;
		s3.setName("Rama");
		s2.setDeptName("Mech");
	       s1=null;
		System.out.println(s2.getName());
		System.out.println(s2.getRollNum());
		System.out.println(s2.getDeptName());
		System.out.println(s3.getName());
		System.out.println(s3.getDeptName());
		System.out.println(s1.getName());
		
	}
}
