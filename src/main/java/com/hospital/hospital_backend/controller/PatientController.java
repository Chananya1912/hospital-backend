
package com.hospital.hospital_backend.controller;

import com.hospital.hospital_backend.model.Patient;
import com.hospital.hospital_backend.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository repo;

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return repo.save(patient);
    }

    @GetMapping
    public List<Patient> getAll() {
        return repo.findAll();
    }
}