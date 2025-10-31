

-- Profesores
INSERT INTO profesor (nombre, apellido, email, materia)
VALUES ('Carlos', 'Rodriguez', 'carlos@gmail.com', 'Matemática');
INSERT INTO profesor (nombre, apellido, email, materia)
VALUES ('Roberto', 'Suarez', 'roberto@gmail.com', 'Programación');

-- Estudiantes
INSERT INTO estudiante (nombre, matricula)
VALUES ('Luciano Orozco', 'MAT001');
INSERT INTO estudiante (nombre, matricula)
VALUES ('Sofía Ramírez', 'MAT002');
INSERT INTO estudiante (nombre, matricula)
VALUES ('Julián Alvarez', 'MAT003');

-- Cursos
INSERT INTO curso (nombre, profesor_id)
VALUES ('Programación I', 1);
INSERT INTO curso (nombre, profesor_id)
VALUES ('Base de Datos', 2);

-- Relación muchos a muchos (tabla intermedia)
INSERT INTO curso_estudiante (curso_id, estudiante_id)
VALUES (1, 1);
INSERT INTO curso_estudiante (curso_id, estudiante_id)
VALUES (1, 2);
INSERT INTO curso_estudiante (curso_id, estudiante_id)
VALUES (2, 2);
INSERT INTO curso_estudiante (curso_id, estudiante_id)
VALUES (2, 3);
