public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Erika Fuentes", 1000);
        // Estrategia actual: ComisionEstandar (por defecto)
        v.mostrarDetalle();
    }
}