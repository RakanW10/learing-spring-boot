package com.springcourse.firstproject.controller;

import com.springcourse.firstproject.dto.AddressDTO;
import com.springcourse.firstproject.dto.ContactDTO;
import com.springcourse.firstproject.dto.RegistrationDTO;
import com.springcourse.firstproject.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    public String signIn(@RequestBody RegistrationDTO form) {
        return "username: " + form.getUsername() + ", password: " + form.getPassword() + ", email: " + form.getEmail();
    }

    // Create & Return JSON object
    @GetMapping("test-json-object")
    public HashMap<String, Object> testJson() {
        HashMap<String, Object> map = new HashMap<>();
        HashMap<String, Object> subMap = new HashMap<>();
        subMap.put("home Address", "test home address");
        subMap.put("work Address", "test work address");

        List<ContactDTO> contacts = new ArrayList<>();
        contacts.add(new ContactDTO("home", "+966 5000000000"));
        contacts.add(new ContactDTO("work", "+966 5111111111"));

        map.put("name", "Rakan");
        map.put("age", 22);
        map.put("address", subMap);
        map.put("contact", contacts);

        return map;
    }

    // Return array of users
    @GetMapping("/test-json-array")
    public List<UserDTO> getAll() {
        List<UserDTO> users = new ArrayList<>();

        List<AddressDTO> rakanAddress = new ArrayList<>();
        rakanAddress.add(new AddressDTO("Saudi Arabia", "Riyadh", "10"));

        List<AddressDTO> muhammedAddress = new ArrayList<>();
        muhammedAddress.add(new AddressDTO("Saudi Arabia", "Dammam", "300"));


        users.add(new UserDTO("rakan", "alotibi", "05000000000", "male", rakanAddress));
        users.add(new UserDTO("muhammed", "khalid", "0511111111", "male", muhammedAddress));
        return users;
    }


}
