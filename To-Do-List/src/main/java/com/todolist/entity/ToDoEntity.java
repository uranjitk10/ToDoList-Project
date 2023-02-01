package com.todolist.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="User")
public class ToDoEntity {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
@Column
private Date date;
private String Title;
private String Description;

public ToDoEntity() {
	super();
}

public ToDoEntity(Date date, String title, String description) {
	super();
	this.date = date;
	Title = title;
	Description = description;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public String getTitle() {
	return Title;
}

public void setTitle(String title) {
	Title = title;
}

public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}

@Override
public String toString() {
	return "ToDoEntity [id=" + id + ", date=" + date + ", Title=" + Title + ", Description=" + Description + "]";
}



}
