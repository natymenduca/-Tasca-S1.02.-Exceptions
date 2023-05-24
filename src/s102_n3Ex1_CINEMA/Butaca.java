package s102_n3Ex1_CINEMA;

public class Butaca {
	private int numFila;
	private int numAsiento;
	private String persona;

	public Butaca(int numFila, int numAsiento, String persona) {
		this.numFila = numFila;
		this.numAsiento = numAsiento;
		this.persona = persona;
	}
    public int getNumFila() {
        return numFila;
    }
     public int getNumAsiento() {
        return numAsiento;
    }
    public String getPersona() {
        return persona;
    }
    @Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Butaca)) {
			return false;
		}
		Butaca butaca = (Butaca) o;
		return numFila == butaca.numFila && numAsiento == butaca.numAsiento;
	}
    @Override
	public int hashCode() {
		int result = 17;
		
		result = 31 * result + numFila;
		result = 31 * result + numAsiento;
		return result;
	}
    @Override
    public String toString() {
        return "Fila: " + numFila + ", Asiento: " + numAsiento + ", Persona: " + persona;
   }
	
}
