public class Carboat {
	
	public static String howmuch(int m, int n) {
		int greater = m>n? m : n;
		int smaller = m<n? m : n;
		StringBuilder sb = new StringBuilder("[");
		for(int i=smaller; i<=greater; i++){
			int carCost = i/9;
			int boatCost = i/7;
			if((i-(carCost*9) == 1) && (i-(boatCost*7) == 2)){
				sb.append("[M: " + i + " B: " + boatCost + " C: " + carCost + "]");
				}
			}
		sb.append("]");
		return sb.toString();
	}
}