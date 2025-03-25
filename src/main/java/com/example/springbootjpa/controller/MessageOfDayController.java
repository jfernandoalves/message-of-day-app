package com.example.springbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootjpa.entity.MessageOfDay;
import com.example.springbootjpa.repository.MessageOfDayRepository;

import java.util.Random;

@RestController
public class MessageOfDayController {

    @Autowired
    private MessageOfDayRepository messageOfDayRepository;
  
    @GetMapping("/messageOfDay")
    public MessageOfDay getMessageOfDay() {
        Long randomId = (long) new Random().nextInt(10); // Assuming IDs are in the range of 0-9
        return messageOfDayRepository.findById(randomId).orElse(null);
    }
}