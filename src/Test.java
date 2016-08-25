
public class Test {
	public static void main(String[] args){
	//	System.out.println(Bio.dnaToRna("GCAT"));
/*		StringBuilder sb = new StringBuilder();
 *		for(int i=0; i<100; i++){
 *			sb.append(i + ", " + GapInPrimes.isPrime(i) + "\n");
 *		}
 *		System.out.println(sb.toString());
 *
 */		
//		long[] aux = GapInPrimes.gap(10, 300, 400);
//		System.out.println(aux[0] + ", " + aux[1]);
		
	//	System.out.println(DnaStrand.makeComplement("GCATACTGTGTTTACTTACTTTAGCT"));
	//	int[] arr = new int[]{4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4};
	//	System.out.println(Kata.findEvenIndex(arr));
//		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
//		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
//		System.out.println(AreSame.comp(a, b));
	//	System.out.println(DescendingOrder.sortDesc(145263));
//		System.out.println(RevRot.revRot("73304991087281576455176044327690580265896896028126182265439", 11));
		//"73304991087 / 28157645517 / 60443276905 / 80265896896 / 02812618226 / 5439", 11)
		
	//	String l = "ZNGA 1300 2.66 , CLH15.NYM 50 56.32 B, OWW 1000 11.623 B, OGG 20 580.1 B";
	//	System.out.println(OrdersSummary.balanceStatements(l));
//		int[] res = PerfectPower.isPerfectPower(36);
//		System.out.println(res[0] + ", " + res[1]);
//		System.out.println(Pyramid.watchPyramidFromTheSide("$/;>"));
//		System.out.println(Pyramid.watchPyramidFromAbove("KINGJOSE"));
//		System.out.println(Pyramid.countVisibleCharactersOfThePyramid("$/;>"));
//		System.out.println(Pyramid.countAllCharactersOfThePyramid("$/;>"));
		
//		System.out.println(Diagonal.diagonal(20, 15));
		StringBuilder sb = new StringBuilder("[");
		Long[] longArray = PrimeNumberDecomposer.getAllPrimeFactors(135);
		for(int i=0; i<longArray.length; i++){
			sb.append(longArray[i]);
			if(i!=longArray.length-1){
				sb.append(", ");
			}
		}
		System.out.println(sb.toString() + "]");
		
		StringBuilder sb1 = new StringBuilder("[[");
		Long[][] longArray1 = PrimeNumberDecomposer.getUniquePrimeFactorsWithCount(135);
		for(int i=0; i<longArray1.length; i++){
			for(int j=0; j<longArray1[i].length; j++){
				sb1.append(longArray1[i][j]);
				if(j!=longArray1[i].length-1){
					sb1.append(", ");
				}
			}
			if(i!=longArray1.length-1){
				sb1.append("], [");
			}
		}
		System.out.println(sb1.toString() + "]]");
		
		StringBuilder sb2 = new StringBuilder("[");
		Long[] longArray2 = PrimeNumberDecomposer.getPrimeFactorPotencies(135);
		for(int i=0; i<longArray2.length; i++){
			sb2.append(longArray2[i]);
			if(i!=longArray2.length-1){
				sb2.append(", ");
			}
		}
		System.out.println(sb2.toString() + "]");
	}
}
