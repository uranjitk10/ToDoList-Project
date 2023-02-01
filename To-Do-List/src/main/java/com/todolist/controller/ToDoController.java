package com.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.entity.ToDoEntity;
import com.todolist.service.ToDoService;

@RestController
public class ToDoController {
	@Autowired
	private ToDoService todoservice;
	
	@GetMapping("/getalltodo")
	public List<ToDoEntity> getAllToDoEntity(){
		return todoservice.getAllToDo();
	}
@PostMapping("/savetodo")
public ToDoEntity saveToDoEntity(@RequestBody ToDoEntity todoentity) {
	return todoservice.saveToDo(todoentity);
}


}
