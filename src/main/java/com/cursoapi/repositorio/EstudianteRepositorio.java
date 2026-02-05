package com.cursoapi.repositorio;

import com.cursoapi.model.Estudiante;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteRepositorio {
    private final List<Estudiante> estudiantes = new ArrayList<>(List.of(
            new Estudiante("Nicolas","Garcia","123456",20),
            new Estudiante("Leonardo","Piedras","123456",20),
            new Estudiante("Luis","Robles","123456",19)
    ));

    public List<Estudiante> buscarTodos(){
        return estudiantes;
    }
}
