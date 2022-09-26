package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.GetData;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class SpringBootController{

  @Autowired
  private GetData getData;

  @GetMapping("/spring")
  public String hello() {
    return getData.getData();
  }
}