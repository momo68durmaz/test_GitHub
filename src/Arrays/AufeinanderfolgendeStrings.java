package Arrays;

public class AufeinanderfolgendeStrings {
	
	public static boolean isProbablyApproaching(String[] signs) {
	    if (signs == null || signs.length < 2) {
	        return false; 
	    }

	    for (int i = 0; i < signs.length - 1; i++) {
	        if (signs[i].equals(signs[i + 1])) {
	            return true; 
	        }
	    }
	    return false; 
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
