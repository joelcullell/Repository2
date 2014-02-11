package herenciaCotxe;

/*
 * La classe cotxe crea un cotxe amb els parametres de vehicle i els propis.
 * 
 */
public class cotxe extends vehicle {
	
	protected int preuCotxe;
	
		/**
		 * 
		 * El constructor de cotxe crea el objecre cotxe que agafa les propietats de la classe
		 * pare vehicles @Param numRodes i en crea un altre per saber el preu del vehicle 
		 * @Param preuCotxe.
		 * 
		 */
		public cotxe(){
		
			super(4);
			preuCotxe=6000;
		}
		
		/**
		 *  Get que retorna el numero de rodas que li demanen.
		 * 
		 * @return numRodes
		 */
		public int getRodesCotxe(){
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
			return this.preuCotxe;
		}
		
		public String vehicleOff(){
			return "El cotxe està apagat";
		}
		public String vehicleOn(){
			return "El cotxe està ences";
		}
		public String vehicleBreak(){
			return "El cotxe està espatllat";
		}
}
