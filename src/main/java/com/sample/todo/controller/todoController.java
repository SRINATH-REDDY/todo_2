package com.sample.todo.controller;

//import com.sample.todo.Repository.TodoRepo;
import com.sample.todo.Repository.TodoRepoService;
//import com.sample.todo.Repository.TodoRepository;
import com.sample.todo.exception.ResourceNotFoundException;
import com.sample.todo.model.Todo;
//import com.sample.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
@CrossOrigin(origins="http://localhost:3000")
public class todoController

{
   // private final TodoRepository todoRepository;

    @Autowired
    TodoRepoService todoRepoService;

//    TodoRepository todoRepository;

   @GetMapping(value="/todos")
   public List<Todo> getList()    {

       return (List<Todo>) todoRepoService.findAll();
  }
//    @PostMapping(value="/todos")
//    public Todo createTodo(@RequestBody Todo todo)
//    {
//        return todoRepository.save(todo);
//    }
//    @GetMapping("/employees/{id}")
//    public ResponseEntity<Todo> gettodobyId(@PathVariable Long id)
//    {
//        Todo todo=todoRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id "+id));
//        // return
//        return ResponseEntity.ok(todo);
//    }
//    //@PutMapping("/employees/{id}")
//    @PutMapping("/todos/{id}")
//    public ResponseEntity<Todo> updateEmployee(@PathVariable(value = "id") Long id,
//                                                    @RequestBody Todo todo) throws ResourceNotFoundException {
//        Todo todolist = todoRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Todo not found for this id :: " + id));
//
//        todolist.setTask(todo.getTask());
//        todolist.setIsDone(todo.getIsDone());
//        todolist.setTargetDate(todo.getTargetDate());
//
//        Todo updatedTodo = todoRepository.save(todolist);
//        return ResponseEntity.ok(updatedTodo);
//    }
//    //@DeleteMapping("/todos/{id}")
//    @DeleteMapping("/todos/{id}")
//    public void deleteEmployee(@PathVariable(value="id") Long id)
//    {
//
//        todoRepository.deleteById(id);
//
//    }


}
