package com.hospital.hospital_backend.repository;

import com.hospital.hospital_backend.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}