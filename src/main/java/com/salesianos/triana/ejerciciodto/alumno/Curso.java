package com.salesianos.triana.ejerciciodto.alumno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Curso {

    private Long id;

    private String nombre;
    private String tipo;

    private String tutor;
    private String aula;


}
