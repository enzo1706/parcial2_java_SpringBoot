

-- Profesores
INSERT INTO profesor (nombre, apellido, email, materia, activo)
VALUES ('Carlos', 'Rodriguez', 'carlos@gmail.com', 'Matemática', TRUE);
INSERT INTO profesor (nombre, apellido, email, materia, activo)
VALUES ('Roberto', 'Suarez', 'roberto@gmail.com', 'Programación', TRUE);

-- Estudiantes
INSERT INTO estudiante (nombre, apellido, email, matricula, activo)
VALUES ('Luciano', 'Orozco', 'luciano@gmail.com', 'MAT001', TRUE);
INSERT INTO estudiante (nombre, apellido, email, matricula, activo)
VALUES ('Sofía', 'Ramírez', 'sofia@gmail.com', 'MAT002', TRUE);
INSERT INTO estudiante (nombre, apellido, email, matricula, activo)
VALUES ('Julián', 'Alvarez', 'julian@gmail.com', 'MAT003', TRUE);

-- Cursos
INSERT INTO curso (nombre, descripcion, profesor_id, activo)
VALUES ('Programación I', 'Curso de introducción a la programación', 2, TRUE);
INSERT INTO curso (nombre, descripcion, profesor_id, activo)
VALUES ('Base de Datos', 'Diseño y consultas SQL', 1, TRUE);

-- Relación muchos a muchos (tabla intermedia)
INSERT INTO curso_estudiante (curso_id, estudiante_id) VALUES (1, 1);
INSERT INTO curso_estudiante (curso_id, estudiante_id) VALUES (1, 2);
INSERT INTO curso_estudiante (curso_id, estudiante_id) VALUES (2, 2);
INSERT INTO curso_estudiante (curso_id, estudiante_id) VALUES (2, 3);
