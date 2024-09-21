package com.example.ai_generate_report;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class UserController {
    private final PersonService personService;

    public UserController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{id}")
    public Person getPersonInfo(@PathVariable String id) {
        return personService.getPersonById(id);
    }
}
