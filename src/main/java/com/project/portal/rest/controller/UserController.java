package com.project.portal.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.portal.model.User;
import com.project.portal.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * @param service dependency for user
     */
    @Autowired
    private UserService userService;

    /**
     * Gets all users.
     *
     * @return a list of users
     */
    @GetMapping("/all")
    public ResponseEntity<Object> getUsers() {
        List<User> list = userService.findAllUsers();
        if (list.isEmpty()) {
            return new ResponseEntity<>(
                    "No employees found in database", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
    }

    /**
     * Gets a user by ID.
     *
     * @param id the ID of the requested user
     * @return the user
     */
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") final String id) {
        return userService.findById(id);
    }

    /**
     * Creates a user by body.
     *
     * @param user the body of the user
     * @return the message
     */
    @PostMapping("/create")
    public String createUser(@RequestBody final User user) {
        return userService.createUser(user);
    }

    /**
     * Deletes a user by id.
     *
     * @param id the ID of the requested user
     * @return the message
     */
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") final String id) {
        return userService.deleteById(id);
    }
}
