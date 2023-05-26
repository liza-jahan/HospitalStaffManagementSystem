package com.example.hospitalstaffmanagementsystem.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todoCount;

    static {
        todos.add(new Todo(++todoCount, "A-1234", "Liza", 20000, "Receptionist", "She is honest person", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todoCount, "A-1235", "Moli", 20000, "Receptionist", "She is honest person", LocalDate.now().minusYears(4), true));
    }

    private Todo todo;

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String registrationNumber, String UserName, int salary, String post, String description, LocalDate joinDate, boolean done) {
        Todo todo = new Todo(++todoCount, registrationNumber, UserName, salary, post, description, joinDate, done);
        todos.add(todo);
    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }

}
