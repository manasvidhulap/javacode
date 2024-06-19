package com.June18;

import java.io.File;

public class FileInfo 
{
	public static void main(String[] args)
	{

		File fileObj = new File("F:/CoreJava8new.pdf");
		if (fileObj.exists()) 
		{
			System.out.println("\nSpecified file path: " + fileObj.getAbsolutePath());
			System.out.println("\nIs the file Writable: " + fileObj.canWrite());
			// checking whether the file is Readable or not
			System.out.println("\nIs the file Readable " + fileObj.canRead());
			// retrieving file name
			System.out.println("\nFile name: " + fileObj.getName());
			// retrieving file size
			System.out.println("\nFile size (in bytes) " + fileObj.length());
			File fileDirObj = new File("F:/fullstackproject/");
			String[] fileList = fileDirObj.list();
			System.out.print("\n" + fileList.length);
			System.out.println("list of files available in the directory");
			// displaying here the list of files available in the directory
			for (int i = 0; i < fileList.length; i++) 
			{
				System.out.print("\n" + fileList[i]);
			}
			System.out.println("\n");
		} 
		else 
		{
			System.out.println("Specified file does not exist.");
		}
	}
}
