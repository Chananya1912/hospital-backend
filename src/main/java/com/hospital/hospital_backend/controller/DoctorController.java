
package com.hospital.hospital_backend.controller;


import com.hospital.hospital_backend.model.Doctor;
import com.hospital.hospital_backend.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repo;

    // ➕ Add doctor
    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return repo.save(doctor);
    }

    // 📋 Get all doctors
    @GetMapping
    public List<Doctor> getAllDoctors() {
        return repo.findAll();
    }
}