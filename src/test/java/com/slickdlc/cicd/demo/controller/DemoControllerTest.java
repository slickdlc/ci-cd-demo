package com.slickdlc.cicd.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import com.oracle.svm.core.annotate.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

@ExtendWith(MockitoExtension.class)
class DemoControllerTest {

  @InjectMocks
  private DemoController demoController;

  @Test
  void shouldReturnHelloWorld() {
    var response = demoController.hello();
    assertAll(
        () -> assertNotNull(response),
        () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
        () -> assertEquals("Hello, World!", response.getBody())
    );
  }
}