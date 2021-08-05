import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class nextPermutation {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			
			List<Integer> perm=new ArrayList<Integer>();
			System.out.println("Enter the size for array:");
		    int n=sc.nextInt();
		    
		    System.out.println("Enter "+ n +" elements");
		    for(int i=0;i<n;i++) {
		    	perm.add(sc.nextInt());
		    }
		    System.out.println("The entered permutation array: ");
		    for(Integer num:perm) {
		    	System.out.print(num +" ");
		    }
		    System.out.println(" ");
		    
		    nextPerm(perm);
		    System.out.println("The Next permutation array :");
		    for(Integer num:perm) {
		    	System.out.print(num +" ");
		    }

		}
		public static  List<Integer>nextPerm(List<Integer>perm){
			int k=perm.size()-2;
			while(k>=0 && perm.get(k)>=perm.get(k+1)) {
				--k;
			}
			if(k==-1) {
				return Collections.emptyList();
			}
			for(int i=perm.size()-1;i>k;--i) {
				if(perm.get(i)>perm.get(k)) {
					Collections.swap(perm, k, i);
					break;
				}
			}
			Collections.reverse(perm.subList(k+1, perm.size()));
			return perm;

	}

}
