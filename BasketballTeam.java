/**
 * Creates a class that will use the abstract class SportsTeam
 */

/**
 * @author Brandon Esarey
 * @version 1.3 Lab1 CS131ON
 * BasketballTeam
 * Semester year 2023
 *
 */
public class BasketballTeam extends SportsTeam {
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;

	public double fieldGoalPercentage() {
		return fieldGoals / fieldGoalsAttempted;
	}// end fieldGoalPercentage()

	public double freeThrowPercentage() {
		return freeThrows / freeThrowsAttempted;
	}// end freeThrowPercentage()

	public void getStats() {
		double[] stats = { getWinPercentage(), fieldGoalPercentage(), freeThrowPercentage() };
		System.out.println(stats);
	}// end getStats()
}// end class
