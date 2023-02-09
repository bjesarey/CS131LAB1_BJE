/**
 * Creates an abstract class SportsTeam
 */

/**
 * @author Brandon Esarey
 * @version 1.3 Lab1 CS131ON
 * SportsTeam
 * Semester year 2023
 *
 */
public abstract class SportsTeam {
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;

	public SportsTeam() {

		wins = 0;
		losses = 0;
	}// end empty argument constructor

	public double getWinPercentage() {
		return wins / (wins - losses);
	}// end getWinPercentage

	public void getStats() {
	}// end getStats
}// end class
