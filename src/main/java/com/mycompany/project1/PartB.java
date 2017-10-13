package com.mycompany.project1;
import com.mycompany.assigment1.*;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.assigment1.course; 
import com.mycompany.assigment1.module; 
import com.mycompany.assigment1.student; 


import org.joda.time.DateTime;


public class PartB {
    public static void main( String[] args ){
    	
    	//Create 5 new Students
    	student student1 = new student("Oisin Curran", 22, "galway", "09/02/1995", "14378786");
    	student student2 = new student("Ross Daily", 20, "Galway", "19/04/1997", "14376765");
    	student student3 = new student("Shawn Bill", 18, "Limerick", "02/03/1995", "1437632");
    	student student4 = new student("Seo Cute", 21, "Dublin", "09/8/1995", "14398980");
    	student student5 = new student("Joey Mole", 20, "Wicklow", "04/04/1997", "14312123");
    	
    	//Add to a List
    	List<student> students1 = new ArrayList<student>();
    	students1.add(student1);
    	students1.add(student2);
    	
    	List<student> students2 = new ArrayList<student>();
    	students2.add(student3);
    	students2.add(student4);
    	students2.add(student5);
    	
    	//Create 5 new Modules
    	module module1 = new module("Engineering", "CT201", students1);
    	module module2 = new module("Heathcare", "MR321", students1);
    	module module3 = new module("Power", "EE453", students2);
    	module module4 = new module("Game Devopment", "CT451", students2);
    	
    	//Add to a list
    	List<module> itModules = new ArrayList<module>();
    	itModules.add(module1);
    	itModules.add(module2);
    	
    	List<module> engModules = new ArrayList<module>();
    	engModules.add(module3);
    	engModules.add(module4);
    	
    	//Create two new courses
    	DateTime start = new DateTime();
    	start.withDate(2017, 9, 4);
    	DateTime end = new DateTime();
    	end.withDate(2018, 5, 16);
    	
    	course course1 = new course("Engineering", engModules, start, end);
    	course course2 = new course("Information Technology", itModules, start, end);
    	
    	//Add to a List for printing
    	List<course> courses = new ArrayList<course>();
    	courses.add(course1);
    	courses.add(course2);
    	
		System.out.println("Students registered for courses here:");
    	for (int i=0; i < courses.size(); i++){
    		System.out.println("In "+courses.get(i).getName() + ":");
    		List<module> modules = courses.get(i).getModules();
    		for (int j=0; j < modules.size(); j++){
    			System.out.println("Studying: "+modules.get(j).getName()+ ":");
    			List<student> students = modules.get(j).getStudents();
    			for (int k=0; k < students.size(); k++){
    				System.out.println(students.get(k).getName());
    			}
    		}
    		System.out.println(" ");
    	}
    	System.out.println(" ");
    }	
}