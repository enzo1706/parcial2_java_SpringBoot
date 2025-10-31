package com.escuela.api.servicios;

import com.escuela.api.entidades.Estudiante;
import com.escuela.api.repositorios.EstudianteRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    private final EstudianteRepositorio estudianteRepositorio;

    public EstudianteService(EstudianteRepositorio estudianteRepositorio) {
        this.estudianteRepositorio = estudianteRepositorio;
    }

    public List<Estudiante> listar() {
        return estudianteRepositorio.findAll();
    }

    public Estudiante crear(Estudiante estudiante) {
        return estudianteRepositorio.save(estudiante);
    }

    public Optional<Estudiante> obtener(Long id) {
        return estudianteRepositorio.findById(id);
    }

    public void eliminar(Long id) {
        estudianteRepositorio.deleteById(id);
    }
}

