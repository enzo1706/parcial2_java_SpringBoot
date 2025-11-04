package com.escuela.api.repositorios;

import com.escuela.api.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {
    List<Estudiante> findByActivoTrue();
}

