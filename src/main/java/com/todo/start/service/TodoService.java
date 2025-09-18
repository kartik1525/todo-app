package com.todo.start.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.start.model.TodoModel;

@Service
public class TodoService{

    private List<TodoModel> todoList = new ArrayList<>();

    public TodoModel createTodo(TodoModel todo) {
        todoList.add(todo);
        return todo;
    }

    public List<TodoModel> getList() {
        return todoList;
    }

    public TodoModel updateTodo(TodoModel todo) {
        for (int i = 0; i < todoList.size(); i++) {
            if (todoList.get(i).getId().equals(todo.getId())) {
                todoList.set(i, todo);
                return todo;
            }
        }
        return null;
    }

    public void deleteTodo(Long id) {
        todoList.removeIf(todo -> todo.getId().equals(id.toString()));
    }

    public List<TodoModel> createBulkTodos(List<TodoModel> todos) {
        todoList.addAll(todos);
        return todos;
    }
    

    public List<TodoModel> updateBulkTodos(List<TodoModel> todos) {
        for (TodoModel todo : todos) {
            updateTodo(todo); // Reusing the single update method
        }
        return todos;
    }
    // Method to delete multiple todos in bulk by their IDs
    public void deleteBulkTodos(List<String> ids) {
    todoList.removeIf(todo -> ids.contains(todo.getId()));
}
}
