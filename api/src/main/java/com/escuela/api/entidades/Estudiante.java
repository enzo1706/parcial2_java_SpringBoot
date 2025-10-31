package com.escuela.api.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre;
    private String apellido;
    private String email;
    private String matricula;

    @ManyToMany(mappedBy = "estudiantes")
    private List<Curso> cursos;
}
