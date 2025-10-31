package com.escuela.api.controladores;

import com.escuela.api.entidades.Profesor;
import com.escuela.api.repositorios.ProfesorRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesorControlador {

    private final ProfesorRepositorio profesorRepositorio;

    public ProfesorControlador(ProfesorRepositorio profesorRepositorio) {
        this.profesorRepositorio = profesorRepositorio;
    }

    @GetMapping
    public List<Profesor> listar() {
        return profesorRepositorio.findAll();
    }

    @PostMapping
    public Profesor crear(@RequestBody Profesor profesor) {
        return profesorRepositorio.save(profesor);
    }

    @GetMapping("/{id}")
    public Profesor obtener(@PathVariable Long id) {
        return profesorRepositorio.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        profesorRepositorio.deleteById(id);
    }
}
