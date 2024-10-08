package com.kovacsiklaszloadam.todo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import com.kovacsiklaszloadam.todo.models.ToDo;
import com.kovacsiklaszloadam.todo.models.ToDoStatus;
import com.kovacsiklaszloadam.todo.services.ToDoService;

@Controller
public class ToDoController {
    
    @Autowired
    ToDoService toDoService;

    @RequestMapping(value = "/")
    public String getIndex() {
        return "index";
    }

    @RequestMapping(value = "/list")
    public String listAll(Model model) {
        model.addAttribute("todos", this.toDoService.getToDos());
        return "list";
    }

    @PostMapping(value = "/add")
    public String addToDo(@ModelAttribute ToDo todo) {
        this.toDoService.addToDo(todo);
        return "redirect:/list";
    }

    @GetMapping(value = "/add")
    public String showToDoForm(Model model) {
        model.addAttribute("todo", new ToDo());
        return "add";
    }

    @PostMapping(value = "/delete")
    public String deleteById(@RequestParam("id") Long Id) {
        this.toDoService.deleteById(Id);
        return "redirect:/list";
    }

    @PostMapping(value = "/update")
    public String updateTodo(@RequestParam("id") Long Id) {
        this.toDoService.updateStatus(Id, ToDoStatus.DONE);
        return "redirect:/list";
    }
}
