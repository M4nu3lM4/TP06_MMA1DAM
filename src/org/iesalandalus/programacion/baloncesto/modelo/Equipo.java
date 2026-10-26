package org.iesalandalus.programacion.baloncesto.modelo;

public enum Equipo {
    LOCAL,
    VISITANTE,
    ;

    @Override
    public String toString() {
        return name().substring(0,1);
    }
}
