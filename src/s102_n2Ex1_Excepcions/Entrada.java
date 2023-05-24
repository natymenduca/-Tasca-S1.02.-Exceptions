package s102_n2Ex1_Excepcions;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Entrada {
	
		private static final String scanner;
		
		static {
		  scanner ="";
		}
		
		private static Scanner entrada = new Scanner(System.in);//Instanciar un objeto de la clase Scanner

	    // Método estático para leer un byte desde el teclado
	    public static byte llegirByte(String mensaje) {
	        byte b = 0;
	        boolean error = true;
	        
	        do {
	            try {// usa el bloque try-catch para recibir información del usuario y manejar la excepción
	                System.out.print(mensaje);
	                b = entrada.nextByte();// damos cualquier valor flotante como entrada  
	                error = false;
	            } catch (InputMismatchException e) {
	                System.out.println("Error de formato. Debe introducir un byte.");
	                entrada.nextLine(); // Consumir el salto de línea
	            }
	        } while (error);
	        return b;
	    }
        // Método estático para leer un int desde el teclado
	    public static int llegirInt(String mensaje) {
	        int i = 0;
	        boolean error = true;
	        
	        do {
	            try {
	                System.out.print(mensaje);
	                i = entrada.nextInt();
	                error = false;
	            } catch (InputMismatchException e) {
	                System.out.println("Error de formato. Debe introducir un entero.");
	                entrada.nextLine(); // Consumir el salto de línea
	            }
	        } while (error);
	        return i;
	    }
        // Método estático para leer un float desde el teclado
	    public static float llegirFloat(String mensaje) {
	        float f = 0;
	        boolean error = true;
	        
	        do {
	            try {
	                System.out.print(mensaje);
	                f = entrada.nextFloat();
	                error = false;
	            } catch (InputMismatchException e) {
	                System.out.println("Error de formato. Debe introducir un float." );
	                entrada.nextLine(); // Consumir el salto de línea
	            }
	        } while (error);
	        return f;
	    }
        // Método estático para leer un double desde el teclado
	    public static double llegirDouble(String mensaje) {
	        double d = 0;
	        boolean error = true;
	        
	        do {
	            try {
	                System.out.print(mensaje);
	                d = entrada.nextDouble();
	                error = false;
	            } catch (InputMismatchException e) {
	                System.out.println("Error de formato. Debe introducir un double.");
	               entrada.nextLine(); // Consumir el salto de línea
	            }
	        } while (error);
	        return d;
	    } 
	    // Método estático para leer un char desde el teclado
	    public static char llegirChar(String mensaje) {
	        char c = ' ';
	        boolean error = true;
	        
	        do {
	            try {
	                System.out.print(mensaje);
	                c = entrada.nextLine().charAt(0);
	                error = false;
	            } catch (Exception e) {
	                System.out.println("Error de formato. Debe introducir un char");
	            }
	        } while (error);
	        return c;
	    }
	    public static String llegirString(String mensaje) {
	        String m = null;
	        boolean error = true;
	        
	        do {
	            try {
	                System.out.print(mensaje);
	                m = entrada.nextLine().toString();
	                error = false;
	            } catch (Exception ex) {
	                System.out.println("Error de formato. Debe introducir un String");
                }
	        } while (error);
	        return m;
	    }
	    public static boolean llegirSiNo(String mensaje) {
	        boolean valid = false;
	        String input = "";
	        do {
	            System.out.print(mensaje);
	            input = entrada.nextLine().toLowerCase();
	            if (input.equals("s")) {
	                return true;
	            } else if (input.equals("n")) {
	                return false;
	            } else {
	                System.out.println("Introduce 's' o 'n'.");
	            }
	        } while (!valid);
	        return false;
	    }
	public static <T> T llegirDada(String mensaje, Function<String,String,T> conversio) {
        T dato = null;
        boolean entradaCorrecta = false;
        Scanner es = new Scanner(System.in);
        
        do {
            try {
                System.out.print(mensaje);
                String entrada = es.nextLine();
                dato = conversio.apply(entrada);
                entradaCorrecta = true;
            } catch (Exception e) {
                System.out.println("Error de formato. Por favor, introduce una entrada válida.");
            } finally {
                es.close();
            }
        } while (!entradaCorrecta);
        return dato;
    }
}
