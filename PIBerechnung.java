package ue9;

public class PIBerechnung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int durchl = 72;
		double erg = 0, diff = 0;
		
		System.out.println("PI-Berechnung A");
		erg = getPI_A(durchl);
		diff = getDiff(erg, durchl);
		setAusgabe(erg, durchl, diff);
		
		System.out.println("PI-Berechnung B");
		erg = getPI_B(durchl);
		diff = getDiff(erg, durchl);
		setAusgabe(erg, durchl, diff);
	}
	
	public static double getPI_A(int durchlauf) {
        double pi   = 1;
        double eins = 1;
        int nenner  = 1;
       
        for (int i = 1; i <= durchlauf; i++) {
            nenner = nenner + 2;
            if ((i % 2) == 1) { // ist die Zahl gerade?
                pi = pi - (eins/nenner);
            } else {
                pi = pi + (eins/nenner);
            }
        }
        //Rückgabe des Ergebnisse
        return 4 * pi;
    }
	
	public static double getPI_B(int durchlauf) {
	    
	    // Pi mit Leibnitz-Reihe
	    double pi=0, erg=0;
	    //Schleife für die Berechnung
	    for (int i=0; i<=durchlauf; i++) {
	    	//Bildungsgesetz
	    	pi += (1/(2.0*i +1)) * Math.pow(-1, i); 	
	    }
	    erg = 4*pi;
	    
	    //Rückgabe des Ergebnisse
	    return erg;
	}

	public static double getDiff(double pi, int durchl){
		double diff = 0;
				  
		//Differenz von Pi mit errechneten Wert von Pi
		
		diff=Math.PI - pi;                       
	    
	    return diff;
	}

	public static void setAusgabe(double pi, int durchl, double diff){
		System.out.print("Leibnitz-Reihe bei " + durchl);
		System.out.println(" Schritten ergibt: " + pi);
		if (diff<0){
    		System.out.print("Pi ist um " + -1*diff);
    		System.out.println(" kleiner als der errechnete Leibnitz-Wert!");
		}else{
    		System.out.print("Pi ist um " + diff);
    		System.out.println(" groesser als der errechnete Leibnitz-Wert!");
		}
		
	}
	

}
