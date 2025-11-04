package com.escuela.api.servicios;

import com.escuela.api.Dtos.EstudianteDTO;
import java.util.List;

public interface EstudianteService {
    List<EstudianteDTO> listar();
    EstudianteDTO obtenerPorId(Long id);
    EstudianteDTO guardar(EstudianteDTO dto);
    void eliminar(Long id);
}
