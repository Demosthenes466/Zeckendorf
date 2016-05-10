import java.util.List;
import java.util.ArrayList;

public class Zeck {

	public static List<Integer> fibNums;
	public static int length;
	public static String zeck;
	// public List<Integer> fib;
	// public int temp;

	public static void main(String[] args) {
		fibNums = new ArrayList<Integer>();
		zeck = "";
		length = 7;
		for(int j = 0; j < length; j ++) {
			fibNums.add(fibonacci(j));
		}

		for(int k = 0; k < 21; k ++) {
			System.out.println(k + ": " + zeckendorf(k));
		}
	}

	public static int fibonacci(int num) {
		if(num == 0) {
			return 1;
		} 
		if(num == 1) {
			return 2;
		}
		return fibonacci(num-1) + fibonacci(num-2);
	}

	public static String zeckendorf(int n) {
		zeck = "";
		for(int j = fibNums.size() - 1; j >= 0; j --) {
			if(n < fibNums.get(j)) {
				zeck += ("0");
			}
			if(n >= fibNums.get(j) && zeck.endsWith("0")) {
				zeck += ("1");
				n -= fibNums.get(j);
			} 
		}

		return zeck.replaceFirst("^0+(?!$)", "");
	}
	
}
