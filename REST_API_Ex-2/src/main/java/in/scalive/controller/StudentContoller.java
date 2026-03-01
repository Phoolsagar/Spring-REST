package in.scalive.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.scalive.model.Student;

@RestController
public class StudentContoller {
	
	@GetMapping("/student")
	public Student welcomeMsg() {
		Student student = new Student(101,"sagar",22,"Spring");
		return student;
	}

	@GetMapping("/students")
	public List<Student> students() {
		List<Student> studList = new ArrayList<>();
		Student student1 = new Student(101,"sagar",22,"Spring");
		Student student2 = new Student(102,"Mannu",24,"React");
		Student student3 = new Student(103,"sagar",23,"Java");
		studList.add(student1);
		studList.add(student2);
		studList.add(student3);
		return studList;
	}
}
