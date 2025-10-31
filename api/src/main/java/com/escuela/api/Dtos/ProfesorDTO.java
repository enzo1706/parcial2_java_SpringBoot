package com.escuela.api.Dtos;

public class ProfesorDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String materia;

    public ProfesorDTO() {}

    public ProfesorDTO(Long id, String nombre, String apellido, String email, String materia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.materia = materia;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMateria() { return materia; }
    public void setMateria(String materia) { this.materia = materia; }
}

