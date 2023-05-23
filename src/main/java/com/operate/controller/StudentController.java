package com.operate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.operate.dto.StudentDto;
import com.operate.entities.Student;
import com.operate.services.StudentService;
 

@Controller
public class StudentController {
	@Autowired
	 private StudentService studentService;
	
	//http://localhost:8080/viewCreateStudent
		@RequestMapping("/viewCreateStudent")
		public String viewCreateStudentForm() {
			return "Student_register";
			
		} 
		@RequestMapping("/saveStudent")
		public String saveOneStudent(StudentDto studentDto, ModelMap model) {
			Student s=new Student();
			s.setFirstName(studentDto.getFirstName());
			s.setLastName(studentDto.getLastName());
			s.setEmail(studentDto.getEmail());
			s.setCourse(studentDto.getCourse());
			s.setFee(studentDto.getFee());
			s.setMobile(studentDto.getMobile());
			model.addAttribute("msg", "record is saved");
			studentService.saveStudent(s);
			return "Student_register";
		}
		//localhost:8080/listStudent
		@RequestMapping("/listStudent")
		public String getAllStudent(ModelMap model) {
		List<Student> students= studentService.findAllStudents();
		model.addAttribute("students", students);
		return "Student_list";
		}
		
		@RequestMapping("/update")
		public String updateOneStudent(@RequestParam("id") long id ,Model model) {
			 Student student = studentService.findStudentById(id);
			 model.addAttribute("student", student);
			 
			return "Student_update";

}
		@RequestMapping("/updateStudent") 
		public String updateOneStudent(@ModelAttribute("s") Student s, ModelMap model) {
			studentService.saveStudent(s);
			 List<Student> students = studentService.findAllStudents();
			 model.addAttribute("students", students);
			return "Student_list"; 
		 
		}
		@RequestMapping("/delete")
		public String deleteOneStudent(@RequestParam("id") long id ,Model model) {
			 studentService.deleteStudent(id);
			 List<Student> students = studentService.findAllStudents();
			 model.addAttribute("students", students);
			return "Student_list";
}
		 
}
