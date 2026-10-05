package com.salesianos.triana.ejerciciodto.producto;

public record ProductoDTO(

        String nombre,
        double pvp,
        String imagen,
        String categoria
) {

    public static ProductoDTO of(Producto p){

        return new  ProductoDTO(

                p.getNombre(),
                p.getPvp(),
                p.getImagenes() != null ? p.getImagenes().stream()
                        .findFirst()
                        .orElse("No hay imagen") : "No hay lista",

                //Si es distinto de nulo devolvemos el nombre y si no devolvemos null 
                p.getCategoria() != null ? p.getCategoria().getNombre() : null


        );



    }


}
