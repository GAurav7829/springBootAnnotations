package com.annotation.entity;

import org.springframework.stereotype.Component;

@Component
//tell spring container, that this is spring component, spring have to manage object lifecycle
//no need to declare object bean now
/**
 * @Component
 * 		@Controller, presentation layer, provide MVC feature
 * 		@Service, service layer
 * 		@Repository, Dao[Data access object] Layer
 */
public class Emp {
	public void getName() {
		System.out.println("My name is grv");
	}
}
