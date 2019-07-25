package app.service;

import app.dao.EmployeeDAO;
import app.model.EmployeeVO;
import java.util.List;

public class EmployeeManagerImpl implements EmployeeManager {
	
	private EmployeeDAO employeeDAO;
	
	public List<EmployeeVO> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}
}
