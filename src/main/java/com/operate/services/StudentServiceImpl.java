package com.operate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operate.entities.Student;
import com.operate.repositories.StudentRepository;

 

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public void saveStudent(Student student) {
		studentRepo.save(student);
	}

	@Override
	public List<Student> findAllStudents() {
		List<Student> students= studentRepo.findAll();
		return students;
	}

	@Override
	public Student findStudentById(long id) {
		 Optional<Student> findById = studentRepo.findById(id);
		 Student student = findById.get();
		return student;
	}

	@Override
	public void deleteStudent(long id) {
		studentRepo.deleteById(id);
	}
}
