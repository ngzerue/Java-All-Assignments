import java.util.*;  
import java.io.*;

	class Student implements Comparable<Student>{
		private String firstName;
		private int age;
	
	 	Student (String firstName ,int age ){
	 		 this.firstName =firstName;
	 		 this.age = age;
	 	}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() 
		  {return"Student [name=" + firstName + ", age=" +age + "]";
		  }

		@Override
		public int compareTo(Student st) {
			
			return this.firstName.compareTo(st.firstName);
			
		}
		}
		
	
	




/*  
4. Given Student class sort students list with their first name using comparable interface 
//File: Student.java//hint implement Comparable 
 interface public class Student 
 {private String firstName;private int age;//constructor here
 //getter and setters 
  here//add toString method here@Overridepublic String toString() 
  {return"Student [name=" + name + ", age=" +age + "]";}}
  //File: MainStudent.java
     public static void main(String[] args) 
   
   {List<Student> students = new ArrayList<>();
      students.add(new Student("Hagos",20));
      students.add(new Student("Zeray",18));
      students.add(new Student("Tirhas",25));
      students.add(new Student("Seble",23));
      //Sort the students list with firstName//
      //hint use Collections.sort()} */
