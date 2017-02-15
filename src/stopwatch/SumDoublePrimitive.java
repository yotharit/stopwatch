package stopwatch;
/**
 * Sum the Number from 0 to counter using Double Primative
 * @author Tharit Pongsaneh
 *
 */
public class SumDoublePrimitive implements Runnable {

	/**
	 * Variable use in this class
	 */
	private int counter;
	double sum = 0.0;
	double[] values = new double[ARRAY_SIZE];
	static final int ARRAY_SIZE = 500000;

	/**
	 * Constructor of the class
	 * @param counter the limit of Double primative
	 */
	SumDoublePrimitive(int counter){
		this.counter = counter;
	}

	/**
	 * Sum of number from 0 to the limit
	 */
	@Override
	public void run() {
		for(int k=0; k<ARRAY_SIZE; k++) values[k] = k+1;
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
		return String.format("Sum array of double primitives with count = %,d\nsum = ", counter) + sum +"\n";
	}

}
