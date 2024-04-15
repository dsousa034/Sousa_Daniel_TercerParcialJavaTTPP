package Ejercicio2;

public class FicheroNormal implements Fichero{

    private String nombre;
    private int tamano;

    public FicheroNormal(String nombre, int tamano){
        this.nombre = nombre;
        this.tamano = tamano;
    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public int getTamano() {
        return 0;
    }
}
