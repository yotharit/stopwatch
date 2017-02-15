package stopwatch;
/**
 * Sum the Number from 0 to counter using Double Object
 * @author Tharit Pongsaneh
 *
 */
public class SumDouble implements Runnable {

	/**
	 * Variable use in this class
	 */
	int counter;
	static final int ARRAY_SIZE = 500000;
	Double[] values = new Double[ARRAY_SIZE];
	Double sum = new Double(0.0);

	/**
	 * Constructor of the class
	 * @param counter the limit of Double
	 */
	SumDouble( int counter ){
		this.counter = counter;
	}

	/**
	 * Sum of number from 0 to the limit
	 */
	@Override
	public void run() {
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new Double(i+1);
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
	}

	/**
	 * Return the sum of this task
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count = %,d\nsum = ", counter) + sum + "\n";
	}
}
