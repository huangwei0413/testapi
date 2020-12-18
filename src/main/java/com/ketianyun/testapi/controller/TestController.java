package com.ketianyun.testapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
public class TestController {

    @GetMapping(path = "/api/test/get")
    public ResponseEntity<String> getHandler() {
        return ResponseEntity.ok().body("get");
    }

    @PostMapping(path = "/api/test/post")
    public ResponseEntity<String> postHandler() {
        return ResponseEntity.created(URI.create("mock location")).build();
    }

    @PutMapping(path = "/api/test/put")
    public ResponseEntity<String> putHandler() {
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(path = "/api/test/delete")
    public ResponseEntity<String> deleteHandler() {
        return ResponseEntity.noContent().build();
    }
}
