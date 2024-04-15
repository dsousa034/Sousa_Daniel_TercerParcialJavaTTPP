package Ejercicio2;

public class Adaptador implements Fichero{
    private Directorio directorio;

    public Adaptador(Directorio directorio){
        this.directorio = directorio;
    }

    @Override
    public String getNombre() {
        return directorio.getNombre();
    }

    @Override
    public int getTamano() {
        return directorio.getTamano();
    }
}
