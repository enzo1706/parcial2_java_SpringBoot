package com.escuela.api.controladores;

import com.escuela.api.entidades.Estudiante;
import com.escuela.api.repositorios.EstudianteRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {

    private final EstudianteRepositorio estudianteRepositorio;

    public EstudianteControlador(EstudianteRepositorio estudianteRepositorio) {
        this.estudianteRepositorio = estudianteRepositorio;
    }

    @GetMapping
    public List<Estudiante> listar() {
        return estudianteRepositorio.findAll();
    }

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante estudiante) {
        return estudianteRepositorio.save(estudiante);
    }

    @GetMapping("/{id}")
    public Estudiante obtener(@PathVariable Long id) {
        return estudianteRepositorio.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        estudianteRepositorio.deleteById(id);
    }
}
