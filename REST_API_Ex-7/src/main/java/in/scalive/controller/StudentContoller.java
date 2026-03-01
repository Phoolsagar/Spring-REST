package in.scalive.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import in.scalive.model.Student;

@RestController
@RequestMapping(value = "/api")

public class StudentContoller {
	Map <Integer, Student> studMap;
	 
	public StudentContoller() {
		studMap = new HashMap(Map.of(101, new Student(101,"Sagar",22,"Spring"), 102, new Student(102,"Manu",24,"React"), 103, new Student(103,"Bittu",23,"Java")));
	}

	// getting all students
	@PostMapping("/students")
	public Collection<Student> students() {
		return studMap.values();
	}
	
	//getting single students
	@GetMapping("/students/{id}")
	public Student student(@PathVariable Integer id) {
		Student student = studMap.get(id);
		return student;
	}
	
	//creating new students
//	@PostMapping("/student")
//	public ResponseEntity<Student> createStudent(@RequestBody Student s) {
//		int id = 100 + studMap.size() + 1;
//		s.setId(id);
//		studMap.put(id, s);
//		return new ResponseEntity<>(s, HttpStatus.CREATED);
//	}
	
	@PostMapping("/student")
	@ResponseStatus(HttpStatus.CREATED)
	public Student createStudent(@RequestBody Student s) {
		int id = 100 + studMap.size() + 1;
		s.setId(id);
		studMap.put(id, s);
		return s;
	}
}
