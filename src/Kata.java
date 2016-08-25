
public class Kata {
	public static int findEvenIndex(int[] arr) {
		int index = -1;
		int i=0, sumA, sumB;
		int[] subArrA;
		int[] subArrB;
		do{
			subArrA = new int[i+1];
			subArrB = new int[arr.length-(i+2)];
			System.arraycopy(arr, 0, subArrA, 0, i+1);
			System.arraycopy(arr, i+2, subArrB, 0, arr.length-(i+2));
			sumA = sumOf(subArrA);
			sumB = sumOf(subArrB);
			i++;
			if(sumA == sumB){
				index = i;
			}
		}while(sumA != sumB && i < arr.length-1);
		return index;
	}
	
	private static int sumOf(int[] arr){
		int res = 0;
		for(int i=0; i<arr.length; i++){
			res+=arr[i];
		}
		return res;
	}
}
