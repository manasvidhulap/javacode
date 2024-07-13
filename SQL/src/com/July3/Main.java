package com.July3;

public class Main {
	public static void main(String[] args) {
        // Creating a student object
        Student s1 = new Student("John", 85);
        Student s2 = new Student("MARY", 110);
        Student s3 = new Student("ALICE", -5);
        
        // Creating a classroom object
        Classroom classroom = new Classroom();
        
        // Registering students
        System.out.println(classroom.registerStudent(s1)); // Output: "Block letters needed"
        System.out.println(classroom.registerStudent(s2)); // Output: "Invalid score"
        System.out.println(classroom.registerStudent(s3)); // Output: "Invalid score"
        
        // Correcting student details
        s1.name = "JOHN";
        s2.score = 95;
        s3.name = "ALICE";
        
        // Registering again after corrections
        System.out.println(classroom.registerStudent(s1)); // Output: "Registered"
        System.out.println(classroom.registerStudent(s2)); // Output: "Registered"
        System.out.println(classroom.registerStudent(s3)); // Output: "Block letters needed"
    }
}
