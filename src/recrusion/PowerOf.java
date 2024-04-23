package recrusion;

public class PowerOf {
	
	public static int calculatePowerOf(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		} else {
			return base * calculatePowerOf(base,exponent - 1);
		}
	}

	public static void main(String[] args) {
 
		System.out.println(calculatePowerOf(5, 2));
	}

}
