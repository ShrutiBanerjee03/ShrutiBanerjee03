import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Rotate2dArrayProg {

	public static void main(String[] args) {
	ArrayList<ArrayList<Integer>>squareMatrix=new ArrayList<ArrayList<Integer>>();
	 squareMatrix.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
     
     squareMatrix.add(new ArrayList<Integer>(Arrays.asList(5,6,7,8)));
     
     squareMatrix.add(new ArrayList<Integer>(Arrays.asList(9,10,11,12)));
     
     squareMatrix.add(new ArrayList<Integer>(Arrays.asList(13,14,15,16)));
     
     System.out.println("The contents of 2D Array: ");
     
     for(int i=0;i<squareMatrix.size();i++) {
     	 for(int j=0;j<squareMatrix.get(i).size();j++) {
     		 System.out.print(squareMatrix.get(i).get(j)+" ");
     	 }
     	 System.out.println();
     }
     rotateMatrix(squareMatrix);
     System.out.println("After rotation the contents of 2D Array: ");
     
     for(int i=0;i<squareMatrix.size();i++) {
    	 for(int j=0;j<squareMatrix.get(i).size();j++) {
    		 System.out.print(squareMatrix.get(i).get(j)+" ");
    	 }
    	 System.out.println();
    }
	}
	public static void rotateMatrix(ArrayList<ArrayList<Integer>> squareMatrix) {
	
		final int matrixSize=squareMatrix.size()-1;
		
		for(int i=0;i<(squareMatrix.size()/2);++i) {
			for(int j=i;j<matrixSize-i;++j) {
				int temp1=squareMatrix.get(matrixSize-j).get(i);
				
				int temp2=squareMatrix.get(matrixSize-i).get(matrixSize-j);
				
				int temp3=squareMatrix.get(j).get(matrixSize-i);
				
				int temp4=squareMatrix.get(i).get(j);
				
				squareMatrix.get(i).set(j, temp1);
				squareMatrix.get(matrixSize-j).set(i, temp2);
				squareMatrix.get(matrixSize-i).set(matrixSize-j, temp3);
				squareMatrix.get(j).set(matrixSize-i, temp4);
			}
		}

	}

}
