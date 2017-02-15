package stopwatch;
/**
 * Appending char to String
 * @author Tharit Pongsaneh
 *
 */

public class AppendToString implements Runnable {
	/**
	 * Variable used in this class
	 */
	private int count;
	private String result = ""; 

	/**
	 * Constructor of the class
	 * @param count how many time it will added char to String
	 */
	AppendToString(int count){
		this.count = count;
		this.result = "";
	}

	/**
	 * Implement Runnable interface to run the program by appending char to String Variable
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
	}
	/**
	 * return the result of this class
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\nfinal string length = %d\n", count, result.length());
	}
}
