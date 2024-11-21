// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt (args[0]);
		String mode = args[1];
		boolean verbose = mode.equals("v");
		boolean concise = mode.equals("c");
		int number = 0;

		if (verbose) {
			for (int i=1; i<=N; i++){
				number = i;
				System.out.println(number+" ");
				for (int j=1; i>=1; j++){
					if (number%2 ==0){
						number /=2;
					} else {
						number = (number*3)+1; 
					} if (number != 1){
						System.out.println(number + " ");
					} else {
						System.out.println (number + "(" + (j+1) + ")");
						break;
					}
				}
			}
		}

	}
}
	
