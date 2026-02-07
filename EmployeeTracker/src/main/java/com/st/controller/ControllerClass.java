package com.nt.controller;


import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.main.entity.Employee;
import com.main.service.IServiceMngt;


@Controller
public class ControllerClass {

	@Autowired
	private IServiceMngt empService;

	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	//For Displaying the Employee
	@GetMapping("/report")
	public String showEmployeeReport(Map<String,Object> map) {
		
		Iterable<Employee> empL = empService.getAllEmployee();
		map.put("empList", empL);
		return "show_employee";
	}
	
	
	//For Adding the Employee
	@GetMapping("/emp_add")
	public String addEmployee(@ModelAttribute("emp") Employee employee) {
		return "insert_employee";
	}
	
	@PostMapping("/emp_add")
	public String addEmployee(@ModelAttribute("emp") Employee employee,RedirectAttributes redirectAttributes) {
		String mess = empService.registerEmployee(employee);
//		ses.setAttribute("result", mess); HttpSession session object to view the message in all the request coming from the browser
		redirectAttributes.addFlashAttribute("message", mess);
		return "redirect:emp_add";
	}
	
	
	//For Editing the details of the employee
	@GetMapping("/emp_edit")
	public String showEmployeeEditFormPage(@ModelAttribute("emp") Employee employee,@RequestParam Integer empno){
		try {
			Employee emp1 = empService.getEmployeeByEmpNo(empno);
			BeanUtils.copyProperties(emp1, employee);
			return "edit_employee";
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return "error";
		}
		
	}
	
	@PostMapping("/emp_edit")
	public String showEmployeeEditFormPage(@ModelAttribute("emp") Employee employee, RedirectAttributes redAttributes) {
		String mess = empService.updateEmployee(employee);
		redAttributes.addFlashAttribute("message", mess);
		return "redirect:report";
	}
	
	
	@GetMapping("/emp_delete")
	public String deleteEmployee(Map<String,Object> map,@RequestParam Integer empno) {
		String mess = empService.deleteEmployeeByEmpno(empno);
		map.put("message", mess);
		return "forward:report";
	}
	
}
