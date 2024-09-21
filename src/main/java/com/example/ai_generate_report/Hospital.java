package com.example.ai_generate_report;

public class Hospital {
    private final String hospitalName = "ANU Hackathon Hospital";
    private final String address = "Birch Building, 35 Science Rd, Acton ACT 2601";
    private final String phoneNumber = "0412345678";

    @Override
    public String toString() {
        return "Hospital Information: {" +
                "Hospital Name ='" + hospitalName + '\'' +
                ", Address ='" + address + '\'' +
                ", Phone number ='" + phoneNumber + '\'' +
                '}';
    }
}
