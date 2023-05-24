package s102_n3Ex1_CINEMA;

import java.util.ArrayList;

public class GestioButacas {
	
	   private ArrayList<Butaca> butacas;

       public GestioButacas() {
	        butacas = new ArrayList<>();
	    }
        public ArrayList<Butaca> getButacas() {
	        return butacas;
	    }
        public void afegirButaca(Butaca butaca) throws ExcepcioButacaOcupada {
	        if (butacas.contains(butaca)) {
	            throw new ExcepcioButacaOcupada();
	        }
	        butacas.add(butaca);
	    }
        public void eliminarButaca(int numFila, int numAsiento) throws ExcepcioButacaLliure { //ejemplo de implementación de la clase GestioButaques 
	        boolean eliminada = butacas.removeIf(butaca -> butaca.getNumFila() == numFila && butaca.getNumAsiento() == numAsiento);
	        if (!eliminada) {
	            throw new ExcepcioButacaLliure("La butaca no está reservada.");
	        }
	    }
        public int cercarButaca(int numFila, int numAsiento) {
	        for (Butaca butaca : butacas) {
	            if (butaca.getNumFila() == numFila && butaca.getNumAsiento() == numAsiento) {
	                return butacas.indexOf(butaca);
	            }
	        }
	        return -1;
	    }
}
