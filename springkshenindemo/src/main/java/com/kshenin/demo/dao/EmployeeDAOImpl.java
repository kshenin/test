package com.kshenin.demo.dao;

import com.kshenin.demo.model.EmployeeVO;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	public List<EmployeeVO> getAllEmployees() {
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		
		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setId(1);
		employeeVO.setFirstName("Vladimir");
		employeeVO.setLastName("Fedorov");
		employees.add(employeeVO);
		
		EmployeeVO employeeVO1 = new EmployeeVO();
		employeeVO1.setId(2);
		employeeVO1.setFirstName("Alexandr");
		employeeVO1.setLastName("Loginov");
		employees.add(employeeVO1);
		
		return employees;
	}
}
