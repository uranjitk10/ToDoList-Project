package com.todolist.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.entity.ToDoEntity;
import com.todolist.repository.ToDoRepository;
import com.todolist.service.ToDoService;

@Service
public class ToDoServiceImpl implements ToDoService {

	@Autowired
	private ToDoRepository todorepository;

	@Override
	public List<ToDoEntity> getAllToDo() {
		// TODO Auto-generated method stub
		return todorepository.findAll();
	}

	@Override
	public ToDoEntity saveToDo(ToDoEntity todoentity) {
		// TODO Auto-generated method stub
		return todorepository.save(todoentity);
	}

	@Override
	public ToDoEntity editToDo(ToDoEntity Todoentity, int id) {
		ToDoEntity todo = todorepository.findById(id).get();
		todo.setDate(todo.getDate());
		todo.setTitle(todo.getTitle());
		todo.setDescription(todo.getDescription());
		return todorepository.save(todo);
	}

	@Override
	public String deleteToDo(int id) {
		todorepository.deleteById(id);
		return "User with id is :" + id + "has been Succsesssfully deleted";
	}

}
