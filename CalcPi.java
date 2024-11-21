// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
    int numberOfTerms = Integer.parseInt(args[0]);
    double myPi = 0;

    for (int i = 0; i < numberOfTerms; i++) {
    // make sure the denominator is always odd
    double denominator = 2 * i + 1;
    

    if (i%2 == 0) {
        myPi += 1 / denominator;
    } else {
        myPi -= 1 / denominator;
    }
}
    myPi *= 4;
    System.out.println("pi according to Java: " + Math.PI);
    System.out.println("pi, approximated:     " + myPi);

      }
    }
	

