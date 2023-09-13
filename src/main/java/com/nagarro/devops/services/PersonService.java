package com.nagarro.devops.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.devops.model.Person;

@Service
public class PersonService {

	private List<Person> persons = new ArrayList<Person>() {

		private static final long serialVersionUID = -5877226937068744251L;

		{
			add(new Person(1L, "Omendra", 27, 500000.00, 'M'));
			add(new Person(2L, "Gauri", 26, 400000.00, 'F'));
			add(new Person(3L, "Mayank", 25, 300000.00, 'T'));
		}
	};

	public String getHTML() {
		String html = "", row;
		html = html + "<tr><th>ID</th><th>NAME</th><th>AGE</th><th>SALARY</th><th>GENDER</th></tr>";
		for (Person person : persons) {
			row = "<td>" + person.getId() + "</td>";
			row = row + "<td>" + person.getName() + "</td>";
			row = row + "<td>" + person.getAge() + "</td>";
			row = row + "<td>" + person.getSalary() + "</td>";
			row = row + "<td>" + person.getGender() + "</td>";
			html = html + "<tr>" + row + "</tr>";
		}
		html = "<body><table border='1'>" + html + "</table></body>";
		html = "<html><head><title>DevOps</title></head>" + html + "</html>";
		return html;
	}

	public Person getPerson(Long id) {
		Person person = null;
		for (Person p : persons) {
			if (p.getId() == id) {
				person = p;
			}
		}
		return person;
	}

	public List<Person> getAllPersons() {
		return persons;
	}

}
