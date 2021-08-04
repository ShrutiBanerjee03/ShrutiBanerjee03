import java.util.Scanner;

public class EvenOddProg {

	public static void main(String[] args) 
	{
		int size;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=s.nextInt();
		int A[]=new int [size];
		System.out.println("Enter"+size+"the elements");
		for(int i=0;i<size;i++) {
			A[i]=s.nextInt();
			}
		System.out.print("The array elements are");
		for(int i=0;i<size;i++) {
			System.out.print(A[i]+"");
		}
		System.out.println();
		evenOdd(A);
		System.out.println("The array elements (after recorded) are");
		for(int i=0;i<size;i++) {
			System.out.println(A[i]+"");
			
		}
		

	}

	public static void evenOdd(int[] a) {
int ne=0,no=a.length-1;
		
		while(ne<no) {
			if(a[ne]%2==0) {
				ne++;
			}
			else {
				int temp=a[ne];
				a[ne]=a[no];
				a[no--]=temp;
		
		
	}
	

		}
	}
	}
	
