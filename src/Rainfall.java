import java.util.Scanner;

public class Rainfall {
    
    public static double mean(String town, String strng) {
    	boolean check = false;
    	double mean = 0;
    	Scanner sc = new Scanner(strng);
    	while(sc.hasNextLine()){
    		String name = sc.nextLine();
    		Scanner sc2 = new Scanner(name);
    		sc2.useDelimiter(":");
    		if(sc2.next().equals(town)){
    			String data = sc2.next();
    			Scanner sc3 = new Scanner(data);
    			sc3.useDelimiter(",");
    			while(sc3.hasNext()){
	    			String month = sc3.next();
	    			Scanner sc4 = new Scanner(month);
	    			while(sc4.hasNext()){
	    				String m = sc4.next();
	    				Double d = sc4.nextDouble();
	    				mean += d;
	    			}
	    			sc4.close();
	    			check = true;
    			}
    			sc3.close();
    		}
    		sc2.close();
    		}
    	sc.close();
    	if(!check){
    			mean = -12;
    	}
		return mean/12;
    }
    
    public static double variance(String town, String strng){
    	double mean = Rainfall.mean(town, strng);
    	boolean check = false;
		double variance = 0;
		Scanner sc = new Scanner(strng);
		while(sc.hasNextLine()){
			String name = sc.nextLine();
			Scanner sc2 = new Scanner(name);
			sc2.useDelimiter(":");
			if(sc2.next().equals(town)){
				String data = sc2.next();
				Scanner sc3 = new Scanner(data);
				sc3.useDelimiter(",");
				while(sc3.hasNext()){
	    			String month = sc3.next();
	    			Scanner sc4 = new Scanner(month);
	    			while(sc4.hasNext()){
	    				String m = sc4.next();
	    				Double d = sc4.nextDouble();
	    				Double auxD = d-mean;
	    				variance += auxD*auxD;
	    			}
	    			sc4.close();
	    			check = true;
				}
				sc3.close();
			}
			sc2.close();
			}
		sc.close();
		if(!check){
				variance = -12;
	}
	return variance/12;
}
}
