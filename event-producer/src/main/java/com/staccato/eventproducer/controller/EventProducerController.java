package com.staccato.eventproducer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.staccato.eventproducer.domain.Events;

@RestController
public class EventProducerController {

	private List<Events> eventss = createList();

	@RequestMapping(value = "/eventss", method = RequestMethod.GET, produces = "application/json")
	public List<Events> firstPage() {
		return eventss;
	}

	@DeleteMapping(path = { "/{id}" })
	public Events delete(@PathVariable("id") int id) {
		Events deletedEmp = null;
		for (Events emp : eventss) {
			if (emp.getEmpId().equals(id)) {
				eventss.remove(emp);
				deletedEmp = emp;
				break;
			}
		}
		return deletedEmp;
	}

	@PostMapping
	public Events create(@RequestBody Events user) {
		eventss.add(user);
		System.out.println(eventss);
		return user;
	}

	private static List<Events> createList() {
		List<Events> tempEvents = new ArrayList<>();
		Events emp1 = new Events();
		emp1.setName("emp1");
		emp1.setDesignation("manager");
		emp1.setEmpId("1");
		emp1.setSalary(3000);

		Events emp2 = new Events();
		emp2.setName("emp2");
		emp2.setDesignation("developer");
		emp2.setEmpId("2");
		emp2.setSalary(3000);
		tempEvents.add(emp1);
		tempEvents.add(emp2);
		return tempEvents;
	}
}
