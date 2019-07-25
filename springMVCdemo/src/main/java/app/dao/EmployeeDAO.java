package app.dao;

import app.model.EmployeeVO;
import java.util.List;

public interface EmployeeDAO {
	List<EmployeeVO> getAllEmployees();
}
