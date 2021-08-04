package ComputerRandomPermutation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputerRandomPermutationProg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number Of elements in an array");
		int n=sc .nextInt();
		List<Integer>permutation=new ArrayList<>();
		permutation=computeRandomPermutation(n);
		System.out.println("The Random Permutation Array:");
		for(Integer num:permutation) {
			System.out.println(num+"");
		}
		

	}

	private static List<Integer> computeRandomPermutation(int n) {
	List<Integer>permutation=new ArrayList<>(n);
	for(int i=0;i<n;++i) {
		permutation.add(i);
		OfflineSampling.randomSampling(permutation.size(),permutation);
	}
	
	return permutation;
	}

}

	
