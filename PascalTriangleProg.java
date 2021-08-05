import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangleProg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows in Pascal triangle");
		int numRows=sc.nextInt();
		List<List<Integer>>PascalTriangle=new ArrayList<List<Integer>>();
		PascalTriangle=generatePascalTriangle(numRows);
		System.out.println("The Generated Pascal's Triangle:");
		for(int i=0;i<PascalTriangle.size();i++) {
			for(int j=0;j<PascalTriangle.get(i).size();j++) {
				System.out.print(PascalTriangle.get(i).get(j)+" ");
			}
			System.out.println();
			
		}
	}
	public static List<List<Integer>>generatePascalTriangle(int nr){
		List<List<Integer>> PascalTriangle=new ArrayList<>();
		
		for(int i=0;i<nr;++i) {
			List<Integer> cr=new ArrayList<>();
			
			for(int j=0;j<=i;++j) {
				if ((j>0 && j<i)) {
					cr.add(PascalTriangle.get(i-1).get(j-1) +
							PascalTriangle.get(i-1).get(j));
				}
				else {
					cr.add(1);
				}
			}
			PascalTriangle.add(cr);
		}
		return PascalTriangle;
			
		}
		
}
