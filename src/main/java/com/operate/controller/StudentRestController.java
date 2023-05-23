package com.operate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operate.entities.Student;
import com.operate.repositories.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentRestController {
	@Autowired
	private StudentRepository studentRepo;	

	 
		//localhost:8080/api/students 
		@GetMapping
		public List<Student> getAllStudents(){
			List<Student> students = studentRepo.findAll();  
			return students;
	}
		@PostMapping
		public void saveOneStudent(@RequestBody Student student) {
			studentRepo.save(student);
			
		}
		@PutMapping
		public void updateOneStudent(@RequestBody Student student) {
			studentRepo.save(student);
			
		}
		//localhost:8080/api/students/3
		@DeleteMapping("/{id}")
		public void deleteOneStudent(@PathVariable("id") long id) {
			studentRepo.deleteById(id);
		}
		//localhost:8080/api/students/5
		
		@GetMapping("/{id}") 
		public Student getOneStudent(@PathVariable("id") long id) {
			Optional<Student> findById = studentRepo.findById(id);
			Student student= findById.get();
			return student;
		}
}
