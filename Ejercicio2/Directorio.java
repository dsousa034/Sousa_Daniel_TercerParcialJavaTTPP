package Ejercicio2;

import java.util.List;

public class Directorio implements Fichero{

    private String nombre;
    private List<Fichero> ficheros;

    public Directorio(String nombre, List<Fichero> ficheros){
        this.nombre = nombre;
        this.ficheros = ficheros;
    }

    public void añadirFichero (Fichero fichero){
        ficheros.add(fichero);
    }
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamano() {
        return ficheros.stream().mapToInt(Fichero::getTamano).sum();
    }
}
