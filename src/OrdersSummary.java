import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class OrdersSummary { 
	
	public static String balanceStatements(String lst) {
		System.out.println(lst);
		double b = 0;
		double s = 0;
		int errors = 0;
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(lst);
		sc.useDelimiter(",");
		while(sc.hasNext()){
			String nextStr = sc.next();
			Scanner sc2 = new Scanner(nextStr);
			sc2.useDelimiter("[ ]");
			try{
				while(sc2.hasNext()){
					String name = sc2.next();
					int quantity = sc2.nextInt();
					sc2.useLocale(Locale.ENGLISH);
					double price = sc2.nextDouble();
					String order = sc2.next();
					boolean buy = order.equals("B")? true : false;
					boolean sell = order.equals("S")? true : false;
					if(buy){
						b += price*quantity;
					}else if(sell){
						s += price*quantity;
					}else{
						throw new NoSuchElementException();
					}
				}
			}catch(NoSuchElementException e){
				errors++;
				sb.append(nextStr + " ; ");
			}
			sc2.close();
		}
		sc.close();
		String ret = "Buy: " + b + " Sell: " + s;
		StringBuilder sb2 = new StringBuilder();
		if(errors > 0){
			sb2.append("Badly formed " + errors + ": ");
			sb2.append(sb.toString());
		}
		System.out.println(ret + "; " + sb2.toString());
		return ret + "; " + sb2.toString();
	}
}

