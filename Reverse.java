/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		int length = s.length();
		int i = length - 1;
		String reversed = "";
		while(i >= 0){
			reversed = reversed + s.charAt(i);
			i = i - 1;
		}
		System.out.println(reversed);
		if(length % 2 ==0){
				System.out.println("The middle character is " + s.charAt((length / 2 - 1)));
		}
		else{
			System.out.println("The middle character is " + s.charAt((length / 2)));
		}
	}
}
