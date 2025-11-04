package com.escuela.api.servicios;

import com.escuela.api.Dtos.ProfesorDTO;
import java.util.List;

public interface ProfesorService {
    List<ProfesorDTO> listar();
    ProfesorDTO obtenerPorId(Long id);
    ProfesorDTO guardar(ProfesorDTO dto);
    void eliminar(Long id);
}

