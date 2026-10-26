package org.iesalandalus.programacion.baloncesto.modelo.canastas;

import org.iesalandalus.programacion.baloncesto.modelo.Equipo;

public enum TipoCanasta {

    TIRO_LIBRE {
        @Override
        public Canasta get(Equipo equipo) {
            return new TiroLibre(equipo);
        }
    },
    TIRO_DE_DOS {
        @Override
        public Canasta get(Equipo equipo) {
            return new TiroDos(equipo);
        }
    },
    TRIPLE {
        @Override
        public Canasta get(Equipo equipo) {
            return new Triple(equipo);
        }
    };

    public abstract Canasta get(Equipo equipo);
}
