package com.kshenin.demo.service;

import com.kshenin.demo.dao.EmployeeDAO;
import com.kshenin.demo.model.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeManagerImpl implements EmployeeManager {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	public List<EmployeeVO> getAllEmployees() {
	return employeeDAO.getAllEmployees();
	}
}
