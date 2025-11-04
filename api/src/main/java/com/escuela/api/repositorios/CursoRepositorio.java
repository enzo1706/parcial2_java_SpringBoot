package com.escuela.api.repositorios;

import com.escuela.api.entidades.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CursoRepositorio extends JpaRepository<Curso, Long> {
    List<Curso> findByActivoTrue();
}

