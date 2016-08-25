import java.util.Arrays;

public class AreSame {
	public static boolean comp(int[] a, int[] b) {
		if(a == null || b == null || a.length != b.length){
			return false;
		}
		int[] newA = squareArray(a);
		Arrays.sort(newA);
		Arrays.sort(b);
		return sameArray(newA, b);		
	}
	
	private static int[] squareArray(int[] a){
		int size = a.length;
		int[] res = new int[size];
		for(int i=0; i<size; i++){
			res[i] = a[i]*a[i];
		}
		return res;
	}
	
	private static String arrayToString(int[] a){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<a.length; i++){
			sb.append(a[i]);
			if(i<a.length-1){
				sb.append(", ");
			}
		}
		return sb.toString();
	}
	
	private static boolean sameArray(int[] a, int[] b){
		boolean res = true;
		int i=0;
		while(i<a.length && res){
			res = a[i] == b[i];
			i++;
		}
		return res;
	}
}
