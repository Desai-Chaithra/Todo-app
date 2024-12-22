package com.in28Minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity // it means Todo is mapped to a data base table
public class Todo {
	
	public Todo() {
		
	}

    public Todo(int id, String userName, String description, LocalDate targetDate, boolean done) {
        super();
        this.id = id;
        this.userName = userName;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }
    
    @Id // primary key
    @GeneratedValue
    private int id;
    
  //  @Column(name="name")
    private String userName;

    @Size(min = 10, message = "Enter at least 10 characters")
    private String description;

    @NotNull(message = "Target date cannot be null")
    @Future(message = "Target date must be in the future") // Optional: Add future date validation
    @DateTimeFormat(pattern = "yyyy-MM-dd") // Ensures the correct date format from the input
    private LocalDate targetDate;

    private boolean done;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo [id=" + id + ", userName=" + userName + ", description=" + description + ", targetDate="
                + targetDate + ", done=" + done + "]";
    }
}
