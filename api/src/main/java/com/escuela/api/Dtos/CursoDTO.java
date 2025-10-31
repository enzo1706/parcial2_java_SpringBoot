package com.escuela.api.Dtos;

public class CursoDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private String turno;

    public CursoDTO() {}

    public CursoDTO(Long id, String nombre, String descripcion, String turno) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.turno = turno;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }
}
