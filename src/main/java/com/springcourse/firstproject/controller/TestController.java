package com.springcourse.firstproject.controller;

import com.springcourse.firstproject.dto.RegistrationDto;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testMethod() {
        return "testMethod executed ...";
    }

    // query string example
    @GetMapping(path = "/search")
    public String search(@RequestParam(name = "key") String name, @RequestParam String type) {
        return "name: " + name + ", and type: " + type;
    }

    // query string with path variables
    @GetMapping(path = "search2/{key}/{type}/{id}")
    public String search2(@PathVariable(name = "key") String name, @PathVariable String type, @PathVariable Integer id) {
        return "name: " + name + ", type: " + type + ", and id: " + id;
    }

    // Post a Data Transfer Object
    @PostMapping(path = "/sign-in")
    public String signIn(@RequestBody RegistrationDto form) {
        return "username: " + form.getUsername() + ", password: " + form.getPassword() + ", email: " + form.getEmail();
    }

    // Create & Return JSON object
    @GetMapping("test-json-object")
    public HashMap<String, Object> testJson() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "Rakan");
        map.put("Age", 22);
        return map;
    }

}
