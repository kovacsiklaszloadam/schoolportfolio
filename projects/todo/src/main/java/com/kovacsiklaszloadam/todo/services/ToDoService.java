package com.kovacsiklaszloadam.todo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kovacsiklaszloadam.todo.models.ToDo;
import com.kovacsiklaszloadam.todo.models.ToDoStatus;
import com.kovacsiklaszloadam.todo.repositories.ToDoRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ToDoService {
    
    @Autowired
    ToDoRepository toDoRepository;

    public List<ToDo> getToDos() {

        Iterable<ToDo> todosIterable = toDoRepository.findAll();
        List<ToDo> todos = new ArrayList();

        for (ToDo toDo : todosIterable) {
            todos.add(toDo);
        }
        return todos;
    }

    public void addToDo(ToDo todo) {
        this.toDoRepository.save(todo);
    }

    public void deleteById(Long Id) {
        this.toDoRepository.deleteById(Id);
    }

    @Transactional
    public void updateStatus(Long Id, ToDoStatus status) {
        this.toDoRepository.updateTodoStatus(Id, status);
    }
}
