import java.util.ArrayList;
import java.util.List;

public class Kit extends Elemento {
    private final List <Elemento> elementos;

    public Kit(int codigo) {
        super(codigo, 0.0);
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public double calcularPrecio(){
        double preciototal = 0;
        for (Elemento elemento : elementos) {
            preciototal += elemento.getPrecio();
        }
        return (preciototal * 0.9);
    }
}
