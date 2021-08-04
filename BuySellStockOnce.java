import java.util.*;
public class BuySellStockOnce {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		List<Double> Prices=new ArrayList<Double>();
		System.out.println("Enter the size for array:");
	    double n=sc.nextInt();
	    
	    System.out.println("Enter "+ n +" elements");
	    for(int i=0;i<n;i++) {
	    	double a=sc.nextInt();
	    	Prices.add(a);
	    }
	    System.out.println("The stock prices: ");
	    for(Double sprice:Prices) {
	    	System.out.println(sprice +" ");
	    }
	    System.out.println(" ");
	    
	    double maxProfit=computeMax(Prices);
	    System.out.println("Profit:" +" "+ maxProfit);

	}
	public static double computeMax(List<Double>prices) {
		double  minPrice=Double.MAX_VALUE;
		double maxProfit=0.0;
		for(Double price:prices) {
			maxProfit=Math.max(maxProfit, price-minPrice);
			minPrice=Math.min(minPrice, price);
		}
		return maxProfit;
		
		

	}

}
