
public class ArgsSum {
	/** Sum all numbers in args. */
	public static void main(String[] args){
		int i = 0;
		int sum = 0;
		while ( i <= (args.length - 1)) {
			sum = sum + Integer.parseInt(args);
			i = i + 1;
		}
		
	}	
}