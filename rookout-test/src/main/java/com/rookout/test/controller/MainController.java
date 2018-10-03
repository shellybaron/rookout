package com.rookout.test.controller;

import com.rookout.test.service.MyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping(path = "/")
@Controller
public class MainController {
    
    @Autowired
    MyService myService;
    
    @RequestMapping(path = "status", method = RequestMethod.GET)
    public
    @ResponseBody
    ResponseEntity<String> status() {
        String value = "I'm Alive";
        return new ResponseEntity<>(value, HttpStatus.OK);
    }
    
    @RequestMapping(path = "hash", method = RequestMethod.POST)
    public
    @ResponseBody
    ResponseEntity<String> hash(@RequestBody List<String> value) {
        String hash = myService.hash(value);
        return new ResponseEntity<>(hash, HttpStatus.OK);
    }
}

