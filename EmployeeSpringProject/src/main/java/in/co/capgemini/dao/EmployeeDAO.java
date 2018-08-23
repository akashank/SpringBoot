package in.co.capgemini.dao;

	import java.awt.List;
import java.util.ArrayList;
import java.util.Optional;

import in.co.capgemini.employee.Employee;

	public class EmployeeDAO {

		private static ArrayList<Employee> emp;
		
		static {
			emp =new ArrayList<Employee>();
		}
		
		public void addNewEmployee(Employee employee)
		{
			emp.add(employee);
		}
		
		public ArrayList<Employee> viewAllEmployee()
		{
			return emp;
		}
		
		public Employee getID(int id)
		{
			Employee employ=null;
			for(Employee a:emp)
			{
				if(a.getEmpID()==id)
				{
					employ=a;
				}
			}
			return employ;
		}
		public void updateEmployee(int id, Employee employee) {
			for(int i=0;i<emp.size();i++)
			{
				Employee t= emp.get(i);
				if(t.getEmpID()==id)
				{
					emp.set(i, employee);
					return;
				}
			}
			
		}
		public void deleteEmp(int id) {
			emp.removeIf(t ->t.getEmpID()==id);
		}

		public void save(Employee employee) {
			// TODO Auto-generated method stub
			
		}

		public List findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		public Optional<Employee> findById(int id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
	}


