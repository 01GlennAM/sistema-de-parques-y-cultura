package com.example;

public class MuseoDeAntioquia implements EspacioCultural {

     @Override
    public String getNombre() {
        return "Museo de Antioquia";
        
    }
    
    @Override
    public void mostrarHorario(){
        System.out.println("5 pm a 9 pm");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Requisitos: " + "solo mayores de edad";
        
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("obras de arte muy antiguas...");
        
    }


}
