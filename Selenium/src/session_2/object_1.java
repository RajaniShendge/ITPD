package session_2;


public class object_1{  
	 int rollno;  
	 String name;  
	  
	 void insertRecord(int r, String n){  //method  
	  rollno=r;  
	  name=n;  
	 }  
	  
	 void displayInformation(){System.out.println(rollno+" "+name);}//method  
	  
	 public static void main(String args[]){  
	  object_1 s1=new object_1();  
	  object_1 s2=new object_1();  
	  
	  s1.insertRecord(111,"Karan");  
	  s2.insertRecord(222,"Aryan");  
	  
	  s1.displayInformation();  
	  s2.displayInformation();  
	  
	 }  
	}  