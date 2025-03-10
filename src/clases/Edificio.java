package clases;

public class Edificio {
    String codigoEdificio;
    Integer altura;
    Integer ancho;
    Integer largo;
    Paquete listaPaquetes[];

    public Edificio(String codigoEdificio, Integer altura, Integer ancho, Integer largo, Paquete listaPaquetes[]) {
        this.codigoEdificio = codigoEdificio;
        this.altura = altura;
        this.ancho = ancho;
        this.largo = largo;
        this.listaPaquetes = listaPaquetes;
    }

    public String getCodigoEdificio() {
        return codigoEdificio;
    }

    public Integer volumenEdificio() {
       return altura * ancho * largo;
    }

    public Integer cantidadLibreEdificio() {
        Integer volumenOcupado = 0;
        for (Paquete paquete : listaPaquetes) {
            volumenOcupado += paquete.volumenPaquete();
        }
        return volumenEdificio() - volumenOcupado;
    }

    public static void ej2() {
        Paquete paquete = new Paquete("A1", 2, 3, 4);
        Paquete paquete2 = new Paquete("B1", 2, 3, 4);
        Paquete[] paquetes = new Paquete[]{paquete, paquete2};
        Edificio edificio = new Edificio("E1",5,7,2,paquetes);
        System.out.println(edificio.cantidadLibreEdificio());
    }
}