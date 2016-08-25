import java.util.ArrayList;

class Persist {
	public static int persistence(long n) {
		int i=0;
		ArrayList<Integer> numList = new ArrayList<Integer>();
		int number = (int) n;
		while(number/10 > 0){
			numList.add(number%10);
			number /= 10;
		}
		return i;
	}
}