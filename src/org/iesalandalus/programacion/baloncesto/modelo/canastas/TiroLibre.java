package org.iesalandalus.programacion.baloncesto.modelo.canastas;

import org.iesalandalus.programacion.baloncesto.modelo.Equipo;

public class TiroLibre extends Canasta {

    public TiroLibre(Equipo equipo){
        super(equipo);

    }

    @Override
    public int getPuntos() {
        return 1;
    }


}
