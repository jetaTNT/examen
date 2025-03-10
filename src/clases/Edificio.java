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
            volumenOcupado += paquete.calcularVolumen();
        }
        return volumenEdificio() - volumenOcupado;
    }
}