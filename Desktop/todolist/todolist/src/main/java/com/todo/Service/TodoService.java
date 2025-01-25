package com.todo.Service;
import com.todo.Entity.TodoEntity;
import com.todo.Repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;


@Service
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000/")
public class TodoService {
    private final TodoRepository todoRepository;


    public List<TodoEntity> getAllTodo(){

        return  todoRepository.findAll();
    }

    public TodoEntity getTaskById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }
    public TodoEntity saveTodo(TodoEntity todo){

        return todoRepository.save(todo);
    }

    public void deleteTodoById(Long id) {
        todoRepository.deleteById(id);
    }
}
