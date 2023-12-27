/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int sumOfDivisors = 1;
		int numRemainder = 0;
		int i = 2;
		String str = num + " is a perfect number since " + num + " = 1";
		while (i < num){
			numRemainder = num % i;
			if(numRemainder == 0){
				sumOfDivisors = sumOfDivisors + i;
				str = str + " + " + i; 
			}
		i = i + 1;
		}
		if (sumOfDivisors == num) {
		System.out.println(str);
		}
		else{
		System.out.println(num + " is not a perfect number");
		}
	}
}
