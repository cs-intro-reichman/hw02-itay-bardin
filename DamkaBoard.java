/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int i = 1;
		int q = 1;
		String damkaRow = "";
		while (i <= num) {
			damkaRow = damkaRow + "* ";
			i = i +1;
		}
		while (q <= num){
			if(q % 2 != 0){
				System.out.println(damkaRow);
			}
			else {
				System.out.println(" " + damkaRow);
			}
			q = q + 1;
		}
		
	}
}
