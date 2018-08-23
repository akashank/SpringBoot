package in.co.capgemini.service;

public class EmployeeServiceImpl {
	
	public class EmployeeServiceImpl implements EmployeeService {

		EmployeeDAO dao;

		
		
		public void addNewEmployee(Employee employee)
		{
			dao.save(employee);
		}
		
		public List<Employee> viewAllEmployee()
		{
			return dao.findAll();
		}
		
		public Optional<Employee> getID(int id)
		{
			return dao.findById(id);
		}
		public void updateEmployee(int id, Employee employee)
		{
			dao.save(employee);
		}
		public void deleteEmp(int id) {
			dao.deleteById(id);
		}
		
		
	}	

}
