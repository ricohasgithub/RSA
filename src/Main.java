import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(KeyGen("Hello"));
	}
	
	public static int KeyGen (String text) {
		String numText = "";
		for (int i=0; i<text.length(); i++) {
			numText += convert(text.charAt(i));
		}
		BigInteger b = new BigInteger(numText);
		return 0; 
	}
	
	public static int convert (char c) {
		int i = c;
		return i;
	}
	
}
