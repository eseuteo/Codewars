
public class Max {
	public static int sequence(int[] arr){
		int max;
		if(isOnlyNegative(arr) || isEmpty(arr)){
			max = 0;
		}else{
			max = arr[0];
			int newSum = arr[0];
			for(int i=1; i<arr.length; i++){
				newSum = Math.max(arr[i], newSum+arr[i]);
				max = Math.max(newSum, max);
			}
		}
		return max;
	}
	
	private static boolean isOnlyNegative(int[] arr){
		boolean res = true;
		int i=0;
		while(res && i<arr.length){
			res = arr[i]<0;
			i++;
		}
		return res;
	}
	
	private static boolean isEmpty(int[] arr){
		return arr.length == 0;
	}
}
