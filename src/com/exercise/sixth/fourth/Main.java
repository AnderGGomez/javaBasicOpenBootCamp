package com.exercise.sixth.fourth;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        /**
         * El problema de definir un vector con una longitud tan grande es que se tiende a
         * desperdiciar espacio en memoria.
         *
         * Por ejemplo, si creamos un vector de 1000 elementos de acuerdo a un estudio de mercado donde se nos
         * informa que las ventas pueden alcanzar como maximo 1000 al dia, y debemos almacenar dichas ventas
         * en un Vector.
         * Lo que va a suceder es que no todos los dias se tendran 1000 ventas y es posible que solo se registren
         * 50, por tal motivo estariamos dejando 950 "espacios" reservados sin usar. Puede parecer una pequeña cantidad,
         * pero si esto se repite a lo largo de un año, es mucho el recurso que se desperdicia.
         * */
        Vector vecMil = new Vector<Integer>(1000);

    }
}
