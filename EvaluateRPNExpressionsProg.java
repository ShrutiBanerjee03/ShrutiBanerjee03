import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class EvaluateRPNExpressionsProg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an arithmetical expression in RPN, each character separated by comma (,) : ");
		String str = sc.nextLine();
		int result = eval(str);
		System.out.print("The evaluation result of RPN arithmetical expression : " + result);
		}
		public static int eval(String RPNExpression) {
		Deque<Integer> intermediateResults = new LinkedList<>();
		String delimiter = ",";
		String[] symbols = RPNExpression.split(delimiter);
		for (String token : symbols) {
			if (token.length() == 1 && "/*+-".contains(token)){
			final int y = intermediateResults.removeFirst();
			final int x = intermediateResults.removeFirst();
			switch (token.charAt(0)){
			case '+':
			intermediateResults.addFirst(x + y);
			break ;
			case '-':
			intermediateResults.addFirst(x - y);
			break ;
			case '*':
			intermediateResults.addFirst(x * y);
			break ;
			case '/':
			intermediateResults.addFirst(x / y);
			break ;
			default:
			throw new IllegalArgumentException("Malformed RPN at :" + token);
			}
			} else { // token is a number.
			intermediateResults.addFirst(Integer.parseInt(token));
			}
			}
			return intermediateResults.removeFirst();
		}
}
