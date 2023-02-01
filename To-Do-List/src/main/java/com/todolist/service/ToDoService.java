package com.todolist.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.todolist.entity.ToDoEntity;
@Component
public interface ToDoService {

public List<ToDoEntity> getAllToDo();

public ToDoEntity saveToDo (ToDoEntity todoentity);
 
public ToDoEntity editToDo (ToDoEntity Todoentity , int id);

public String deleteToDo (int id);


}
