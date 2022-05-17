package com.example.jpa;


import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService service;

    @GetMapping("get/{id}")
    private Book get(@PathVariable long id) {
        return service.get(id);
    }

    @PostMapping("create")
    private Long create(@RequestBody Book book) {
        return service.create(book);

    }


   @DeleteMapping("delete/{id}")
    private void delete( @PathVariable long id) {
        service.delete(id);
    }

}
