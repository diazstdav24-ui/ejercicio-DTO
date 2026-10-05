package com.salesianos.triana.ejerciciodto.alumno;


public record AlumnoDTO (


     String nombre,
     String apellidos,

     String email,

     Curso curso,

     Direccion direccion
) {

    public static String unirApellidos(String apellido1, String apellido2){

            return apellido1.concat(" ").concat(apellido2);


    }


    public static AlumnoDTO of(Alumno a){

        return new AlumnoDTO(

                a.getNombre(),
                unirApellidos(a.getApellido1(),a.getApellido2()),
                a.getEmail(),
                a.getCurso(),
                a.getDireccion()

        );

    }

}







