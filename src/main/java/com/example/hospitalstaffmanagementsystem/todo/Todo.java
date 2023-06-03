package com.example.hospitalstaffmanagementsystem.todo;


import jakarta.validation.constraints.Size;
import nonapi.io.github.classgraph.json.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;

public class Todo {
    /*
        id,Username,Salary,Post,Description,JoinDate,RegistrationNumber
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String registrationNumber;
    private  String UserName;
    private int salary;
    private  String post;
    @Size(min=10,message ="Enter atleast 10 characters")

    private  String description;
    private LocalDate joinDate;
    private boolean done;

    public Todo(int id, String registrationNumber, String UserName, int salary, String post, String description, LocalDate joinDate, boolean done) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.UserName = UserName;
        this.salary = salary;
        this.post = post;
        this.description = description;
        this.joinDate = joinDate;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", UserName='" + UserName + '\'' +
                ", salary=" + salary +
                ", post='" + post + '\'' +
                ", description='" + description + '\'' +
                ", joinDate=" + joinDate +
                ", done=" + done +
                '}';
    }
}
