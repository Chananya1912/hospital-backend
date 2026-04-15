package com.hospital.hospital_backend.repository;

import com.hospital.hospital_backend.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}