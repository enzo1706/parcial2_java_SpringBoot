package com.escuela.api.servicios;

import com.escuela.api.Dtos.EstudianteDTO;
import com.escuela.api.entidades.Estudiante;
import com.escuela.api.repositorios.EstudianteRepositorio;
import com.escuela.api.servicios.EstudianteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepositorio repo;

    public EstudianteServiceImpl(EstudianteRepositorio repo) {
        this.repo = repo;
    }

    @Override
    public List<EstudianteDTO> listar() {
        return repo.findByActivoTrue().stream()
                .map(this::convertirADTO)
                .collect(Collectors.toList());
    }

    @Override
    public EstudianteDTO obtenerPorId(Long id) {
        Estudiante e = repo.findById(id).orElseThrow(() -> new RuntimeException("No encontrado"));
        return convertirADTO(e);
    }

    @Override
    public EstudianteDTO guardar(EstudianteDTO dto) {
        Estudiante e = new Estudiante();
        e.setNombre(dto.getNombre());
        e.setApellido(dto.getApellido());
        e.setEmail(dto.getEmail());
        e.setMatricula(dto.getMatricula());
        e.setActivo(true);
        Estudiante guardado = repo.save(e);
        return convertirADTO(guardado);
    }

    @Override
    public void eliminar(Long id) {
        Estudiante e = repo.findById(id).orElseThrow(() -> new RuntimeException("No encontrado"));
        e.setActivo(false);
        repo.save(e);
    }

    private EstudianteDTO convertirADTO(Estudiante e) {
        EstudianteDTO dto = new EstudianteDTO();
        dto.setId(e.getId());
        dto.setNombre(e.getNombre());
        dto.setApellido(e.getApellido());
        dto.setEmail(e.getEmail());
        dto.setMatricula(e.getMatricula());
        return dto;
    }
}

