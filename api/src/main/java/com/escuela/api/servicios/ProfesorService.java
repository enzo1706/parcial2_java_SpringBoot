package com.escuela.api.servicios;

import com.escuela.api.entidades.Profesor;
import com.escuela.api.repositorios.ProfesorRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {

    private final ProfesorRepositorio profesorRepositorio;

    public ProfesorService(ProfesorRepositorio profesorRepositorio) {
        this.profesorRepositorio = profesorRepositorio;
    }

    public List<Profesor> listar() {
        return profesorRepositorio.findAll();
    }

    public Profesor crear(Profesor profesor) {
        return profesorRepositorio.save(profesor);
    }

    public Optional<Profesor> obtener(Long id) {
        return profesorRepositorio.findById(id);
    }

    public void eliminar(Long id) {
        profesorRepositorio.deleteById(id);
    }
}
