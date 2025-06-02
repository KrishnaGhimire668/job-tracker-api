package com.kish.jobtracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String company;
    private String status;
    private String dateApplied;
    private String notes;

    // Constructors
    public Job() {
    }

    public Job(String title, String company, String status, String dateApplied, String notes) {
        this.title = title;
        this.company = company;
        this.status = status;
        this.dateApplied = dateApplied;
        this.notes = notes;
    }

    // Getters and Setters
    public Long getId() { return id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getDateApplied() { return dateApplied; }
    public void setDateApplied(String dateApplied) { this.dateApplied = dateApplied; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}
