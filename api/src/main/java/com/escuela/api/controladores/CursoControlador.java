package com.escuela.api.controladores;

import com.escuela.api.entidades.Curso;
import com.escuela.api.repositorios.CursoRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoControlador {

    private final CursoRepositorio cursoRepositorio;

    public CursoControlador(CursoRepositorio cursoRepositorio) {
        this.cursoRepositorio = cursoRepositorio;
    }

    @GetMapping
    public List<Curso> listar() {
        return cursoRepositorio.findAll();
    }

    @PostMapping
    public Curso crear(@RequestBody Curso curso) {
        return cursoRepositorio.save(curso);
    }

    @GetMapping("/{id}")
    public Curso obtener(@PathVariable Long id) {
        return cursoRepositorio.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        cursoRepositorio.deleteById(id);
    }
}
