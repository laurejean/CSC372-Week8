import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentData {
	
	public static void main(String[] args) {
		LinkedList <StudentClass> studentList = new LinkedList<StudentClass>();	 
		Scanner scr = new Scanner(System.in);
		 
		System.out.println("Welcome to the Student Portal");
	
		for(int i = 1; i < 3; i++) {
			System.out.println("Stuent #" + i);
			System.out.print("Please enter your name: ");
			String name = scr.nextLine();
			System.out.print("Please enter your address: ");
			String address = scr.nextLine();
			Double GPA = null;
	        	while (GPA == null) {
	        		System.out.print("Please enter your GPA: ");
	                try {
	                    GPA = scr.nextDouble();
	                } catch (Exception e) {
	                    System.out.println("Your entry is not a valid number. Please enter a valid GPA.");
	                    scr.next(); 
	                }
	                scr.nextLine();  
	           }
	     // Creation of object          
	     StudentClass student = new StudentClass(name, address, GPA);
	     
	     // Adding students to the student list      
	     studentList.add(student);
		 }
		
		 //Creation of for each loop to get 
		 for(StudentClass student : studentList) {
			 System.out.println(" ");
			 System.out.println(student.toString());
		 }
		 
		 //
		 System.out.println(" ");
		 System.out.println("Sorting by Name");  
		  
		Collections.sort(studentList,new NameComparator());  
		for(StudentClass lst: studentList){  
			System.out.println(lst.getName()+" "+lst.getAddress()+" "+lst.getGPA());  
			} 
	 }
	 
}