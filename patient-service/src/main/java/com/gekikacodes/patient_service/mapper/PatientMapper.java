package com.gekikacodes.patient_service.mapper;

import com.gekikacodes.patient_service.dto.PatientResponseDTO;
import com.gekikacodes.patient_service.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO patientDTO = new PatientResponseDTO();
        patientDTO.setId(patientDTO.getId().toString());
        patientDTO.setFullname(patient.getFullname());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setDateOfBirth(patientDTO.getDateOfBirth().toString());
        return  patientDTO;

    }
}
