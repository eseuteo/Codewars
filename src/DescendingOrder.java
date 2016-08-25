import java.util.ArrayList;
import java.util.Iterator;

public class DescendingOrder {
  public static int sortDesc(final int num) {
	  int auxN = num;
	  ArrayList<Integer> listInt = toListInt(auxN); 
	  listInt.sort(null);
	  Iterator<Integer> it = listInt.iterator();
	  int res = 0;
	  int i=0;
	  while(it.hasNext()){
		  res += it.next()*Math.pow(10, i);
		  i++;
	  }
	  return res;
  }
  
  private static ArrayList<Integer> toListInt(int num){
	  ArrayList<Integer> listInt = new ArrayList<Integer>();
	  while(num>0){
		  listInt.add(num%10);
		  num /= 10;
	  }
	  return listInt;
  }
}