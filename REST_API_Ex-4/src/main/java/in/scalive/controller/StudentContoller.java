package in.scalive.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.scalive.model.ErrorResponse;
import in.scalive.model.Student;

@RestController
@RequestMapping(value = "/api")
public class StudentContoller {

	@GetMapping("/students")
	public List<Student> students() {
		List<Student> studList = new ArrayList<>();
		Student student1 = new Student(101, "sagar", 22, "Spring");
		Student student2 = new Student(102, "Mannu", 24, "React");
		Student student3 = new Student(103, "sagar", 23, "Java");
		studList.add(student1);
		studList.add(student2);
		studList.add(student3);
		return studList;
	}


	@GetMapping("/student/details")
	public ResponseEntity<?> geStudent(@RequestParam Integer id , @RequestParam String name) {
		Map<Integer, Student> studMap = Map.of(101, new Student(101, "sagar", 22, "Spring"), 
				102,new Student(102, "Mannu", 24, "React"), 103, new Student(103, "sagar", 23, "Java"));
		Student student = studMap.get(id);
		
		if(student == null || student.getName() != name) {
			ErrorResponse error = new ErrorResponse( HttpStatus.NOT_FOUND.value(), "Student not found!");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
		}
		
		return ResponseEntity.ok(student);
	}
	
}
