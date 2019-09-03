package app.controller;

import app.model.EmployeeVO;
import app.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@SuppressWarnings("ALL")
@Controller
@RequestMapping("/employee-module/addNew")
@SessionAttributes("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeManager manager;
	
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		EmployeeVO employeeVO = new EmployeeVO();
		model.addAttribute("employee", employeeVO);
		return "addEmployee";
	}
	
	public String submitForm(@ModelAttribute("employee") EmployeeVO employeeVO,
	                         BindingResult result, SessionStatus status) {
		boolean error = false;
		
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
		
		status.setComplete();
		return "redirect:addNew/success";
	}
	
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String success(Model model) {
		return "addSuccess";
	}
}
