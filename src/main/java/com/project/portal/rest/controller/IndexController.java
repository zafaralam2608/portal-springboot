package com.project.portal.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    /**
     * Checks application status.
     *
     * @return welcome message
     */
    @GetMapping("/")
    public String index() {
        return "Welcome";
    }

}
