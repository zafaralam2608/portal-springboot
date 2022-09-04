package com.project.portal.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    /** The unique id. */
    private String id;

    /** The name of user. */
    private String username;

    /** The password of user. */
    private String password;

    /** The first name of user. */
    private String firstName;

    /** The last name of user. */
    private String lastName;

    /** The main id of user. */
    private String email;

    /** The creation date of user. */
    private String createdDate;

}
