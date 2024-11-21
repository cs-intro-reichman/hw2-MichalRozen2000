// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt (args[0]);
		String mode = args[1];
		boolean verbose = mode.equals("v");
		boolean concise = mode.equals("c");
		int number = 0;

			for (int i=1; i<=N; i++){
				number = i;
				int count = 0;
				if (verbose){
				System.out.print(number+" ");
				while (number != 1) {  
                    if (number % 2 == 0) {
                        number /= 2; 
                    } else {
                        number = (number * 3) + 1; 
                    }
                    System.out.print(number + " "); 
                    count++;
				
					}
					System.out.println("(" + (count+1) + ")");

				}
				if (concise){
					number = i;
					count = 0;
					while (number !=1){
						if (number % 2 == 0){
							number /=2;
						} else {
							number = (number*3) + 1;
						}
						count++;
					}
					System.out.println("For " + i + ", steps to reach 1: " + (count + 1));
				}

			}
		}

	}

	
