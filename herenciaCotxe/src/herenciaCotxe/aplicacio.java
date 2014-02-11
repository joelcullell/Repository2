package herenciaCotxe;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * La classe aplicacio esl a que conte el la que conte el void main i des de on s´inicializa
 * l´aplicacio de control de vehicles.
 *
 * @author JoelPanella Cullell
 * 
 * @version 05/02/2014 
 *
 */

//Hola mama salgo en la tele.

public class aplicacio {
	
	/**
	 *  El void main crea 4 vehicles, 2 cotxes i 2 motos, les posa en una arrayList
	 *  i llavors les llista de dos maneres diferents (for, while).
	 *  Suma el valor de totes les rodes i preus dels vehicles i finalment
	 *  crea 3 alerts per si el cotxe està ences, parat o espatllat.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int numRodes=0,rodesTotals=0, preuTotal=0,preuVehicle;
		String a, b,c;
		
		cotxe a1 = new cotxe();
		
		cotxe a2 = new cotxe();
		
		moto a3 = new moto();
		
		moto a4 = new moto();
		
		
		ArrayList <vehicle> llistaVehicles = new ArrayList <vehicle> ();
		
		
		llistaVehicles.add(a1);
		llistaVehicles.add(a2);
		llistaVehicles.add(a3);
		llistaVehicles.add(a4);
		
	/*	//imprimeix els vehicles
		for(vehicle v: llistaVehicles){
			System.out.print("el número de rodes és: " + v.getrodes() );
			System.out.println(" i el seu cost és: " + v.preuVehicle() );
			//Suma rodes i preus
			numRodes = numRodes + v.getrodes();
			preuTotal = preuTotal + v.preuVehicle();	
		}
		//Imprimeix la suma de tot
		System.out.println("El numero total de rodes és: " + numRodes);
		System.out.println("El preu de tot és: " + preuTotal);
		
		 */

		
		Iterator<vehicle> iterarVehicles = llistaVehicles.iterator();

		while(iterarVehicles.hasNext()){
			
			vehicle asd = iterarVehicles.next();
			
			numRodes=asd.getrodes();
			preuVehicle=asd.preuVehicle();
			
			System.out.print("El número de rodes és: " + numRodes);
			System.out.println(" i el preu del vehicle és: " + preuVehicle);
			
			rodesTotals = numRodes + rodesTotals;
			preuTotal = preuVehicle + preuTotal;
			
		}
		
		System.out.println("El numero total de rodes és: " + rodesTotals);
		System.out.println("El preu de tot és: " + preuTotal);
		
		
		cotxe a5 = new cotxe();
		
		a=a5.vehicleOn();
		b=a5.vehicleOff();
		c=a5.vehicleBreak();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
