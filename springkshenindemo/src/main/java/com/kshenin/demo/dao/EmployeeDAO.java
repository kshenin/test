package com.kshenin.demo.dao;

import com.kshenin.demo.model.EmployeeVO;
import java.util.List;

public interface EmployeeDAO {
	List<EmployeeVO> getAllEmployees();
}
