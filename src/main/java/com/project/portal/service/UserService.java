package com.project.portal.service;

import java.util.List;

import com.project.portal.model.User;

public interface UserService {

    /**
     * Gets all users.
     *
     * @return a list of users
     */
    List<User> findAllUsers();

    /**
     * Gets a user by ID.
     *
     * @param id the ID of the requested user
     * @return the user
     */
    User findById(String id);

    /**
     * Creates a user by body.
     *
     * @param user the body of the user
     * @return the message
     */
    String createUser(User user);

    /**
     * Deletes a user by id.
     *
     * @param id the ID of the requested user
     * @return the message
     */
    String deleteById(String id);

}
