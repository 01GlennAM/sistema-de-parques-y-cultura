package com.example;

public class ParqueExplora implements EspacioCultural{

    @Override
    public String getNombre() {
        return "Parque explora";
        
    }

     @Override
    public void mostrarHorario(){
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
