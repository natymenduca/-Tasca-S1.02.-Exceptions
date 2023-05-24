package s102_n1Ex1_PRODUCTOS;

public class Producto {//debe tener dos atributos: "nombre" y "precio"
	
	    private String nombre;
	    private double precio;

	    public Producto(String nombre, double precio) {
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public double getSubtotal(Integer cantidad) {
	        return precio * cantidad;
	    }
}

	

