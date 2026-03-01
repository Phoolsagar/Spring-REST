package in.scalive.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


	@GetMapping("/students/{id}")
	public ResponseEntity<?> geStudent(@PathVariable Integer id) {
		Map<Integer, Student> studMap = Map.of(101, new Student(101, "sagar", 22, "Spring"), 
				102,new Student(102, "Mannu", 24, "React"), 103, new Student(103, "sagar", 23, "Java"));
		Student student = studMap.get(id);
		
		if(student == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student with id: "+id+" not found!");
		}
		
		return ResponseEntity.ok(student);
	}
	
}
