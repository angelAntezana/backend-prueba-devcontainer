package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.AppointmentRequest;


@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @PostMapping(value = {"/add"})
    public ResponseEntity<AppointmentRequest> addAppointment(@RequestBody AppointmentRequest appointmentRequest) {
        
        System.out.println(appointmentRequest);
        return ResponseEntity.ok(appointmentRequest);
    }
    
}
