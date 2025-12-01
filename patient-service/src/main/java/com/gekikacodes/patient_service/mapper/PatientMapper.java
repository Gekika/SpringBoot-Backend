package com.gekikacodes.patient_service.mapper;

import com.gekikacodes.patient_service.dto.PatientRequestDTO;
import com.gekikacodes.patient_service.dto.PatientResponseDTO;
import com.gekikacodes.patient_service.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO patientDTO = new PatientResponseDTO();
        patientDTO.setId(patientDTO.getId());
        patientDTO.setFullname(patient.getFullname());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setDateOfBirth(patientDTO.getDateOfBirth());
        return  patientDTO;

    }
    public static Patient toModel(PatientRequestDTO patientRequestDTO){
        Patient patient = new Patient();
        patient.setFullname(patientRequestDTO.getFullname());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        patient.setRegisterdDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));

        return patient;
    }
}
