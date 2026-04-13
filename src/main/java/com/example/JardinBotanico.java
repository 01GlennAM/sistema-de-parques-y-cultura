package com.example;

public class JardinBotanico implements EspacioCultural {

    @Override
    public String getNombre() {
        return "Jardin Botanico";
        
    }

    @Override
    public void mostrarHorario(){
        System.out.println("9 de la mañana a 4 de la tarde");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Requisitos: " + "entrada libre";
        
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("caminar por el bosque tropical...");
        
    }


}
