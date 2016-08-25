import java.util.ArrayList;
import java.util.Iterator;

public class RevRot {    
    public static String revRot(String strng, int sz) {
    	System.out.println("input: " + strng + ", " + sz);
    	StringBuilder sb = new StringBuilder();
    	if(!(sz == 0)){
	        String auxStr = strng;
	        ArrayList<String> listStr = toListStr(auxStr,sz);
	        Iterator<String> strIt = listStr.iterator();
	        while(strIt.hasNext()){
	        	String auxStr1 = strIt.next(); 
	        	if(sumCubes(auxStr1)){
	        		StringBuilder sb1 = new StringBuilder(auxStr1);
	        		sb.append(sb1.reverse().toString());
	        	}else{
	        		StringBuilder sb2 = new StringBuilder(auxStr1);
	        		char auxChar = sb2.charAt(0);
	        		sb2.append(auxChar);
	        		sb2.deleteCharAt(0);
	        		sb.append(sb2.toString());
	        	}
	        }
    	}
    	System.out.println(sb.toString());
        return sb.toString();
    }
    
    private static boolean sumCubes(String str){
    	System.out.println(str);
    	try{
    	int num = Integer.parseInt(str,10);
    	int sum = 0;
    	System.out.println("-----"+num);
    	while(num > 0){ 
    		int toAdd = num%10;
    		System.out.println("\t " + sum + ", " + num + ", " + toAdd);
    		sum += (toAdd*toAdd);
    		num/=10;
    	}
    	return sum%2 == 0;
    	}catch(NumberFormatException e){
    		long longNum = Long.parseLong(str, 10);
    		int num = 0;
    		num += longNum;
    		int sum = 0;
    		System.out.println("-----"+num);
        	while(num > 0){
        		int toAdd = num%10;
        		System.out.println("\t " + sum + ", " + num + ", " + toAdd);
        		sum += (toAdd*toAdd);
        		num/=10;
        	}
        	System.out.println(sum);
        	return sum%2 == 0;
    	}
    }
    
    private static ArrayList<String> toListStr(String auxStr, int sz){
    	ArrayList<String> list = new ArrayList<String>();
        while(auxStr.length()+1 > sz){
        	String newInt = auxStr.substring(0, sz);
        	list.add(newInt);
        	auxStr = auxStr.substring(sz,auxStr.length());
        }
    	return list;
    }
}