import java.util.*;
import java.util.HashMap;
public class ConvertRomanNoToDecimalNoProg {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Roman No.");
		String RomNum=sc.nextLine();
		int DecNum=romanToInteger(RomNum);
		System.out.println("Roman no. " + RomNum + " is equivalent to decimal no. " + DecNum);

	}

	public static int romanToInteger(String RomNum) {
		RomNum=RomNum.toUpperCase();
		Map<Character,Integer>HM=new HashMap<Character,Integer>();
		
		HM.put('I', 1);
		HM.put('V', 5);
		HM.put('X', 10);
		HM.put('L', 50);
		HM.put('C', 100);
		HM.put('D', 500);
		HM.put('M', 1000);
		
		int sum=HM.get(RomNum.charAt(RomNum.length()-1));
		
		for(int i=RomNum.length()-2;i>=0;--i) {
			if(HM.get(RomNum.charAt(i))<HM.get(RomNum.charAt(i+1))) {
				sum-=HM.get(RomNum.charAt(i));
			}
			else {
				sum+=HM.get(RomNum.charAt(i));
			}
		}
		return sum;
	}

}
