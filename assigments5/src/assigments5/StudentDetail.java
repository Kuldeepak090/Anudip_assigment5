package assigments5;

	import java.util.ArrayList;
	import java.util.stream.Collectors; 
	import java.util.List;

	class Student{  
	    int id;  
	    String name;  
	    int age;
	    float marks;
	    public Student(int id, String name, int age,float math_marks) {  
	        this.id = id;  
	        this.name = name;  
	        this.age = age; 
	        this.marks=math_marks;
	    }  
	    
	  //overriding 
	    public String toString(){
	    	  return id+" "+name+" "+age+" "+marks;  
	    }
	}  

	public class StudentDetail {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 List<Student> student = new ArrayList<Student>();
			 
			 
		        //Adding students details
		       student.add(new Student(1,"Ravi",20,68.6f));  
		       student.add(new Student(2,"Rahul",25,70.2f));  
		       student.add(new Student(3,"Rohan",30,82.8f));  
		       student.add(new Student(4,"Ram",35,79f));  
		       student.add(new Student(5,"Sita",40,80f));  
		       
		       
		        List<Student> newStudent1 =student.stream().filter(p -> p.marks>60 && p.marks<80).collect(Collectors.toList()); 	
		        System.out.println( "id" +" "+ "name" +" "+ "age" +" " +"marks" + newStudent1 );    
		}
		
}

