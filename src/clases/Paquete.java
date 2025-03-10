package clases;

public class Paquete {
    String codigoPaquete;
    Integer alto;
    Integer ancho;
    Integer largo;

    public Paquete(String codigoPaquete, Integer alto, Integer ancho, Integer largo) {
        this.codigoPaquete = codigoPaquete;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public Integer volumenPaquete() {
        return alto * ancho * largo;
    }

    public static void ej1() {
        Paquete paquete = new Paquete("A1", 2, 3, 4);
        System.out.println(paquete.volumenPaquete());
    }

    @Override
    public String toString() {
        return "Paquete " + codigoPaquete +
                "{ alto=" + alto +
                ", ancho=" + ancho +
                ", largo=" + largo +
                '}' + '\n';
    }
}
