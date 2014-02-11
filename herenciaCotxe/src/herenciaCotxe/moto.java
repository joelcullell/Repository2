package herenciaCotxe;

/*
 * La classe moto crea una moto amb els parametres de vehicle i els propis.
 * 
 */
public class moto extends vehicle {
	
	protected int preuMoto;
	
	/**
	 * 
	 * El constructor de moto crea el objecre moto que agafa les propietats de la classe pare 
	 * vehicles @Param numRodes i en crea un altre per saber el preu del vehicle 
	 * @Param preuMoto.
	 * 
	 */
		public moto(){
			
			super(2);
			preuMoto=1000;
		}
		
		/**
		 *  Get que retorna el numero de rodas que li demanen.
		 * 
		 * @return numRodes
		 */
		public int getRodesMoto(){
			return this.numRodes;
		}
		
		/**
		 * Set que asigna el número de rodes
		 * 
		 * @param num
		 */
		public void setRodes(int num){
			numRodes=num;
		}
		
		/**
		 *  Set que retorna a la classe vehicle el preu del cotxe.
		 *  @param preuCotxe
		 */
		public int preuVehicle(){
			return this.preuMoto;
		}
		
		public String vehicleOff(){
			return "La moto està apagada";
		}
		public String vehicleOn(){
			return "La moto està encesa";
		}
		public String vehicleBreak(){
			return "La moto està espatllada";
		}

	


}
