package com.howtodoinjava.demo.controller;

import com.howtodoinjava.demo.model.EmployeeVO;
import com.howtodoinjava.demo.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/employee-module/addNew")
@SessionAttributes("employee")
public class EmployeeController {
	@Autowired
	EmployeeManager manager;
	
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		EmployeeVO employeeVO = new EmployeeVO();
		model.addAttribute("employee", employeeVO);
		return "addEmployee";
	}
	
	
	public String submitForm(@ModelAttribute("employee") EmployeeVO employeeVO,
	                         BindingResult result, SessionStatus status) {
		//Validation code start
		boolean error = false;
		
		System.out.println(employeeVO); //Verifying if information is same as input by user
		
		if (employeeVO.getFirstName().isEmpty()) {
			result.rejectValue("firstName", "error.firstName");
			error = true;
		}
		
		if (employeeVO.getLastName().isEmpty()) {
			result.rejectValue("lastName", "error.lastName");
			error = true;
		}
		
		if (employeeVO.getEmail().isEmpty()) {
			result.rejectValue("email", "error.email");
			error = true;
		}
		
		if (error) {
			return "addEmployee";
		}
		//validation code ends
		
		//Store the employee information in database
		//manager.createNewRecord(employeeVO);
		
		//Mark Session Complete
		status.setComplete();
		return "redirect:addNew/success";
	}
	
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String success(Model model) {
		return "addSuccess";
	}
}