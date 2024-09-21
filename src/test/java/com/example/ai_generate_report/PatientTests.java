package com.example.ai_generate_report;


import com.fasterxml.jackson.core.type.*;
import com.fasterxml.jackson.databind.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.*;

@SpringBootTest
 class PatientTests {


    public static void main(String[] args) {
        // Path to your JSON file (adjust the path as needed)
        String jsonFilePath = "/Users/leong/Desktop/team-15-ai/src/main/resources/Patients.JSON";

        // Create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Deserialize JSON into List<Patient>
            List<Patient> patients = objectMapper.readValue(new File(jsonFilePath), new TypeReference<List<Patient>>() {});

            System.out.println("num patients " + patients.size());
            // Now you can iterate over the list of patients
            for (Patient patient : patients) {
                System.out.println("Patient First Name: " + patient.getFirstName());
                System.out.println("Principal Diagnosis: " + patient.getPrincipalDiagnosis());
                System.out.println("Patient ID: " + patient.getPatientID());
                System.out.println("---");
            }


            System.out.println(patients.get(5).toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
