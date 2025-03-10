package clases;

import java.util.Arrays;

public class Empresa {
    Edificio[] listaEdificios;

    public Empresa(Edificio[] listaEdificios) {
        this.listaEdificios = listaEdificios;
    }

    @Override
    public String toString() {
        return  Arrays.toString(listaEdificios) +
                '}';
    }

    public static void ej4B() {
        Paquete paquete1 = new Paquete("A1", 2, 3, 4);
        Paquete paquete2 = new Paquete("A2", 3, 4, 5);
        Paquete paquete3 = new Paquete("A3", 4, 5, 6);
        Paquete [] listaPaquetes = {paquete1, paquete2, paquete3};
        Edificio edificio1 = new Edificio("B1",2,7,4, listaPaquetes);
        Edificio edificio2 = new Edificio("B2",3,8,5, listaPaquetes);
        Edificio edificio3 = new Edificio("B3",4,9,6, listaPaquetes);
        Edificio[] listaEdificios = {edificio1, edificio2, edificio3};
        Empresa empresa = new Empresa(listaEdificios);
        System.out.println(empresa);
    }
}
