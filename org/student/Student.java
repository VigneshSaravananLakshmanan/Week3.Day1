package org.student;

import org.department.Department;


public class Student extends Department {
	
	/* Student class (child) inherits from parent Department. The Department (Parent class) further inherits from College class (grand parent).
	 * This is called Multi Level Inheritance */
	
	
	/* Create Methods  - This methods are declared for learning Inheritance concept*/
   public void studentName() {
		
		System.out.println("This method in Student class lists the Student Names ");
	}
	
	
    public void studentDept() {
		
		System.out.println("This method in Student class lists the Student Department  ");
	}
    
    public void studentId() {
		
		System.out.println("This method in Student class lists the Student ID ");
	}

	public static void main(String[] args) {
		
		/* Create an object for Student class */
		Student student = new Student();
		
		/* All the methods declared in different classes are invoked using the single object with the concept of inheritance*/
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.deptName();
		student.studentId();
		student.studentName();
		student.studentDept();

	}

}
