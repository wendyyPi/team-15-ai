package com.example.ai_generate_report;

import com.fasterxml.jackson.core.type.*;
import com.fasterxml.jackson.databind.*;
import org.springframework.boot.*;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

@Service
public class PersonService {
    Hospital h = new Hospital();

    public static List<Person> personList = new ArrayList<>();
    public PersonService() {
        String jsonFilePath = "src/main/resources/Patients.JSON";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Load JSON data into personList
            personList = objectMapper.readValue(new File(jsonFilePath), new TypeReference<List<Person>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getPersonPromptById(String id) {
        int idNumber = Integer.parseInt(id);
        if (idNumber < 0 || idNumber >= personList.size()) {
            return "Invalid Person ID";
        }

        // Create the prompt based on the selected person
        Person selectedPerson = personList.get(idNumber);
        return generatePrompt(selectedPerson);
    }
    private String generatePrompt(Person person) {
//        String promptStart = "I want you to generate a realistic hospital discharge report, to given the following information: ";
//        String promptStart = "I want you to generate a realistic and formal and structural  hospital discharge report," +
//            "and start a new line before start a new sector, to given the following information: ";
        String promptStart = "I want you to generate a realistic and formal and structural  hospital discharge report," +
            "and have it formatted into html.";
        String hospitalInfoPrompt = "Hospital information: " + h.toString();
        String patientPrompt = " and Patient information: ";
        String promptEnd = " . Furthermore, please generate appropriate responses for the missing details such as Patient’s Allergies, Discharge Condition, Vital Signs or Lab Results, and Instructions for the Patient.";
        String outputString = promptStart + hospitalInfoPrompt + patientPrompt + person.toString() + promptEnd;
        // Combine prompt parts
        return outputString;
    }


}
