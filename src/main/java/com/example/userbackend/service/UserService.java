package com.example.userbackend.service;
import com.example.userbackend.exception.UserNotFoundException;
import com.example.userbackend.model.User;
import com.example.userbackend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getAll() {
        return repo.findAll();
    }

    public User create(User user) {
        return repo.save(user);
    }

    public User update(Long id, User user) {
    	
    	User existing = repo.findById(id)
    		    .orElseThrow(() -> new UserNotFoundException(id));

       
        existing.setName(user.getName());
        existing.setEmail(user.getEmail());
        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public List<User> search(String keyword) {
        return repo.findByNameContainingIgnoreCaseOrEmailContainingIgnoreCase(keyword, keyword);
    }
}
