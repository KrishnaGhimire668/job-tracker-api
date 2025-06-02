package com.kish.jobtracker.repository;

import com.kish.jobtracker.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    // JpaRepository gives you methods like save(), findAll(), deleteById(), etc.
}
