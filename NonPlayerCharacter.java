//import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits from GameCharacter it represent
 * objects the game controls (as opposed to objects a human player controls).
 * 
 * @author Brandon Esarey
 * @version 1.3 Lab1 CS131ON
 * NonPlayerCharacter
 * Semester year 2023
 */

public class NonPlayerCharacter extends GameCharacter {
	private boolean Behavior;
	private String IntelligenceType;

	public void setBehavior(boolean active) {
		Behavior = active;
	}

	public boolean getBehavior() {
		return Behavior;
	}

	public void setIntelligenceType(String intelligence) {
		IntelligenceType = intelligence;
	}

	public String getIntelligenceType() {
		return IntelligenceType;
	}

	public NonPlayerCharacter() {
		super();
		setBehavior(false);
		setIntelligenceType("AVERAGE");
	}// End empty argument constructor.

}// end class
