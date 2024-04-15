package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        FicheroNormal fichero1 = new FicheroNormal("archivo1.txt", 100);
        FicheroNormal fichero2 = new FicheroNormal("archivo2.txt", 200);

        Directorio directorio = new Directorio("Directorio");
        directorio.añadirFichero(fichero1);
        directorio.añadirFichero(fichero2);

        // Crear un adaptador para el directorio
        Adaptador adaptador = new Adaptador(directorio);

        // Acceder al nombre y tamaño del directorio a través del adaptador
        System.out.println("Nombre del directorio: " + adaptador.getNombre());
        System.out.println("Tamaño del directorio: " + adaptador.getTamano() + " bytes");
    }
}
