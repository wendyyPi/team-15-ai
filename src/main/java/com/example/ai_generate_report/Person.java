package com.example.ai_generate_report;

import java.util.*;

public class Person {
    //Triage and Patient Details
    private String firstName;
    private String lastName;
    private String deceasedStatement;
    private String dateOfBirth;
    private int age;
    private String sex;
    private String residentialAddress;
    private String telephone;
    private int patientID;
    private String indigenousStatus;

    //Presentation Details
    private String dateOfAdmission;
    private String dateOfDischarge;
    private String clinicalUnit;
    private String episodeType;
    private String seniorClinician;
    private String dischargeLocation;

    //Problems and Diagnoses
    private String principalDiagnosis;
    private String reasonForPresentation;
    private List<String> secondaryDiagnoses;
    private List<String> complications;
    private List<String> pastMedicalHistory;

    private List<String> procedures;

    private String clinicalSummary;

    private List<String> medicinesOnDischarge;

    private List<String> ceasedMedicines;

    private List<String> precautions;

    private List<String> followUpAppointments;

    private List<String> informationProvidedToPatient;

    public Person() {}

    public Person(String firstName,
                   String lastName,
                   String deceasedStatement,
                   String dateOfBirth,
                   int age,
                   String sex,
                   String residentialAddress,
                   String telephone,
                   int patientID,
                   String indigenousStatus,
                   String dateOfAdmission,
                   String dateOfDischarge,
                   String clinicalUnit,
                   String episodeType,
                   String seniorClinician,
                   String dischargeLocation,
                   String principalDiagnosis,
                   String reasonForPresentation,
                   List<String> secondaryDiagnoses,
                   List<String> complications,
                   List<String> pastMedicalHistory,
                   List<String> procedures,
                   String clinicalSummary,
                   List<String> medicinesOnDischarge,
                   List<String> ceasedMedicines,
                   List<String> precautions,
                   List<String> followUpAppointments,
                   List<String> informationProvidedToPatient) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deceasedStatement = deceasedStatement;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.sex = sex;
        this.residentialAddress = residentialAddress;
        this.telephone = telephone;
        this.patientID = patientID;
        this.indigenousStatus = indigenousStatus;
        this.dateOfAdmission = dateOfAdmission;
        this.dateOfDischarge = dateOfDischarge;
        this.clinicalUnit = clinicalUnit;
        this.episodeType = episodeType;
        this.seniorClinician = seniorClinician;
        this.dischargeLocation = dischargeLocation;
        this.principalDiagnosis = principalDiagnosis;
        this.reasonForPresentation = reasonForPresentation;
        this.secondaryDiagnoses = secondaryDiagnoses;
        this.complications = complications;
        this.pastMedicalHistory = pastMedicalHistory;
        this.procedures = procedures;
        this.clinicalSummary = clinicalSummary;
        this.medicinesOnDischarge = medicinesOnDischarge;
        this.ceasedMedicines = ceasedMedicines;
        this.precautions = precautions;
        this.followUpAppointments = followUpAppointments;
        this.informationProvidedToPatient = informationProvidedToPatient;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDeceasedStatement() {
        return deceasedStatement;
    }

