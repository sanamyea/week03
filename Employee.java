
public class Employee {

	private int empid;
	private String name;
	protected int salary;
	
	public Employee(int empid, String name, int salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
public int getEmpid() {
	return empid;}

	public String getName() {
		return name;}
	
     public int getSalary() {
    	 return salary;
     }

     public void setEmpid(int empid) {
    		this.empid= empid;
    	}
    	public void setName(String name) {
    		this.name = name;
    	}
    	public void setSalary(int salary) {
    		this.salary = salary;
    	}

public void increaseSalary(int increase) {
	salary += increase; 
}
}