package com.example;

public class ParqueExplora implements EspacioCultural{

    private String nombre;

    public ParqueExplora(String nombre){
        this.nombre = nombre;

    };

     @Override
    public void mostrarHorario(){
        System.out.println("Lugar: " + nombre);
        System.out.println("7 am a 5 pm");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Requisitos: " + "cobro de entrada 10.000$";
        
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("pelicula del universo");
        
    }

}
