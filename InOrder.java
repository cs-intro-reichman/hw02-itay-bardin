/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int randNumber = (int)(Math.random() * 10); // main random number that will update each loop
		int lastNumber = randNumber; // the previous random number
		String str = "" + randNumber; // empty string
		while (randNumber >= lastNumber){ // while the main random number is bigger or equal to the previous random
				lastNumber = randNumber; // set the previous number as the main one that generated
				randNumber = (int)(Math.random() * 10); // generate a new random number as the main one
				if (randNumber < lastNumber) { // check if the new main is smaller than the previous one
					randNumber = -1; // to stop the while loop
				}
				else {
					str = str + " " + randNumber; // if the new random is bigger the previous one, add the number to the string with a space between
				}
			}
		System.out.println(str); // the while stopped, which means the new random was smaller than the previous one, what caused it to stop and print the generated string
	}
}
