package com.example.demo.services;

import java.time.LocalDateTime;

public interface AppointmentService {
    void crearCita(LocalDateTime inicio) throws Exception;
}
