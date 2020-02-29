package com.wichacks2020.onehunt.model;

import java.net.URL;
import java.util.Date;

public class Application {
    private String role;
    private String company;
    private String url;
    private int salary;
    private String deadline; //becomes date submitted after application is submitted
    private String stage;
    private String interviewDate;
    private String type;
    private String location;
    private String color;
    private String notes;
    private Boolean sponsorship;

    public Application() {

    }

    //region getters and setters
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getSponsorship() {
        return sponsorship;
    }

    public void setSponsorship(Boolean sponsorship) {
        this.sponsorship = sponsorship;
    }

    //endregion
}


