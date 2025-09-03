package com.slickdlc.cicd.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class DemoController {

  @PostMapping("/hello")
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok("Hello, Skillnest!");
  }

}
