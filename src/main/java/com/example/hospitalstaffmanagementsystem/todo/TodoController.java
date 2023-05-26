package com.example.hospitalstaffmanagementsystem.todo;

import ch.qos.logback.core.model.Model;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("Liza");
        model.addAttribute("todos", todos);

        return "listTodos";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap model) {
        Todo todo = new Todo(0, "", "", ' ', "", "", LocalDate.now().minusYears(5), false);
        model.put("todo", todo);

        return "todo";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
        if (result.hasErrors()) {
            return "todo";

        }

        todoService.addTodo(todo.getRegistrationNumber(), todo.getUserName(), todo.getSalary(), todo.getPost(), todo.getDescription(), todo.getJoinDate(), false);

        return "redirect:list-todos";
    }

    @RequestMapping("delete-todo")
    public String deleteTodos(@RequestParam int id) {

        todoService.deleteById(id);
        return "redirect:list-todos";
    }

    @RequestMapping(value = "update-todo", method = RequestMethod.GET)
    public String updateTotoPage(@RequestParam int id,ModelMap model) {
        Todo todo=todoService.findById(id);

        todoService.deleteById(id);
        model.addAttribute("todo",todo);
        return "todo";
    }
    @RequestMapping(value = "update-todo", method = RequestMethod.POST)
    public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
        if (result.hasErrors()) {
            return "todo";

        }

/*        String username=(String) model.get("UserName");
          todo.setUserName(username);*/
        todoService.updateTodo(todo);
        return "redirect:list-todos";
    }
}
