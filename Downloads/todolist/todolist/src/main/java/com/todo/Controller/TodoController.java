package com.todo.Controller;


import com.todo.Entity.TodoEntity;
import com.todo.Service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todos/")
@RequiredArgsConstructor
public class TodoController {

    private  final TodoService todoService;

    @GetMapping
    public List<TodoEntity> getAllTodo(){
        return todoService.getAllTodo();

    }
    @PostMapping
    public TodoEntity addTask(@RequestBody TodoEntity task) {
        return todoService.saveTodo(task);
    }
    @PutMapping("/{id}/toggle")
    public TodoEntity toggleTask(@PathVariable Long id) {
        TodoEntity task = todoService.getTaskById(id);
        if (task != null) {
            task.setCompleted(!task.isCompleted());
            return todoService.saveTodo(task); // Save the updated task
        }
        throw new RuntimeException("Task not found");
    }
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id){
        todoService.deleteTodoById(id);
    }
}
