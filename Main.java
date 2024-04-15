public class Main {

    public static void main(String[] args) {
        ElementoSimple silla = new ElementoSimple(1, 50.0);
        ElementoSimple mesa = new ElementoSimple(2, 100.0);

        Kit kit = new Kit(1001);
        kit.agregarElemento(silla);
        kit.agregarElemento(mesa);

        double precioKit = kit.calcularPrecio();
        System.out.println("El precio del kit es: $" + precioKit);
    }
}
