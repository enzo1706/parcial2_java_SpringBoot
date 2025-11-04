package com.escuela.api.servicios;

import com.escuela.api.Dtos.ProfesorDTO;
import com.escuela.api.entidades.Profesor;
import com.escuela.api.repositorios.ProfesorRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    private final ProfesorRepositorio repo;

    public ProfesorServiceImpl(ProfesorRepositorio repo) {
        this.repo = repo;
    }

    @Override
    public List<ProfesorDTO> listar() {
        return repo.findByActivoTrue().stream()
                .map(this::convertirADTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProfesorDTO obtenerPorId(Long id) {
        Profesor p = repo.findById(id).orElseThrow(() -> new RuntimeException("Profesor no encontrado"));
        return convertirADTO(p);
    }

    @Override
    public ProfesorDTO guardar(ProfesorDTO dto) {
        Profesor p = new Profesor();
        p.setNombre(dto.getNombre());
        p.setApellido(dto.getApellido());
        p.setEmail(dto.getEmail());
        p.setMateria(dto.getMateria());
        p.setActivo(true);
        Profesor guardado = repo.save(p);
        return convertirADTO(guardado);
    }

    @Override
    public void eliminar(Long id) {
        Profesor p = repo.findById(id).orElseThrow(() -> new RuntimeException("Profesor no encontrado"));
        p.setActivo(false);
        repo.save(p);
    }

    private ProfesorDTO convertirADTO(Profesor p) {
        return new ProfesorDTO(p.getId(), p.getNombre(), p.getApellido(), p.getEmail(), p.getMateria());
    }
}
