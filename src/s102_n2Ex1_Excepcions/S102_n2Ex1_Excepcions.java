package s102_n2Ex1_Excepcions;

public class S102_n2Ex1_Excepcions {
	
    public static void main(String[] args) {
    	int integer = 0;
    	double decimal = 0;
    	int texto;
    	
        integer = llegirDada("Introduce un numero entero: "+ integer);
        System.out.println("El numero entero introducido es: " + integer);

        decimal = llegirDada("Introduce un numero decimal: " + decimal);
        System.out.println("El numero decimal introducido es: " + decimal);

        texto = llegirDada("Introduce un texto: ", Function.identity());
        System.out.println("El texto introducido es: "+ texto);
    }

	private static int llegirDada(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int llegirDada(String string, Object object) {
		// TODO Auto-generated method stub
		return 0;
	}
}
