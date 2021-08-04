package ComputerRandomPermutation;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class OfflineSampling {

	
		// TODO Auto-generated method stub
		 static void randomSampling(int k, List<Integer>A) {
		Random gen=new Random();
		for(int i=0;i<k;i++) {
			int randNo=gen.nextInt(A.size()-i);
			Collections.swap(A, i, i+randNo);
		}
	}
}

	



