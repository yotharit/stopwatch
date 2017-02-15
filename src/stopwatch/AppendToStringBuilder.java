package stopwatch;
/**
 * Appending String to StringBuilder
 * @author Tharit Pongsaneh
 *
 */
public class AppendToStringBuilder implements Runnable {
	/**
	 * Declare variable used in this class
	 */
	private int count;
	private String result;

	/**
	 * Constructor of this class
	 * @param count how many char will be appended
	 */
	AppendToStringBuilder(int count){
		this.count = count;
		this.result = "";
	}

	/**
	 * Appending String to StringBuilder than store it in String result
	 */
	@Override
	public void run() {
		StringBuilder builder = new StringBuilder(); 
		final char CHAR = 'a';
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
		result = builder.toString();	
	}

	/**
	 * Return the Task name and length
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\nfinal string length = %d\n", count, result.length() );
	}

}
