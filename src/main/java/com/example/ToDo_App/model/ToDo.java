package com.example.ToDo_App.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todo")
public class ToDo {
	
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @NonNull
   private Long id;
   
   @Column
   @NonNull
   private String title;
   
   @Column
   @NonNull
   @DateTimeFormat(pattern = "yyyy-MM-dd")
   private Date date;
   
   @Column
   @NonNull
   private String Status;
   

public ToDo() {
	
}
  

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public String getStatus() {
	return Status;
}

public void setStatus(String status) {
	Status = status;
} 
   
}
