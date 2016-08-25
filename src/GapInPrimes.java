
class GapInPrimes {
    
    public static long[] gap(int g, long m, long n) {
    	int countGap = 0;
    	int countNum = (int) m;
    	long first = countNum, last = n;
    	boolean theresFirst = false;
    	while(!theresFirst){
    		if(isPrime(countNum)){
    			first = countNum;
    			theresFirst = true;
    		}else{
    			countNum++;
    		}
    	}
    	boolean foundGap = false;
    	while(countNum < n && !foundGap){
    		if(!isPrime(countNum)){
    //			System.out.println(countGap + ", " + countNum);
    			countGap++;
    			countNum++;
    //			System.out.println(first + ", " + last);
    		}else{
    //			System.out.println(countGap + ", " + countNum);
    			if(countGap+1==g){
    				last = countNum;
    				foundGap = true;
    			}else{
    				countGap = 0;
        			first = countNum;
        			countNum++;
    			}
    		}
    	}
    	last = countNum;
    	long[] res = new long[]{first,last};
    	if(countGap < g-1)
    		res = null;
    	return res;
    }
    
    public static boolean isPrime(int n){
    	boolean prime;
    	if(n<2){
    		prime = false;
    	}else if(n<4){
    		prime = true;
    	}else{
    		prime = true;
    		int i = 2;
    		while(prime && i<n/2+1){
    			prime = !(n%i == 0);
    			i++;
    		}
    	}
    	return prime;
    }
}