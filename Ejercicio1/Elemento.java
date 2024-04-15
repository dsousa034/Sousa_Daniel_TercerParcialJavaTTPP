package Ejercicio1;

abstract class Elemento {
    int codigo;
    double precio;

    public Elemento(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }
}
