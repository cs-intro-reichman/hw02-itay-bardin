
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		double rand = Math.random();
		String str = "";
		int boys = 0;
		int girls = 0;
			while(boys <1 || girls <1){
				if(rand < 0.5){
					boys++;
					str = str + "b ";
				} 
				else{
					girls++;
					str = str + "g ";
				}
			rand = Math.random();
			}
		System.out.println(str);
		System.out.println("You Made it... and now you have " + (girls + boys) + " children");
	}
}
