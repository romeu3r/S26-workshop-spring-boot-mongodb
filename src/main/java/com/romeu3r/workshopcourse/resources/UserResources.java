package com.romeu3r.workshopcourse.resources;

import com.romeu3r.workshopcourse.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "users")
public class UserResources {
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User u1 = new User(null, "Maria", "email@email");
        User u2 = new User(null, "Maria", "email@email");
        User u3 = new User(null, "Maria", "email@email");
        User u4 = new User(null, "Maria", "email@email");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(u1, u2, u3, u4));
        return ResponseEntity.ok().body(list);
    }
}
