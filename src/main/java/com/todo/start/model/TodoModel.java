package com.todo.start.model;

public class TodoModel {
    private String id;
    private String task;

    public TodoModel(String id, String task) {
        this.id = id;
        this.task = task;
    }

    public TodoModel() {
        
        this.id = null;
        this.task = null;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }
}
