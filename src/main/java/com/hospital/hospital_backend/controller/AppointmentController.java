
package com.hospital.hospital_backend.controller;

import com.hospital.hospital_backend.model.Appointment;
import com.hospital.hospital_backend.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentRepository repo;

    // ➕ Add appointment
    @PostMapping
    public Appointment addAppointment(@RequestBody Appointment appointment) {
        return repo.save(appointment);
    }

    // 📋 Get all appointments
    @GetMapping
    public List<Appointment> getAllAppointments() {
        return repo.findAll();
    }
}