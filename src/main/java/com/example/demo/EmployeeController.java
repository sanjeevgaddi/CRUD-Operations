package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/crud")
public class EmployeeController {
	
	EmployeeService es;

	public EmployeeController(EmployeeService es) {
		this.es = es;
	}
	
	@GetMapping("/employees") 
	public String getAllEmployees(Model thModel) 
	{ 
		thModel.addAttribute("list",es.findAll());
		return "emplist"; 
	} 

	@GetMapping("/showFormForAdd") 
	public String showFormForAdding(Model theModel) 
	{ 
		Employee e=new Employee(); 
		theModel.addAttribute(  "employee", e);
		return "empform"; 
	} 

	@GetMapping("/showformtoupdate") 
	public String showFormForUpdate(@RequestParam("employeeid") int id,Model theModel) 
	{ 
		Employee emp=es.findById(id); 
		theModel.addAttribute("employee", emp); 
		return "empform"; 
	} 
	
	@GetMapping("/delete") 
	public String delete(@RequestParam("employeeid") int id) 
	{ 
			es.deleteById(id); 
			return "redirect:/crud/employees"; 

	} 

	@PostMapping("/save") 
	public String saveEmployee(@ModelAttribute("employee") Employee e) 
	{ 
		es.save(e); 
		return "redirect:/crud/employees"; 
	} 
	
	

}
