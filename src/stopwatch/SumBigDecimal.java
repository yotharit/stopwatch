package stopwatch;
/**
 * Sum of the number from 0 to the counter using BigDecimal
 * @author Tharit Pongsaneh
 */

import java.math.BigDecimal;

public class SumBigDecimal implements Runnable {

	/**
	 * Variable use in this class
	 */
	static final int ARRAY_SIZE = 500000;
	private int counter;
	private BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
	private BigDecimal sum = new BigDecimal(0.0);

	/**
	 * Constructor of the class
	 * @param counter the limit of BigDecimal
	 */
	SumBigDecimal(int counter){
		this.counter = counter;
	}

	/**
	 * Sum of number from 0 to the limit
	 */
	@Override
	public void run() {
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] );
		}
	}

	/**
	 * Return the sum of this task
	 */
	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count = %,d\nsum = ", counter) + sum + "\n";
	}
}
