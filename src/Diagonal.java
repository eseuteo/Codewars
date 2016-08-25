import java.math.BigInteger;

public class Diagonal {	
	private static BigInteger getFact(BigInteger n){
		if(n.equals(BigInteger.ZERO)){
			return BigInteger.ONE;
		}else{
			return n.multiply(getFact(n.subtract(BigInteger.ONE)));
		}
	}
	
	
	public static BigInteger diagonal(int n, int p){
		n+=1;
		p+=1;
		BigInteger auxBN = BigInteger.valueOf(n);
		int auxN = n-1;
		for(int i=0; i<p-1; i++){
			auxBN = auxBN.multiply(BigInteger.valueOf(auxN));
			auxN--;
		}
		return auxBN.divide(getFact(BigInteger.valueOf(p)));
	}
}