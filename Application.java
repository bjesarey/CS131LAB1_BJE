/**
 * This is the Application object that will launch our application
 * 
 * @author Brandon Esarey
 * @version 1.3 Lab1 CS131ON
 * Application
 * Semester year 2023
 */
public class Application {

	public static void main(String[] args) {

		NonPlayerCharacter npc = new NonPlayerCharacter();
		// Uncomment the line below to ensure reportStructure() method works after you have written it.
		System.out.println(npc.reportStructure());
		System.out.println(npc.Introduce());
		System.out.println(npc.Exclaim());
	}// end main

}// end class