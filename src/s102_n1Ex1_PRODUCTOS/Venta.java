package s102_n1Ex1_PRODUCTOS;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> productos;
    private double precioTotal = 0;

    public Venta() {
        this.productos = new ArrayList<>();
        this.precioTotal = 0;
    }
    public void agregarProducto(Producto producto, int cantidad) {
        double subtotal = producto.getSubtotal(cantidad);
        this.productos.add(producto);
        this.precioTotal += subtotal;
    }
   
    public void calcularTotal() throws VendaBuidaException { 
        if (this.productos.isEmpty()) {
            throw new VendaBuidaException("Para hacer una venta primero tienes que coger productos");//operador creado new por throws para lanzar la excepcion
        }
        for (Producto producto : this.productos) {
            this.precioTotal += producto.getPrecio();
        }
    }
    public double getPrecioTotal() {
        return precioTotal;
    }
}
