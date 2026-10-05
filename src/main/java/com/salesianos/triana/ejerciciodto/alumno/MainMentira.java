package com.salesianos.triana.ejerciciodto.alumno;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class MainMentira {

    @PostConstruct
    public void main() {

        Curso curso = Curso.builder()
                .id(1L)
                .nombre("2DAM")
                .tipo("Grado Superior")
                .tutor("Manuel Ruiz")
                .aula("A-12")
                .build();

        Direccion direccion = Direccion.builder()
                .id(1L)
                .tipoVia("Calle")
                .linea1("San Jacinto 25")
                .linea2("2ºB")
                .cp("41010")
                .poblacion("Sevilla")
                .provincia("Sevilla")
                .build();

        Alumno alumno = Alumno.builder()
                .id(1L)
                .nombre("Carlos")
                .apellido1("Pérez")
                .apellido2("López")
                .telefono("600111222")
                .email("carlos@mail.com")
                .direccion(direccion)
                .curso(curso)
                .build();

        System.out.println(AlumnoDTO.of(alumno));
    }
}
