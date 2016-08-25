public class DnaStrand {
  public static String makeComplement(String dna) {
	  StringBuilder sb = new StringBuilder();
	  char[] array = dna.toCharArray();
	  for(int i=0; i<dna.length(); i++){
		  sb.append(makeComplement(array[i]));
	  }
	  return sb.toString();
  }
  
  private static char makeComplement(char c){
	  switch(c){
	  case 'A': return 'T';
	  case 'T': return 'A';
	  case 'G': return 'C';
	  case 'C': return 'G';
	  default: return c;
	  }
  }
}
