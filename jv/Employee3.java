// constructor example 2
 class Employee3 {
	String name;
	int emp_id;
     
     Employee3(String name, int emp_id)
     {
     	this.name=name;
     	this.emp_id=emp_id;
     }
	

	public static void main(String[] args){
		
		Employee3 e1 = new Employee3("deepak",101);
		Employee3 e2 = new Employee3("abc",102);
		System.out.println("Employee 1 :"+ e1.name+ " "+e1.emp_id);
		System.out.println("Employee 2 :"+ e2.name+ " "+e2.emp_id);
	  
	}	
}