package in.scalive.model;

public class Student {

	private Integer id;
	private String name;
	private int age;
	private String course;
	public Student(Integer id, String name, int age, String course) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	public Student() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
