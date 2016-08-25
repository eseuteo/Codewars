public class ReverseLonger {
	public static String shorterReverseLonger(String a, String b) {
		String shortStr = a.length() < b.length()? a : b;
		String longStr = a.length() < b.length()? b : a;
		return shortStr + reverse(longStr) + shortStr;
	}
	
	private static String reverse(String str){
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
}

