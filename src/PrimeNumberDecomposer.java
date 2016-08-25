import java.util.ArrayList;
import java.util.TreeMap;

class PrimeNumberDecomposer {
	public static Long[] getAllPrimeFactors(long n) {
		ArrayList<Long> list = new ArrayList<Long>();
		long auxN = n;
		while (auxN > 1) {
			long i = 2;
			while (auxN % i != 0) {
				i++;
			}
			list.add(i);
			auxN /= i;
		}
		Long[] res = list.toArray(new Long[list.size()]);
		return res;
	}

	public static Long[][] getUniquePrimeFactorsWithCount(long n) {
		TreeMap<Long, Long> map = new TreeMap<Long, Long>();
		Long[] longArray = getAllPrimeFactors(n);
		for (int i = 0; i < longArray.length; i++) {
			if (map.containsKey(longArray[i])) {
				long auxVal = map.get(longArray[i]);
				map.put(longArray[i], auxVal+1);
			} else {
				map.put(longArray[i], (long) 1);
			}
		}
		Long[] res1 = map.keySet().toArray(new Long[map.keySet().size()]);
		Long[] res2 = map.values().toArray(new Long[map.values().size()]);
		return new Long[][] { res1, res2 };
	}

	public static Long[] getPrimeFactorPotencies(long n) {
		Long[][] longArray = getUniquePrimeFactorsWithCount(n);
		ArrayList<Long> list = new ArrayList<Long>();
		Long[] factors = longArray[0];
		Long[] potencies = longArray[1];
		for(int i=0; i<factors.length; i++){
			long auxLong = 1;
			long currentFactor = factors[i];
			for(int j=0; j<potencies[i]; j++){
				auxLong*=currentFactor;
			}
			list.add(auxLong);
		}
		return list.toArray(new Long[list.size()]);
	}
}
