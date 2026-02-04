package com.cursoapi.controlador;

import com.cursoapi.model.Estudiante;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {
    @GetMapping
    public String getEstudiante(){
        return "Hola estudiantes ಥ_ಥ";
    }
    @PostMapping
    public String postEstudiante(@RequestBody Estudiante estudiante){
        return "Hola nuevo estudiante " + estudiante.getNombre() + " ╰(*°▽°*)╯";
    }
}
