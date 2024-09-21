package com.example.ai_generate_report;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {
    private List<Person> persons = Arrays.asList(
        new Person("1", "John Doe", 25),
        new Person("2", "Jane Smith", 30)
    );

    public Person getPersonById(String id) {
        return persons.stream()
            .filter(person -> person.getId().equals(id))
            .findFirst()
            .orElse(null);
    }
}
