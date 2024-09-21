package com.example.ai_generate_report;

import com.fasterxml.jackson.core.type.*;
import com.fasterxml.jackson.databind.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.*;

@SpringBootApplication
public class AiGenerateReportApplication {
	static Hospital h = new Hospital();

	public static void main(String[] args) {
		SpringApplication.run(AiGenerateReportApplication.class, args);
		// Adjust this file path to match the path on your computer
		String jsonFilePath = "/Users/leong/Desktop/team-15-ai/src/main/resources/Patients.JSON";
		// Create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		List<Patient> patients = new ArrayList<>();
		try {
			// Deserialize JSON into List<Patient>
			patients = objectMapper.readValue(new File(jsonFilePath), new TypeReference<List<Patient>>() {});
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Successfully loaded: " + patients.size() + " patients from the JSON");

		System.out.println(generatePrompt(7, patients));




	}



	//Input: personID, ranging from 0 to 19 (We have 20 fake patients in the JSON)
	final static String promptStart = "I want you to generate a realistic hospital discharge report, given the following information: ";
	final static String hospitalInfoPrompt = h.toString();
	final static String patientPrompt = " and Patient information: ";
	final static String promptEnd = " . Furthermore, the following details are not included, but I want you to generate appropriate responses for the report: Patient’s Allergies, Discharge Condition, Vital Signs or Lab Results, Instructions for the Patient, Emergency or Symptom Escalation Plan.";

	public static String generatePrompt(int personID, List<Patient> patients) {
		if (personID < 0 || personID >= 20) {
			personID = 0;
		}
		String patientToString = patients.get(personID).toString();
		String outputString = promptStart + hospitalInfoPrompt + patientPrompt + patientToString + promptEnd;
		return outputString;
	}

}
