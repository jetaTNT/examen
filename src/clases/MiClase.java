package clases;

public class MiClase {
    public static int contarVocales(String texto) {
        if (texto.isEmpty()) { // Caso base: si el texto está vacío, no hay vocales.
            return 0;
        } else {
            char primerCaracter = texto.charAt(0);
            int cuenta = (primerCaracter == 'a' || primerCaracter == 'e' ||
                    primerCaracter == 'i' || primerCaracter == 'o' ||
                    primerCaracter == 'u') ? 1 : 0;
            // Llamada recursiva con el resto del string.
            return cuenta + contarVocales(texto.substring(1));
        }
    }

    public static void ej3A() {
        System.out.println(contarVocales("hola"));
    }

    public static boolean estaOrdenada(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public static void ej3B() {
        int[] numeros = {2,34,55};
        System.out.println(estaOrdenada(numeros));
    }
}
