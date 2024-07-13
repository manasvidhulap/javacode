package com.July3;

public class Classroom {
    // Method definition
    public String registerStudent(Student student) {
        // Check if name is in uppercase
        if (!student.name.equals(student.name.toUpperCase())) {
            return "Block letters needed";
        }
        
        // Check if score is between 0 and 100
        if (student.score < 0 || student.score > 100) {
            return "Invalid score";
        }
        
        // If both conditions are satisfied, return "Registered"
        return "Registered";
    }
    
}