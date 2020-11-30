/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.restwebserviceswagger.controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Ultimate
 */
@Controller
public class TestController {
    
    
    @GetMapping("/get")
    
    public ResponseEntity<String>getData()
    {
    return ResponseEntity.ok("Get working");
    }
    
    @PostMapping("post")
    public String postData(@RequestBody String req_data)
    {
    return "<h1>Post working</h1>";
    }
}
