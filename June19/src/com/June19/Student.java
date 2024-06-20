package com.June19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
	int sid;
	String sname;
	int marks;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s = new Student();
		s.sid = 120;
		s.sname = "Sneha";
		s.marks = 70;
		FileOutputStream fos = new FileOutputStream("C:/Users/Sneha/java11221/Serilization/src/com/June19/file2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		System.out.println("Object Serializable Done ");
		oos.close();
		fos.close();
		FileInputStream fis = new FileInputStream("C:/Users/Sneha/java11221/Serilization/src/com/June19/file2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		s = (Student) ois.readObject();
		ois.close();
		fis.close();
		System.out.println("Object DeSerializable Data ");
		System.out.println("sid:" + s.sid + " sname:" + s.sname + " marks:" + s.marks);
	}
}
