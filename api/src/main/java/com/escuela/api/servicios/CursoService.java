package com.escuela.api.servicios;

import com.escuela.api.Dtos.CursoDTO;
import java.util.List;

public interface CursoService {
    List<CursoDTO> listar();
    CursoDTO obtenerPorId(Long id);
    CursoDTO guardar(CursoDTO dto);
    void eliminar(Long id);
}



