package s102_n3Ex1_CINEMA;

public class ExcepcioNomPersonaIncorrecte extends Exception {
	 
	        public ExcepcioNomPersonaIncorrecte(String message) {
	            super(message);
	        }
	        @Override
	        public String getMessage() {
	            return "Error: " + super.getMessage();
	        }
 }


