
public class PerfectPower {
	public static int[] isPerfectPower(int n){
		for(int i=2; i<Math.log(n)/Math.log(2)+1; i++){
			for(int k=1; Math.pow(i, k) <= n; k++){
				if(Math.pow(i, k) == n){
					return new int[]{i,k};
				}
			}
		}
		return null;
	}
}