    public void setDeceasedStatement(String deceasedStatement) {
        this.deceasedStatement = deceasedStatement;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getIndigenousStatus() {
        return indigenousStatus;
    }

    public void setIndigenousStatus(String indigenousStatus) {
        this.indigenousStatus = indigenousStatus;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getDateOfDischarge() {
        return dateOfDischarge;
    }

    public void setDateOfDischarge(String dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }

    public String getClinicalUnit() {
        return clinicalUnit;
    }

    public void setClinicalUnit(String clinicalUnit) {
        this.clinicalUnit = clinicalUnit;
    }

    public String getEpisodeType() {
        return episodeType;
    }

    public void setEpisodeType(String episodeType) {
        this.episodeType = episodeType;
    }

    public String getSeniorClinician() {
        return seniorClinician;
    }

    public void setSeniorClinician(String seniorClinician) {
        this.seniorClinician = seniorClinician;
    }

    public String getDischargeLocation() {
        return dischargeLocation;
    }

    public void setDischargeLocation(String dischargeLocation) {
        this.dischargeLocation = dischargeLocation;
    }

    public String getPrincipalDiagnosis() {
        return principalDiagnosis;
    }

    public void setPrincipalDiagnosis(String principalDiagnosis) {
        this.principalDiagnosis = principalDiagnosis;
    }

    public String getReasonForPresentation() {
        return reasonForPresentation;
    }

    public void setReasonForPresentation(String reasonForPresentation) {
        this.reasonForPresentation = reasonForPresentation;
    }

    public List<String> getSecondaryDiagnoses() {
        return secondaryDiagnoses;
    }

    public void setSecondaryDiagnoses(List<String> secondaryDiagnoses) {
        this.secondaryDiagnoses = secondaryDiagnoses;
    }

    public List<String> getComplications() {
        return complications;
    }

    public void setComplications(List<String> complications) {
        this.complications = complications;
    }

    public List<String> getPastMedicalHistory() {
        return pastMedicalHistory;
    }

    public void setPastMedicalHistory(List<String> pastMedicalHistory) {
        this.pastMedicalHistory = pastMedicalHistory;
    }

    public List<String> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<String> procedures) {
        this.procedures = procedures;
    }

    public String getClinicalSummary() {
        return clinicalSummary;
    }

    public void setClinicalSummary(String clinicalSummary) {
        this.clinicalSummary = clinicalSummary;
    }

    public List<String> getMedicinesOnDischarge() {
        return medicinesOnDischarge;
    }

    public void setMedicinesOnDischarge(List<String> medicinesOnDischarge) {
        this.medicinesOnDischarge = medicinesOnDischarge;
    }

    public List<String> getCeasedMedicines() {
        return ceasedMedicines;
    }

    public void setCeasedMedicines(List<String> ceasedMedicines) {
        this.ceasedMedicines = ceasedMedicines;
    }

    public List<String> getPrecautions() {
        return precautions;
    }

    public void setPrecautions(List<String> precautions) {
        this.precautions = precautions;
    }

    public List<String> getFollowUpAppointments() {
        return followUpAppointments;
    }

    public void setFollowUpAppointments(List<String> followUpAppointments) {
        this.followUpAppointments = followUpAppointments;
    }

    public List<String> getInformationProvidedToPatient() {
        return informationProvidedToPatient;
    }

    public void setInformationProvidedToPatient(List<String> informationProvidedToPatient) {
        this.informationProvidedToPatient = informationProvidedToPatient;
    }

    @Override
    public String toString() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", deceasedStatement='" + deceasedStatement + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", residentialAddress='" + residentialAddress + '\'' +
                ", telephone='" + telephone + '\'' +
                ", patientID=" + patientID +
                ", indigenousStatus='" + indigenousStatus + '\'' +
                ", dateOfAdmission='" + dateOfAdmission + '\'' +
                ", dateOfDischarge='" + dateOfDischarge + '\'' +
                ", clinicalUnit='" + clinicalUnit + '\'' +
                ", episodeType='" + episodeType + '\'' +
                ", seniorClinician='" + seniorClinician + '\'' +
                ", dischargeLocation='" + dischargeLocation + '\'' +
                ", principalDiagnosis='" + principalDiagnosis + '\'' +
                ", reasonForPresentation='" + reasonForPresentation + '\'' +
                ", secondaryDiagnoses=" + secondaryDiagnoses +
                ", complications=" + complications +
                ", pastMedicalHistory=" + pastMedicalHistory +
                ", procedures=" + procedures +
                ", clinicalSummary='" + clinicalSummary + '\'' +
                ", medicinesOnDischarge=" + medicinesOnDischarge +
                ", ceasedMedicines=" + ceasedMedicines +
                ", precautions=" + precautions +
                ", followUpAppointments=" + followUpAppointments +
                ", informationProvidedToPatient=" + informationProvidedToPatient +
                '}';
    }
}
