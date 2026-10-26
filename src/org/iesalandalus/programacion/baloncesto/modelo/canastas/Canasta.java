package org.iesalandalus.programacion.baloncesto.modelo.canastas;

import org.iesalandalus.programacion.baloncesto.modelo.Equipo;

import java.util.Random;

public abstract class Canasta{
    private Equipo equipo;
    private static Random generador= new Random();

    public Canasta(Equipo equipo) {
        this.equipo = equipo;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public static Canasta generar(){
        return generarCanasta(generarEquipo());
    }

    private static Equipo generarEquipo() {
        int valor = generador.nextInt(0,2);
        if(valor == 0){
            return Equipo.LOCAL;
        }else{
            return Equipo.VISITANTE;
        }
    }

    public static Canasta generarCanasta(Equipo equipo) {
        int valor = generador.nextInt(0,3);
        if(valor == 0){
            return new TiroLibre(equipo);
        }else if(valor == 1){
            return new TiroDos((equipo));
        }else{
            return new Triple(equipo);
        }
    }

    public abstract int getPuntos();

    @Override
    public String toString() {
        return "";
    }
}
