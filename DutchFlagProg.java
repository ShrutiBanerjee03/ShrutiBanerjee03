 import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DutchFlagProg {
     public static enum Color{RED,WHITE,BLUE  }
	public static void main(String[] args) {
		
		 Color RED=Color.RED;
		 Color BLUE=Color.BLUE;
		 Color WHITE=Color.WHITE;
		 
		 List<Color> A=new ArrayList<Color>();
		 A.add(RED);
		 A.add(WHITE);
		 A.add(BLUE);
		 A.add(WHITE); 
		 A.add(RED); 
		 A.add(BLUE);
		 
		 System.out.println("list before swaping");
		 for(Color C:A)
			 System.out.println(C+"");
		 int pivotIndex=(A.size()-1);
		 dutchFlag1(pivotIndex,A);
		 System.out.println(""); 
		 System.out.println("list after swaping");
		 for(Color C:A)
			 System.out.println(C+"");
		 
	}
public static void dutchFlag1(int pI,List<Color>A) {
	Color pivot =A.get(pI);
	
	int smaller=0,equal=0,larger=A.size();
	
     while(equal<larger) {
	
			if(A.get(equal).ordinal() < pivot.ordinal()) {
				Collections.swap(A, smaller++, equal++);
			}
			else if(A.get(equal).ordinal() == pivot.ordinal()) {
				++equal;
			}
			else
		    {
			     Collections.swap(A,equal,--larger);
		    }
     }
}
}