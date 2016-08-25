public class Circle {
  public static double area(double radius) {
    if(radius <= 0){
    	throw new IllegalArgumentException(); 
    }else{
    	double a = radius*radius*3.14; 
    	return round2(a);
    }
  }
  public static double round2(double d){
	  d*=100;
	  Math.round(d);
	  return d/100;
  }
}