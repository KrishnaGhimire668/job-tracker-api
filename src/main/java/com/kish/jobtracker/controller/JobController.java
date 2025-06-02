package com.kish.jobtracker.controller;


import com.kish.jobtracker.dto.JobDTO;
import com.kish.jobtracker.model.Job;
import com.kish.jobtracker.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping
    public Job createJob(@RequestBody JobDTO jobDTO) {
        return jobService.createJob(jobDTO);
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @PutMapping("/{id}")
    public Job updateJob(@PathVariable Long id, @RequestBody JobDTO jobDTO) {
        return jobService.updateJob(id, jobDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id) {
        jobService.deleteJob(id);
    }
}
