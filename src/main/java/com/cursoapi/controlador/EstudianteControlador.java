package com.cursoapi.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {
    @GetMapping
    public String getEstudiante(){
        return "Hola estudiantes ಥ_ಥ";
    }
}
