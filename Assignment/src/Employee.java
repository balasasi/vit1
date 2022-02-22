
public class Employee {
	private Integer empId;
	private String empName;
	public Integer getEmpId()
	{
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId=empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName=empName;		
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.setEmpId(1);
		e1.setEmpName("Chikku");
		
		Employee e2=new Employee();
		e2.setEmpId(2);
		e2.setEmpName("Dori");
		
		System.out.println("Employee (e1): "+e1.getEmpId());
		System.out.println("Employee (e1): "+e1.getEmpName());
		
		System.out.println("Employee (e2): "+e2.getEmpId());
		System.out.println("Employee (e2): "+e2.getEmpName());
		
		e2 = e1;
		e2.setEmpName("Dhanu");
		
		System.out.println("Employee (e1): "+e1.getEmpId());
		System.out.println("Employee (e1): "+e1.getEmpName());
		
		System.out.println("Employee (e2): "+e2.getEmpId());
		System.out.println("Employee (e2): "+e2.getEmpName());	
	}

}
