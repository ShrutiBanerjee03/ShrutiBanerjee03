import java.util.*;
public class LookAndSayPgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer");
		int num= sc.nextInt();
		String result=lookAndSay(num);
		System.out.println("");
		System.out.println("The"+num+"term of the look and say sequence is"+result);
		}

	public static String lookAndSay(int n) {
		String str="1";
		System.out.println("The look and say sequence are"+str+"");
		for(int i=1;i<n;++i) {
			str=nextNumber(str);
			System.out.println(str+"");
		}
		return str;
	}

	private static String nextNumber(String str) {
		StringBuilder result=new StringBuilder();
		for(int i=0;i<str.length();++i) {
			int count=1;
			while(i+1<str.length()&&str.charAt(i)==str.charAt(i+1)) {
				++i;
				++count;
			}
			result.append(count);
			result.append(str.charAt(i));
			
		}
		return result.toString();
	}
	

}
