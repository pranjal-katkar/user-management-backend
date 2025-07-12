package com.example.userbackend.controller;

import com.example.userbackend.model.User;
import com.example.userbackend.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    // GET: fetch all users
    @GetMapping
    public List<User> getAll() {
        return service.getAll();
    }

    // POST: create new user
    @PostMapping
    public ResponseEntity<?> create(@RequestBody User user) {
        if (service.emailExists(user.getEmail())) {
            // ✅ Clean JSON error message your React fronted can parse
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body(Collections.singletonMap("message", "Email already exists"));
        }

        User createdUser = service.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    // PUT: update user
    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return service.update(id, user);
    }

    // DELETE: delete user
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    // GET: search user
    @GetMapping("/search")
    public List<User> search(@RequestParam String query) {
        return service.search(query);
    }
}
