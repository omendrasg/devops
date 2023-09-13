package com.nagarro.devops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.devops.model.Person;
import com.nagarro.devops.services.PersonService;

@CrossOrigin
@RestController
@RequestMapping("/devops")
public class PersonController {

	@Autowired
	private PersonService personService;

	@RequestMapping("/")
	public String getHTML() {
		return personService.getHTML();
	}

	@RequestMapping("/get")
	public Person getPerson(@RequestParam Long id) {
		return personService.getPerson(id);
	}

	@RequestMapping("/getAll")
	public List<Person> getAllPersons() {
		return personService.getAllPersons();
	}

}
