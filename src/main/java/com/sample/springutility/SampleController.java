package com.sample.springutility;


import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
public class SampleController {

    @GetMapping(value = "/test/{id}")
    @ResponseStatus(HttpStatus.OK)
    public int test(@PathVariable int id){
        return id * 2;
    }
}
