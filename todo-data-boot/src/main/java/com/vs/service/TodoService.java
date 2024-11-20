package com.vs.service;

import java.util.List;

import com.vs.entity.TodoList;
import com.vs.entity.User;

public interface TodoService {

	 public void save(TodoList td,int id);
		
		public TodoList fetch(int id) ;
		
		public List<TodoList> list();
		
		public void remove(int id) ;
		
//		public List<TodoList> listByUser(int id);
//		
//		public List<TodoList> listByStatus(String status);
		
		
}
