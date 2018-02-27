package com.cloud.demo.cloudconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/api/v1")
public class ClientController {
    @Autowired
    Integration integration;

    @RequestMapping(path = "/foo/{val}", method = RequestMethod.GET)
    public ResponseEntity<String> foo(@PathVariable String val) {
        String str = integration.getParam(val);

        return new ResponseEntity<>(str, HttpStatus.OK);
    }

}
