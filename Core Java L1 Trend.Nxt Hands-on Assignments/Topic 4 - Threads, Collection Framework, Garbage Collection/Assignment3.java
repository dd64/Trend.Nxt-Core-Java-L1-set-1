

import java.util.ArrayList;

class Employee
{
	String name,department;
	int salary,id;
	Employee(String n,String d,int i,int s)
	{
		name = n;
		department = d;
		id = i;
		salary = s;
	}
	void showDetails()
	{
		System.out.println("\nName : "+name+
				"\nEMP ID : "+id+"\nDepartment : "+department+"\nSalary : "+salary);
	}
}
class EmployeeDB
{
	ArrayList<Employee> e1 = new ArrayList<Employee>();
	boolean addEmployee(Employee e)
	{
		int flag = 0;
		for (Employee emp : e1) {
			if(emp.id==e.id)
			{
				flag++;
				break;
			}
		}
		if(flag==1)
			{
			System.out.println("Employee with same ID exists");
			return false;
			}
		else
			{
			e1.add(e);
			System.out.println("Employee Details Added successfully");
			return false;
			}
	}
	boolean deleteEmployee(int e)
	{
		if(e1.isEmpty())
			{
			System.out.println("No employees added to database");
			return false;
			}
		else
		{
			int flag = 0;
			for (Employee emp : e1) {
				if(emp.id==e)
				{
					flag++;
					e1.remove(emp);
					break;
				}
			}
			if(flag==1) {
				System.out.println("Employee with EMP ID : "+e+" deleted Succesfully");
				return true;
			}
			else {
				System.out.println("No Employees found with the given EMP ID");
				return false;
			}
		}
	}
	String showPaySlip(int e)
	{
		if(e1.isEmpty())
		{
		System.out.println("No employees added to database");
		return "No Employee Found";
		}
		else
		{
			int flag = 0;
			String pay="";
			for (Employee emp : e1) {
				if(emp.id==e)
				{
					flag++;
					pay+="\n--- Pay Slip ---\nEmp ID : "+emp.id+
					"\nName : "+emp.name+
					"\nDepartment : "+emp.department+
					"\nSalary : "+emp.salary;
					break;
				}
			}
			if(flag==1) return pay;
			else return "No such employees found";
		}
		
		
	}
	Employee[] listAll()
	{
		return e1.toArray(new Employee[e1.size()]);
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		Employee e1 = new Employee("Amal","Finance",1001,12000);
		Employee e2 = new Employee("Wilson","Management",1002,12000);
		Employee e3 = new Employee("Amala","Tech",1003,13000);
		Employee e4 = new Employee("Bachan","MFG",1001,12500);
		Employee e5 = new Employee("Amliya","Finance",1004,16000);
		
		ArrayList<Employee> arr1 = new ArrayList<Employee>();
		arr1.add(e1);
		arr1.add(e2);
		arr1.add(e3);
		arr1.add(e4);
		arr1.add(e5);
		
		EmployeeDB edb1 = new EmployeeDB();
		edb1.deleteEmployee(1005);
		edb1.showPaySlip(0);
		for (Employee employee : arr1) {
			edb1.addEmployee(employee);
		}
		edb1.deleteEmployee(1005);
		edb1.deleteEmployee(1003);
		System.out.println(edb1.showPaySlip(1005));
		System.out.println(edb1.showPaySlip(1004));
		Employee[] arr2 = edb1.listAll();
		System.out.println("\n--- Employee Details ---");
		for (Employee employee : arr2) {
			employee.showDetails();
			System.out.println("\n================");
		}
		
										
	}

}
