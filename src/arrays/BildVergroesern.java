package arrays;

public class BildVergroesern {
	
	
	public static int[][] magnify( int[][] array, int factor ) {
	    int width = array[ 0 ].length;
	    int height = array.length;
	    int[][] result = new int[ height * factor ][ width * factor ];

	    for ( int row = 0; row < result.length; row++ ) {
	      int[] cols = result[ row ];
	      for ( int col = 0; col < cols.length; col++ )
	        cols[ col ] = array[ row / factor ][ col / factor ];
	    }
	    return result;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
