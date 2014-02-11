package herenciaCotxe;
/**
 * La classe vehicle te com a atributs el numRodes que varia segons quin vehicle es crea.
 * pots asignar el número de rodes i pots preguntar quantes rode te el vehicle.
 *
 */

public abstract class vehicle implements onOff {

		protected int numRodes;
		
		/*
		 * Constructor que asigna el numero de rodes amb el @ param int rodes.
		 */
		public vehicle(int rodes){	
			this.numRodes=rodes;

		}
		
		/**
		 * Metode que et retorna el numero de rode.
		 * 
		 * @return numRodes
		 */
		public int getrodes(){
			return this.numRodes;
		}
		
		/**
		 * Metode per preguntar el preu del vehicle de les subclasses.
		 * 
		 * @return preuCotxe o preuMoto.
		 */
		public abstract int preuVehicle();
		
		
	
		
	
		
			
		
		
}
