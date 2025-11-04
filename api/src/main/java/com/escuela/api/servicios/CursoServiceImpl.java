package com.escuela.api.servicios;

import com.escuela.api.Dtos.CursoDTO;
import com.escuela.api.entidades.Curso;
import com.escuela.api.entidades.Profesor;
import com.escuela.api.repositorios.CursoRepositorio;
import com.escuela.api.repositorios.ProfesorRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CursoServiceImpl implements CursoService {

    private final CursoRepositorio repo;
    private final ProfesorRepositorio profesorRepo;

    public CursoServiceImpl(CursoRepositorio repo, ProfesorRepositorio profesorRepo) {
        this.repo = repo;
        this.profesorRepo = profesorRepo;
    }

    @Override
    public List<CursoDTO> listar() {
        return repo.findByActivoTrue().stream()
                .map(this::convertirADTO)
                .collect(Collectors.toList());
    }

    @Override
    public CursoDTO obtenerPorId(Long id) {
        Curso c = repo.findById(id).orElseThrow(() -> new RuntimeException("Curso no encontrado"));
        return convertirADTO(c);
    }

    @Override
    public CursoDTO guardar(CursoDTO dto) {
        Curso c = new Curso();
        c.setNombre(dto.getNombre());
        c.setDescripcion(dto.getDescripcion());
        c.setActivo(true);
        Profesor profesor = profesorRepo.findById(dto.getProfesorId())
                .orElseThrow(() -> new RuntimeException("Profesor no encontrado"));
        c.setProfesor(profesor);
        Curso guardado = repo.save(c);
        return convertirADTO(guardado);
    }

    @Override
    public void eliminar(Long id) {
        Curso c = repo.findById(id).orElseThrow(() -> new RuntimeException("Curso no encontrado"));
        c.setActivo(false);
        repo.save(c);
    }

    private CursoDTO convertirADTO(Curso c) {
        Long profesorId = (c.getProfesor() != null) ? c.getProfesor().getId() : null;
        return new CursoDTO(c.getId(), c.getNombre(), c.getDescripcion(), profesorId);
    }
}
