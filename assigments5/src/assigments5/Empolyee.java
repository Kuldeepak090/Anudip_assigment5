package assigments5;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;


	//Implementing Runnable interface
	class Employee implements Comparable<Employee> {
	    String name;
	    Integer age;
	    Integer salary;
	    Integer EmployeeId;
	    
	public Employee() {
	}

	public Employee(String n, Integer a,Integer f, Integer id) {
	       name = n;
	       age =a;
	       salary = f;
	       EmployeeId =id;
	       
	}


	public int compareTo(Employee o) {
	       return this.name.compareTo(o.name) + (this.age.compareTo(o.age)) +(this.salary.compareTo(o.salary))
	                    + (this.EmployeeId.compareTo(o.EmployeeId));
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Employee emp1 = new Employee("ravi", 45, 20000 ,5767678);
			 Employee emp2 = new Employee("rohan", 26, 25000 ,5767667);
			 Employee emp3 = new Employee("ram", 55, 30000 ,5767689);
			 Employee emp4 = new Employee("vivek", 35, 35000 ,5767688);
			 Employee emp5 = new Employee("bibek", 40, 40000 ,5767500);


	         List<Employee> l = new ArrayList<Employee>();
	         l.add(emp1);
	         l.add(emp2);
	         l.add(emp3);
	         l.add(emp4);
	         l.add(emp5);

	         Collections.sort(l); // SORT

	         System.out.println(l); // Display list

	  }

	}

