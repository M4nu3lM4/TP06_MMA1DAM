package org.iesalandalus.programacion.baloncesto.modelo;

import org.iesalandalus.programacion.baloncesto.modelo.canastas.Canasta;

import java.util.*;

public class Partido {
    private int MIN_CANASTAS = 50;
    private int MAX_CANASTAS = 75;
    private static Random GENERADOR;
    private List<Canasta> canastas;

    public Partido(){
        this.canastas= new ArrayList<Canasta>();
        this.GENERADOR = new Random();
    }

    public List<Canasta> getCanastas(){

        return canastas;
    }

    public void jugar(){
        int numero = GENERADOR.nextInt(MIN_CANASTAS,MAX_CANASTAS);
        for(int i=0;i<numero;i++){
            canastas.add(Canasta.generar());
        }
    }

    public Map<Equipo,Integer> getResultado(){
        Map<Equipo,Integer> resultado = new HashMap<>();
        for(int i=0; i<this.canastas.size();i++){
            Equipo equipo = this.canastas.get(i).getEquipo();
            int valor = this.canastas.get(i).getPuntos();
            int nuevoValor = valor + resultado.getOrDefault(equipo,0);
            resultado.put(equipo,nuevoValor);
        }

        return resultado;
    }



}
