package com.escuela.api.repositorios;

import com.escuela.api.entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProfesorRepositorio extends JpaRepository<Profesor, Long> {
    List<Profesor> findByActivoTrue();
}
