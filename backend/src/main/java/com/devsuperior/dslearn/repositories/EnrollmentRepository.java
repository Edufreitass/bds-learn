package com.devsuperior.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearn.entities.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

}
