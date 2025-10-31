package com.escuela.api.servicios;

import com.escuela.api.entidades.Curso;
import com.escuela.api.repositorios.CursoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    private final CursoRepositorio cursoRepositorio;

    public CursoService(CursoRepositorio cursoRepositorio) {
        this.cursoRepositorio = cursoRepositorio;
    }

    public List<Curso> listar() {
        return cursoRepositorio.findAll();
    }

    public Curso crear(Curso curso) {
        return cursoRepositorio.save(curso);
    }

    public Optional<Curso> obtener(Long id) {
        return cursoRepositorio.findById(id);
    }

    public void eliminar(Long id) {
        cursoRepositorio.deleteById(id);
    }
}

