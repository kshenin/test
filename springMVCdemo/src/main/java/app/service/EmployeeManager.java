package app.service;

import app.model.EmployeeVO;
import java.util.List;

public interface EmployeeManager {
	List<EmployeeVO> getAllEmployees();
}
