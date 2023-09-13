package com.nagarro.devops.model;

public class Person {

	private Long id;
	private String name;
	private Integer age;
	private Double salary;
	private Character gender;

	public Person(Long id, String name, Integer age, Double salary, Character gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender
				+ "]";
	}

}
