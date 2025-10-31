package com.escuela.api.repositorios;

import com.escuela.api.entidades.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepositorio extends JpaRepository<Curso, Long> {
}
