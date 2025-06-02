package com.kish.jobtracker.service;


import com.kish.jobtracker.dto.JobDTO;
import com.kish.jobtracker.model.Job;
import com.kish.jobtracker.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    // Create a job
    public Job createJob(JobDTO jobDTO) {
        Job job = new Job(
                jobDTO.getTitle(),
                jobDTO.getCompany(),
                jobDTO.getStatus(),
                jobDTO.getDateApplied(),
                jobDTO.getNotes()
        );
        return jobRepository.save(job);
    }

    // Get all jobs
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    // Update job
    public Job updateJob(Long id, JobDTO jobDTO) {
        Optional<Job> optionalJob = jobRepository.findById(id);
        if (optionalJob.isPresent()) {
            Job job = optionalJob.get();
            job.setTitle(jobDTO.getTitle());
            job.setCompany(jobDTO.getCompany());
            job.setStatus(jobDTO.getStatus());
            job.setDateApplied(jobDTO.getDateApplied());
            job.setNotes(jobDTO.getNotes());
            return jobRepository.save(job);
        }
        return null;
    }

    // Delete job
    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }
}
