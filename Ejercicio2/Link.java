package Ejercicio2;

public class Link implements Fichero {

    private String nombre;
    private Fichero ficheroConectado;

    public Link(String nombre, Fichero ficheroConectado){
        this.nombre = nombre;
        this.ficheroConectado = ficheroConectado;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamano() {
        return ficheroConectado.getTamano();
    }
}
