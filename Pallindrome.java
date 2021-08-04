import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number:"); 
		int n=sc.nextInt();
		boolean result=palindrome(n);
		if(result)
			System.out.println("The number "+n+" is a palindrome number"); 
		else
			System.out.println("The number "+n+" is not a palindrome number"); 	
	}
	private static boolean palindrome(int n) 
	{
		if(n<0) 
		{
			return false;
		}
		final int numDigits=(int)(Math.floor(Math.log10(n)))+1;
		int msdMask=(int)Math.pow(10, numDigits-1);
		for(int i=0;i<(numDigits/2);++i)
		{
			if(n/msdMask!=n%10)
			{
				return false;
			}
			n%=msdMask;//Remove the most significant digit of n
			n/=10;//Remove the least significant digit of n
			msdMask/=100;
		}
		return true;
	}


	}


