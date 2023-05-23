package com.operate.services;

import java.util.List;

import com.operate.entities.Student;

 

public interface StudentService {
	public void saveStudent(Student student);

	public List<Student> findAllStudents();

	public Student findStudentById(long id);

	public void deleteStudent(long id);
}
