package Codesignal;

public class SpookyMatrix {
	public static void main(String[] args) {
		 
		int tot = matrixElementsSum(new int[][] {
			                                                {0,1,1,2} ,{0,5,0,0},{2,0,3,3} 
		                                                   });
	 System.out.println("the total is "+tot);
		                                 
		                                       
		}
		static int matrixElementsSum(int[][] matrix) {
		   int total = 0;
		    
		   for (int i=0; i<matrix.length; i++){
		     for (int j=0; j<matrix[i].length; j++){
		       if (matrix[i][j] == 0) {
		         for (int k=i+1; k<matrix.length; k++){
		           matrix[k][j] = 0;
		         }
		       }
		     }
		   }
		    
		   for (int x=0; x<matrix.length; x++){
		     for (int y=0; y<matrix[x].length; y++){
		       total += matrix[x][y];
		     }
		   }
		    
		   return total;
		}

}
