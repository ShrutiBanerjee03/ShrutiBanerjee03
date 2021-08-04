import java.util.*;
public class ComputeAllValidIPAddresses {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  Decimal String ");
		String str=sc.nextLine();
		List<String> result=getValidAdd(str);
		System.out.println(" All possible valid IP addresses is: ");
		
		for(String ip:result) {
			System.out.println(ip);
		}

	}
	public static List<String>getValidAdd(String s){
		List<String> result=new ArrayList();
		for(int i=1;i<4 && i<s.length();++i) {
			
			final String first=s.substring(0,i);
			
			if(isValid(first)) {
				for(int j=1;i+j<s.length() && j<4;++j) {
					
					final  String second=s.substring(i, i+j);
				
				if(isValid(second)) {
					for(int k=1;i+j+k<s.length() && k<4;++k) {
						final  String third=s.substring(i+j, i+j+k);
						final  String fourth=s.substring( i+j+k);
						
						if(isValid(third) && isValid(fourth)) {
						result.add(first + '.' + second + '.' + third + '.' + fourth);
					}
			    }
		    }	
		 }
	   }
	}
		return result;
  }
	private static boolean isValid(String s) {
		if(s.length()>3) {
			return false;
		}
		if(s.startsWith("0")&& s.length()>1) {
			return false;
		}
		int val=Integer.parseInt(s);
		return val<=255 &&val>=0;

	}

}
