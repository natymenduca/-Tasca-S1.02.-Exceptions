package s102_n3Ex1_CINEMA;

import java.util.Scanner;

public class Cine {
	//atributos
	private int numFilas;
    private int numAsientos;
    private GestioButacas gestioButacas;
	
    //constructor
    public Cine() {
        gestioButacas = new GestioButacas();
        demanarDadesInicials();
    }
    //getter
	public int getNumAsientos() {
		return numAsientos;
	}
	//setter
	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}
	//metodos generales
    private void demanarDadesInicials() {
    	// TODO Auto-generated method stub
    	return;
	}
	public void iniciar() throws Throwable {
        Scanner scanner = new Scanner(System.in);
        int opc;
        
        do {
            opc = menu(scanner);
            switch (opc) {
                case 1:
                    mostrarButaques();
                    break;
                case 2:
                    mostrarButaquesPersona(scanner);
                    break;
                case 3:
                    reservarButaca(scanner);
                    break;
                case 4:
                    anularReserva(scanner);
                    break;
                case 5:
                    anularReservaPersona(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opc != 0);
    }
    private int menu(Scanner scanner) {
        System.out.println("Menú principal:");
        System.out.println("1.- Mostrar todas las butacas reservadas.");
        System.out.println("2.- Mostrar las butacas reservadas por una persona.");
        System.out.println("3.- Reservar una butaca.");
        System.out.println("4.- Anular la reserva de una butaca.");
        System.out.println("5.- Anular todas las reservas de una persona.");
        System.out.println("0.- Salir.");
        System.out.print("Introduce opción: ");
        return scanner.nextInt();
    }

    private void mostrarButaques() {
        for (Butaca butaca : gestioButacas.getButacas()) {
            System.out.println(butaca);
        }
    }
    private void mostrarButaquesPersona(Scanner scanner) throws Throwable {
        String persona = introduirPersona(scanner);
        for (Butaca butaca : gestioButacas.getButacas()) {
            if (butaca.getPersona().equals(persona)) {
                System.out.println(butaca);
            }
        }
    }
    private void reservarButaca(Scanner scanner) throws Throwable {
        int numFila = introduirFila(scanner);
        int numAsiento = introduirSeient(scanner);
        String persona = introduirPersona(scanner);
        Butaca butaca = new Butaca(numFila, numAsiento, persona);
        try {
            gestioButacas.afegirButaca(butaca);
            System.out.println("Butaca reservada correctamente.");
        } catch (ExcepcioButacaOcupada e) {
            System.out.println("La butaca ya está ocupada.");
        }
    }
    private int introduirSeient(Scanner scanner) {
		// TODO Auto-generated method stub
		return 0;
	}
	private void anularReserva(Scanner scanner) {
        int numFila = introduirFila(scanner);
        int numAsiento = introduirSeient(scanner);
        try {
            gestioButacas.eliminarButaca(numFila, numAsiento);
            System.out.println("Reserva anulada correctamente.");
        } catch (ExcepcioButacaLliure e) {
            System.out.println("La butaca no está reservada.");
        }
    }
    private void anularReservaPersona(Scanner scanner) throws Throwable {
        String persona = introduirPersona(scanner);
        int numReserves = 0;
        for (Butaca butaca : gestioButacas.getButacas()) {
            if (butaca.getPersona().equals(persona)) {
                gestioButacas.getButacas().remove(butaca);
                numReserves++;
            }
        }
        System.out.println(numReserves + " reservas anuladas correctamente.");
    }
    private String introduirPersona(Scanner scanner) throws Throwable {
        System.out.print("Introduce el nombre de la persona: ");
        String persona = scanner.next();
        if (persona.matches(".*\\d.*")) {
            throw new ExcepcioNomPersonaIncorrecte("El nombre de la persona no puede contener números");
        }
        return persona;
    }
    private int introduirFila(Scanner entrada) {
    	System.out.print("Introduce el número de fila (1-" + numFilas + "): ");
        numFilas = entrada.nextInt();
		return numFilas;
    }
}
