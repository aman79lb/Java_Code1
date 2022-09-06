/* wrapping up the data and code acticg on it is encapsulation
Encapsulation in Java is a mechanism of wrapping the data(varalbles) and code acting on the data (mehods ) together as a single unit
*/
class Employee {
	private int empid;
	public void setEmpid(int eid) { //getter method
		empid = eid;
	}
	public int getEmpid() { //setter method
		return empid;
	}
}
class Company {
	public static void main(String[] args) {
		Employee e = new Employee();
		//e.empid=101;
		e.setEmpid(101);
		System.out.println(e.getEmpid());
	}
}