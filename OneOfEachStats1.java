/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int boys, girls, children;
		double averageChildren = 0;
		int couplesWithTwo = 0, couplesWithThree = 0, couplesWithFourOrMore = 0;
		for (int i=0; i < T; i++){
			boys = girls = 0;
			while(boys <1 || girls <1){
				double rand = Math.random();
				if(rand < 0.5){
					boys++;
				} 
				else{
					girls++;
				}
			}
			children = boys + girls;
			if ((boys + girls) == 2) couplesWithTwo++;
			if ((boys + girls) == 3) couplesWithThree++;
			if ((boys + girls) >= 4) couplesWithFourOrMore++;	
			averageChildren += children;
		}
			int mostCommon = Math.max(couplesWithTwo,Math.max(couplesWithThree, couplesWithFourOrMore));
			averageChildren /= T;
		System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + couplesWithTwo);
		System.out.println("Number of families with 3 children: " + couplesWithThree);
		System.out.println("Number of families with 4 or more children: " + couplesWithFourOrMore);
		if (mostCommon == couplesWithTwo) System.out.println("The most common number of children is 2.");
		else if (mostCommon == couplesWithThree) System.out.println("The most common number of children is 3.");
		else System.out.println("The most common number of children is 4 or more.");
	}
}
