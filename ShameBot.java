
public class ShameBot {
	
	public static boolean isShameful() {
		
		boolean isShameful = false;
		String[] ingredients = new String[] {"meat"};
		String[] badThings = new String[] {"meat"};
		
		
		for(int i = 0; i < ingredients.length; i++) {
			for( int j = 0; j < badThings.length; j++) {
				if( ingredients[i].equalsIgnoreCase(badThings[j])) {
					isShameful = true;
				}
			}
		}
		
		return isShameful;
	}

}
