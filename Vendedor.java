public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes) {
        super(nombre, ventasMes);
        this.estrategia = new ComisionEstandar(); // por defecto
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Vendedor: " + nombre);
        System.out.println("Venta total: $" + ventasMes);
        System.out.println("Comisión: $" + estrategia.calcularComision(ventasMes));
    }
}