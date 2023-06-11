package com.example.hospitalstaffmanagementsystem.todo;


import jakarta.validation.constraints.Size;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "staffList")
public class Todo {
    /*
        id,Username,Salary,Post,Description,JoinDate,RegistrationNumber
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length = 7)
    private  String registrationNumber;
    @Column(nullable = false, unique = false, length = 20)
    private  String UserName;
    @Column(nullable = false, unique = false, length = 15)
    private int salary;
    @Column(nullable = false, unique = false, length = 15)
    private  String post;
    @Size(min=10,message ="Enter atleast 10 characters")
    private  String description;
    private LocalDate joinDate;
    @Column(nullable = false, unique = false, length = 5)
    private String done;

    public Todo() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String isDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }



    public Todo(Integer id, String registrationNumber, String userName, int salary, String post, String description, LocalDate joinDate, String done) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        UserName = userName;
        this.salary = salary;
        this.post = post;
        this.description = description;
        this.joinDate = joinDate;
        this.done = done;

    }

    @Override
    public String toString() {
        return "Todo{" +
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
