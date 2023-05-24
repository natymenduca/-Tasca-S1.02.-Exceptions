package s102_n1Ex1_PRODUCTOS;

public class S102_n1Ex1_PRODUCTOS {

	public static void main(String[] args) {

		Venta venta1 = new Venta();
		venta1.agregarProducto(new Producto(null, 0), 0);
		venta1.agregarProducto(new Producto(null, 0), 0);

		try { 
		    Venta venta = new Venta();
			venta.calcularTotal();
		} catch (VendaBuidaException ex) { 
		    System.out.println(ex.getMessage());
		}
       
    }

}

