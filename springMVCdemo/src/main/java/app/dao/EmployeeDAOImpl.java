package app.dao;

import app.model.EmployeeVO;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	public List<EmployeeVO> getAllEmployees() {
		
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		
		EmployeeVO vo1 = new EmployeeVO();
		vo1.setId(1);
		vo1.setFirstName("Alexander");
		vo1.setLastName("Loginov");
		employees.add(vo1);
		
		EmployeeVO vo2 = new EmployeeVO();
		vo2.setId(2);
		vo2.setFirstName("Vladimir");
		vo2.setLastName("Fedorov");
		employees.add(vo2);
		
		return employees;
	}
}
